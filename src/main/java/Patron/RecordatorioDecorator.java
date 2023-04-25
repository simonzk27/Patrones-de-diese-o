
package Patron;

/**
 *
 * @author Simon Sanmiguel Ordoñez
 */
// Decorador abstracto: mantiene una referencia al componente al que se le puede agregar responsabilidades adicionales
    abstract class RecordatorioDecorator extends Prestamo {
    protected Prestamo prestamo;

    public RecordatorioDecorator(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public void enviarRecordatorio() {
        if (prestamo != null) {
            prestamo.enviarRecordatorio();
        }
    }
}
