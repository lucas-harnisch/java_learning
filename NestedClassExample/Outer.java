package NestedClassExample;

public class Outer {


    static {
        System.out.println("i am inside the static Block");
    }



    public static void main(String[] args) {
                Outer.printOuter();
                Outer.StaticInner.printInner();

            Outer outer = new Outer();
            LocalInnerClass localInnter = outer.new LocalInnerClass();
            localInnter.printLocalInner();
            localInnter.k = 5;
            System.out.println(localInnter.k);

    }

                static void printOuter() {
                System.out.println("I am inside the outer class!");
            }

    static class StaticInner {

            static void printInner() {

                System.out.println("I am inside the static inner class!");
            }



    }

    class LocalInnerClass {

        private int k = 1;

        void printLocalInner() {
            System.out.println("I am inside the local inner class");
        }
    }


}
