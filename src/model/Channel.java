package model;

import java.util.ArrayList;
import java.util.List;

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
    public void addShow(TVShow show){
        shows.add(show);
    }
}
