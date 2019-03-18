package com.igortullio.stefanini.selecao.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "pessoa")
public class Pessoa {
    @Id
    private String id;
    private String nome;
    private String cpf;
    private String email;
    @DBRef(lazy = true)
    private List<Endereco> enderecos = new ArrayList<>();

    public Pessoa(String id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

}
