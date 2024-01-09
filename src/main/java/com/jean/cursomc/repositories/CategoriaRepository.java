package com.jean.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.cursomc.domain.Categoria;

/** Interface responsável pelo OBJETO que irá realizar operações no banco de dados */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
