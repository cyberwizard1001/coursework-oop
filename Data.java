import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Data {

    ArrayList<Album> albums;
    ArrayList<Library> libraries;
    ArrayList<Musician> musicians;
    ArrayList<Band> bands;
    ArrayList<Compilation> compilations;
    ArrayList<Track> tracks;

    public Data() {
        albums = new ArrayList<>();
        libraries = new ArrayList<>();
        musicians = new ArrayList<>();
        bands = new ArrayList<>();
        compilations = new ArrayList<>();
        tracks = new ArrayList<>();
    }


    //Musician
    public void addMusician(Musician musician) {
        System.out.println("Musician " + musician.name + " added.");
        musicians.add(musician);
    }


    //Band
    public void addBand(Band band) {
        boolean add = true;
        for (Musician musician : band.musicians) {
            boolean exists = false;
            String musician_name = musician.getName();
            for (Musician m : musicians) {
                if (musician_name.equals(m.name)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                System.out.println("Some artist not registered on database. Try again.");
                add = false;
            }

        }
        if (add) {
            System.out.println("Band " + band.name + " added.");
            bands.add(band);
        }

    }


    //Track
    public void addTrack(Track track) {
        boolean added = false;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("tracks.txt", true);
        } catch (IOException e) {
            System.out.println("Unable to open file to add track");
            System.out.println("Track not added");
        }
        if (track.band) {
            for (Band band : bands) {
                String bandName = band.getName();
                if (bandName.equals(track.getArtist())) {
                    tracks.add(track);
                    added = true;
                    try {
                        assert fileWriter != null;
                        fileWriter.append(track.getName()).append(" ").append(String.valueOf(0));
                        System.out.println("Track " + track.getName() + " added.");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
            }
        } else {
            for (Musician musician : musicians) {
                String musicianName = musician.getName();
                if (musicianName.equals(track.getArtist())) {
                    tracks.add(track);
                    added = true;
                    try {
                        fileWriter.append(track.getName()).append(" ").append(String.valueOf(0));
                        System.out.println("Track " + track.getName() + " added.");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
            }
        }

        if (!added) {
            System.out.println("Artist not found, track not added to database.");
        }

    }

    public void removeTrack(String name) {
        boolean deleted = false;
        Iterator<Track> trackIterator = tracks.iterator();
        while (trackIterator.hasNext()) {
            String trackName = trackIterator.next().getName();
            if (trackName.equals(name)) {
                trackIterator.remove();
                deleted = true;
                System.out.println("Track " + trackName + " deleted.");
                break;
            }
        }

        if (!deleted) {
            System.out.println("Track " + name + " not found.");
        }
    }

    public ArrayList<String> listSongsByArtist(String artistName) {
        ArrayList<String> songsByArtist = new ArrayList<>();

        for (Track t : tracks) {
            if (t.getArtist().contains(artistName)) {
                songsByArtist.add(t.getName());
            }
        }

        return songsByArtist;
    }


    //Album
    public void addAlbum(Album album) {

        ArrayList<Track> albumTracks = album.tracks;
        boolean add = true;
        for (Track track : albumTracks) {
            String trackName = track.getName();
            boolean exists = false;
            for (Track t : tracks) {
                if (Objects.equals(t.getName(), trackName)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some track in album not registered. Try again.");
                add = false;
                break;
            }
        }
        if (add) {
            albums.add(album);
            System.out.println("Album " + album.name + " added.");
        }

    }


    //Library
    public void addLibrary(Library library) {
        boolean add = true;
        ArrayList<Track> libraryTracks = library.tracks;
        ArrayList<Album> libraryAlbums = library.albums;

        for (Track track : libraryTracks) {
            String trackName = track.getName();
            boolean exists = false;
            for (Track t : tracks) {
                if (Objects.equals(t.getName(), trackName)) {
                    exists = true;
//                    System.out.println(trackName);
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some track in library not registered. Try again.");
                add = false;
                break;
            }
        }

        for (Album album : libraryAlbums) {
            String albumName = album.name;
            boolean exists = false;
            for (Album a : albums) {
                if (Objects.equals(a.name, albumName)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some album in library not registered. Try again.");
                add = false;
                break;
            }
        }

        if (add) {
            libraries.add(library);
            System.out.println("Library " + library.name + " added.");
        }

    }


    //Compilation
    public void addCompilation(Compilation compilation) {
        boolean add = true;
        ArrayList<Track> compilationTracks = compilation.tracks;
        ArrayList<Album> compilationAlbums = compilation.albums;

        for (Track track : compilationTracks) {
            String trackName = track.getName();
            boolean exists = false;
            for (Track t : tracks) {
                if (Objects.equals(t.getName(), trackName)) {
                    exists = true;
//                    System.out.println(trackName);
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some track in compilation not registered. Try again.");
                add = false;
                break;
            }
        }

        for (Album album : compilationAlbums) {
            String albumName = album.name;
            boolean exists = false;
            for (Album a : albums) {
                if (Objects.equals(a.name, albumName)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some album in compilation not registered. Try again.");
                add = false;
                break;
            }
        }

        if (add) {
            compilations.add(compilation);
            System.out.println("Compilation " + compilation.name + " added.");
        }

    }


}
