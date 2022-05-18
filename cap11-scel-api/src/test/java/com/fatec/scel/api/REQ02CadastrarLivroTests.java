package com.fatec.scel.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.scel.mantemLivro.model.Livro;
import com.fatec.scel.mantemLivro.ports.LivroRepository;
@SpringBootTest
class REQ02CadastrarLivroTests {
	
	@Autowired
	LivroRepository repository;

	@Test
	void ct01_quando_dados_validos_isbn_nao_cadastrado_retorna1() {
		// Dado – que o atendente tem um livro não cadastrado
		Livro livro = new Livro("3333", "Teste de Software", "Delamaro");
		// Quando – o atendente cadastra um livro com informações validas
		repository.save(livro);
		// Então – o sistema valida os dados E permite a consulta do livro
		assertEquals(1, repository.count());
	}


}
