package com.example.WebApi;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class Controller {

    @RequestMapping("/hello")
    public String Hello()
    {
        return "Hello";
    }

    @RequestMapping(path="/person"
            ,method = RequestMethod.GET
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson()
    {
        Person p = new Person("Schessl","Timo","22");
        return p;
    }



}
