/**
 * @author Gadiel Amir Ocaña Veliz-231270
 * Fecha: 13/10/2023
 * Ejercicio 5: Polimorfismo
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * Clase main encargada de la logica del programa y entrada de datos
 */

import java.util.Scanner;
public class MainTorneoVolley {
    public static void main(String[] args) {
        TorneoVolley torneo = new TorneoVolley();

        String menu = "1. Regitrar un jugador\n" +
                "2. Mostrar jugadores registrados\n"+"3. Mostrar mejores 3 liberos\n"+"4. Cantidad de pasadores con mayor de 80% de efectividad";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        System.out.println(menu);
        int opcion = teclado.nextInt();
        teclado.nextLine();
        boolean estado = true;
        try{
            while (estado) {
                switch (opcion) {
                    //Registrar Jugadores
                    case 1:
                        System.out.println("Ingrese el nombre: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Ingrese el pais: ");
                        String pais = teclado.nextLine();
                        System.out.println("Ingrese la cantidad de errores cometidos: ");
                        int errores = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese el total de servicios: ");
                        int totServicios= teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese la cantidad de aces: ");
                        int aces = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese el tipo de jugador que desea registrar: ");
                        System.out.println("1. Libero\n2. Pasador\n3. Auxiliar");
                        int opcion2 = teclado.nextInt();
                        teclado.nextLine();
                        switch (opcion2){
                            case 1:
                                System.out.println("Ingrese la cantidad de recibos efectivos: ");
                                int recibosEfec = teclado.nextInt();
                                teclado.nextLine();
                                torneo.registrarLibero(nombre,pais,errores,totServicios,recibosEfec, aces);
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad de fintas efectivas: ");
                                int fintasEfec = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("Ingrese la cantidad de pases: ");
                                int pases = teclado.nextInt();
                                teclado.nextLine();
                                torneo.registrarPasador(nombre,pais,errores,totServicios,pases,fintasEfec, aces);
                                break;
                            case 3:
                                System.out.println("Ingrese la cantidad de ataques: ");
                                int ataques = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("Ingrese la cantidad de bloqueos efectivos: ");
                                int bloqueosEfec = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("Ingrese la cantidad de bloqueos fallidos: ");
                                int bloqueosFalli = teclado.nextInt();
                                teclado.nextLine();
                                torneo.registrarAuxiliar(nombre,pais,errores,totServicios,ataques,bloqueosEfec,bloqueosFalli, aces);
                                break;
                        }

                        break;
                    //Mostrar Jugadores registrados
                    case 2:
                                torneo.mostrarJugadores();
                        break;
                    //Mostrar mejores 3 liberos
                    case 3:
                    torneo.mejoresLiberos();
                        break;
                    //Cantidad de pasadores con mayor de 80%
                    case 4:
                    int cantidadPasador = torneo.mejoresPasadores();
                        System.out.println("Los cantidad de pasadores con efectividad mayor al 80% son: "+cantidadPasador);
                        break;
                    case 5:
                        estado = false;
                        System.out.println("Cerrando el programa...");
                }
                System.out.println(menu);
                System.out.println("Ingrese una opcion: ");
                opcion = teclado.nextInt();
                teclado.nextLine();
            }
        }catch (Exception e){
            System.out.println("Ingrese una opcion numerica >:c");
            opcion = 0;
            teclado.nextLine();
        }
        try{
            torneo.guardarArchivo();

        }catch(Exception e){
            System.out.println("Hubo un error al crear el archivo");
        }

    }
}
