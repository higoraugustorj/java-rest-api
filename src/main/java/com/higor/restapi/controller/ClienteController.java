package com.higor.restapi.controller;

import com.higor.restapi.model.Cliente;
import com.higor.restapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Cliente> adicionar(@RequestBody List<Cliente> novoCliente) {
        return clienteRepository.saveAll(novoCliente);
    }
}
