
package Obserer;

/**
 *
 * @Simon Sanmiguel Ordoñez
 */
public class ObserverPatternEx {

    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demo***\n");
        
        Libro libro = new Libro();
        Solicitante solicitante1 = new Solicitante("Juan", libro);
        Solicitante solicitante2 = new Solicitante("Ana", libro);
        libro.addObserver(solicitante1);
        
     }
}