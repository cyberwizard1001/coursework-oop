import java.util.ArrayList;
import java.util.Iterator;

/**
 * The `Album` class represents an album containing a collection of tracks.
 */
public class Album {
    /**
     * Stores the name of the album.
     */
    private String name;

    /**
     * Stores a list of tracks that are part of the album.
     */
    ArrayList<Track> tracks;

    /**
     * Stores the type or genre of the album.
     */
    private String type;

    /**
     * Constructor to create an album with a name, list of tracks, and type.
     *
     * @param name   The name of the album.
     * @param tracks A list of tracks that are part of the album.
     * @param type   The type or genre of the album.
     */
    public Album(String name, ArrayList<Track> tracks, String type) {
        this.name = name;
        this.tracks = tracks;
        this.type = type;
    }

    /**
     * Constructor to create an album with a name and type, without initializing the list of tracks.
     *
     * @param name The name of the album.
     * @param type The type or genre of the album.
     */
    public Album(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Default constructor to create an empty album with no name, type, or tracks.
     */
    public Album() {
    }

    /**
     * Getter method to retrieve the name of the album.
     *
     * @return The name of the album.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to set the name of the album to a new value.
     *
     * @param name The new name of the album.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method to retrieve a list of track names in the album.
     *
     * @return An ArrayList containing the names of tracks in the album.
     */
    public ArrayList<String> getTracks() {
        ArrayList<String> returnString = new ArrayList<>();

        for (Track track : tracks) {
            returnString.add(track.getName());
        }
        return returnString;
    }

    /**
     * Setter method to set the list of tracks in the album.
     *
     * @param tracks A list of tracks to set for the album.
     */
    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * Getter method to retrieve the type or genre of the album.
     *
     * @return The type or genre of the album.
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method to set the type or genre of the album to a new value.
     *
     * @param type The new type or genre of the album.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Method to calculate and return the total run time of all tracks in the album.
     *
     * @return The total run time of all tracks in the album.
     */
    public double calculateTotalRunTime() {
        double runtime = 0.0;
        for (Track track : tracks) {
            runtime += track.length;
        }

        return runtime;
    }

    /**
     * Method to calculate and return the total size of all tracks in the album.
     *
     * @return The total size of all tracks in the album.
     */
    public double calculateTotalSize() {
        double totalSize = 0.0;
        Iterator<Track> trackIterator = tracks.iterator();
        while (trackIterator.hasNext()) {
            totalSize += trackIterator.next().size;
        }

        return totalSize;
    }
}
