package com.todolist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entities.User;

@RestController
public class UserProcess implements ProcessInterface<User> {
	@GetMapping("/find/{id}")
	public User find(@PathVariable int id) {
		return new User("michael");
	}

	@GetMapping
	public List<User> findAll(int id) {
		return null;
	}

	@PostMapping
	public User create(User u) {
		return new User("michael");
	}

	@PutMapping
	public User update(User u) {
		return null;
	}

	@DeleteMapping
	public void delete(int id) {
	}
}
