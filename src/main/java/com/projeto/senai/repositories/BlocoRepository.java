package com.projeto.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.projeto.senai.entities.Bloco;

@Repository
public interface BlocoRepository extends JpaRepository<Bloco, ID>{

}
