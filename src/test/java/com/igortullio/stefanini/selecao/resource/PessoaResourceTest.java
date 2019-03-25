package com.igortullio.stefanini.selecao.resource;

import com.igortullio.stefanini.selecao.domain.Pessoa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PessoaResourceTest {

    @InjectMocks
    private PessoaResource pessoaResource;

    @Test
    public void findAll() {
        pessoaResource.findAll();
    }

    @Test
    public void findById() {
        pessoaResource.findById("1");
    }

    @Test
    public void insert() {
        pessoaResource.insert(new Pessoa(null, "Igor", "66666666666", "teste@teste.com"));
    }

    @Test
    public void delete() {
        pessoaResource.delete("1");
    }

}
