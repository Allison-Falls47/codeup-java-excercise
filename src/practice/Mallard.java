package practice;

public class Mallard extends Duck implements Quackable {
    private int flySpeed;

    public Mallard(String name, int age, int flySpeed) {
        super(name, age);
        this.flySpeed = flySpeed;
    }
    public int getFlySpeed(){
        return flySpeed;
    }
    public void setFlySpeed(int newFlySpeed){
        this.flySpeed = newFlySpeed;
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
