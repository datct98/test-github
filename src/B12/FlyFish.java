package B12;

public class FlyFish implements IFlying, ISwimming{
    @Override
    public void fly() {
        System.out.println("I fly");
    }

    @Override
    public void swim() {
        System.out.println("I Swim");
    }
}
