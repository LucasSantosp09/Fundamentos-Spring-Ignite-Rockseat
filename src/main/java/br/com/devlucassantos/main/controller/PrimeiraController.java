package br.com.devlucassantos.main.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id){
        return "O parametro é " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
        return "O parametro com metodoComQueryParams é" + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams){
        return "O parametro com metodoComQueryParams2 é" + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String meotodoComBodyParams(@RequestBody Usuario usuario ){
        return "meotodoComBodyParams " + usuario.username();
    }

    @PostMapping("/metodoComHeaders")
    public String meotodoComBodyParams(@RequestHeader ("name") String name){
        return "metodoComHeaders " + name;
    }
    record Usuario(String username){}
}
