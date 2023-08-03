package entities;

import utils.Constant;

public class Bus extends Vehicle{

    @Override
    public void prinInfo(double s) {
        System.out.println("Thời gian di chuyển của bus là: "+caculateTime(s));
    }

    @Override
    public double caculateTime(double s) {
        return s/ Constant.V_BUS;
    }
}
