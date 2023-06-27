package com.relacionamentos.exemplo3.repositorio;

import com.relacionamentos.exemplo3.modelo.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositorio extends CrudRepository<Aluno, Long> {
}
