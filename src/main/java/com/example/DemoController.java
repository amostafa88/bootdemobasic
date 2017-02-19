package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amost on 10-Feb-17.
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String getHelloMessage(){

        return "hello world";

    }

}
