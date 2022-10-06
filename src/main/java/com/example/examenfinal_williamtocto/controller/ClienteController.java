package com.example.examenfinal_williamtocto.controller;

import com.example.examenfinal_williamtocto.model.Cliente;
import com.example.examenfinal_williamtocto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {


    @Autowired
    ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>>listar() {

      List<Cliente> lista= clienteService.findByAll();

      return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearUsuario(@RequestBody Cliente u) {
      //  u.setCosto_total(calcularCosto(u.getArea()));
        return new ResponseEntity<>(clienteService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminarUsuario(@PathVariable Integer id) {
        clienteService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public Cliente actualizarCasa(@PathVariable Integer id, @RequestBody Cliente c) {
        Cliente clienteActual = clienteService.findById(id);
        clienteActual.setApellido(c.getApellido());
        clienteActual.setNombre(c.getNombre());
        clienteActual.setTelefono(c.getTelefono());
        clienteActual.setDni(c.getDni());

        return clienteService.save(clienteActual);
    }


}
