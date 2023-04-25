
package Obserer;

/**
 *
 * @Simon Sanmiguel Ordoñez
 */
public class Solicitante implements IObserver {
    private String nombre;
    private Libro libro;
    
    public Solicitante(String nombre, Libro libro) {
        this.nombre = nombre;
        this.libro = libro;
    }
    
    @Override
    public void update() {
        System.out.println(nombre + ", el libro " + libro.toString() + " que habías reservado está disponible para recoger.");
    }
}
