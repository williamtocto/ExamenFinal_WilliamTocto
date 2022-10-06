package com.example.examenfinal_williamtocto.service;


import com.example.examenfinal_williamtocto.model.Producto;

import java.util.List;

public interface ProductoService {

    public Producto create(Producto c);
    public Producto save(Producto produc);
    public Producto findById(Integer id);
    public List<Producto> findByAll();
    public void eliminar(Integer id);
    Producto findByCode (String code);
}
