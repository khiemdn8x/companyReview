package com.leo.prj.companyreview.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leo.prj.common.constant.StringConstant;
import com.leo.prj.companyreview.model.bean.User;

@RestController()
@RequestMapping("/user")
public class UserController {
	@RequestMapping(method = RequestMethod.GET, value = "*")
	public List<String> getUsers() {
		List<String> users = new ArrayList<String>();
		users.add("adsfasdfasdf");
		users.add("bgfhdfg");
		return users;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public User getUserById(@RequestParam(value = "id", defaultValue = StringConstant.ZERO) final long id) {
		return new User();
	}

	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody final User user) {
		return user;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity update(@RequestBody final User user) {
		return ResponseEntity.ok().build();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity delete(@RequestParam(value = "id", defaultValue = StringConstant.ZERO) final long id) {
		return ResponseEntity.ok().build();
	}
}
