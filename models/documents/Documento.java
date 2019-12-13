package models.documents;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import models.entities.Local;
import models.entities.Parte;

public interface Documento {
	
	public Documento getDocumento ();
	
	public String getNome ();
	
	public String getTipo ();
	
	public ArrayList<Parte> getPartes ();
	
	public Date getData ();
	
	public Local getLocal ();

	public static Documento documentoSetup (File input) throws Exception {
		
		Scanner sc = new Scanner(input);
		
		String nextLine;
		Documento documento;
		
		while (sc.hasNext()) {
			
			nextLine = sc.nextLine();

			if ( nextLine.matches("^declaracao:") ) {

				documento = Declaracao.declaracaoSetup(sc);
				sc.close();
				return documento;
				
			}
			
			else {

				sc.close();
				System.out.println("Documento não reconhecido!");
				return null;
				
			}
			
		}
		
		sc.close();
		System.out.println("Documento não identificado!");
		return null;
		
	}
	
}
