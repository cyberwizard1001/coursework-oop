import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    String name;
    ArrayList<Track> tracks;
    String type;

    public Album(String name, ArrayList<Track> tracks, String type) {
        this.name = name;
        this.tracks = tracks;
        this.type = type;
    }

    public Album(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Album() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTracks() {
        ArrayList<String> returnString = new ArrayList<>();

        for(Track track : tracks){
            returnString.add(track.name);
        }
        return returnString;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calculateTotalRunTime() {
        double runtime = 0.0;
        for (Track track : tracks) {
            runtime += track.length;
        }

        return runtime;
    }

    public double calculateTotalSize() {
        double totalsize = 0.0;
        Iterator<Track> trackIterator = tracks.iterator();
        while (trackIterator.hasNext()) {
            totalsize += trackIterator.next().size;
        }

        return totalsize;
    }
}
