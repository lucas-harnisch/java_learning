//this shows inheritance, as we create a sub class of Car

package src.object;

public class Ford extends Car {

    //now setting a specific variable for Ford
    private String series;


    //constrctor for Ford
    public Ford(String color, String model, boolean electric, String series) {

        // calling the constructor of the super class
        super(color, model, electric);

        this.series = series;
    }

    // Getter and Setter for new Ford
    public String getSeries() {
        return series;
    }


    public void setSeries(String series) {
        this.series = series;
    }

    
    
}


