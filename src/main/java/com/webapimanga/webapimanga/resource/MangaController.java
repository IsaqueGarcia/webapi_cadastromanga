package com.webapimanga.webapimanga.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapimanga.webapimanga.models.Manga;
import com.webapimanga.webapimanga.repository.MangaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/mangaAPI")
@Api(value = "WEB API MANGAS CADASTRO")
@CrossOrigin(origins = "*")
public class MangaController {
	
	@Autowired
	MangaRepository mangaRepository;
	
	//Qual o tipo de mapeamento dele.
	@ApiOperation(value = "Procura por todos os mangas no banco de dados")
	@GetMapping(value = "/AllMangas")
	public List<Manga> listarMangas(){
		return mangaRepository.findAll();
	}
	
	@ApiOperation(value = "Procura um manga em especifico no banco usando um id como argumento")
	@GetMapping(value = "/Mangaid/{id}")
	public Manga mangaId(@PathVariable(value="id") long id) {
		return mangaRepository.findById(id);
	}
	
	@ApiOperation(value = "Salva um novo manga no banco de dados")
	@PostMapping(value = "/Manga")
	public Manga insertManga(@RequestBody Manga manga) {
		return mangaRepository.save(manga);
	}
	
	@ApiOperation(value = "Atualiza um manga existente")
	@PutMapping(value = "/Manga")
	public Manga updateManga(@RequestBody Manga manga) {
		return mangaRepository.save(manga);
	}
	
	@ApiOperation(value = "Deleta um manga do banco de dados")
	@DeleteMapping(value = "/Manga")
	public void deleteManga(@RequestBody Manga manga) {
		mangaRepository.delete(manga);
	}
	
	
}
