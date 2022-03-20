package hora.y.fecha;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class PRUEBA {

public sString[] args) {
 String Fecha;
 String Tiempo;
 String TiempoFin ;
      
 Fecha = new SimpleDateFormat("18/03/2022").format(Calendar.getInstance().getTime());
 Tiempo = new SimpleDateFormat("08:30").format(Calendar.getInstance().getTime());
 TiempoFin = new SimpleDateFormat("15:30").format(Calendar.getInstance().getTime());
 
 
 if (Tiempo == TiempoFin)
     return Tiempo;

 
 Tiempo = TiempoFin;
 
 System.out.println(Tiempo);
 
    }
}


 
     
 


  




