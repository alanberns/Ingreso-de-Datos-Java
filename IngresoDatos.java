import java.util.Scanner;


public class IngresoDatos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingresa tu nombre");
		String nombre = scanner.next();
		
		System.out.println("ingresa tu apellido");
		String apellido = scanner.next();
		
		System.out.println("ingresa tu edad");
		int edad = scanner.nextInt();
		
		System.out.println("ingresa tu hobbie");
		String hobbie = scanner.next();
		
		System.out.println("ingresa tu editor de textos favorito");
		String editor = scanner.next();
		
		System.out.println("ingresa tu sistema operativo");
		String so = scanner.next();
		
		
		System.out.println("nombre: "+nombre+ "\n"+
				"apellido: "+apellido+"\n"+
				"edad: "+edad+"\n"+
				"hobbie: "+hobbie+"\n"+
				"editor de texto: "+editor+"\n"+
				"sistema operativo: "+so+"\n"
				);



	}

}
