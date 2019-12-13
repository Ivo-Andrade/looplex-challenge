package models.documents;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import models.entities.*;

public class Declaracao implements Documento {

	String tipo;
	String nome;

    Parte parte;

    Date dataAssinatura;
    Local localAssinatura;
	
    Declaracao ( String tipo,
	    			String nome,
	    			Parte parte,
	                Date dataAssinatura,
	                Local localAssinatura ) {
		
    	this.tipo = tipo;
    	this.nome = nome;
		this.parte = parte;
		this.dataAssinatura = dataAssinatura;
		this.localAssinatura = localAssinatura;
		
	}
	
	public ArrayList<Parte> getPartes () {
		
        return new ArrayList<>( Arrays.asList(this.parte) );
		
	}
	
	public Date getData () {
		
        return this.dataAssinatura;
		
	}
	
	public Local getLocal () {
		
        return this.localAssinatura;
		
	}
	
	public String getNome () {
		
        return this.nome;
		
	}
	
	public String getTipo () {
		
        return this.tipo;
		
	}

	@Override
	public Documento getDocumento() {
		
		return this;
		
	}

	public static Documento declaracaoSetup ( Scanner sc ) throws Exception {
		
		String nextLine;
		
		String tipo = null;
		String nome = null;
		Parte parte = null;
		Date dataAssinatura =  null;
		Local localAssinatura = null;
		
		while (sc.hasNext()) {
			
			nextLine = sc.nextLine();

			if ( nextLine.matches("\\s*tipo:.*") ) 
				tipo = nextLine.substring( nextLine.indexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*nome:.*") ) 
				nome = nextLine.substring( nextLine.indexOf(":") + 1 ).trim();

			else if ( nextLine.matches("\\s*parte:") ) 
				parte = Parte.parteSetup(sc);

			else if ( nextLine.matches("\\s*dataAssinatura:.*") ) {

				DateFormat formatoData = new SimpleDateFormat ("dd/MM/yyyy, HH:mm:ss");
				dataAssinatura = formatoData.parse( nextLine.substring( nextLine.indexOf(":") + 1 ).trim() );
				
			}

			else if ( nextLine.matches("\\s*localAssinatura:.*") ) {
				
				localAssinatura = Local.localSetup(sc);
				if ( localAssinatura == null ) {

					System.out.println("Local não pode ser salvo para organização!");
					 return null;
					
				}
				
			}
			
			else {
				
				System.out.println("Insuficiente número de argumentos para declaração!");
				return null;
				
			}

			if ( tipo != null &&
					nome != null &&
					parte != null &&
					dataAssinatura != null &&
					localAssinatura != null ) {
				
				Declaracao newDeclaracao = new Declaracao( tipo, 
															nome, 
															parte, 
															dataAssinatura,
															localAssinatura );
				return newDeclaracao;
				
			}
			
		}
		
		return null;
		
	}

}