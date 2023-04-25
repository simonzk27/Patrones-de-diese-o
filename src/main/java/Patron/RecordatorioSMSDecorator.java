
package Patron;

/**
 *
 * @author Simon Sanmiguel Ordoñez
 */
// Decorador 1: agrega una responsabilidad adicional al componente
    class RecordatorioSMSDecorator extends RecordatorioDecorator {
    public RecordatorioSMSDecorator(Prestamo prestamo) {
        super(prestamo);
    }

    @Override
    public void enviarRecordatorio() {
        super.enviarRecordatorio();
        System.out.println("Recordatorio de devolución del libro enviado por mensaje de texto.");
    }
}
