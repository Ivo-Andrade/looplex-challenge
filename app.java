import java.io.File;
import java.util.Scanner;

import models.documents.Documento;

public class app {
	
	public static void main(String[] args) {
		File inputFile = null;
		
		if (0 < args.length) {
			
			inputFile = new File(args[0]);
//			
			Documento documento = documentoSetup(inputFile);
			 
			
		} else {
			
		   System.err.println("Invalid arguments count:" + args.length);
		   return;
		   
		}
		
	}

	public static Documento documentoSetup (File input) {
		
		Scanner sc = new Scanner(input);
		
		System.out.print(sc.nextLine());
				
				
		sc.close();
		
		return new Documento();
	}
	
}