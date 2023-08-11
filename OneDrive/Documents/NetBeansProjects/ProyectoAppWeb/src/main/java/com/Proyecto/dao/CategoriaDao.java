package com.Proyecto.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

//interface que hereda de otra
public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}
