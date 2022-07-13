package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;
/*componente do sistema responsável para acessar o banco de dados (salvar, buscar, deletar, atualizar)*/
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
