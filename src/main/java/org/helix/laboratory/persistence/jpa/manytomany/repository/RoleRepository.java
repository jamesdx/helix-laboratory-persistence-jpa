package org.helix.laboratory.persistence.jpa.manytomany.repository;

import org.helix.laboratory.persistence.jpa.manytomany.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
