package models.documents;

import java.util.ArrayList;
import java.util.Date;

import models.entities.*;

public class Acordo implements Documento {

	String tipo;
	String nome;

	ArrayList<Parte> partes;

    Date dataAssinatura;
    Local localAssinatura;
	
	Acordo ( ArrayList<Parte> partes,
                Date dataAssinatura,
                Local localAssinatura ) {
		
		this.partes = partes;
		this.dataAssinatura = dataAssinatura;
		this.localAssinatura = localAssinatura;
		
	}
	
	public ArrayList<Parte> getPartes () {
		
        return this.partes;
		
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

}