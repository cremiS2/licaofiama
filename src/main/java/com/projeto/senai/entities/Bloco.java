package com.projeto.senai.entities;

import java.time.Instant;

import com.atividade.desafio.entities.Atividade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_bloco")
public class Bloco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Instant inicio;
	private Instant fim;
	
	 @OneToOne
	    @JoinColumn(name = "atividade_id")  
	    private Atividade atividade;
	
	public Bloco() {
		
	}



	public Bloco(Integer id, Instant inicio, Instant fim) {
		
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Instant getInicio() {
		return inicio;
	}



	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}



	public Instant getFim() {
		return fim;
	}



	public void setFim(Instant fim) {
		this.fim = fim;
	}
	
	
	
}
