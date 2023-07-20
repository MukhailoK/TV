package model;

import java.util.ArrayList;
import java.util.List;

public class TV {
    private List<Channel> channels;

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
        channels.add(channel);
    }
}
