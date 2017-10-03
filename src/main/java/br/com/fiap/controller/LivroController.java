package br.com.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.bean.Livro;
import br.com.fiap.dao.LivroDAO;

@RestController
public class LivroController {

	@Autowired
	private LivroDAO livroDAO;	
	
	@PostMapping(value = "/livro")
	public ResponseEntity<?> save(@RequestBody Livro livro) {
		livroDAO.save(livro);
		return new ResponseEntity<Livro>(livro, HttpStatus.OK);
	}	
	
}
