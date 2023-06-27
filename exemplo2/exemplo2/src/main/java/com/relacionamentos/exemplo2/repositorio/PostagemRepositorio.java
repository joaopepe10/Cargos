package com.relacionamentos.exemplo2.repositorio;

import com.relacionamentos.exemplo2.modelo.Postagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepositorio extends CrudRepository<Postagem, Long> {
}
