package com.example.examenfinal_williamtocto.service;


import com.example.examenfinal_williamtocto.model.Cliente;
import com.example.examenfinal_williamtocto.model.Factura;
import com.example.examenfinal_williamtocto.repository.ClienteRepository;
import com.example.examenfinal_williamtocto.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {
    @Autowired
    FacturaRepository facturaRepository;

    @Override
    public Factura create(Factura c) {
        return facturaRepository.save(c);
    }

    @Override
    public Factura save(Factura casa) {
        return facturaRepository.save(casa);
    }

    @Override
    public Factura findById(Integer id) {
        return facturaRepository.findById(id).orElse(new Factura());
    }

    @Override
    public List<Factura> findByAll() {
        return facturaRepository.findAll();
    }


    @Override
    public void eliminar(Integer id) {
        facturaRepository.deleteById(id);
    }

    @Override
    public Factura findByCode(String code) {
        return null;
    }


}
