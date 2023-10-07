import java.util.ArrayList;

public class Library {
    String name;
    ArrayList<Track> tracks;
    ArrayList<Album> albums;

    public Library(String name, ArrayList<Track> tracks, ArrayList<Album> albums) {
        this.name = name;
        this.tracks = tracks;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTracks() {
        ArrayList<Track> returnItems = new ArrayList<>(tracks);
        ArrayList<String> returnStrings = new ArrayList<>();

        for (Album album : albums) {
            returnItems.addAll(album.tracks);
        }

        for (Track track: returnItems) {
            returnStrings.add(track.name);
        }
        return returnStrings;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
