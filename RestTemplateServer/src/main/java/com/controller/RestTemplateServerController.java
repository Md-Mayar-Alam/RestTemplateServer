package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestTemplateServerController {

	@ResponseBody
	@RequestMapping(method= RequestMethod.GET, value="/restServerHello")
	public String restServerMessage() {
		return "Rest msg from Server";
	}
}
