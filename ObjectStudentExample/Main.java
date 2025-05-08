package ObjectStudentExample;

public class Main {

    public static void main(String[] args) {


            
        Student eli = new Student("Elisabeth", Student.setGrade("English", 1, "Japanese", 1, "IT", 4));
        Student bernd = new Student("Bernd", Student.setGrade("English", 5, "Japanese", 5, "IT", 1));

        

    System.out.println("Eli: " + Student.calculateAverage(eli) + " \nBernd: " + Student.calculateAverage(bernd));




    }
    
}