/**
 * @author Gadiel Amir Ocaña Veliz-231270
 * Fecha: 13/10/2023
 * Ejercicio 5: Polimorfismo
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * Clase hija que hereda de Jugador. Modela un Jugador de tipo Pasador
 */
public class Pasador extends Jugador{
    //Atributos
    private int pases;
    private int fintasEfec;
    private float efectividadPasador;

    /**
     * Constructor con parametros
     * @param nombre
     * @param pais
     * @param errores
     * @param totServicios
     * @param pases
     * @param fintasEfec
     * @param aces
     */
    public Pasador(String nombre, String pais, int errores, int totServicios, int pases, int fintasEfec, int aces) {
        super(nombre, pais, errores, totServicios, aces);
        this.pases = pases;
        this.fintasEfec = fintasEfec;
    }
    //gets y sets
    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getFintasEfec() {
        return fintasEfec;
    }

    public void setFintasEfec(int fintasEfec) {
        this.fintasEfec = fintasEfec;
    }

    public float getEfectividadPasador() {
        return efectividadPasador;
    }

    public void setEfectividadPasador(float efectividadPasador) {
        this.efectividadPasador = efectividadPasador;
    }

    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "Pasador{" +
                "pases=" + pases +
                ", fintasEfec=" + fintasEfec +
                ", efectividadPasador=" + efectividadPasador +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", errores=" + errores +
                ", totServicios=" + totServicios +
                ", aces=" + aces +
                '}';
    }

    /**
     * Metodo para calcular efectividad
     * @param pases
     * @param fintasEfec
     * @param errores
     * @param aces
     * @param totServicios
     * @return
     */
    public float calculoEfectividadPasador(int pases, int fintasEfec, int errores, int aces, int totServicios){
        float calculoEfectividad = (((pases +fintasEfec)-errores)*100/(pases+fintasEfec+errores))+aces*100/totServicios;
        return calculoEfectividad;
    }
}
