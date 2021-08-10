import java.util.Arrays;

public class ArraysExercises {
        public static void main(String[] args) {
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

    Person[] objArray = new Person[3];
    objArray[0] = new Person("Jim");
    objArray[1] = new Person("Ann");
    objArray[2] = new Person("Smithy");

    for (int i = 0; i < objArray.length; i++){
        System.out.println(objArray[i].getName());
    }

        }

        public static Person[] addPerson(Person[] people, Person personToAdd){
            Person[] addPeopleArray = Arrays.copyOf(people, people.length + 1 );

           addPeopleArray[addPeopleArray.length -1] = personToAdd;
           return addPeopleArray;
        }


}

