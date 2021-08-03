import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//    int counting = 0;
//
//    do{
//        System.out.println(counting);
//        counting += 2;
//
//    }while (counting <= 100);

//        int counting = 100;
////
////        do{
////            System.out.println(counting);
////            counting -= 5;
////
////        }while (counting >= -10);


//        long counting = 2L;
//
//        do{
//            System.out.println(counting);
//            counting *= counting;
//            counting = counting * counting;
//        }while (counting < 1000000L);

//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (long i = 2L; i < 1000000L; i *= 1){
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++){
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            }else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//         }

//


        boolean anotherGrade = true;

        do{
            System.out.println("Please enter a letter grade from 0 - 100");

            int userGrade = scanner.nextInt();

            if (userGrade >= 88){
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            }else if (userGrade >= 67){
                System.out.println("C");
            }else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you want to enter a new grade? (y/n");

            String userResponse = scanner.next();



        }while (anotherGrade);



    }
}
