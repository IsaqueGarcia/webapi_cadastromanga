package com.webapimanga.webapimanga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapimanga.webapimanga.models.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long> {

	Manga findById(long id);
	
}
