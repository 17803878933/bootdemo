package com.fishjam.spring.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandArguments{// implements EnvironmentAware {

  //该类可以访问命令行参数
  @Autowired
  public CommandArguments(ApplicationArguments args) {

    boolean debug = args.containsOption("debug");
    List<String> files = args.getNonOptionArgs();
    // if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
  }

  //@Override
  //public void setEnvironment(Environment environment) {
  //
  //}
}
