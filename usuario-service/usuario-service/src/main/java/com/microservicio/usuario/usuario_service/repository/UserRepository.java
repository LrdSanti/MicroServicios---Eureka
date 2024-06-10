package com.microservicio.usuario.usuario_service.repository;

import com.microservicio.usuario.usuario_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
