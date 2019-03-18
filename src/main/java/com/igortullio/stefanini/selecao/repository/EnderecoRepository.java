package com.igortullio.stefanini.selecao.repository;

import com.igortullio.stefanini.selecao.domain.Endereco;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {
}
