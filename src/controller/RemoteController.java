package controller;

import model.TV;


public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
    public void onChannel(int num){
        tv.onChannel(num);
    }
    public void onTV() {
        onChannel(tv.getLastChannel());
    }

    public void offTV() {
        System.out.println("Standby");
    }

}
