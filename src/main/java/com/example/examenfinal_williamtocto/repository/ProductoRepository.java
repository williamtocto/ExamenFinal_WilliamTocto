package com.example.examenfinal_williamtocto.repository;

import com.example.examenfinal_williamtocto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}