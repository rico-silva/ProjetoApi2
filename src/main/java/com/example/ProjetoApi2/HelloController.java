package com.example.ProjetoApi2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    String name = "Henrique";

    @GetMapping("/hello")
    public String helloWorld() {
        return "Primeira chamada de serviço de API";
    }

    @PostMapping ("/user")
    public String helloWorl(@RequestBody String name)    {
        return "Primeira chama de API: " + name;
    }
}
