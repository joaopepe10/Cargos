package com.relacionamentos.exemplo2.controle;

import com.relacionamentos.exemplo2.modelo.Postagem;
import com.relacionamentos.exemplo2.repositorio.PostagemRepositorio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postagem")
public class PostagemControle {
    @Autowired
    private PostagemRepositorio postagem_repositorio;
    @GetMapping("/listar")
    public Iterable<Postagem> listar(){
        return postagem_repositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Postagem cadastro(@RequestBody Postagem obj){
        return postagem_repositorio.save(obj);
    }

}
