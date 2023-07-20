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

}
