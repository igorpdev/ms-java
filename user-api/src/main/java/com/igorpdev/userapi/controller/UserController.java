package com.igorpdev.userapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.igorpdev.userapi.dto.UserDTO;
import com.igorpdev.userapi.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<UserDTO> getUsers() {
		List<UserDTO> usuarios = userService.getAll();
		return usuarios;
	}

	@GetMapping("/{id}")
	UserDTO findById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@PostMapping
	UserDTO newUser(@RequestBody UserDTO userDTO) {
		return userService.save(userDTO);
	}

	@GetMapping("/{cpf}")
	public UserDTO findByCpf(@PathVariable String cpf) {
		return userService.findByCpf(cpf);
	}

	@DeleteMapping("/{id}")
	UserDTO delete(@PathVariable Long id) {
		return userService.delete(id);
	}

	@GetMapping("/search")
	public List<UserDTO> queryByName(@RequestParam(name = "nome", required = true) String nome) {
		return userService.queryByName(nome);
	}

}
