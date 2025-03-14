package me.dio.desafio_spring_api_bradesco.domain.repository;

import me.dio.desafio_spring_api_bradesco.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
}
