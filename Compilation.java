import java.util.ArrayList;

public class Compilation extends Album{

    ArrayList<Album> albums;
    ArrayList<Track> tracks;
    ArrayList<String> artists;

    public Compilation(String name, ArrayList<Album> albums, ArrayList<Track> tracks, ArrayList<String> artists) {
        super(name, "compilation");
        this.albums = albums;
        this.tracks = tracks;
        this.artists = artists;
    }

    @Override
    public ArrayList<Track> getTracks(){
        ArrayList<Track> returnItems = new ArrayList<>(tracks);

        for(Album album : albums){
            returnItems.addAll(album.tracks);
        }

        return returnItems;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
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
