package com.Karol_dev.LiterAlura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Karol_dev.LiterAlura.principal.Principal;
import com.Karol_dev.LiterAlura.repository.AutorRepository;
import com.Karol_dev.LiterAlura.repository.IdiomaRepository;
import com.Karol_dev.LiterAlura.repository.LibroRepository;

@SpringBootApplication
public class LiterAlura_Application implements CommandLineRunner {

	@Autowired
	private LibroRepository repositorioLibro;

	@Autowired
	private AutorRepository repositorioAutor;

	@Autowired
	private IdiomaRepository repositorioIdioma;


	public static void main(String[] args) {
		SpringApplication.run(LiterAlura_Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorioLibro, repositorioAutor, repositorioIdioma);
		principal.Menu();
	}
}
