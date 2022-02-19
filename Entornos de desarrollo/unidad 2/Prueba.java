
public class Prueba {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		char letra='*';
		String cadena="";
		
		while(cadena.length()<100) {
			if(cadena.length()%2==0)
				cadena=añadirLetras(cadena,letra,1);
			else
				cadena=añadirLetras(cadena,letra,2);
		}
		System.out.println(cadena);
		System.out.println(cadena.length());

	}

	
	
	public static String añadirLetras(String cad,char car,int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			cad=cad+car;			
		}
		return cad;
	}
	
	
	
}
