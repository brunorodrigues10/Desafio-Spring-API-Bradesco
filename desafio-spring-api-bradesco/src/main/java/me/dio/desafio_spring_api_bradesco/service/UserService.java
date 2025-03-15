package me.dio.desafio_spring_api_bradesco.service;

import me.dio.desafio_spring_api_bradesco.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
