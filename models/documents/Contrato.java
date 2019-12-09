package models.documents;

import java.util.ArrayList;
import java.util.Date;

import models.config.ConfigContrato;
import models.entities.*;

public class Contrato implements Documento {

    ArrayList<Parte> partes;

    ConfigContrato configContrato;

    Date dataAssinatura;
    Local localAssinatura;
	
	Contrato ( ArrayList<Parte> partes,
                ConfigContrato configContrato,
                Date dataAssinatura,
                Local localAssinatura ) {
		
		this.partes = partes;
		this.configContrato = configContrato;
		this.dataAssinatura = dataAssinatura;
		this.localAssinatura = localAssinatura;
		
	}
	
	public ArrayList<Parte> getPartes () {
		
        return this.partes;
		
	}
	
	public ConfigContrato getConfigContrato () {
		
        return this.configContrato;
		
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