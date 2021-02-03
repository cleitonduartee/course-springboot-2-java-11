package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Order;
import com.example.course.services.OrderService;

@RestController    //Esse restControler determina que a classe é implementada pelo um controlador rest
@RequestMapping(value = "/orders") //RequestMapping determina o caminho desse recurso
public class OrderResource {


	@Autowired //Anotação que injeta automaticamente a dependencia
	private OrderService orderService;
	
	@GetMapping  //GetMapping determina que o metodo nesse recurso é get
	public ResponseEntity<List<Order>> findAll(){       //ResponseEntity quer dizer que essa função retorna uma requisição nesse recurso
		List<Order> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){	
		Order order = orderService.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
