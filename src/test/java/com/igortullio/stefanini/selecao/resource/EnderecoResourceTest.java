package com.igortullio.stefanini.selecao.resource;

import com.igortullio.stefanini.selecao.domain.Endereco;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnderecoResourceTest {

    @InjectMocks
    private EnderecoResource enderecoResource;

    @Test
    public void findAll() {
        enderecoResource.findAll();
    }

    @Test
    public void findById() {
        enderecoResource.findById("1");
    }

    @Test
    public void insert() {
        enderecoResource.insert(new Endereco(null, "66666666", "Logradouro", "Bairro", "Cidade", "Estado"));
    }

    @Test
    public void delete() {
        enderecoResource.delete("1");
    }

}
