package ObjectStudentExample;

import java.util.HashMap;

public class Student {

    private String name;
    private HashMap<String,Integer> grades;

    public Student(String name, HashMap<String,Integer> grades) {

        this.name = name;
        this.grades = new HashMap<>(grades);


    }
//toString method
    @Override
    public String toString() {
        return "Student [name=" + name + ", grades=" + grades + "]";
        
    }


    


@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((grades == null) ? 0 : grades.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (grades == null) {
            if (other.grades != null)
                return false;
        } else if (!grades.equals(other.grades))
            return false;
        return true;
    }


    //getter for grades
    public static HashMap<String, Integer> getGrades(Student student) {
        return student.grades;
    }

//setter for grades
    public static HashMap<String,Integer> setGrade(String class1, Integer grade1, String class2, Integer grade2, String class3, Integer grade3)  {

        HashMap<String,Integer> grades = new HashMap<>();
        grades.put(class1, grade1);
        grades.put(class2, grade2);
        grades.put(class3, grade3);

        return grades;
    }

    public static double calculateAverage(Student student) {
        
        HashMap<String,Integer> grades = Student.getGrades(student);
        double[] gradesFromArrayList = new double[3];
        int i = 0;
        double average = 0;

        for (Integer grade : grades.values()) {
                
                gradesFromArrayList[i] = grade;
                average += gradesFromArrayList[i];
                i++;

        }
        average = average / gradesFromArrayList.length;      
        return average;   

        }

    }

