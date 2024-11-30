package org.youcode.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.youcode.security.user.AppUser;

import java.util.Optional;
import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {

    Optional<AppUser> findByEmail(String email);

}
