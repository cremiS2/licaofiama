package com.projeto.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.projeto.senai.entities.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, ID>{

}
