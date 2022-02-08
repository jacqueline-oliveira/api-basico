package br.com.tech4me.primeiraapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mensagens")
public class PrimeiraApiController {

    List<String> mensagens = new ArrayList<>();

    @GetMapping
    public String getMensagem() {
        return "Respondi a mensagem no browser";
    }

    @PostMapping
    public String cadastrarMensagem(@RequestBody String mensagem){
        mensagens.add(mensagem);
        return String.format("Mensagem ' %s ' cadastrada com sucesso!", mensagem);
    }
    
}
