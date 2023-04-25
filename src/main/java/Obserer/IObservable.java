
package Obserer;

/**
 *
 * @Simon Sanmiguel Ordoñez
 */
public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}