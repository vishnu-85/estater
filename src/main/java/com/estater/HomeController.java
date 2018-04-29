package com.estater;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estater.dto.UserDto;

@RestController
@RequestMapping("/estater")
public class HomeController {
	
	@RequestMapping(value="/api")
	public UserDto estater(@RequestParam(value="name") String name) {
		UserDto userdto = new UserDto();
			userdto.setOutput("My name is "+name);
		return userdto;
	}

}
