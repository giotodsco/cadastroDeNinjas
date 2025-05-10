package dev.java10x.cadastroDeNinjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/rotaUm")
    public String rotaUm(){
        return "Olá, rota 1";
    }

    @GetMapping("/rotaDois")
    public String rotaDois(){
        return "Olá, rota 2";
    }
}
