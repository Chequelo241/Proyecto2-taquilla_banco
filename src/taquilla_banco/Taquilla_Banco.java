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

        Cola Clientes = new Cola();
        Cola Pendientes = new Cola();
        Documento D = new Documento();
        Pila Atendidos = new Pila();

        do {
            LocalDate fecha = LocalDate.parse(Documento.leer("fecha.in"));
            LocalTime horaInicio = LocalTime.of(8, 0);
            LocalTime horaCierre = LocalTime.of(15, 30);
            LocalTime horaActual = horaInicio;
            Pendientes.enqueueClientes("ClientesPendientes.in");
            D.Eliminar("ClientesPendientes.in");
            Clientes.enqueueClientes("Clientes.in");

            Salir = null;
            System.out.println("\t|-----------------------BIENVENIDO-----------------------|");
            System.out.println();

            System.out.println("");
            System.out.print("Hoy es: " + fecha + ". Ya son las [" + horaInicio + "], presiona: \n\n"
                    + "1 : Para comenzar.\n"
                    + "2 : Para salir.\n\n");

            System.out.print("[R]-----------> ");
            Opc = sc.nextLine();

            switch (Opc) {
                case "1":
                    if (!Pendientes.isEmpty()) {
                        System.out.println("");
                        while (!Pendientes.isEmpty() && horaActual.isBefore(horaCierre)) {
                            int atendidos = 0;
                            Cliente y;
                            if (atendidos < 5) {
                                y = Pendientes.dequeue().cliente;
                                atendidos++;
                            } else {
                                y = Pendientes.dequeuePrioridad().cliente;
                                atendidos = 0;
                            }
                            System.out.println("Se atiende a " + y.getName() + " a las [" + horaActual + "]");
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

                        System.out.println("");
                        while (!Clientes.isEmpty() && horaActual.isBefore(horaCierre)) {
                            int atendidos = 0;
                            Cliente y;
                            if (atendidos < 5) {
                                y = Clientes.dequeue().cliente;
                                atendidos++;
                            } else {
                                y = Clientes.dequeuePrioridad().cliente;
                                atendidos = 0;
                            }

                            System.out.print("\tSe atiende a: " + y.getName() + " a las [" + horaActual + "]");

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

                            System.out.println(" ----> Efectuó: " + y.getOperaciones());
                            Atendidos.push(new nodoP(y));
                        }
                    }
                case "2":

                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }

            if (!Clientes.isEmpty()) {
                Clientes.dequeuePrint("ClientesPendientes.in");
                System.out.println("No se ha podido atender a todos los clientes...");
            }

            if (!Atendidos.isEmpty()) {
                Atendidos.popPrint("Taquilla " + fecha.toString() + ".log");
            }

            fecha = fecha.plusDays(1);
            Documento.escribir(fecha.toString(), "fecha.in");

            System.out.println("");
            System.out.print("Cerrar el Programa? S/ N: ---> ");
            Salir = sc.nextLine();

            if (Salir.equals("N")) {
                System.out.println("Pasando al siguiente dia...");
                System.out.println("");
            }
        } while (!Salir.equalsIgnoreCase("S"));
    }
}
