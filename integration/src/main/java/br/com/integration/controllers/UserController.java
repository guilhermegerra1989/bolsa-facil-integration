package br.com.integration.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.integration.models.User;
import br.com.integration.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST User")
@CrossOrigin(origins="*")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value="Retorna Usuários do Banco Postgres")
	@GetMapping("/User/FindAll")
	public List<User> FindAll() {
		return this.userService.findAll();
	}
}
