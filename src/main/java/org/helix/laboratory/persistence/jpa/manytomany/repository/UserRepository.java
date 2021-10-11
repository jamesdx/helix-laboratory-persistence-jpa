package org.helix.laboratory.persistence.jpa.manytomany.repository;

import org.helix.laboratory.persistence.jpa.manytomany.domain.User;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(value="user-with-role", type = EntityGraph.EntityGraphType.FETCH )
    List<User> findByUserName(String userName);
}
