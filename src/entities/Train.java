package entities;

import utils.Constant;

public class Train extends Vehicle{


    @Override
    public void prinInfo(double s) {

    }

    @Override
    public double caculateTime(double s) {
        return s/ Constant.V_TRAIN;
    }
}
