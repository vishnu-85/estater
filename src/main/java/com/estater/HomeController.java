package com.estater;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estater.Exception.ResponseMessageDTO;

@RestController
@RequestMapping("/estater")
public class HomeController {

	@RequestMapping(value = "/api")
	public ResponseMessageDTO estater(@RequestParam(value = "name") String name) {
		ResponseMessageDTO response = new ResponseMessageDTO();
		if (name == null || name == "") {
			response.setResponseCode((HttpStatus.BAD_REQUEST).toString());
			response.setResponseMessage("user-name mandatory");
			response.setErrorDiscription("BAD_REQUEST");
		}else {
			response.setResponseCode((HttpStatus.OK).toString());
			response.setResponseMessage("OK");
			response.setData(name);
		}
		return response;
	}

}
