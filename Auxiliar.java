/**
 * @author Gadiel Amir Ocaña Veliz-231270
 * Fecha: 13/10/2023
 * Ejercicio 5: Polimorfismo
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * Clase hija que hereda de Jugador. Modela un Jugador de tipo Auxiliar/Opuesto
 */
 public class Auxiliar extends Jugador {
 private int ataques;
 private int bloqueosEfec;
 private int bloqueosFalli;
 private float efectividadAuxiliar;

    /**
     * Constructor con parametros
     * @param nombre
     * @param pais
     * @param errores
     * @param totServicios
     * @param ataques
     * @param bloqueosEfec
     * @param bloqueosFalli
     * @param aces
     */
    public Auxiliar(String nombre, String pais, int errores, int totServicios, int ataques, int bloqueosEfec, int bloqueosFalli, int aces) {
        super(nombre, pais, errores, totServicios, aces);
        this.ataques = ataques;
        this.bloqueosEfec = bloqueosEfec;
        this.bloqueosFalli = bloqueosFalli;
    }
    //gets y sets
    public int getAtaques() {
        return ataques;
    }

    public void setAtaques(int ataques) {
        this.ataques = ataques;
    }

    public int getBloqueosEfec() {
        return bloqueosEfec;
    }

    public void setBloqueosEfec(int bloqueosEfec) {
        this.bloqueosEfec = bloqueosEfec;
    }

    public int getBloqueosFalli() {
        return bloqueosFalli;
    }

    public void setBloqueosFalli(int bloqueosFalli) {
        this.bloqueosFalli = bloqueosFalli;
    }

    public float getEfectividadAuxiliar() {
        return efectividadAuxiliar;
    }

    public void setEfectividadAuxiliar(float efectividadAuxiliar) {
        this.efectividadAuxiliar = efectividadAuxiliar;
    }

    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "Auxiliar{" +
                "ataques=" + ataques +
                ", bloqueosEfec=" + bloqueosEfec +
                ", bloqueosFalli=" + bloqueosFalli +
                ", efectividadAuxiliar=" + efectividadAuxiliar +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", errores=" + errores +
                ", totServicios=" + totServicios +
                '}';
    }

    /**
     * Calcula la efectividad
     * @param ataques
     * @param bloqueosEfec
     * @param bloqueosFalli
     * @param errores
     * @param totServicios
     * @param aces
     * @return
     */
    public float calculoEfectividadPasador(int ataques, int bloqueosEfec, int bloqueosFalli, int errores, int totServicios,int aces){
        float calculoEfectividad = ((ataques+bloqueosEfec-bloqueosFalli-errores)*100/(ataques+bloqueosEfec+bloqueosFalli+errores))+aces*100/totServicios;
        return calculoEfectividad;
    }
}