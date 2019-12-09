package models.documents;

import java.util.Date;

import models.entities.*;

public class Declaracao implements Documento {

    Parte parte;

    Date dataAssinatura;
    Local localAssinatura;
	
    Declaracao ( Parte parte,
                Date dataAssinatura,
                Local localAssinatura ) {
		
		this.parte = parte;
		this.dataAssinatura = dataAssinatura;
		this.localAssinatura = localAssinatura;
		
	}
	
	public Parte getParte () {
		
        return this.parte;
		
	}
	
	public Date getData () {
		
        return this.dataAssinatura;
		
	}
	
	public Local getLocal () {
		
        return this.localAssinatura;
		
	}

	@Override
	public Documento getDocumento() {
		
		return this;
		
	}

}