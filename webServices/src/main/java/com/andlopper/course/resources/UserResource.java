package com.andlopper.course.resources;

import com.andlopper.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Implementado por um controlador REST
@RequestMapping(value = "/users") //Caminho do recurso
public class UserResource {
    //Endpoint para acessar os usuários
    @GetMapping //Responde requisição do tipo GET do HTTP
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
