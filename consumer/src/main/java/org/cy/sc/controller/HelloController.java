package org.cy.sc.controller;

import lombok.extern.apachecommons.CommonsLog;
import org.cy.sc.feign.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@CommonsLog
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloFeignService helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name)  {
        log.info("the name is " + name);
        return helloRemote.hello(name) + "\n" + new Date().toString();
    }


    @GetMapping("/testCustomFilter/{name}")
    public String customFilter(@PathVariable("name") String name)  {
        log.info("the name is " + name);
        return helloRemote.customFilter(name) + "\n" + new Date().toString();
    }


}
