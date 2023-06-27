package com.relacionamentos.exemplo2.repositorio;

import com.relacionamentos.exemplo2.modelo.Comentario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepositorio extends CrudRepository<Comentario, Long> {
}
