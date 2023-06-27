package com.exemplo1.controle;

import com.exemplo1.modelo.Colaborador;
import com.exemplo1.repositorio.ColaboradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorControle {
    @Autowired
    private ColaboradorRepositorio colaborador_repositorio;
    @GetMapping("/listar")
    public Iterable<Colaborador> listar(){
        return colaborador_repositorio.findAll();
    }
    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj){
        return colaborador_repositorio.save(obj);
    }
}
