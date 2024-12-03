        package streams;

    import java.util.Arrays;
    import java.util.List;



    public class StreamExample {



            public static void main(String[] args) {


            //Creating an Int List
            List<Integer> numbers = Arrays.asList(20,10,8,4,91,87,41);

            // Creating a List with Objects inside it
            List<String> person = Arrays.asList("Alice", "Thomas", "Bob", "Neil");      
            
            
            
            //Filtering something with streams
            person.stream() //creating stream
                .filter(name -> name.startsWith("T"))
                .forEach(System.out::println); //output

            int sum = numbers.stream() //saving the sum in the variable sum
                .reduce(0, Integer::sum); //Giving back the sum

        
            //Filtering some numbers with conditions in streams
            numbers.stream() //creating stream
                .map(number -> number *3) //tripple all numbers
                .filter(number -> number % 2 == 0) //filtering only numbers that are dividable by 2
                .sorted() //sort the stream
                .forEach(System.out::println); //output the stream



            System.out.println(sum);            
        }

            
        }
