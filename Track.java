import java.util.ArrayList;
import java.util.Date;

/**
 * The `Track` class represents a music track with various attributes and methods
 * for accessing and updating its information.
 */
public class Track {
    // Track attributes
    private String name;
    private String artist;
    public boolean band;
    private Date date;
    public double length;
    private int rating;
    private String location;
    public double size;
    private ArrayList<String> guestArtists;
    public int playCount;

    /**
     * Constructor to initialize a new `Track` object with provided information.
     *
     * @param name         The name of the track.
     * @param artist       The artist or band of the track.
     * @param band         The band status of the track (true for band, false for solo artist).
     * @param date         The date when the track was created or recorded.
     * @param length       The length of the track in minutes.
     * @param rating       The rating of the track (1-5).
     * @param location     The file location of the track on disk.
     * @param size         The size of the track in MB.
     * @param guestArtists A list of guest artists featured in the track.
     */
    public Track(String name, String artist, boolean band, Date date, double length, int rating, String location, double size, ArrayList<String> guestArtists) {
        this.name = name;
        this.artist = artist;
        this.band = band;
        this.date = date;
        this.length = length;
        this.rating = rating;
        this.location = location;
        this.size = size;
        this.guestArtists = guestArtists;
        this.playCount = 0; // Initialize play count to zero
    }

    // Getter methods for accessing track information

    /**
     * Get the name of the track.
     *
     * @return The name of the track.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the artist or band of the track.
     *
     * @return The artist or band of the track.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Check the band status of the track.
     *
     * @return `true` if the track is associated with a band, `false` if it's a solo artist.
     */
    public boolean isBand() {
        return band;
    }

    /**
     * Get the date when the track was created or recorded.
     *
     * @return The date when the track was created or recorded.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Get the length of the track in minutes.
     *
     * @return The length of the track in minutes.
     */
    public double getLength() {
        return length;
    }

    /**
     * Get the rating of the track (1-5).
     *
     * @return The rating of the track (1-5).
     */
    public int getRating() {
        return rating;
    }

    /**
     * Get the file location of the track on disk.
     *
     * @return The file location of the track on disk.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Get the size of the track in megabytes (MB).
     *
     * @return The size of the track in megabytes (MB).
     */
    public double getSize() {
        return size;
    }

    /**
     * Get a list of guest artists featured in the track.
     *
     * @return A list of guest artists' names.
     */
    public ArrayList<String> getGuestArtists() {
        return guestArtists;
    }

    // Setter methods for updating track information

    /**
     * Set the name of the track.
     *
     * @param name The new name of the track.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the artist or band of the track.
     *
     * @param artist The new artist or band of the track.
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Update the band status of the track.
     *
     * @param band `true` if the track is associated with a band, `false` if it's a solo artist.
     */
    public void setBand(boolean band) {
        this.band = band;
    }

    /**
     * Set the date when the track was created or recorded.
     *
     * @param date The new date of the track.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Set the length of the track in minutes.
     *
     * @param length The new length of the track in minutes.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Set the rating of the track (1-5).
     *
     * @param rating The new rating of the track (1-5).
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Set the file location of the track on disk.
     *
     * @param location The new file location of the track.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Set the size of the track in megabytes (MB).
     *
     * @param size The new size of the track in megabytes (MB).
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Set the list of guest artists featured in the track.
     *
     * @param guestArtists The updated list of guest artists' names.
     */
    public void setGuestArtists(ArrayList<String> guestArtists) {
        this.guestArtists = guestArtists;
    }

    // Additional methods

    /**
     * Increment the play count of the track when it is played.
     */
    public void incrementPlayCount() {
        playCount++;
    }

    /**
     * Get the current play count of the track.
     *
     * @return The play count of the track.
     */
    public int getPlayCount() {
        return playCount;
    }
}
