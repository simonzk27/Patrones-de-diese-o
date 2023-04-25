
package Obserer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Simon Sanmiguel Ordoñez
 */
public class Libro implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private boolean reservado = false;
    
    public void reservar() {
        if (!reservado) {
            reservado = true;
            notifyObservers();
        }
    }
    
    public void devolver() {
        if (reservado) {
            reservado = false;
        }
    }
    
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    
    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
