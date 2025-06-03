// this class demeonstrates how to use inheritance and encaplsulation
// we will create specific "card models"
package object;

import java.util.ArrayList;


public class Car implements Cloneable {

    private String color;   
    private String model;
    private boolean electric;
    public static ArrayList<Car> carList = new ArrayList();

  

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

    
    //Use Annontation
    //Use the correct signature:
    //Check reference equality:
    //Check for null:
    //Check class equality:
    //Cast the object:
    //Compare relevant fields
    //Override hashCode() too (to keep consistency):



   



    @Override
    public String toString() {
        return "Car [color=" + color + ", model=" + model + ", electric=" + electric + "]";
    }




    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + (electric ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } 
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Car tempCar = (Car) obj;
        
        return this.color == tempCar.color && this.model == tempCar.model && this.electric == tempCar.electric;
        


    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
        


        

    
}

    
    

