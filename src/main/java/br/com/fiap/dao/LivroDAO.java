package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import br.com.fiap.bean.Livro;

//@Component
public class LivroDAO {
	
	//@PersistenceContext	
	private EntityManager entityManager;
	
//	@Transactional
	public void save(Livro livro) {
		//entityManager.persist(livro);
		System.out.println("Dados salvo com sucesso !!");
	}	
}
