package com.projeto.senai.entities;

import java.util.List;

import com.atividade.desafio.entities.Atividade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer descricao;
	
	@OneToMany(mappedBy = "categoria")  
    private List<Atividade> atividades;
	
	
	public Categoria() {
		
	}




	public Categoria(Integer id, Integer descricao) {
		this.id = id;
		this.descricao = descricao;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Integer getDescricao() {
		return descricao;
	}




	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}
	
	
}
