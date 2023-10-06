import java.util.ArrayList;
import java.util.Iterator;

public class Data {

    ArrayList<Album> albums;
    ArrayList<Library> libraries;
    ArrayList<Musician> musicians;
    ArrayList<Band> bands;
    ArrayList<Compilation> compilations;
    ArrayList<Track> tracks;

    public void addAlbum(Album album){



        albums.add(album);
    }

    public void addLibrary(Library library){
        libraries.add(library);
    }

    public void addMusician(Musician musician){
        musicians.add(musician);
    }

    public void addBand(Band band){
        bands.add(band);
    }

    public void addCompilation(Compilation compilation){
        compilations.add(compilation);
    }

    public void addTrack(Track track){
        boolean added = false;
        if(track.band){
            for (Band band : bands) {
                String bandName = band.getName();
                if (bandName.equals(track.artist)) {
                    tracks.add(track);
                    added = true;
                    System.out.println("Track " + track.name + " added.");
                    break;
                }
            }
        }

        else{
            for (Musician musician: musicians){
                String musicianName = musician.getName();
                if(musicianName.equals(track.artist)){
                    tracks.add(track);
                    added = true;
                    System.out.println("Track " + track.name + " added.");
                    break;
                }
            }
        }

        if(!added){
            System.out.println("Artist not found, track not added to database.");
        }

    }

    public void removeTrack(String name){
        boolean deleted = false;
        Iterator<Track> trackIterator = tracks.iterator();
        while(trackIterator.hasNext()){
            String trackName = trackIterator.next().getName();
            if(trackName.equals(name)){
                trackIterator.remove();
                deleted = true;
                System.out.println("Track " + trackName + " deleted.");
                break;
            }
        }

        if(!deleted){
            System.out.println("Track not found");
        }
    }


}
