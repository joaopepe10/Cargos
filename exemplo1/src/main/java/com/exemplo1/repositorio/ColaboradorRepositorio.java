package com.exemplo1.repositorio;

import com.exemplo1.modelo.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepositorio extends CrudRepository<Colaborador, Long> {
}
