package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Channel {
    private String name;
    private int number;
    private List<TVShow> shows;

    public Channel(String name, int number) {
        this.name = name;
        this.number = number;
        this.shows = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<TVShow> getShows() {
        return shows;
    }

    public void setShows(List<TVShow> shows) {
        this.shows = shows;
    }

    public void addShow(TVShow show) {
        if (show != null) {
            shows.add(show);
        } else {
            System.err.println("show can't be null");
        }
    }
    public TVShow getRandomShow() {
        Random random = new Random();
        int rd = random.nextInt(shows.size());
        return shows.get(rd);
    }
}
