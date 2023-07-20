package model;

public class TVShow {
   private String title;

    public TVShow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "title='" + title + '\'' +
                '}';
    }
}
