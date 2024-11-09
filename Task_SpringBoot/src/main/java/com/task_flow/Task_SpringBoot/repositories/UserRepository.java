package com.task_flow.Task_SpringBoot.repositories;

import com.task_flow.Task_SpringBoot.entities.User;
import com.task_flow.Task_SpringBoot.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String username);

    Optional<User> findByUserRole(UserRole userRole);
}
