package org.helix.laboratory.persistence.jpa.manytomany.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "uaa_role")
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "roleName")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<User>();
}
