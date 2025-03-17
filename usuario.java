 public class Usuario extends Persona {
  
    public Usuario(String datonombre, String datoCorreo, int datocontraceña) {
        return(datonombre, datoCorreo, datocontraceña);
    }
        Scanner objTeclado = new Scanner(System.in);
        Usuario objUsuario = new Usuario();
          
       System.out.println("Digite el nombre");
        String datoNombre = objteclado.nextLine();
        objUsuario.setNombreUsuario(datoNombre);

        System.out.println("Digite el Correo");
        String datoCorreo= objteclado.nextLine();
        objUsuario.setCorreoUsuario(datoCorreo);

       System.out.println("Digite la Contraseña");
        String datoContraseña= objteclado.nextLine();
        objUsuario.setCorreoUsuario(datoContraseña);
  
    public void reservarAsiento(String datosala) {
        if (datosala.hayAsientosDisponibles()) {
            datosala.reservarAsiento();
        } else {
            System.out.println("Lo siento, " + getNombre() + ", no hay asientos disponibles.");
        }
    }
    }
}
