import java.util.Scanner;		//IMPORTAR SCANNER
public class PasarAMay�sculas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		//CREAR TECLADO
		String palabra = new String (teclado.next());		//CREAR CADENA Y ALMACENAR VALOR POR TECLADO
		
		char [] may�sculas = palabra.toCharArray();		//CREAR VECTOR IGUAL A LA CADENA (CADA CARACTER OCUPA UNA POSICION DEL VECTOR)
		for (int i=0;i<may�sculas.length;i++) {		//PARA TANTAS VECES COMO POSICIONES TENGA EL VECTOR
			if (may�sculas[i]>='a' && may�sculas[i]<='z') {		//SIEMPRE Y CUANDO EST�N LOS CARACTERES ENTRE LA A Y LA Z (NO LA � NI LAS TILDES)
				may�sculas[i]=(char)(may�sculas[i]-32);			//SUMAR 32 (PARA HACER MAY�SCULA)
			}
		}
		System.out.print("La palabra en may�sculas es: ");		//OUTPUT
		System.out.print(may�sculas);		//OUTPUT
	}

}
