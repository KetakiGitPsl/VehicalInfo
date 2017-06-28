package com.psl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.psl.model.Info;

@Controller
public class VehicalContoller {
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public @ResponseBody Info getInfo(){
		return new Info("abcd Mac", 1234, 5678);
	}

}
