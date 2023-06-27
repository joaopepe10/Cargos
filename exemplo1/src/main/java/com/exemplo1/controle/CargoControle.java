package com.exemplo1.controle;

import com.exemplo1.modelo.Cargo;
import com.exemplo1.repositorio.CargoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargos" )
public class CargoControle {
    @Autowired
    public CargoRepositorio cargo_repositorio;
    @GetMapping("/listar")
    public Iterable<Cargo> listar(){
        return cargo_repositorio.findAll();
    }
    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo obj){
        return cargo_repositorio.save(obj);
    }
}
