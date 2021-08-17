package practice;

public class Duck {
    private String name;
    private int age;

    public Duck(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.age = age;
    }

        public String getName(){
        return name;
        }
        public void setName(String newName){
        this.name = newName;
        }

    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
}
