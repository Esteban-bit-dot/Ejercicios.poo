public class Persona {
      
   private static String Nombre;
   private static String Correo;
   private static int Cedula;
   private int Telefono;
    
    public Persona(String datoNombre, String datoCorreo, int datoCedula, int datoTelefono){
        Persona.Nombre = datoNombre();
        Persona.Correo = datoCorreo();
        Persona.Cedula = datoCedula();
        this.Telefono = datoTelefono();
       
        Scanner objTeclado = new Scanner(System.in);
        Persona objPersona = new Persona();
          
       System.out.println("Digite el nombre");
        String datoNombre = objteclado.nextLine();
        objPersona.setNombrePersona(datoNombre);

        System.out.println("Digite el Correo");
        String datoCorreo= objteclado.nextLine();
        objPersona.setCorreoPersona(datoCorreo);

       System.out.println("Digite el Cedula");
        int datoCedula = objteclado.nextLine();
        objPersona.setCedulaPersona(datoCedula);
    }
    
    public int Telefono(){
        System.out.println("Digite el telefono");
        int datoTelefono = objteclado.nextLine();
        objPersona.setTelefonoPersona(datoTelefono);
    }
   
    public void imprimirdatos(){
        System.out.println("El Nombre es: "+Persona.Nombre);
        System.out.println("El Correo es: "+Persona.Correo);
        Sytem.out.println("La Cedula es: "+Persona.Cedula);
    }
 
