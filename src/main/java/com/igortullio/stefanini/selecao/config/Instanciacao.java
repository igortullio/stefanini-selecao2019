package com.igortullio.stefanini.selecao.config;

import com.igortullio.stefanini.selecao.domain.Endereco;
import com.igortullio.stefanini.selecao.domain.Pessoa;
import com.igortullio.stefanini.selecao.repository.EnderecoRepository;
import com.igortullio.stefanini.selecao.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instanciacao implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public void run(String... args) throws Exception {
        pessoaRepository.deleteAll();
        enderecoRepository.deleteAll();

        Endereco e1 = new Endereco(null, "99999999", "Rua Tal", "Águas Claras", "Brasília", "DF");
        Endereco e2 = new Endereco(null, "88888888", "Rua Tal", "Eldorado", "Goiânia", "GO");

        Pessoa p1 = new Pessoa(null, "Igor", "99999999999", "igor@hotmail.com");
        Pessoa p2 = new Pessoa(null, "Túllio", "88888888888", "tullio@hotmail.com");
        Pessoa p3 = new Pessoa(null, "Santana", "77777777777", "santana@hotmail.com");

        p1.setEnderecos(Arrays.asList(e1, e2));
        p2.setEnderecos(Arrays.asList(e1));
        p3.setEnderecos(Arrays.asList(e2));

        enderecoRepository.saveAll(Arrays.asList(e1, e2));
        pessoaRepository.saveAll(Arrays.asList(p1, p2, p3));
    }


}
