/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.domain.Producto;
import java.util.List;

/**
 *
 * @author Eliecer_Brenes
 */
public interface ProductoService {

    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);

    // Se obtiene un Producto a apartir del id de una producto
    public Producto getProducto(Producto producto);

    //Se inserta una nueva producto si el id del catetgoria esta vacio
    // se actualiza una producto si el ide del cproducto no esta vacio
    public void save(Producto producto);

    //Se elimina la producto que tiene id por parametros
    public void delete(Producto producto);

    //Lista de productos con precio entre ordenados por descripcion consulta ampliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}
