package com.relacionamentos.exemplo3.repositorio;

import com.relacionamentos.exemplo3.modelo.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends CrudRepository<Curso, Long> {
}
