package com.Proyecto.service;
import com.Proyecto.domain.Categoria;
import java.util.List;
public interface CategoriaService {
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    
    // Se obtiene una Categoria, a partir del id de una categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacio
    // Se actualiza un categoria di el id del categoria NO esta vacio
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parametros
    public void delete(Categoria categoria);
}
