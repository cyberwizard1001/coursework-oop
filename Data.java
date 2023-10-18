import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * The Data class represents a data storage and management system for a music library.
 * It stores information about musicians, bands, tracks, albums, libraries, and compilations.
 */
public class Data {
    ArrayList<Album> albums;
    ArrayList<Library> libraries;
    ArrayList<Musician> musicians;
    ArrayList<Band> bands;
    ArrayList<Compilation> compilations;
    ArrayList<Track> tracks;

    /**
     * Constructs an instance of the Data class with empty collections for each type of data.
     */
    public Data() {
        albums = new ArrayList<>();
        libraries = new ArrayList<>();
        musicians = new ArrayList<>();
        bands = new ArrayList<>();
        compilations = new ArrayList<>();
        tracks = new ArrayList<>();
    }

    /**
     * Adds a musician to the collection of musicians in the data.
     *
     * @param musician The Musician object to be added.
     */
    public void addMusician(Musician musician) {
        System.out.println("Musician " + musician.name + " added.");
        musicians.add(musician);
    }

    /**
     * Adds a band to the collection of bands in the data.
     *
     * @param band The Band object to be added.
     */
    public void addBand(Band band) {
        boolean add = true;
        for (Musician musician : band.getMusicians()) {
            boolean exists = false;
            String musician_name = musician.getName();
            for (Musician m : musicians) {
                if (musician_name.equals(m.name)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                System.out.println("Some artist not registered on the database. Try again.");
                add = false;
            }
        }
        if (add) {
            System.out.println("Band " + band.getName() + " added.");
            bands.add(band);
        }
    }

    /**
     * Adds a track to the collection of tracks in the data.
     *
     * @param track The Track object to be added.
     */
    public void addTrack(Track track) {
        boolean added = false;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("tracks.txt", true);
        } catch (IOException e) {
            System.out.println("Unable to open the file to add track");
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
                        System.out.println("File not found");;
                        e.printStackTrace();
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
                        System.out.println("File not found");;
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }

        if (!added) {
            System.out.println("Artist not found, track not added to the database.");
        }
    }

    /**
     * Removes a track from the collection of tracks in the data by name.
     *
     * @param name The name of the track to be removed.
     */
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

    /**
     * Lists all songs by a given artist in the data.
     *
     * @param artistName The name of the artist to list songs for.
     * @return An ArrayList of strings containing the names of songs by the artist.
     */
    public ArrayList<String> listSongsByArtist(String artistName) {
        ArrayList<String> songsByArtist = new ArrayList<>();

        for (Track t : tracks) {
            if (t.getArtist().contains(artistName)) {
                songsByArtist.add(t.getName());
            }
        }

        return songsByArtist;
    }



    /**
     * Adds an album to the collection of albums in the data. Checks if all tracks in the album are registered.
     * If all tracks exist in the general track collection, the album is added.
     *
     * @param album The Album object to be added to the data.
     */
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
                System.out.println("Some track in the album is not registered. Try again.");
                add = false;
                break;
            }
        }
        if (add) {
            albums.add(album);
            System.out.println("Album " + album.getName() + " added.");
        }
    }

    /**
     * Adds a library to the collection of libraries in the data. Checks if all tracks and albums in the library are registered.
     * If all tracks and albums exist in the respective collections, the library is added.
     *
     * @param library The Library object to be added to the data.
     */
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
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some track in the library is not registered. Try again.");
                add = false;
                break;
            }
        }

        for (Album album : libraryAlbums) {
            String albumName = album.getName();
            boolean exists = false;
            for (Album a : albums) {
                if (Objects.equals(a.getName(), albumName)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some album in the library is not registered. Try again.");
                add = false;
                break;
            }
        }

        if (add) {
            libraries.add(library);
            System.out.println("Library " + library.getName() + " added.");
        }
    }

    /**
     * Adds a compilation to the collection of compilations in the data. Checks if all tracks and albums in the compilation are registered.
     * If all tracks and albums exist in the respective collections, the compilation is added.
     *
     * @param compilation The Compilation object to be added to the data.
     */
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
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some track in the compilation is not registered. Try again.");
                add = false;
                break;
            }
        }

        for (Album album : compilationAlbums) {
            String albumName = album.getName();
            boolean exists = false;
            for (Album a : albums) {
                if (Objects.equals(a.getName(), albumName)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                System.out.println("Some album in the compilation is not registered. Try again.");
                add = false;
                break;
            }
        }

        if (add) {
            compilations.add(compilation);
            System.out.println("Compilation " + compilation.getName() + " added.");
        }
    }


}
