package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;
import com.example.course.services.UserService;

@RestController    //Esse restControler determina que a classe é implementada pelo um controlador rest
@RequestMapping(value = "/users") //RequestMapping determina o caminho desse recurso
public class UserResource {


	@Autowired //Anotação que injeta automaticamente a dependencia
	private UserService userService;
	
	@GetMapping  //GetMapping determina que o metodo nesse recurso é get
	public ResponseEntity<List<User>> findAll(){       //ResponseEntity quer dizer que essa função retorna uma requisição nesse recurso
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){	
		User user = userService.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
