package com.School_Management_System.repositories;

import com.School_Management_System.entities.User;
import com.School_Management_System.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByRole(UserRole userRole);
}
