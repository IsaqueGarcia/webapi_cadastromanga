package com.webapimanga.webapimanga.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping(value = "/mangaAPI")
public class MangaController {
	
	@Autowired
	MangaRepository mangaRepository;
	
	//Qual o tipo de mapeamento dele.
	@GetMapping(value = "/AllMangas")
	public List<Manga> listarMangas(){
		return mangaRepository.findAll();
	}
	
	@GetMapping(value = "/Mangaid/{id}")
	public Manga mangaId(@PathVariable(value="id") long id) {
		return mangaRepository.findById(id);
	}
	
	@PostMapping(value = "/Manga")
	public Manga insertManga(@RequestBody Manga manga) {
		return mangaRepository.save(manga);
	}
	
	@PutMapping(value = "/Manga")
	public Manga updateManga(@RequestBody Manga manga) {
		return mangaRepository.save(manga);
	}
	
	@DeleteMapping(value = "/Manga")
	public void deleteManga(@RequestBody Manga manga) {
		mangaRepository.delete(manga);
	}
	
	
}
