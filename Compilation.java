import java.util.ArrayList;

/**
 * The `Compilation` class represents a compilation containing a collection of albums, tracks, and associated artists.
 */
public class Compilation extends Album {
    /**
     * Stores a list of albums that are part of the compilation.
     */
    ArrayList<Album> albums;

    /**
     * Stores a list of tracks that are part of the compilation.
     */
    ArrayList<Track> tracks;

    /**
     * Stores a list of artists associated with the compilation.
     */
    ArrayList<String> artists;

    /**
     * Constructor to create a compilation with a name, list of albums, list of tracks, and list of artists.
     *
     * @param name    The name of the compilation.
     * @param albums  A list of albums that are part of the compilation.
     * @param tracks  A list of tracks that are part of the compilation.
     * @param artists A list of artists associated with the compilation.
     */
    public Compilation(String name, ArrayList<Album> albums, ArrayList<Track> tracks, ArrayList<String> artists) {
        super(name, "compilation"); // Calls the parent class (Album) constructor to set the name and type of the compilation.
        this.albums = albums;
        this.tracks = tracks;
        this.artists = artists;
    }

    /**
     * Default constructor to create an empty compilation.
     */
    public Compilation() {
    }

    /**
     * Overrides the getTracks method to return a list of track names in the compilation.
     *
     * @return An ArrayList of track names in the compilation.
     */
    @Override
    public ArrayList<String> getTracks() {
        ArrayList<Track> returnItems = new ArrayList<>(tracks); // Create a copy of the tracks in the compilation.
        ArrayList<String> returnStrings = new ArrayList<>();

        // Add tracks from albums to the list of tracks to be returned.
        for (Album album : albums) {
            returnItems.addAll(album.tracks);
        }

        // Convert the tracks to a list of track names.
        for (Track track : returnItems) {
            returnStrings.add(track.getName());
        }

        return returnStrings; // Return the list of track names.
    }

    /**
     * Getter method to retrieve the list of albums in the compilation.
     *
     * @return An ArrayList of albums in the compilation.
     */
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    /**
     * Setter method to set the list of albums in the compilation.
     *
     * @param albums A list of albums to set for the compilation.
     */
    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    /**
     * Setter method to set the list of tracks in the compilation.
     *
     * @param tracks A list of tracks to set for the compilation.
     */
    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * Getter method to retrieve the list of artists associated with the compilation.
     *
     * @return An ArrayList of artists associated with the compilation.
     */
    public ArrayList<String> getArtists() {
        return artists;
    }

    /**
     * Setter method to set the list of artists associated with the compilation.
     *
     * @param artists A list of artists to set for the compilation.
     */
    public void setArtists(ArrayList<String> artists) {
        this.artists = artists;
    }
}
