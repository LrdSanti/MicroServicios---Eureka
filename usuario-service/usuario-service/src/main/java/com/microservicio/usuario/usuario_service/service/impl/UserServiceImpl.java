package com.microservicio.usuario.usuario_service.service.impl;

import com.microservicio.usuario.usuario_service.entity.User;
import com.microservicio.usuario.usuario_service.exceptions.ResourcerNotFoundException;
import com.microservicio.usuario.usuario_service.repository.UserRepository;
import com.microservicio.usuario.usuario_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User newUser) {
        String randomUsuarioId = UUID.randomUUID().toString();
        newUser.setUserId(randomUsuarioId);
        return userRepository.save(newUser);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourcerNotFoundException("Usuario no encontrado con el ID : "+userId));
    }
}
