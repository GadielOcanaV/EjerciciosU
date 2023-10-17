/**
 * @author Gadiel Amir Ocaña Veliz-231270
 * Fecha: 13/10/2023
 * Ejercicio 5: Polimorfismo
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * Clase asociada a Jugador y clase que se encarga de hacer calculos por las clases modelo
 */


import java.util.ArrayList;
public class TorneoVolley {
    //Atributos
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Archivo jugadorCSV;

    /**
     * Constructor con parametro
     * @param jugadores
     */
    public TorneoVolley(ArrayList<Jugador> jugadores) {

    }

    /**
     * Constructor sin parametros, instancia objeto tipo Archivo
     */
    public TorneoVolley(){
        jugadorCSV = new Archivo("jugadores.csv");
    }


    /**
     * Registra un Libero en jugadores
     * @param nombre
     * @param pais
     * @param errores
     * @param totServicios
     * @param recibosEfec
     * @param aces
     */
    public void registrarLibero(String nombre, String pais, int errores, int totServicios, int recibosEfec, int aces){
        Libero libero1 = new Libero(nombre, pais, errores, totServicios, recibosEfec, aces);
        jugadores.add(libero1);
        libero1.setEfectividadLibero(libero1.calculoEfectividadLibero(errores, totServicios, aces, recibosEfec));
    }

    /**
     * Registra un Pasador en jugadores
     * @param nombre
     * @param pais
     * @param errores
     * @param totServicios
     * @param pases
     * @param fintasEfec
     * @param aces
     */
    public void registrarPasador(String nombre, String pais, int errores, int totServicios, int pases, int fintasEfec, int aces){
        Pasador pasador1 = new Pasador(nombre, pais, errores, totServicios, pases, fintasEfec, aces);
        jugadores.add(pasador1);
        pasador1.setEfectividadPasador(pasador1.calculoEfectividadPasador(errores,totServicios,pases,fintasEfec,aces));
    }

    /**
     * Registra un auxiliar en jugadores
     * @param nombre
     * @param pais
     * @param errores
     * @param totServicios
     * @param ataques
     * @param bloqueosEfec
     * @param bloqueosFalli
     * @param aces
     */
    public void registrarAuxiliar(String nombre, String pais, int errores, int totServicios, int ataques, int bloqueosEfec, int bloqueosFalli, int aces){
        Auxiliar auxi1 = new Auxiliar(nombre, pais, errores, totServicios, ataques, bloqueosEfec, bloqueosFalli, aces);
        jugadores.add(auxi1);
        auxi1.setEfectividadAuxiliar(auxi1.calculoEfectividadPasador(errores, totServicios,ataques,bloqueosEfec,bloqueosFalli,aces));
    }

    /**
     * Muestra en pantalla los jugadores registrdos en la lista de jugadores
     */
    public void mostrarJugadores(){
        for (Jugador player: jugadores){
            System.out.println(player.toString());
        }
    }

    /**
     * Muestra los mejores 3 libero en funcion en la efectividad
     */
    public void mejoresLiberos() {
        //ArrayList<Portero> mejoresPorteros = new ArrayList<>();
        Jugador mejorLibero1 = new Libero();
        Jugador mejorLibero2 = new Libero();
        Jugador mejorLibero3 = new Libero();
        for(Jugador top1: jugadores){
            if (top1 instanceof Libero){
                if(((Libero) top1).getEfectividadLibero() > ((Libero)mejorLibero1).getEfectividadLibero()){
                    mejorLibero1 = top1;
                }
                if(((Libero)mejorLibero2).getEfectividadLibero()< ((Libero) top1).getEfectividadLibero() && ((Libero) top1).getEfectividadLibero()>((Libero)mejorLibero3).getEfectividadLibero()){
                    mejorLibero2 = top1;
                }
                if(((Libero) top1).getEfectividadLibero()<((Libero) mejorLibero2).getEfectividadLibero() && ((Libero) top1).getEfectividadLibero()<((Libero) mejorLibero1).getEfectividadLibero()&&((Libero) top1).getEfectividadLibero()>((Libero)mejorLibero3).getEfectividadLibero()){
                    mejorLibero3 = top1;
                }
            }

        }
        System.out.println("Libero numero 1:");
        System.out.println(mejorLibero1.toString());
        System.out.println("Libero numero 2: ");
        System.out.println(mejorLibero2.toString());
        System.out.println("Libero numero 3: ");
        System.out.println(mejorLibero3.toString());

    }

    /**
     *Cuenta cantidad de Jugadores Pasador con mas de 80% de efectividad
     * @return contador
     */
    public int mejoresPasadores(){
        int contador = 0;
        for(Jugador a : jugadores) {
            if(a instanceof Pasador){
                if (((Pasador)a).getEfectividadPasador() > 80) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * guarda el archivo generado
     * @throws Exception
     */
    public void guardarArchivo() throws Exception{
        jugadorCSV.escribirArchivo(jugadores);
    }

}


