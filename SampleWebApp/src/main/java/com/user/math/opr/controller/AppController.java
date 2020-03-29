package com.user.math.opr.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.math.opr.model.DataObj;
import com.user.math.opr.model.Result;

@RestController
@RequestMapping("/api")
public class AppController 
{
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String hello()
	{
		return "Hello World!!!";
	}
	
	@PostMapping(path = "/add", produces=MediaType.APPLICATION_JSON)
	public Result addOpr(@RequestBody DataObj obj)
	{
		Result oResult = new Result();
		oResult.setResult(obj.getX() + obj.getY());
		return oResult;
	}
	
	@PostMapping(path = "/diff", produces=MediaType.APPLICATION_JSON)
	public Result diffOpr(@RequestBody DataObj obj)
	{
		Result oResult = new Result();
		oResult.setResult(obj.getX() - obj.getY());
		return oResult;
	}
}
