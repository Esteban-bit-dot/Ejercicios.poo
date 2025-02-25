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
