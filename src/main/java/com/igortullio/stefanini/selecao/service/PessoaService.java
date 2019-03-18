package com.igortullio.stefanini.selecao.service;

import com.igortullio.stefanini.selecao.domain.Pessoa;
import com.igortullio.stefanini.selecao.repository.PessoaRepository;
import com.igortullio.stefanini.selecao.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa findById(String id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public Pessoa insert(Pessoa pessoa) {
        return pessoaRepository.insert(pessoa);
    }

    public void delete(String id) {
        findById(id);
        pessoaRepository.deleteById(id);
    }

}
