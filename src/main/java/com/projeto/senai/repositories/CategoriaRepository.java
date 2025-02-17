package com.projeto.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.projeto.senai.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, ID> {

}
