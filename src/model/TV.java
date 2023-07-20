package model;

import java.util.ArrayList;
import java.util.List;

public class TV {
    private List<Channel> channels;
    private int lastChannel = 1;
    private int volume = 20;

    public TV() {
        this.channels = new ArrayList<>();
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public void addChannel(Channel channel) {
        if (channel != null) {
            channels.add(channel);
        } else {
            System.err.println("channel can't be null");
        }
    }

    public int getLastChannel() {
        return lastChannel;
    }

    public void onChannel(int num) {
        if (num > channels.size() || num <= 0) {
            System.err.println("not found");
        } else
            for (Channel channel : channels) {
                if (channel.getNumber() == num) {
                    System.out.println("channel #" + channel.getNumber() + " \""
                            + channel.getName() + "\" show name \""
                            + channel.getRandomShow().getTitle() + "\"");
                    lastChannel = num;
                }
            }
    }
    public void onTV() {
        onChannel(lastChannel);
    }

    public void standby() {
        System.out.println("Standby");
    }
    public void offTV(){
        lastChannel = 1;
        volume = 20;
        System.out.println("off");
    }

    public void volumeUp() {
        if (volume <= 100) {
            volume++;
            System.out.println("Volume " + volume);
        } else
            System.out.println("max volume");
    }

    public void volumeDown() {
        if (volume >= 0) {
            volume--;
            System.out.println("Volume " + volume);
        } else
            System.out.println("min volume");
    }
}