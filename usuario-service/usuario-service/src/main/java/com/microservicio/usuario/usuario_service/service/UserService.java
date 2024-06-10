package com.microservicio.usuario.usuario_service.service;

import com.microservicio.usuario.usuario_service.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User newUser);

    List<User> getAllUsers();

    User getUser(String userId);
}
