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
