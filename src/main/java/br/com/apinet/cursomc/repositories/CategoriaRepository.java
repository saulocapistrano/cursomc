package br.com.apinet.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apinet.cursomc.damain.Categoria;

@Repository 
public interface CategoriaRepository extends JpaRepository<Categoria, Integer > {

}
