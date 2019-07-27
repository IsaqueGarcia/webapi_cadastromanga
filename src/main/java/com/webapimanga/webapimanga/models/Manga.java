package com.webapimanga.webapimanga.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_MANGA")
public class Manga implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Size(max = 60)
	private String nome;
	
	@Size(max = 60)
	private String nomeAutor;
	
	@Size(max = 10)
	private String capitulo;
	
	@Size(max = 255)
	private String descricao;
	
	private Integer anoLancamento;
	
	
	public Manga() {
		
	}
	
	public Manga(Long id, String nome, String nomeAutor, String capitulo, String descricao, Integer anoLancamento) {
		this.id = id;
		this.nome = nome;
		this.nomeAutor = nomeAutor;
		this.capitulo = capitulo;
		this.descricao = descricao;
		this.anoLancamento = anoLancamento;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public String getCapitulo() {
		return capitulo;
	}
	
	public void setCapitulo(String capitulo) {
		this.capitulo = capitulo;
	}
	
	public String getDesc() {
		return descricao;
	}
	
	public void setDesc(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	
	
}
