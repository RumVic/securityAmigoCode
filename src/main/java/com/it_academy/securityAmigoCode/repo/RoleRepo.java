package com.it_academy.securityAmigoCode.repo;

import com.it_academy.securityAmigoCode.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
