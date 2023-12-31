package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 0, 0, 0, isManual, "", 0);
    }

    public void accelerate(int rate){
        int newSpeed = this.getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        if(newSpeed==0){
            this.setGear(1);
        }
        if(newSpeed>=1 && newSpeed<=50){
            this.setGear(1);
        }
        if(newSpeed>=51 && newSpeed<=100){
            this.setGear(2);
        }
        if(newSpeed>=101 && newSpeed<=150){
            this.setGear(3);
        }
        if(newSpeed>=151 && newSpeed<=200){
            this.setGear(4);
        }
        if(newSpeed>=201 && newSpeed<=250){
            this.setGear(5);
        }
        if(newSpeed>250){
            this.setGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
