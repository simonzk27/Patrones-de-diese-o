
package Patron;


/**
 *
 * @author Simon Sanmiguel Ordoñez
 */
// Componente que: define un objeto al que se le puede agregar responsabilidades adicionales
class PrestamoLibro extends Prestamo {
    @Override
    public void enviarRecordatorio() {
        System.out.println("Recordatorio de devolución del libro enviado por correo electrónico.");
    }
}
