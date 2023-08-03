package entities;

public class Plane extends Vehicle{
    public static final double v = 20;


    @Override
    public void prinInfo(double s) {

    }

    @Override
    public double caculateTime(double s) {
        return s/v;
    }
}
