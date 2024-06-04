package com.mx.cbtis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.cbtis.modelo.Ventas;
import com.mx.cbtis.repository.VentasRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class VentasController {

	@Autowired
	VentasRepository ventastable;
	
	@GetMapping("/buscarVentas")
	public Ventas getVentas(@RequestParam int id_venta) {	
		
		Ventas registro = new Ventas();
		Optional <Ventas> ventas = ventastable.findById(id_venta);
		if(ventas.isPresent()) {
			registro = ventas.get();
		}
		return registro;
	}
	
	@PostMapping("/addVentas")
	public int addVentas(@RequestBody Ventas ventas) {
		int flag = 0;
		if(!ventas.equals(null)) {
			ventastable.save(ventas);
			flag = 1;
		}
	    return flag;
	}
	
	@PostMapping("/updateVentas")
	public int updateVentas(@RequestBody Ventas ventas) {
		int flag = 0;
		if(!ventas.equals(null)) {
			ventastable.save(ventas);
			flag = 1;
	    }	
	    return flag;
    }	
	
	@DeleteMapping("/deleteVentas")
	public int deleteVentas(@RequestBody Ventas ventas) {
		int flag = 0;
		if(!ventas.equals(null)) {
			ventastable.delete(ventas);
			flag = 1;
		}
		return flag;	
	}
	
	@PostMapping("/buscarVentas")
	public List<Ventas> getProductos(){
		List<Ventas> listaVentas = new ArrayList<>();
		ventastable.findAll().forEach(listaVentas::add);
		return listaVentas;		
	}
}
