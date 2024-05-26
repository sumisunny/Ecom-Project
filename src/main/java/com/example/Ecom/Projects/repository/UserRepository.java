package com.example.Ecom.Projects.repository;

import com.example.Ecom.Projects.model.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

public interface UserRepository extends JpaRepository <User, Long> {
}
