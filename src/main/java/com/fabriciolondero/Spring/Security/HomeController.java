package com.fabriciolondero.Spring.Security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Página inicial";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Painel Administrativo";
    }
}