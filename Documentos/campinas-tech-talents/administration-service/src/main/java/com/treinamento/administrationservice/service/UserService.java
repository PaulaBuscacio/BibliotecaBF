package com.treinamento.administrationservice.service;

import com.treinamento.administrationservice.entity.User;
import com.treinamento.administrationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Lista todos os usuarios cadastrados
    public List<User> findAll() {

        return userRepository.findAll();
    }

    public User findById(Integer id) throws Exception {
      Optional<User> user = this.userRepository.findById(id);
      if(user.isPresent()) {
          return user.get();
      } else {
          throw new Exception("User not found: " + id);
      }
    }


}
