package com.vsdev.repository;

import com.vsdev.model.AppUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface AppUserRoleRepository extends JpaRepository<AppUserRole, Long> {
    Optional<AppUserRole> findAppUserRoleByName(String name);
}
