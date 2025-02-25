import java.util.ArrayList;
import java.util.Scanner;
public class principal {
public String bienvenido (){
    System.out.println("***BIENVENIDO***");
}
    public static void main(String[] args) {
         Scanner Tomardatos = new Scanner(System.in);
         Sala datosala = new Sala(10); // Creando una sala con 10 asientos
        Usuario datoUsuario = new Usuario("");
        
        while (Sala.hayAsientosDisponibles()) {
            System.out.println("¿Desea reservar un asiento? (s/n)");
            String respuesta = Tomardatos.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                datoUsuario.reservarAsiento(Sala);
            } else {
                break;
            }
        }
        System.out.println("No hay más asientos disponibles o ha decidido no reservar más asientos.");
        Tomardatos.close();
      }
    }
