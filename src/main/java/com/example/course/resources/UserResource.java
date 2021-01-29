package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController    //Esse restControler determina que a classe é implementada pelo um controlador rest
@RequestMapping(value = "/users") //RequestMapping determina o caminho desse recurso
public class UserResource {

	@GetMapping  //GetMapping determina que o metodo nesse recurso é get
	public ResponseEntity<User> fundAll(){       //ResponseEntity quer dizer que essa função retorna uma requisição nesse recurso
		User u = new User(1, "Nome","nome@teste.com","99999999","123456");
		return ResponseEntity.ok().body(u);
	}
}
