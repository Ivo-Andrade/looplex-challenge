package models.entities;

public class Local {

    String endereco;
    String complemento;
    Integer numero;
    String bairro;
    String cidade;
    String estado;
	
	Local ( String endereco,
                String complemento,
                Integer numero,
                String bairro,
                String cidade,
                String estado ) {
		
		this.endereco = endereco;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		
	}
	
	public String getLocalCompleto () {
		
        if ( this.complemento != null && this.bairro != null ) 
            return this.endereco 
                    + ", " + this.complemento
                    + ", " + this.numero
                    + " - " + this.bairro
                    + ", " + this.cidade
                    + " - " + this.estado;
		
        if ( this.complemento != null ) 
            return this.endereco 
                    + ", " + this.complemento
                    + ", " + this.numero
                    + ", " + this.cidade
                    + " - " + this.estado;
		
        if ( this.bairro != null ) 
            return this.endereco 
                    + ", " + this.numero
                    + " - " + this.bairro
                    + ", " + this.cidade
                    + " - " + this.estado;

        else
            return this.endereco 
                    + ", " + this.numero
                    + ", " + this.cidade
                    + " - " + this.estado;
		
	}

}