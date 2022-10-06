package com.example.examenfinal_williamtocto.service;


import com.example.examenfinal_williamtocto.model.Cliente;

import java.util.List;

public interface ClienteService {

    public Cliente create(Cliente c);
    public Cliente save(Cliente casa);
    public Cliente findById(Integer id);
    public List<Cliente> findByAll();
    public void eliminar(Integer id);
    Cliente findByCode (String code);
}
