package com.example.examenfinal_williamtocto.controller;


import com.example.examenfinal_williamtocto.model.Factura;
import com.example.examenfinal_williamtocto.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factura")
public class FacturaController {


    @Autowired
    FacturaService facturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Factura>>listar() {

      List<Factura> lista= facturaService.findByAll();

      return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Factura> crearUsuario(@RequestBody Factura u) {
      //  u.setCosto_total(calcularCosto(u.getArea()));
        return new ResponseEntity<>(facturaService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Factura> eliminarUsuario(@PathVariable Integer id) {
        facturaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public Factura actualizarCasa(@PathVariable Integer id, @RequestBody Factura c) {
        Factura facturaActual = facturaService.findById(id);
        facturaActual.setNumFactura(c.getNumFactura());
        facturaActual.setFecha(c.getFecha());
        facturaActual.setIdCliente(c.getIdCliente());

        return facturaService.save(facturaActual);
    }


}
