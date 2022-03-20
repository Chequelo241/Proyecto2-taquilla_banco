package hora.y.fecha;

import java.util.Calendar;
import java.util.GregorianCalendar; //Estas son las cosas que importe

public class HoraYFecha {

    public static void main(String[] args) {  //La clase principal
                                                  //Año,      Mes del año,   dia//
       Calendar calendario = new GregorianCalendar(2022,Calendar.WEEK_OF_YEAR, 05); //*Aca edite la fecha de tal manera que quedo asi: Año/Mes del año/ y dia)*//
       Calendar tiempo = new GregorianCalendar(); //Tambien hice aca un metodo aparte para la hora y los minutos, estos estan en hora militar para facilitar*//                                  
       int DIA = calendario.get(Calendar.DATE);  
       int MES = calendario.get(Calendar.MONTH); //El dia se pone como un numero entero, e igualmente el mes y el año. Incluyendo tambien la hora
       int ANO = calendario.get(Calendar.YEAR);
       int Tiempo, Minutos;
       
       Tiempo = tiempo.get(Calendar.HOUR_OF_DAY); //Hour of day es el formato militar, existe otro llamado Hour pero esta medio bug xdd
       Minutos = tiempo.get(Calendar.MINUTE); //Simplemente son los minutos, estos hay que editarlo segun las actividades o actividad que haga el cliente
       
            Tiempo = 8;               
                Minutos = 10 ;   
                                 //Esta es la hora estipulada de cuando se abre el banco, luego de aca ignoren el resto y dirigete a SaberTopeHora aviso por comentarios donde es
                               
 // Tiempo ++;
  //Tiempo ++;
 // Tiempo ++;
  //Tiempo ++;
  //Tiempo ++;      //Ya que no tengo la funcionalidad de las personas clientes subi el tiempo por aca mismo para comprobar, esta agregado 7 veces ya que el tiempo es igual a 8
  //Tiempo ++;
  //Tiempo ++;     //Te invito a que agregues 30 veces lo de minuto, yo no quiero hacer eso, aunque lo probe y si funciona :) aunque tambien si cambias el valor inicial de minutos esta listo
  
  System.out.println( "Fecha y hora antes de implementar los boolean");
  System.out.println( "Fecha " + DIA + "/" + MES + "/" + ANO);
  System.out.println( "Hora " + Tiempo + ":" + Minutos); //Aca se puede ver la hora, hay un pequeño error pero es del mismo Calendar, como puedes ver la hora se ve 8:0 en vez de 8:00  
                                                        // Puedes ver que si pones un numero de dos cifras en los minutos si los marca, aun ando viendo a ver si se puede resolver ese error
    
    boolean TopeHora= SaberTopeHora(Tiempo);    
    boolean TopeMins= SaberTopeMin(Minutos);  //con esto llamo a los boolean 
    
     if (TopeHora && TopeMins == true)
        System.out.println("Banco Abierto");
     else{                                     //Esto dice si el banco esta cerrado o abierto cada vez que el tiempo y los minutos sean true
        System.out.println("Banco Cerrado"); 
     }
    if (TopeHora && TopeMins == true) {
        DIA ++;
    } 
                                            // Esto hace que pase un dia cada vez que el tiempo y los minutos son true
    if (TopeHora && TopeMins == true){
        Tiempo = 8; 
    }                                  //Estas son unas cosas que estaba haciendo para tratar de recortar el tiempo
    if (TopeHora && TopeMins == true){
        Minutos = 00;
    }

    System.out.println("Fecha y hora despues de implementar los boolean");
    System.out.println(Tiempo + ":" + Minutos); //El reloj se reinicia a la hora de apertura
    System.out.println( "Fecha " + DIA + "/" + MES + "/" + ANO); //El dia se incrementa ++
    
        //System.out.println(TopeHora); 
        //System.out.println(TopeMins);  //Con esto averigua si es true o false el tiempo y los minutos     
    
   
       }
    
    
    public static boolean SaberTopeHora(int tiempo){   //Aca es...
      boolean TopeH;
      if(tiempo <= 15){  //*Primeramente como se ve cree una funcion boolean, esto para que cuando el numero entero que corresponde a la hora toque el numero 15 o sea menor haga dos cosas 
          TopeH = true;   //el numero entero DIAS se incremetaran ++ y ademas El banco pasara a estar cerrado                         
        }else {
          TopeH = false;
      }
      return TopeH;
    }
    
    public static boolean SaberTopeMin(int minuto){  //Aca hice lo mismo pero con los minutos
      boolean TopeM;                                //Vuelve arriba 
      if(minuto <= 30){
          TopeM = true;
        }else {
          TopeM = false;
      }
      return TopeM;
    }
}
    
  

   



