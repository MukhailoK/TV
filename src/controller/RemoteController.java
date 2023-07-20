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

    public void onChannel(int num) {
        if (num > tv.getChannels().size()) {
            System.err.println("not found");
        } else
            for (Channel channel : tv.getChannels()) {
                if (channel.getNumber() == num) {
                    System.out.println(getRandomShow(channel.getShows()));
                }
            }

    }

    private TVShow getRandomShow(List<TVShow> shows) {
        Random random = new Random();
        int rd = random.nextInt(shows.size());
        return shows.get(rd);
    }

}
