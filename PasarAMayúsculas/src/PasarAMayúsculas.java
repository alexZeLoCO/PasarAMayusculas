import java.util.Scanner;		//IMPORTAR SCANNER
public class PasarAMayúsculas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		//CREAR TECLADO
		String palabra = new String (teclado.next());		//CREAR CADENA Y ALMACENAR VALOR POR TECLADO
		
		char [] mayúsculas = palabra.toCharArray();		//CREAR VECTOR IGUAL A LA CADENA (CADA CARACTER OCUPA UNA POSICION DEL VECTOR)
		for (int i=0;i<mayúsculas.length;i++) {		//PARA TANTAS VECES COMO POSICIONES TENGA EL VECTOR
			if (mayúsculas[i]>='a' && mayúsculas[i]<='z') {		//SIEMPRE Y CUANDO ESTÉN LOS CARACTERES ENTRE LA A Y LA Z (NO LA Ñ NI LAS TILDES)
				mayúsculas[i]=(char)(mayúsculas[i]-32);			//SUMAR 32 (PARA HACER MAYÚSCULA)
			}
		}
		System.out.print("La palabra en mayúsculas es: ");		//OUTPUT
		System.out.print(mayúsculas);		//OUTPUT
	}

}
