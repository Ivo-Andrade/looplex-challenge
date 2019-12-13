package models.entities;

import java.util.Scanner;

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

	public static Pessoa pessoaSetup ( Scanner sc ) throws Exception {
		
		String nextLine;
		
		String nome = null;
		String RG = null;
		String cargo = null;
		Local domicilio = null;
		
		while ( sc.hasNext() ) {
			
			nextLine = sc.nextLine();

			if ( nextLine.matches("\\s*nome:.*") )
				nome = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*RG:.*") )
				RG = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();
			
			else if ( nextLine.matches("\\s*cargo:.*") )
				cargo = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*domicilio:.*") ) {
				
				domicilio = Local.localSetup(sc);
				
			}
			
			else {
				
				System.out.println("Insuficiente número de argumentos");
				return null;
				
			}
			
			if ( nome != null &&
					RG != null &&
					cargo != null &&
					domicilio != null ) {
				
				Pessoa newPessoa = new Pessoa ( nome, 
													RG,
													cargo,
													domicilio );
				return newPessoa;
				
			}
				
		}
		
		return null;
		
		
	}

}