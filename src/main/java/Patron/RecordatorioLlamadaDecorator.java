
package Patron;

/**
 *
 * @author Simon Sanmiguel Ordoñez
 */
// Decorador 2: agrega otra responsabilidad adicional al componente
class RecordatorioLlamadaDecorator extends RecordatorioDecorator {
    public RecordatorioLlamadaDecorator(Prestamo prestamo) {
        super(prestamo);
    }

    @Override
    public void enviarRecordatorio() {
        super.enviarRecordatorio();
        System.out.println("Recordatorio de devolución del libro enviado por llamada telefónica.");
    }
}
