package org.zerhusen.security.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.security.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


   Optional<User> findOneWithAuthoritiesByUsername(String username);


   Optional<User> findOneWithAuthoritiesByEmailIgnoreCase(String email);

}
