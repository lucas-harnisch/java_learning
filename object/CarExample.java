package object;

public class CarExample {






    public static void main(String[] args) {

       Car[] carArray =new Car[5];

        
      Car car1 = new Car("blue", "Ford Fiesta", false);
      Car car2 = new Car("blue", "Ford Fiesta", false);
      Car car3 = new Car("black", "Tesla", true);

      boolean carComp = car1.equals(car2);

      Car.carList.add(car1);
      Car.carList.add(car2);
      Car.carList.add(car3);

      int sizeBeforeRemove = Car.carList.size();

      System.out.println(Car.carList);

      Car.carList.remove(car3);

      int sizeBeforeRemove2 = Car.carList.size();
   

      System.out.println(Car.carList);


      carArray = Car.carList.toArray(carArray) ;


        
    }


}
