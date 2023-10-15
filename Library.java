import java.util.ArrayList;

/**
 * The `Library` class represents a music library containing a collection of individual tracks and albums.
 * It stores information about the library's name, a list of individual tracks, and a list of albums.
 */
public class Library {
    /**
     * Stores the name of the library.
     */
    String name;

    /**
     * Stores a list of individual tracks in the library.
     */
    ArrayList<Track> tracks;

    /**
     * Stores a list of albums in the library.
     */
    ArrayList<Album> albums;

    /**
     * Creates a new instance of the `Library` class with the specified name, list of tracks, and list of albums.
     *
     * @param name    The name of the library.
     * @param tracks  A list of individual tracks in the library.
     * @param albums  A list of albums in the library.
     */
    public Library(String name, ArrayList<Track> tracks, ArrayList<Album> albums) {
        this.name = name;
        this.tracks = tracks;
        this.albums = albums;
    }

    /**
     * Default constructor to create an empty library with no name, tracks, or albums.
     */
    public Library() {

    }

    /**
     * Retrieves the name of the library.
     *
     * @return The name of the library.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the library to a new value.
     *
     * @param name The new name of the library.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves a list of track names in the library, including tracks from albums.
     *
     * @return A list of track names in the library.
     */
    public ArrayList<String> getTracks() {
        ArrayList<Track> returnItems = new ArrayList<>(tracks);
        ArrayList<String> returnStrings = new ArrayList<>();

        for (Album album : albums) {
            returnItems.addAll(album.tracks);
        }

        for (Track track : returnItems) {
            returnStrings.add(track.getName());
        }

        return returnStrings;
    }

    /**
     * Sets the list of individual tracks in the library to a new value.
     *
     * @param tracks The new list of individual tracks.
     */
    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * Retrieves a list of albums in the library.
     *
     * @return A list of albums in the library.
     */
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    /**
     * Sets the list of albums in the library to a new value.
     *
     * @param albums The new list of albums.
     */
    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
