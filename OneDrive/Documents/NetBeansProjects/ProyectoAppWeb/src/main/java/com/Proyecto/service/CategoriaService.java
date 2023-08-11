package com.Proyecto.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);

    // Se obtiene un Categoria a apartir del id de una categoria
    public Categoria getCategoria(Categoria categoria);

    //Se inserta una nueva categoria si el id del catetgoria esta vacio
    // se actualiza una categoria si el ide del ccategoria no esta vacio
    public void save(Categoria categoria);

    //Se elimina la categoria que tiene id por parametros
    public void delete(Categoria categoria);
}
