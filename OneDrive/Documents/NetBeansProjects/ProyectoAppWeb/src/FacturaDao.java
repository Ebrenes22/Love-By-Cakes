package com.Proyecto.Dao;
import com.Proyecto.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FacturaDao extends JpaRepository <Factura,Long>{
    
}
