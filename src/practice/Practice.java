package practice;

public class Practice {
    public static double multiply(int number, int number2){
        return (number * number2);
    }

    public static double multiply(double number, double number2){
        return (number * number2);
    }

    public static void main(String[] args) {
//        System.out.println(multiply(5.5, 2.4));

        Duck duck1 = new Duck("James", 21);

        Mallard duck2 = new Mallard("Joe", 34, 12);

        duck2.quack();

        getMallardDetails(duck2);
    }

    public static void getMallardDetails(Mallard mallard){
        System.out.println("Mallard name is " + mallard.getName() + " Mallard age is " + mallard.getAge() + " Mallard flight speed is " + mallard.getFlySpeed());
    }

}
