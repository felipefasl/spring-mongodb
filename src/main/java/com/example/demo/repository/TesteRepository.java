package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.documents.Teste;

public interface TesteRepository extends MongoRepository<Teste, String>{

}
