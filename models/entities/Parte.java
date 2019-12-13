package models.entities;

import java.util.Scanner;

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

	public static Parte parteSetup ( Scanner sc ) throws Exception {
		
		String nextLine;
		
		Organizacao empresa = null;
		Pessoa representante = null;
		
		while (sc.hasNext()) {
			
			nextLine = sc.nextLine();

			if ( nextLine.matches("\\s*empresa:") )
				empresa = Organizacao.organizacaoSetup(sc);
			
			else if ( nextLine.matches("\\s*representante:") )
				representante = Pessoa.pessoaSetup(sc);
			
			else {
				
				System.out.println("Insuficiente número de argumentos para parte!");
				return null;
				
			}

			if ( empresa != null &&
					representante != null ) {
				
				Parte newParte = new Parte ( empresa,
								                 representante );
				return newParte;
				
			}

		}
		
		return null;
		
	}

}