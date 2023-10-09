import java.util.ArrayList;
import java.util.Date;

public class Track {
    String name;
    String artist;
    boolean band;
    Date date;
    double length;
    int rating;
    String location;
    double size;
    ArrayList<String> guest_artists;
    int play_count;

    public Track(String name, String artist, Boolean band, Date date, double length, int rating, String location, double size, ArrayList<String> guest_artists) {
        this.name = name;
        this.artist = artist;
        this.band = band;
        this.date = date;
        this.length = length;
        this.rating = rating;
        this.location = location;
        this.size = size;
        this.guest_artists = guest_artists;
        this.play_count = 0;
        this.checkDetails();
    }

    private boolean checkDetails() {
        boolean valid = false;

        if (this.band) {

        }

        return valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Boolean getBand() {
        return band;
    }

    public void setBand(Boolean band) {
        this.band = band;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ArrayList<String> getGuest_artists() {
        return guest_artists;
    }

    public void setGuest_artists(ArrayList<String> guest_artists) {
        this.guest_artists = guest_artists;
    }
}
