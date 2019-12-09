package models.entities;

public class Parte {

    Organizacao empresa;
    Pessoa representante;
	
	Parte ( Organizacao empresa,
                Pessoa representante ) {
		
		this.empresa = empresa;
		this.representante = representante;
		
	}
	
	public Organizacao getEmpresa () {
		
        return this.empresa;
		
	}
	
	public Pessoa getRepresentante () {
		
        return this.representante;
		
	}

}