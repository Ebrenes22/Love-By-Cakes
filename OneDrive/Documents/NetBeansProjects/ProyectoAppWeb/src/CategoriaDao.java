package com.Proyecto.Dao;
import com.Proyecto.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria,Long>{
    
}
