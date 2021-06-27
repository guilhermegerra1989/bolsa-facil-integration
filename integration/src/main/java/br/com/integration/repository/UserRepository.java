package br.com.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.integration.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
