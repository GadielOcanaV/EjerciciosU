/**
 * @author Gadiel Amir Ocaña Veliz-231270
 * Fecha: 13/10/2023
 * Ejercicio 5: Polimorfismo
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * Clase abstracta que hereda a Libero, Pasador, Auxiliar, asociada a TorneoVolley
 */
public abstract class Jugador {
    //Atributos
    protected String nombre;
    protected String pais;
    protected int errores;
    protected int totServicios;
    protected int aces;

    /**
     * Constructor con parametros
     * @param nombre
     * @param pais
     * @param errores
     * @param totServicios
     * @param aces
     */
    public Jugador(String nombre, String pais, int errores, int totServicios, int aces){
        this.nombre=nombre;
        this.pais=pais;
        this.errores=errores;
        this.totServicios=totServicios;
        this.aces = aces;
    }

    /**
     * constructor sin parametros
     */
    public Jugador(){

    }
    //get y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public int getTotServicios() {
        return totServicios;
    }

    public void setTotServicios(int totSservicios) {
        this.totServicios = totSservicios;
    }

    public int getAces() {
        return aces;
    }

    public void setAces(int aces) {
        this.aces = aces;
    }

    /**
     * Metodo to string
     * @return
     */
    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", errores=" + errores +
                ", totServicios=" + totServicios +
                ", aces=" + aces +
                '}';
    }
}
