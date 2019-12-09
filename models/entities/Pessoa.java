package models.entities;

public class Pessoa {

    String nome;
    String RG;
    String cargo;
    Local domicilio;

	
	Pessoa ( String nome,
                String RG,
                String cargo,
                Local domicilio ) {
		
		this.nome = nome;
		this.RG = RG;
		this.cargo = cargo;
		this.domicilio = domicilio;
		
	}
	
	public String getNome () {
		
        return this.nome;
		
	}
	
	public String getRG () {
		
        return this.RG;
		
	}
	
	public String getCargo () {
		
        return this.cargo;
		
	}
	
	public Local getDomicilio () {
		
        return this.domicilio;
		
	}

}