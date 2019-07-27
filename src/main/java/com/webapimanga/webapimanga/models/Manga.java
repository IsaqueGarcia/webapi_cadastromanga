package com.webapimanga.webapimanga.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MANGA")
public class Manga implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String nomeAutor;
	private String capitulo;
	private String desc;
	private Integer anoLancamento;
	
	
	public Manga() {
		
	}
	
	public Manga(Long id, String nome, String nomeAutor, String capitulo, String desc, Integer anoLancamento) {
		this.id = id;
		this.nome = nome;
		this.nomeAutor = nomeAutor;
		this.capitulo = capitulo;
		this.desc = desc;
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
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	
	
}
