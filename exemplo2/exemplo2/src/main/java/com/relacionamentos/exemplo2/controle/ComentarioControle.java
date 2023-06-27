package com.relacionamentos.exemplo2.controle;

import com.relacionamentos.exemplo2.modelo.Comentario;
import com.relacionamentos.exemplo2.repositorio.ComentarioRepositorio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comentarios")
public class ComentarioControle {
    @Autowired
    private ComentarioRepositorio comentario_repositorio;
    @GetMapping("/listar")
    public Iterable<Comentario> listar(){
        return comentario_repositorio.findAll();
    }
    @PostMapping("/cadastrar")
    public Comentario cadastro(@RequestBody Comentario obj){
        return comentario_repositorio.save(obj);
    }
}
