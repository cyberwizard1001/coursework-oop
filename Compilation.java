import java.util.ArrayList;

public class Compilation {
    ArrayList<Album> albums;
    ArrayList<Track> tracks;
    ArrayList<String> artists;

    public Compilation(ArrayList<Album> albums, ArrayList<Track> tracks, ArrayList<String> artists) {
        this.albums = albums;
        this.tracks = tracks;
        this.artists = artists;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public ArrayList<String> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<String> artists) {
        this.artists = artists;
    }
}
