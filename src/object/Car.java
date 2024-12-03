//this class demeonstrates how to use inheritance and encaplsulation
//we will create specific "card models"
// the class Ford will inherite from Car
package src.object;


public abstract class Car {

    private String color;   
    private String model;
    private boolean electric;

    // constructor (how the class is created)
    public Car(String color, String model, boolean electric) {
        this.color = color;
        this.model = model;
        this.electric = electric;
    }

    // Encapsulation (gives a clear way how to get and set attributes of an object)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    
    
}
