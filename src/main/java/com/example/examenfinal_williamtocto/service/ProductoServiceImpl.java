package com.example.examenfinal_williamtocto.service;


import com.example.examenfinal_williamtocto.model.Cliente;
import com.example.examenfinal_williamtocto.model.Producto;
import com.example.examenfinal_williamtocto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public Producto create(Producto c) {
        return productoRepository.save(c);
    }

    @Override
    public Producto save(Producto casa) {
        return productoRepository.save(casa);
    }

    @Override
    public Producto findById(Integer id) {
        return productoRepository.findById(id).orElse(new Producto());
    }

    @Override
    public List<Producto> findByAll() {
        return productoRepository.findAll();
    }


    @Override
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto findByCode(String code) {
        return null;
    }


}
