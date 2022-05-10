package br.com.apinet.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apinet.cursomc.damain.Produto;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Integer > {

}
