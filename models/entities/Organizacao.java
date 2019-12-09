package models.entities;

public class Organizacao {

    String nome;
    String CNPJ;
    Local sede;

	
	Organizacao ( String nome,
                String CNPJ,
                Local sede ) {
		
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.sede = sede;
		
	}
	
	public String getNome () {
		
        return this.nome;
		
	}
	
	public String getCNPJ () {
		
        return this.CNPJ;
		
	}
	
	public Local getSede () {
		
        return this.sede;
		
	}

}