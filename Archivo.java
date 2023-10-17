/**
 * @author Gadiel Amir Ocaña Veliz-231270
 * Fecha: 13/10/2023
 * Ejercicio 5: Polimorfismo
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * Clase para la escritura del archivo
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Archivo {
    private File archivo;

    /**
     * Constructor de la clase que crear un objeto de tipo archivo y recibe un nombre
     * @param nombreArchivo
     */
    public Archivo(String nombreArchivo){
        archivo = new File(nombreArchivo);
    }

    /**
     * Escribe en un srchivo csv el contenido de la lista
     * @param jugadores
     * @throws Exception
     */
    public void escribirArchivo(ArrayList<Jugador>jugadores) throws Exception{
        PrintWriter escritor = new PrintWriter(archivo, "UTF-8");
        String line = "Nombre,Pais,Errores,Servicios Totales,Aces,Tipo de Jugador,Recibos efectivos,Pases,Fintas efectivas,Ataques,Bloqueos Efectivos,Bloqueos Fallidos\n";
        escritor.println(line);
        for(Jugador player: jugadores){
            line = player.getNombre()+','+player.getPais()+','+player.getErrores()+','+player.getTotServicios()+','+player.getAces()+',';
            if(player instanceof Libero){
                line = line + "Libero"+','+((Libero)player).getRecibosEfec()+','+','+','+','+','+','+',';
            } else if (player instanceof Pasador) {
                line = line + "Pasador"+','+','+((Pasador)player).getPases()+','+((Pasador)player).getFintasEfec()+','+','+','+','+',';
            } else if (player instanceof Auxiliar) {
                line = line + "Auxiliar"+','+','+','+','+((Auxiliar)player).getAtaques()+','+((Auxiliar)player).getBloqueosEfec()+','+((Auxiliar)player).getBloqueosFalli();
            }
            escritor.println(line);

        }
        escritor.close();
    }
}
