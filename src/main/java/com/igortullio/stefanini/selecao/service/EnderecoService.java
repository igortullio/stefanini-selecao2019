package com.igortullio.stefanini.selecao.service;

import com.igortullio.stefanini.selecao.domain.Endereco;
import com.igortullio.stefanini.selecao.repository.EnderecoRepository;
import com.igortullio.stefanini.selecao.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Endereco findById(String id) {
        Optional<Endereco> endereco = enderecoRepository.findById(id);
        return endereco.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public Endereco insert(Endereco endereco) {
        return enderecoRepository.insert(endereco);
    }

    public void delete(String id) {
        findById(id);
        enderecoRepository.deleteById(id);
    }

}
