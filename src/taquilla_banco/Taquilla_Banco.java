/*
    EZEQUIEL RODRIGUEZ C.I 30.008.226
    ALBERT HENRIQUEZ C.I
    LUIS SUAREZ C.I 
 */
package taquilla_banco;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Taquilla_Banco {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String Salir, Opc;
        
        LocalDate fecha = LocalDate.parse(Documento.leer("fecha.in"));
        LocalTime horaInicio = LocalTime.of(8, 0);
        LocalTime horaCierre = LocalTime.of(15, 30);
        LocalTime horaActual = horaInicio;

        Cola Clientes = new Cola();
        Cola Pendientes = new Cola();
        Documento D= new Documento();
        Pila Atendidos = new Pila();

        Pendientes.enqueueClientes("ClientesPendientes.in");
        Clientes.enqueueClientes("Clientes.in");

        System.out.println("------------------BIENVENIDO-------------------------");
        System.out.println();

        do {
            System.out.println("Ya son las " + horaInicio + ", presiona 1 para comenzar");
            Opc = sc.nextLine();

            if (Opc.equals("1")) {
                if (!Pendientes.isEmpty()) {
                    while (!Pendientes.isEmpty() || horaActual.isAfter(horaCierre)) {
                        Cliente y = Pendientes.dequeue().cliente;
                        System.out.print("Se atiende a " + y.getName() + " a las " + horaActual);
                        for (String i : y.getOperacionesArray()) {

                            switch (i) {

                                case "retiro":
                                    horaActual = horaActual.plusMinutes(4);
                                    break;
                                case "deposito":
                                    horaActual = horaActual.plusMinutes(3);
                                    break;
                                case "consulta/movimientos":
                                    horaActual = horaActual.plusMinutes(1);
                                    horaActual = horaActual.plusSeconds(30);
                                    break;
                                case "actualizacion/libreta":
                                    horaActual = horaActual.plusMinutes(5);
                                    break;
                                case "pago/Servicios":
                                    horaActual = horaActual.plusMinutes(2);
                                    break;
                            }

                        }
                        System.out.println(". Efectuó: " + y.getOperaciones());
                        Atendidos.push(new nodoP(y));
                    }
                } else if (!Clientes.isEmpty()) {
                    D.Eliminar("ClientesPendientes.in");
                    while (!Clientes.isEmpty() || horaActual.isAfter(horaCierre)) {
                        Cliente y = Clientes.dequeue().cliente;
                        System.out.print("Se atiende a " + y.getName() + " a las " + horaActual);

                        for (String i : y.getOperacionesArray()) {

                            switch (i) {

                                case "retiro":
                                    horaActual = horaActual.plusMinutes(4);
                                    break;
                                case "deposito":
                                    horaActual = horaActual.plusMinutes(3);
                                    break;
                                case "consulta/movimientos":
                                    horaActual = horaActual.plusMinutes(1);
                                    horaActual = horaActual.plusSeconds(30);
                                    break;
                                case "actualizacion/libreta":
                                    horaActual = horaActual.plusMinutes(5);
                                    break;
                                case "pago/Servicios":
                                    horaActual = horaActual.plusMinutes(2);
                                    break;
                            }

                        }

                        System.out.println(". Efectuó: " + y.getOperaciones());
                        Atendidos.push(new nodoP(y));
                    }
                }
            } else{
                System.out.println("Veo que no deseas iniciar....");
            }
            
            System.out.println("Desea salir? S/N");
            Salir = sc.nextLine();
        } while (!Salir.equals("S"));

    }
}
