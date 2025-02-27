import java.util.Scanner;

public class control_Luces {
    
    public static void prenderluces(){
        Scanner luceScanner = new Scanner(System.in);
        noche objnoche = new noche();
        objprenderluces.setnocheControl_luces(datonoche);
        if (prenderluces=noche){
            boolean = true;
           System.out.println("luces prendidas");
        }else(false){
          System.out.println("luces apagadas");
        }
    }
    public static void movimiento(){
        movimiento objmovimiento = new movimiento();
        objmovimiento.setmovimientoControl_luces(datomovimiento);
        if (prenderluces = movimiento){
          boolean = true;
           System.out.println("luces prendidas"); 
        }else(false){
           System.out.println("luces apagadas"); 
        }
    }
     public static void Apagarluces(){
       dia objdia =  new dia();
       objApagarluces.setdiaControl_luces(datodia);
      while(luces){
        if (dia=luces){
            System.out.println("luces apagadas");
            boolean = true;
            break;
        }else(false){
            System.out.println("luces prendidas");
        }
      }
   }
}
