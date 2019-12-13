import java.io.File;

import models.documents.Documento;

public class app {
	
	public static void main(String[] args) {
		
		File inputFile = null;
		
		Documento documento = null;
			
		inputFile = new File(args[0]);
		
		if (inputFile != null) {
			
			try {

				documento = Documento.documentoSetup(inputFile);
				
			} catch ( Exception e ) {
				
				System.out.println(e);
				return;
				
			}
			
			if ( documento != null ) {
				
				System.out.println( "Objeto de documento '"
						+ documento.getNome() 
						+ "' criado com sucesso, em nome de '"
						+ documento.getPartes().get(0).getEmpresa().getNome()
						+ "' !" );
				
			}
			
		}
	
	}
	
}