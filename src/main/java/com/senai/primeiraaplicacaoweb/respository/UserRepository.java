package com.senai.primeiraaplicacaoweb.respository;

import com.senai.primeiraaplicacaoweb.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
