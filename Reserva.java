# Ejercicios.poo
package ejercicios.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    
    public class principal {

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
public class Persona {
      
   private static String Nombre;
    private static String Correo;
    private int Telefono;
    
    public Persona(String datoNombre, String datoCorreo, int datoTelefono){
        Persona.Nombre = datoNombre;
        Persona.Correo = datoCorreo;
        this.Telefono = datoTelefono;
    }
    public int getTelefono(){
        int auxTelefono = this.Telefono;
       return auxTelefono;
    }
    public void setTelefono(int datoTelefono){
       this.Telefono = datoTelefono;
    }
    public void imprimirdatos(){
        System.out.println("El Nombre es: "+Persona.Nombre);
        System.out.println("El Correo es: "+Persona.Correo);
    }
    public static void telefono(){
        Persona objtelefono = new Telefono("");
        objtelefono.imprimirdatos();
        System.out.println("el telefono es: "+Persona.Telefono);
    }
    public class Usuario extends Persona {
    public Usuario(String datonombre, String datoCorreo) {
        super(datonombre, datoCorreo);
    }
    public void reservarAsiento(String datosala) {
        if (datosala.hayAsientosDisponibles()) {
            datosala.reservarAsiento();
        } else {
            System.out.println("Lo siento, " + getNombre() + ", no hay asientos disponibles.");
        }
    }
    }
}
public class Sala {
    private ArrayList<Asiento> Asientos;
    
    public Sala(int capacidad) {
        Asientos = new ArrayList<>(capacidad);
        for (int i = 0; i < capacidad; i++) {
            Asientos.add(new Asiento());
        }
    }
    
    public boolean hayAsientosDisponibles() {
        for (Asiento datoasiento : Asientos) {
            if (datoasiento.isDisponible()) {
                return true;
            }
        }
        return false;
    }
    
    public void reservarAsiento() {
        for (Asiento asiento : Asientos) {
            if (asiento.isDisponible()) {
                asiento.reservar();
                System.out.println("Asiento reservado.");
                return;
            }
        }
        System.out.println("No hay asientos disponibles.");
    }
}
public class Asiento {
    private boolean disponible;
    
    public Asiento() {
        this.disponible = true;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void reservar() {
        this.disponible = false;
    }
 }
}
    
