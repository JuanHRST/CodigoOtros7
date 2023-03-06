import java.util.HashMap; // Se importo el HashMap
import java.util.Scanner; // Se importo el scanner
	
//Este código sirve para ingresar un país y te dice la capital del pais si es parte de la base de datos.
public class Codigo7 { //Se quito el acento a código
	
	public static void main(String[] args) { //Se agrega el public static void main 
	   Scanner s = new Scanner(System.in); //Se agrego el System.in

    HashMap<String, String> capitales = new HashMap<>(); //se completo a capitales, Se modifico a String, String el Hash Map

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador"); // Se agregó la capital
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = ""; //Se agrego la "r" a Sting

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: "); //Se cambio el syso de in a out
      c = s.nextLine(); //Se modifico de nextDouble a nextLine 
      
      if (!c.equals("salir")) { // Se agrego la "s" a equal
        if (capitales.containsKey(c)) { //se completo de "ca" a "capitales para de que coincida y se cambio de value a key
          System.out.print("La capital de " + c); //Se agrego out
          System.out.println(" es " + capitales.get(c)); //se completo de "ca" a "capitales para de que coincida y se cambio el metodo de put a get
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String capital = s.nextLine();
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir")); //Se modifico a While, se completo con un ")"
  }

}