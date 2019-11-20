package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.documents.Teste;
import com.example.demo.repository.TesteRepository;

@Service
public class TesteService {

	@Autowired
	private TesteRepository testeRepository;

	public void salvar(String nome, String conteudo) {

		testeRepository.save(new Teste(nome, conteudo));
	}

	public List<Teste> findAll() {
		return testeRepository.findAll();
	}

	public long count() {
		return testeRepository.count();
	}

	public Optional<Teste> findById(String id) {
		return testeRepository.findById(id);
	}

	public void delete(String id) {
		
		testeRepository.deleteById(id);
	}
}
