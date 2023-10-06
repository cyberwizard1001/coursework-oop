import java.util.ArrayList;

public class Library {
    String name;
    ArrayList<Track> tracks;
    ArrayList<Album> albums;

    public Library(String name, ArrayList<Track> tracks, ArrayList<Album> albums){
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

    public ArrayList<Track> getTracks() {
        return tracks;
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
