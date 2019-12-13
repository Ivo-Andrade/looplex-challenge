package models.entities;

import java.util.Scanner;

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

	public static Local localSetup ( Scanner sc ) throws Exception {
		
		String nextLine;

	    String endereco = null;
	    String complemento = null;
	    Integer numero = null;
	    String bairro = null;
	    String cidade = null;
	    String estado = null;
		
		while ( sc.hasNext() ) {
			
			nextLine = sc.nextLine();

			if ( nextLine.matches("\\s*endereco:.*") )
				endereco = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*complemento:.*") )
				complemento = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*numero:.*") )
				numero = Integer.parseInt( nextLine.substring(nextLine.lastIndexOf(":") + 1 ).trim());

			else if ( nextLine.matches("\\s*bairro:.*") )
				bairro = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*cidade:.*") )
				cidade = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*estado:.*") )
				estado = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();
			
			else {
				
				System.out.println("Insuficiente número de argumentos para local!");
				return null;
				
			}

			if ( endereco != null &&
				    complemento != null &&
				    numero != null &&
				    bairro != null &&
				    cidade != null &&
				    estado != null ) {
				
				Local newLocal = new Local ( endereco,
								                 complemento,
								                 numero,
								                 bairro,
								                 cidade,
								                 estado );
				return newLocal;
				
			}
			
		}
		
		return null;
		
	}

}