package com.fishjam.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//26.5 Custom log configuration
//http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/

//http://docs.spring.io/spring/docs/4.3.0.BUILD-SNAPSHOT/spring-framework-reference/htmlsingle/
//http://spring.io/guides/

/***********************************************************************************************************************
 * 1.Gradle Wrapper -- 在编译工程时下载Gradle
 * 2.SDKMAN(Software Development Kit Manager) -- 什么东西? http://sdkman.io/ , 可通过 sdk install xxx 的方式安装 Spring Boot CLI 等
 * 3.命令行的自动完成 -- 需要 source 脚本(如 spring) 或将脚本放在 bash completion 的位置,如 /shell-completion/bash
 * 4.jar tvf xxx.jar -- 查看 jar中的内容
 ***********************************************************************************************************************/

/***********************************************************************************************************************
 * spring-boot-reference.pdf -- P
 *
 * 最佳实践(Best practices)
 *   1.start.spring.io -- 生成基础模版
 *   2.Spring Boot CLI -- 快速原型开发，允许运行 Groovy scripts，可以设置 %SPRING_HOME% 环境变量并将 bin 加入Path，可使用 spring.bat 脚本,可用命令:
 *     grab
 *     help
 *     jar
 *     run  myApp.groovy
 *     test
 *     version
 *
 *
 * embedded servers, security, metrics, health checks, externalized configuration
 * Tomcat 8/Jetty 9 + Servlet 3.1 + Java8
 ***********************************************************************************************************************/

/***********************************************************************************************************************
 * spring-boot-starter-parent + starters  -- 若不用 starter-parent 的话，可以通过 import
 * spring-boot-maven-plugin/spring-boot-gradle-plugin -- 创建可执行jar(在 parent 中配置了 <goal>repackage</goal> ),
 *   TODO: 使用了在 jar 中保存jar的方式(避免了多个jar中有相同文件名的问题), 原理是运行时通过 Boot Loader 解压执行?
 *   Maven: spring-boot:run
 *   Gradle: bootRun
 ***********************************************************************************************************************/

/***********************************************************************************************************************
 * http://docs.spring.io/spring/docs/4.3.0.BUILD-SNAPSHOT/spring-framework-reference/htmlsingle#mvc
 *   @RestController -- 是Controller，可以处理进入的Web请求( render the resulting string directly back to the caller )
 *   @RequestMapping -- HTTP地址映射到对应的处理方法或处理类
 *
 * @EnableAutoConfiguration -- 根据加入的jar依赖，猜测并自动配置Spring
 *
 *
 * [SpringApplication]
***********************************************************************************************************************/

@Configuration    //java-based configuration
@EnableAutoConfiguration()
@ComponentScan
//@SpringBootApplication    //等价写法
public class ApplicationMain {

  public static void main(String[] args) {
    //TODO:
    //  1.run 的第一个参数 source 表示是配置信息，可以是 java-based 的类, 也可以是 XML source,
    //    推荐用@Configuration 修饰的Java类（通过搜索  enable* 注解来找到配置信息?）
    //  2.You don’t need to put all your @Configuration into a single class. The @Import annotation can be used to
    //    import additional configuration classes. Alternatively, you can use @ComponentScan to automatically pick up
    //    all Spring components, including @Configuration classes.

    SpringApplication.run(ApplicationMain.class, args);
    //new SpringApplicationBuilder(ApplicationMain.class)
    //    .web(true)
    //    .bannerMode(Banner.Mode.CONSOLE)
    //    //.build().setWebEnvironment()
    //    .run(args);
  }
}
