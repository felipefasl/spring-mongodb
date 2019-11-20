package com.example.demo.documents;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Document(collection="autpag")
public class Teste implements Serializable {

	@Id	@Getter @Setter private TestePK id;
	@Getter @Setter private String observacoes;
	@Getter @Setter private Double valor;
}
