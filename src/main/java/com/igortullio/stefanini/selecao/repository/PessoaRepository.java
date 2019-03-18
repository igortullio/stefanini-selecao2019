package com.igortullio.stefanini.selecao.repository;

import com.igortullio.stefanini.selecao.domain.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String> {
}
