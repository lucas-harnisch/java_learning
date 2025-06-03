package Racewars.model;
/**
 * Basisklasse für alle Wesen im Spiel.
 */
public abstract class Wesen {


    /**
     * Greife das andere Wesen an. Der Schaden wird berechnet und beim
     * gegnerischen Wesen abgezogen.
     *
     * @param gegner Wesen, das angegriffen werden soll.
     * @return Zugefügter Schaden.
     */
    public abstract double attacke(Wesen gegner);

    /**
     * Beschränkt den Schaden.
     *
     * @param dmg Schaden.
     * @return Vebleibender Schaden nach der Beschränkung.
     */
    public double beschraenkeSchaden(double dmg) {
        return dmg;
    }
}
