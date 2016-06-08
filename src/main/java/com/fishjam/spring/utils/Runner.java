package com.fishjam.spring.utils;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)   //指定在多个 ApplicationRunner 和 CommandLineRunner 队列中的运行顺序
public class Runner implements ApplicationRunner {
  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("Runner.run");
  }

}
