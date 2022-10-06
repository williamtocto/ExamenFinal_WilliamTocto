package com.example.examenfinal_williamtocto.controller;

import com.example.examenfinal_williamtocto.model.Cliente;
import com.example.examenfinal_williamtocto.model.Producto;

import com.example.examenfinal_williamtocto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {


    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>>listar() {

      List<Producto> lista= productoService.findByAll();

      return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Producto> crearUsuario(@RequestBody Producto u) {
      //  u.setCosto_total(calcularCosto(u.getArea()));
        return new ResponseEntity<>(productoService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Producto> eliminarUsuario(@PathVariable Integer id) {
        productoService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public Producto actualizarCasa(@PathVariable Integer id, @RequestBody Producto c) {
        Producto productoActual = productoService.findById(id);
        productoActual.setProducto(c.getProducto());
        productoActual.setCantidad(c.getCantidad());
        productoActual.setPrecio(c.getPrecio());
        productoActual.setIdFactura(c.getIdFactura());

        return productoService.save(productoActual);
    }


}
