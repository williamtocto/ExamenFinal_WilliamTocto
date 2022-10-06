package com.example.examenfinal_williamtocto.service;


import com.example.examenfinal_williamtocto.model.Cliente;
import com.example.examenfinal_williamtocto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Cliente create(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public Cliente save(Cliente casa) {
        return clienteRepository.save(casa);
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id).orElse(new Cliente());
    }

    @Override
    public List<Cliente> findByAll() {
        return clienteRepository.findAll();
    }


    @Override
    public void eliminar(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente findByCode(String code) {
        return null;
    }


}
