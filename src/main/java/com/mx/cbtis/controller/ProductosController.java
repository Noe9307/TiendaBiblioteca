package com.mx.cbtis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.cbtis.modelo.Productos;
import com.mx.cbtis.repository.ProductosRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductosController {
	@Autowired
	ProductosRepository productostable;
	
	@GetMapping("/buscarProductos")
	public Productos getProductos(@RequestParam int id_prod) {	
		
		Productos registro = new Productos();
		Optional <Productos> productos = productostable.findById(id_prod);
		if(productos.isPresent()) {
			registro = productos.get();
		}
		return registro;
	}
	
	@PostMapping("/addProductos")
	public int addProductos(@RequestBody Productos productos) {
		int flag = 0;
		if(!productos.equals(null)) {
			productostable.save(productos);
			flag = 1;
		}
	    return flag;
	}
	
	@PostMapping("/updateProductos")
	public int updateProductos(@RequestBody Productos productos) {
		int flag = 0;
		if(!productos.equals(null)) {
			productostable.save(productos);
			flag = 1;
	    }	
	    return flag;
    }	
	
	@DeleteMapping("/deleteProductos")
	public int deleteProductos(@RequestBody Productos productos) {
		int flag = 0;
		if(!productos.equals(null)) {
			productostable.delete(productos);
			flag = 1;
		}
		return flag;	
	}
	
	@PostMapping("/mostrarProductos")
	public List<Productos> getProductos(){
		List<Productos> listaProductos = new ArrayList<>();
		productostable.findAll().forEach(listaProductos::add);
		return listaProductos;		
	}
}
