package com.example.demo.documents;


import lombok.Getter;
import lombok.Setter;

public class TestePK {

	@Getter @Setter
	private Long contrato;
	
	@Getter @Setter
	private int parcela;
	
	public TestePK(Long contrato, int parcela) {
		
		this.contrato = contrato;
		this.parcela = parcela;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
		result = prime * result + parcela;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestePK other = (TestePK) obj;
		if (contrato == null) {
			if (other.contrato != null)
				return false;
		} else if (!contrato.equals(other.contrato))
			return false;
		if (parcela != other.parcela)
			return false;
		return true;
	}
	
	
}
