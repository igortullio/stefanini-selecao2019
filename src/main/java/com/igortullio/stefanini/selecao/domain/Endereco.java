package com.igortullio.stefanini.selecao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Endereco {
    @Id
    private String id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
}