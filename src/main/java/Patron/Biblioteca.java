
package Patron;

/**
 *
 * @author Simon Sanmiguel Ordoñez
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
              // Creamos un objeto de préstamo concreto (un libro)
        Prestamo prestamo = new PrestamoLibro();

        // Decoramos el objeto con un decorador que envía recordatorios por mensaje de texto
        prestamo = new RecordatorioSMSDecorator(prestamo);

        // Decoramos el objeto con otro decorador que envía recordatorios por llamada telefónica
        prestamo = new RecordatorioLlamadaDecorator(prestamo);

        // Enviamos el recordatorio
        prestamo.enviarRecordatorio();
        
    }
    
}
