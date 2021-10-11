package org.helix.laboratory.persistence.jpa;


import org.helix.laboratory.persistence.jpa.manytomany.domain.Role;
import org.helix.laboratory.persistence.jpa.manytomany.domain.User;
import org.helix.laboratory.persistence.jpa.manytomany.repository.RoleRepository;
import org.helix.laboratory.persistence.jpa.manytomany.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRoleTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Before
    public void initTestData(){
        Role roleA = new Role();
        roleA.setRoleName("RoleA");

        roleRepository.save(roleA);
        Role roleB = new Role();
        roleB.setRoleName("RoleB");
        roleRepository.save(roleB);

        User user = new User();
        user.setUserName("allen001");
        user.getRoles().add(roleA);
        user.getRoles().add(roleA);

        User userA = new User();
        userA.setUserName("allen001");
        userA.getRoles().add(roleA);
        userA.getRoles().add(roleB);
        userRepository.save(user);
        userRepository.save(userA);

    }

    @Test
    public void should_find_user_by_userName(){
        List<User> users =  this.userRepository.findByUserName("allen001");
        users.stream();
    }
}
