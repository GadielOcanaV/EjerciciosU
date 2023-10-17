/**
 * @author Gadiel Amir Ocaña Veliz-231270
 * Fecha: 13/10/2023
 * Ejercicio 5: Polimorfismo
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * Clase hija que hereda de Jugador. Modela un Jugador de tipo Libero
 */
public class Libero extends Jugador{
    //Atributos
    private int recibosEfec;
    private float efectividadLibero;

    /**
     * Constructor con parametros
     * @param nombre
     * @param pais
     * @param errores
     * @param totServicios
     * @param recibosEfec
     * @param aces
     */
    public Libero(String nombre, String pais, int errores, int totServicios, int recibosEfec, int aces) {
        super(nombre, pais, errores, totServicios, aces);
        this.recibosEfec=recibosEfec;
    }

    /**
     * Constructor vacio sin parametros
     */
     public Libero(){
        super();
     }
    //gets y sets
    public int getRecibosEfec() {
        return recibosEfec;
    }

    public void setRecibosEfec(int recibosEfec) {
        this.recibosEfec = recibosEfec;
    }

    public float getEfectividadLibero() {
        return efectividadLibero;
    }

    public void setEfectividadLibero(float efectividadLibero) {
        this.efectividadLibero = efectividadLibero;
    }

    public float calculoEfectividadLibero(int recibosEfec , int errores, int totServicios, int aces){
        float calculoEfec = ((recibosEfec - errores)*100/(recibosEfec+errores))+aces*100/totServicios;
        return calculoEfec;
    }

    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "Libero{" +
                "recibosEfec=" + recibosEfec +
                ", efectividadLibero=" + efectividadLibero +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", errores=" + errores +
                ", totServicios=" + totServicios +
                ", aces=" + aces +
                '}';
    }
}
