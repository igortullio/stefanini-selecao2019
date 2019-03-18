package com.igortullio.stefanini.selecao.resource;

import com.igortullio.stefanini.selecao.domain.Endereco;
import com.igortullio.stefanini.selecao.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Endereco>> findAll() {
        return ResponseEntity.ok().body(enderecoService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Endereco> findById(@PathVariable String id) {
        return ResponseEntity.ok().body(enderecoService.findById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Endereco endereco) {
        Endereco e = enderecoService.insert(endereco);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(e.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        enderecoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
