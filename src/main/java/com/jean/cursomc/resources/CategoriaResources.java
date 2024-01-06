package com.jean.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jean.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

	@GetMapping
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1,"informática");
		Categoria cat2 = new Categoria(2,"escritório");
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(cat1);
		categorias.add(cat2);
		
		return categorias;
	}
}
