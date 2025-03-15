package me.dio.desafio_spring_api_bradesco.domain.repository;

import me.dio.desafio_spring_api_bradesco.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
