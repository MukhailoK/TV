package model;

import java.util.ArrayList;
import java.util.List;

public class TV {
    private List<Channel> channels;
    private int lastChannel = 1;

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
                    System.out.println(channel.getNumber() + " "
                            + channel.getName() + " "
                            + channel.getRandomShow().getTitle());
                    lastChannel = num;
                }
            }
    }

}
