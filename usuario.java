 public class Usuario extends Persona {
    public Usuario(String datonombre, String datoCorreo, int datocontraceña) {
        super(datonombre, datoCorreo, datocontraceña);
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
