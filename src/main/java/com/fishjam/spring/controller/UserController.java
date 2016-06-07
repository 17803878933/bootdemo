package com.fishjam.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class UserController {

  @RequestMapping("/hello")
  @ResponseBody
  public String hello(){
    return "Hello World " + new Date().toString();
  }
}
