package com.example.examenfinal_williamtocto.service;


import com.example.examenfinal_williamtocto.model.Factura;

import java.util.List;

public interface FacturaService {

    public Factura create(Factura c);
    public Factura save(Factura casa);
    public Factura findById(Integer id);
    public List<Factura> findByAll();
    public void eliminar(Integer id);
    Factura findByCode (String code);
}

