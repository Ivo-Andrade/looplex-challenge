package models.entities;

import java.util.Scanner;

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

	public static Organizacao organizacaoSetup ( Scanner sc ) throws Exception {
		
		String nextLine;
		
		String nome = null;
		String CNPJ = null;
		Local sede = null;
		
		while ( sc.hasNext() ) {
			
			nextLine = sc.nextLine();

			if ( nextLine.matches("\\s*nome:.*") )
				nome = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*CNPJ:.*") )
				CNPJ = nextLine.substring( nextLine.lastIndexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*sede:.*") ) {
				
				sede = Local.localSetup(sc);
				if ( sede == null ) {

					System.out.println("Local não pode ser salvo para organização!");
					return null;
					
				}
				
			}
			
			else {
				
				System.out.println("Insuficiente número de argumentos para organização!");
				return null;
				
			}
			
			if ( nome != null &&
					CNPJ != null &&
					sede != null ) {
				
				Organizacao newOrganizacao = new Organizacao ( nome, 
																CNPJ,
																sede );
				return newOrganizacao;
				
			}
				
		}
		
		return null;
		
		
	}

}