package controller;

import model.Channel;
import model.TV;
import model.TVShow;

import java.util.List;
import java.util.Random;

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

    public TVShow onChannel(int num) {
        for (Channel channel : tv.getChannels()) {
            if (channel.getNumber() == num) {
                return getRandomShow(channel.getShows());
            }
        }
        return null;
    }

    private TVShow getRandomShow(List<TVShow> shows) {
        Random random = new Random();
        int rd = random.nextInt(shows.size() + 1);
        return shows.get(rd);
    }

}
