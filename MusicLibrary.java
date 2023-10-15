import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * The `MusicLibrary` class represents a digital music library that stores information about musicians, bands, albums, tracks,
 * compilations, and libraries. It provides functionality for managing and organizing music-related data.
 */
public class MusicLibrary {

    Data data = new Data();
    Scanner scanner = new Scanner(System.in);

    /**
     * MusicLibrary()
     * The class constructor is being used to input data to the Data object that is being used throughout the program.
     * Data has been pre-fed with artist, band, track, album, library and compilation album details
     */
    public MusicLibrary() {
        ArrayList<String> current_bands = new ArrayList<>();
        ArrayList<Musician> band1_musicians = new ArrayList<>();
        current_bands.add("Band 1");
        ArrayList<String> past_bands = new ArrayList<>();
        ArrayList<String> roles = new ArrayList<>();
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Musician> band2_musicians = new ArrayList<>();
        ArrayList<Musician> band3_musicians = new ArrayList<>();
        ArrayList<Musician> band4_musicians = new ArrayList<>();
        ArrayList<Musician> band5_musicians = new ArrayList<>();
        ArrayList<Musician> band6_musicians = new ArrayList<>();
        ArrayList<Track> tracks1 = new ArrayList<>();
        ArrayList<Track> tracks2 = new ArrayList<>();
        ArrayList<Track> tracks3 = new ArrayList<>();
        ArrayList<Track> tracks4 = new ArrayList<>();
        ArrayList<Track> tracks5 = new ArrayList<>();

        tracks.add(new Track("Track 24", "Maroon 5", true, new Date(), 4.10, 4, "", 3540, null));
        tracks.add(new Track("Track 26", "Maroon 5", true, new Date(), 4.10, 4, "", 3540, null));
        tracks.add(new Track("Track 25", "Maroon 5", true, new Date(), 4.25, 4, "", 3960, null));
        tracks1.add(new Track("Track 2", "One Direction", true, new Date(), 4.30, 5, "", 3840, null));
        tracks1.add(new Track("Track 20", "One Direction", true, new Date(), 4.30, 5, "", 3840, null));
        tracks2.add(new Track("Track 3", "Imagine Dragons", true, new Date(), 4.10, 4, "", 3540, null));
        tracks2.add(new Track("Track 27", "Imagine Dragons", true, new Date(), 4.10, 4, "", 3540, null));
        tracks3.add(new Track("Track 22", "Linkin Park", true, new Date(), 4.25, 4, "", 3960, null));
        tracks3.add(new Track("Track 23", "Linkin Park", true, new Date(), 4.10, 4, "", 3540, null));
        tracks4.add(new Track("Track 28", "Green Day", true, new Date(), 4.10, 4, "", 3540, null));
        tracks4.add(new Track("Track 7", "Green Day", true, new Date(), 4.25, 4, "", 3960, null));
        tracks4.add(new Track("Track 8", "Green Day", true, new Date(), 4.10, 4, "", 3540, null));
        tracks5.add(new Track("Track 17", "The neighbourhood", true, new Date(), 4.10, 4, "", 3540, null));

        data.addMusician(new Musician("Nirmal K", false, null, 23, past_bands, roles));
        data.addMusician(new Musician("Sumithra S", true, current_bands, 23, past_bands, roles));
        data.addMusician(new Musician("Selena Gomez", false, current_bands, 22, past_bands, roles));
        data.addMusician(new Musician("John Legend", false, current_bands, 24, past_bands, roles));
        data.addMusician(new Musician("S.P.Balasubramaniam", false, current_bands, 28, past_bands, roles));
        data.addMusician(new Musician("Arijit Singh", false, current_bands, 32, past_bands, roles));
        data.addMusician(new Musician("Frank Ocean", true, current_bands, 24, past_bands, roles));
        data.addMusician(new Musician("Khalid", true, current_bands, 30, past_bands, roles));
        data.addMusician(new Musician("Justin Timberlake", true, current_bands, 32, past_bands, roles));
        data.addMusician(new Musician("Harry Styles", true, current_bands, 25, past_bands, roles));

        band1_musicians.add(new Musician("Sumithra S", true, current_bands, 23, past_bands, roles));
        band1_musicians.add(new Musician("Nirmal K", true, current_bands, 23, past_bands, roles));
        band2_musicians.add(new Musician("Frank Ocean", true, current_bands, 24, past_bands, roles));
        band2_musicians.add(new Musician("Khalid", true, current_bands, 30, past_bands, roles));
        band3_musicians.add(new Musician("Justin Timberlake", true, current_bands, 32, past_bands, roles));
        band3_musicians.add(new Musician("Frank Ocean", true, current_bands, 24, past_bands, roles));
        band3_musicians.add(new Musician("Sumithra S", true, current_bands, 23, past_bands, roles));
        band4_musicians.add(new Musician("Nirmal K", true, current_bands, 23, past_bands, roles));
        band4_musicians.add(new Musician("Frank Ocean", true, current_bands, 24, past_bands, roles));
        band4_musicians.add(new Musician("Khalid", true, current_bands, 30, past_bands, roles));
        band5_musicians.add(new Musician("Justin Timberlake", true, current_bands, 32, past_bands, roles));
        band5_musicians.add(new Musician("Frank Ocean", true, current_bands, 24, past_bands, roles));
        band6_musicians.add(new Musician("Sumithra S", true, current_bands, 23, past_bands, roles));
        band6_musicians.add(new Musician("Harry Styles", true, current_bands, 25, past_bands, roles));


        data.addBand(new Band("Green Day", 2001, band1_musicians));
        data.addBand(new Band("One Direction", 2001, band2_musicians));
        data.addBand(new Band("Imagine Dragons", 2004, band3_musicians));
        data.addBand(new Band("The neighbourhood", 2010, band4_musicians));
        data.addBand(new Band("Linkin Park", 2005, band5_musicians));
        data.addBand(new Band("Maroon 5", 2012, band6_musicians)); //okay


        data.addTrack(new Track("Track 1", "Nirmal K", false, new Date(), 4.28, 4, "", 4040, null));
        data.addTrack(new Track("Track 2", "One Direction", true, new Date(), 4.30, 5, "", 3840, null));
        data.addTrack(new Track("Track 3", "Nirmal K", false, new Date(), 4.28, 4, "", 4040, null));
        data.addTrack(new Track("Track 4", "Selena Gomez", false, new Date(), 4.25, 4, "", 3960, null));
        data.addTrack(new Track("Track 5", "John Legend", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 6", "John Legend", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 7", "Green Day", true, new Date(), 4.25, 4, "", 3960, null));
        data.addTrack(new Track("Track 8", "Green Day", true, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 9", "John Legend", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 10", "S.P.Balasubramaniam", false, new Date(), 4.28, 4, "", 4040, null));
        data.addTrack(new Track("Track 11", "Arijit Singh", false, new Date(), 4.30, 5, "", 3840, null));
        data.addTrack(new Track("Track 12", "Arijit Singh", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 13", "Khalid", false, new Date(), 4.25, 4, "", 3960, null));
        data.addTrack(new Track("Track 14", "Khalid", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 15", "Frank Ocean", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 16", "Khalid", false, new Date(), 4.25, 4, "", 3960, null));
        data.addTrack(new Track("Track 17", "The neighbourhood", true, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 18", "Justin Timberlake", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 19", "Justin Timberlake", false, new Date(), 4.28, 4, "", 4040, null));
        data.addTrack(new Track("Track 20", "One Direction", true, new Date(), 4.30, 5, "", 3840, null));
        data.addTrack(new Track("Track 21", "Justin Timberlake", false, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 22", "Linkin Park", true, new Date(), 4.25, 4, "", 3960, null));
        data.addTrack(new Track("Track 23", "Linkin Park", true, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 24", "Maroon 5", true, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 25", "Maroon 5", true, new Date(), 4.25, 4, "", 3960, null));
        data.addTrack(new Track("Track 26", "Maroon 5", true, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 27", "Imagine Dragons", true, new Date(), 4.10, 4, "", 3540, null));
        data.addTrack(new Track("Track 28", "Green Day", true, new Date(), 4.10, 4, "", 3540, null));


        albums.add(new Album("Maroon 5", tracks, "Melody"));
        albums.add(new Album("One Direction", tracks2, "Melody"));

        data.addAlbum(new Album("Maroon 5", tracks, "Melody")); //okay
        data.addAlbum(new Album("Green Day", tracks1, "Melody")); //no
        data.addAlbum(new Album("One Direction", tracks2, "Melody")); //okay
        data.addAlbum(new Album("Imagine Dragons", tracks3, "Melody")); //okay
        data.addAlbum(new Album("The neighbourhood", tracks4, "Melody")); //okay
        data.addAlbum(new Album("Linkin Park", tracks5, "Melody")); //no
        //data.removeTrack("Track 2");

        data.addLibrary(new Library("Library 1", tracks, albums));

        data.addCompilation(new Compilation("Compilation 1", albums, tracks2, null));
    }

    public void homeInterface() {
        int input = 0;
        System.out.println("oTunes");  // Display the application name.
        System.out.println("Pick your poison!");  // Prompt the user for an action.
        System.out.println("1. Add");  // Option to add music entities.
        System.out.println("2. Play");  // Option to play music.
        System.out.println("3. View");  // Option to view music entities.
        System.out.println("4. Burn to disk");  // Option to burn music to a disk.

        try {
            input = scanner.nextInt();  // Read the user's input.
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number");  // Handle invalid input.
            homeInterface();  // Recursively call the home interface.
        }

        switch (input) {
            case 1:
                addInterface();  // Navigate to the add interface.
                break;
            case 2:
                playInterface();  // Navigate to the play interface.
                break;
            case 3:
                viewInterface();  // Navigate to the view interface.
                break;
            case 4:
                burnInterface();  // Navigate to the burn interface.
                break;
            default: {
                System.out.println("Error, try again!");  // Handle invalid input.
                homeInterface();  // Recursively call the home interface.
                break;
            }
        }
    }

    private void burnInterface() {
        // TODO: Implement the burn functionality.
    }

    private void viewInterface() {
        int input1 = 0;
        System.out.println("View Menu");  // Display the view menu.
        System.out.println("1. Musician");  // Option to view musicians.
        System.out.println("2. Band");  // Option to view bands.
        System.out.println("3. Track");  // Option to view tracks.
        System.out.println("4. Album");  // Option to view albums.
        System.out.println("5. Library");  // Option to view libraries.
        System.out.println("6. Compilation Album");  // Option to view compilation albums.
        System.out.println("7. Go back");  // Option to return to the home interface.

        try {
            System.out.print("Choose a number: ");
            input1 = scanner.nextInt();  // Read the user's input.
        } catch (InputMismatchException e) {
            System.out.println("Invalid character, choose a number");  // Handle invalid input.
            scanner.nextLine();
            viewInterface();  // Recursively call the view interface.
        }

        switch (input1) {
            case 1: {
                viewMusician();  // Navigate to view musician interface.
                break;
            }
            case 2: {
                viewBand();  // Navigate to view band interface.
                break;
            }
            case 3: {
                viewTracks();  // Navigate to view tracks interface.
                break;
            }
            case 4: {
                viewAlbums();  // Navigate to view albums interface.
                break;
            }
            case 5: {
                viewLibraries();  // Navigate to view libraries interface.
                break;
            }
            case 6: {
                viewCompilations();  // Navigate to view compilation albums interface.
                break;
            }
            case 7: {
                homeInterface();  // Return to the home interface.
            }
            default:
                System.out.println("Enter a valid number");  // Handle invalid input.
                scanner.nextLine();
                homeInterface();  // Recursively call the home interface.
        }
    }

    public void addInterface() {
        int input1 = 0;
        System.out.println("Add music");  // Display the add music menu.
        System.out.println("1. Musician");  // Option to add a musician.
        System.out.println("2. Band");  // Option to add a band.
        System.out.println("3. Track");  // Option to add a track.
        System.out.println("4. Album");  // Option to add an album.
        System.out.println("5. Library");  // Option to add a library.
        System.out.println("6. Compilation Album");  // Option to add a compilation album.
        System.out.println("7. Go back");  // Option to return to the home interface.

        System.out.print("Choose a number: ");
        try {
            input1 = scanner.nextInt();  // Read the user's input.
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Enter a valid number");  // Handle invalid input.
            addInterface();  // Recursively call the add interface.
        }

        switch (input1) {
            case 1: {
                addMusician();  // Navigate to add musician interface.
                break;
            }
            case 2: {
                addBand();  // Navigate to add band interface.
                break;
            }
            case 3: {
                addTrack();  // Navigate to add track interface.
                break;
            }
            case 4: {
                addAlbum();  // Navigate to add album interface.
                break;
            }
            case 5: {
                addLibrary();  // Navigate to add library interface.
                break;
            }
            case 6: {
                addCompilation();  // Navigate to add compilation album interface.
                break;
            }
            case 7: {
                homeInterface();  // Return to the home interface.
                break;
            }
        }
    }

    private void addCompilation() {
        String name;
        ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<String> artists = new ArrayList();

        System.out.print("Name: ");
        name = scanner.nextLine();  // Prompt for the name of the compilation album.

        System.out.print("Enter names of tracks (Enter x to stop): ");
        ArrayList<String> trackNames = new ArrayList<>();
        while (!Objects.equals(scanner.nextLine(), "x")) {
            trackNames.add(scanner.nextLine());  // Gather names of tracks to be included in the compilation.
        }

        // Iterate through the provided track names and find corresponding tracks in the data.
        for (String n : trackNames) {
            for (Track t : data.tracks) {
                if (t.getName().contains(n)) {
                    tracks.add(t);  // Add the selected tracks to the compilation.
                }
            }
        }

        System.out.print("Enter names of albums (Enter x to stop): ");
        ArrayList<String> albumNames = new ArrayList<>();
        while (!Objects.equals(scanner.nextLine(), "x")) {
            albumNames.add(scanner.nextLine());  // Gather names of albums to be included in the compilation.
        }

        // Iterate through the provided album names and find corresponding albums in the data.
        for (String n : albumNames) {
            for (Album a : data.albums) {
                if (a.getName().contains(n)) {
                    albums.add(a);  // Add the selected albums to the compilation.
                }
            }
        }

        System.out.print("Enter names of compilation artists (Enter x to stop): ");
        while (!Objects.equals(scanner.nextLine(), "x")) {
            artists.add(scanner.nextLine());  // Gather names of compilation artists.
        }

        // Create the final compilation object with the collected information and add it to the data.
        Compilation finalCompilation = new Compilation(name, albums, tracks, artists);
        data.addCompilation(finalCompilation);
    }

    private void addLibrary() {
        String name;
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<Album> albums = new ArrayList<>();

        System.out.print("Name: ");
        name = scanner.nextLine();  // Prompt for the name of the library.

        System.out.print("Enter names of tracks (Enter x to stop): ");
        ArrayList<String> trackNames = new ArrayList<>();
        while (!Objects.equals(scanner.nextLine(), "x")) {
            trackNames.add(scanner.nextLine());  // Gather names of tracks to be included in the library.
        }

        // Iterate through the provided track names and find corresponding tracks in the data.
        for (String n : trackNames) {
            for (Track t : data.tracks) {
                if (t.getName().contains(n)) {
                    tracks.add(t);  // Add the selected tracks to the library.
                }
            }
        }

        System.out.print("Enter names of albums (Enter x to stop): ");
        ArrayList<String> albumNames = new ArrayList<>();
        while (!Objects.equals(scanner.nextLine(), "x")) {
            albumNames.add(scanner.nextLine());  // Gather names of albums to be included in the library.
        }

        // Iterate through the provided album names and find corresponding albums in the data.
        for (String n : albumNames) {
            for (Album a : data.albums) {
                if (a.getName().contains(n)) {
                    albums.add(a);  // Add the selected albums to the library.
                }
            }
        }

        // Create the final library object with the collected information and add it to the data.
        Library finalLibrary = new Library(name, tracks, albums);
        data.addLibrary(finalLibrary);
    }


    private void addAlbum() {
        String name;
        ArrayList<Track> tracks = new ArrayList<>();
        String type;

        System.out.print("Name: ");
        name = scanner.nextLine();  // Prompt for the name of the album.

        System.out.print("Enter names of tracks (Enter x to stop): ");
        ArrayList<String> trackNames = new ArrayList<>();

        // Gather names of tracks to be included in the album.
        while (!Objects.equals(scanner.nextLine(), "x")) {
            trackNames.add(scanner.nextLine());
        }

        // Iterate through the provided track names and find corresponding tracks in the data.
        for (String n : trackNames) {
            for (Track t : data.tracks) {
                if (t.getName().contains(n)) {
                    tracks.add(t);  // Add the selected tracks to the album.
                }
            }
        }

        System.out.print("Type: ");
        type = scanner.nextLine();  // Prompt for the type of the album.

        // Create the final album object with the collected information and add it to the data.
        Album finalAlbum = new Album(name, tracks, type);
        data.addAlbum(finalAlbum);
    }

    private void addTrack() {
        String name;
        String artist;
        boolean band = false;
        Date date;
        double length = 0.0;
        int rating = 0;
        String location;
        double size = 0;
        ArrayList<String> guest_artists = new ArrayList<>();

        scanner.nextLine();

        System.out.print("Name: ");
        name = scanner.nextLine();  // Prompt for the name of the track.

        System.out.print("Artist: ");
        artist = scanner.nextLine();  // Prompt for the artist of the track.

        System.out.print("Is this song by a band? (Type true / false): ");
        try {
            band = scanner.nextBoolean();  // Prompt to determine if the track is by a band.
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid boolean");
            scanner.nextLine();
            addTrack();
        }

        date = new Date();

        System.out.print("Enter length of track in minutes (Eg: 4.26): ");
        try {
            length = scanner.nextDouble();  // Prompt for the length of the track.
        } catch (InputMismatchException e) {
            System.out.println("Enter valid time: ");
            scanner.nextLine();
            addTrack();
        }

        System.out.print("Enter song rating (1-5): ");
        try {
            rating = scanner.nextInt();  // Prompt for the rating of the track.
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid digit");
            scanner.nextLine();
            addTrack();
        }

        if (rating > 5) {
            System.out.println("Choose a rating between 1-5");
            addTrack();
        }

        scanner.nextLine();

        System.out.print("Enter file location on disk: ");
        location = scanner.nextLine();  // Prompt for the file location of the track.

        // Create the final track object with the collected information and add it to the data.
        Track finalTrack = new Track(name, artist, band, date, length, rating, location, size, guest_artists);
        data.addTrack(finalTrack);
    }

    private void addBand() {
        String name;
        int established = 0;
        ArrayList<Musician> musicians = new ArrayList<>();
        ArrayList<String> musicianNames = new ArrayList<>();

        System.out.println("Enter band details");

        System.out.print("Name: ");
        name = scanner.nextLine();  // Prompt for the name of the band.

        System.out.print("Enter year of establishment: ");
        try {
            established = scanner.nextInt();  // Prompt for the year of establishment.
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number: ");
            scanner.nextLine();
            addBand();
        }

        System.out.print("Enter names of band members (Enter x to stop): ");

        // Gather names of band members to be included in the band.
        while (!Objects.equals(scanner.nextLine(), "x")) {
            musicianNames.add(scanner.nextLine());
        }

        // Iterate through the provided musician names and find corresponding musicians in the data.
        for (String n : musicianNames) {
            for (Musician m : data.musicians) {
                if (m.getName().contains(n)) {
                    musicians.add(m);  // Add the selected musicians to the band.
                }
            }
        }

        // Create the final band object with the collected information and add it to the data.
        Band b = new Band(name, established, musicians);
        data.addBand(b);
    }

    private void addMusician() {
        String name;
        boolean band_status = false;
        ArrayList<String> current_bands = new ArrayList<>();
        int age = 0;
        ArrayList<String> past_bands = new ArrayList<>();
        ArrayList<String> roles = new ArrayList<>();

        System.out.println("Enter musician details");  // Prompt to enter musician details.

        System.out.print("Name: ");
        name = scanner.nextLine();  // Prompt for the name of the musician.

        System.out.print("Is " + name + " in a band? (Type true / false) ");

        try {
            band_status = scanner.nextBoolean();  // Prompt to determine if the musician is in a band.
        } catch (InputMismatchException e) {
            System.out.print("Enter 'true' or 'false");
            scanner.nextLine();
            addInterface();  // If an invalid input is provided, return to the main interface.
        }

        if (band_status) {
            System.out.print("Enter current bands " + name + " is part of (Type x to stop):");

            // Gather names of current bands the musician is part of.
            while (!Objects.equals(scanner.nextLine(), "x")) {
                current_bands.add(scanner.nextLine());
            }
        }

        System.out.print("Enter age: ");

        try {
            age = scanner.nextInt();  // Prompt for the age of the musician.
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number");
            scanner.nextLine();
            addInterface();  // If an invalid input is provided, return to the main interface.
        }

        System.out.print("Enter bands " + name + " was part of (Type x to stop):");

        // Gather names of past bands the musician was part of.
        while (!Objects.equals(scanner.nextLine(), "x")) {
            past_bands.add(scanner.nextLine());
        }

        System.out.print("Enter roles " + name + " performs in (Type x to stop):");

        // Gather roles the musician performs in.
        while (!Objects.equals(scanner.nextLine(), "x")) {
            roles.add(scanner.nextLine());
        }

        // Create the final Musician object with the collected information and add it to the data.
        Musician musician = new Musician(name, band_status, current_bands, age, past_bands, roles);
        data.addMusician(musician);
    }


    public void playInterface() {
        while (true) {
            int input1 = 0, input2 = 0;
            // Display the initial options for the play interface.
            System.out.println("Play music");
            System.out.println("Pick your poison!");
            System.out.println("1. Universal Search (song, artist, libraries, compilation albums)");
            System.out.println("2. Choose from list");
            System.out.println("Any key to go to the home menu");

            // Prompt the user to choose an option.
            System.out.print("Choose a number: ");
            try {
                input1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                // Handle invalid input and restart if the input is not a number.
                scanner.nextLine();
                System.out.println("Enter a valid number");
                playInterface();
            }

            if (input1 == 1) {
                scanner.nextLine();
                System.out.println("Universal search");
                // Prompt the user to enter a search string.
                System.out.print("Enter a string: ");
                String searchString = scanner.nextLine();
                universalSearch(searchString);  // Calls the universalSearch method for searching.
            } else if (input1 == 2) {
                System.out.println("List Menu");
                System.out.println("Pick your poison!");
                System.out.println("1. Track");
                System.out.println("2. Album");
                System.out.println("3. Library");
                System.out.println("4. Compilation Album");
                System.out.println("Any key to go to the home menu");

                // Prompt the user to choose an option from the list.
                System.out.print("Choose a number: ");
                try {
                    input2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    // Handle invalid input and restart if the input is not a number.
                    scanner.nextLine();
                    System.out.println("Enter a valid number");
                    playInterface();
                }

                if (input2 == 1) {
                    int x = 1;
                    for (Track track : data.tracks) {
                        System.out.println(x + " " + track.getName());
                        x++;
                    }
                    int choice = 0;
                    // Prompt the user to choose a track to play.
                    System.out.print("Choose a number: ");
                    try {
                        choice = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        // Handle invalid input and restart if the input is not a number.
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }
                    // Display the selected track and increment its play count.
                    System.out.println("Playing " + data.tracks.get(choice - 1).getName());
                    incrementSongPlayCount(data.tracks.get(choice - 1));  // Calls a method to increment the song play count.
                } else if (input2 == 2) {
                    int x = 1;
                    for (Album album : data.albums) {
                        System.out.println(x + " " + album.getName());
                        x++;
                    }
                    int choice = 0;
                    // Prompt the user to choose an album to play.
                    System.out.print("Choose a number: ");
                    try {
                        choice = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        // Handle invalid input and restart if the input is not a number.
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }
                    // Display the selected album and play all its tracks.
                    System.out.println("Playing from " + data.albums.get(choice - 1).getName());
                    for (Track t : data.albums.get(choice - 1).tracks) {
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);  // Calls a method to increment the song play count for each track in the album.
                    }
                } else if (input2 == 3) {
                    int x = 1;
                    for (Library library : data.libraries) {
                        System.out.println(x + " " + library.getName());
                        x++;
                    }
                    int choice = 0;
                    // Prompt the user to choose a library to play.
                    System.out.print("Choose a number: ");
                    try {
                        choice = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        // Handle invalid input and restart if the input is not a number.
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }
                    // Display the selected library and play all its tracks and albums.
                    System.out.println("Playing from " + data.libraries.get(choice - 1).getName());
                    for (Track t : data.libraries.get(choice - 1).tracks) {
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);  // Calls a method to increment the song play count for each track in the library.
                    }
                    for (Album a : data.libraries.get(choice - 1).albums) {
                        for (Track t : a.tracks) {
                            System.out.println("Song: " + t.getName());
                            incrementSongPlayCount(t);  // Calls a method to increment the song play count for each track in the albums in the library.
                        }
                    }
                } else if (input2 == 4) {
                    int x = 1;
                    for (Compilation compilation : data.compilations) {
                        System.out.println(x + " " + compilation.getName());
                        x++;
                    }
                    int choice = 0;
                    // Prompt the user to choose a compilation album to play.
                    System.out.print("Choose a number: ");
                    try {
                        choice = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        // Handle invalid input and restart if the input is not a number.
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }
                    // Display the selected compilation album and play all its tracks and albums.
                    System.out.println("Playing from " + data.compilations.get(choice - 1).getName());
                    for (Track t : data.compilations.get(choice - 1).tracks) {
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);  // Calls a method to increment the song play count for each track in the compilation.
                    }
                    for (Album a : data.compilations.get(choice - 1).albums) {
                        for (Track t : a.tracks) {
                            System.out.println("Song: " + t.getName());
                            incrementSongPlayCount(t);  // Calls a method to increment the song play count for each track in the albums in the compilation.
                        }
                    }
                } else {
                    System.out.println("Going back...");
                    break;
                }
            } else {
                System.out.println("Going back...");
                break;
            }

            homeInterface();  // Return to the home interface.
        }
    }


    private void incrementSongPlayCount(Track track) {
        String filePath = "tracks.txt";  // Define the file path for song play counts.
        String toReplace = "";
        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(new File(filePath));  // Attempt to open the file for reading.
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find play_count file");
            homeInterface();  // Handle the case where the file is not found and return to the home interface.
        }
        StringBuilder stringBuffer = new StringBuilder();

        while (true) {
            assert fileScanner != null;
            if (!fileScanner.hasNextLine()) break;
            stringBuffer.append(fileScanner.nextLine()).append(System.lineSeparator());
        }
        String fileContents = stringBuffer.toString();
        String trackName = track.getName();

        if (fileContents.contains(trackName)) {
            int trackIndex = fileContents.indexOf(trackName);
            toReplace = fileContents.substring(trackIndex, (trackIndex + trackName.length() + 3));

            String prevCountString = toReplace.replace(trackName, "");

            prevCountString = prevCountString.replaceAll("[^0-9]", "");

            track.playCount = Integer.parseInt(prevCountString) + 1;
            String replacement = trackName + " " + track.playCount;

            fileContents = fileContents.replaceAll(toReplace, replacement);  // Replace the old play count with the updated count.
            System.out.println("Play count: " + track.playCount);

            try {
                FileWriter writer = new FileWriter(filePath);  // Open the file for writing.
                writer.append(fileContents);  // Write the updated contents back to the file.
                writer.flush();
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        } else {
            System.out.println("Song not found on record, cannot play");
        }
    }


    private void universalSearch(String searchString) {
        // Create a LinkedHashMap to store search results where the keys are names, and the values are types (e.g., Musician).
        LinkedHashMap<String, String> searchResults = new LinkedHashMap<>();
        // Create an ArrayList to store search result names as strings.
        ArrayList<String> searchResultsString = new ArrayList<>();
        String choice;
        int count = 0;

        // Search for Musicians matching the search string and display them.
        System.out.println("Musicians:");
        for (Musician m : data.musicians) {
            if (m.getName().contains(searchString)) {
                System.out.println((count + 1) + " " + m.getName());
                searchResults.put(m.getName(), "Musician");
                searchResultsString.add(m.getName());
                count++;
            }
        }

        // Search for Bands matching the search string and display them.
        System.out.println("Bands:");
        for (Band b : data.bands) {
            if (b.getName().contains(searchString)) {
                System.out.println((count + 1) + " " + b.getName());
                searchResults.put(b.getName(), "Band");
                searchResultsString.add(b.getName());
                count++;
            }
        }

        // Search for Tracks matching the search string and display them.
        System.out.println("Tracks:");
        for (Track t : data.tracks) {
            if (t.getName().contains(searchString)) {
                System.out.println((count + 1) + " " + t.getName());
                searchResults.put(t.getName(), "Track");
                searchResultsString.add(t.getName());
                count++;
            }
        }

        // Search for Albums matching the search string and display them.
        System.out.println("Albums:");
        for (Album a : data.albums) {
            if (a.getName().contains(searchString)) {
                System.out.println((count + 1) + " " + a.getName());
                searchResults.put(a.getName(), "Album");
                searchResultsString.add(a.getName());
                count++;
            }
        }

        // Search for Libraries matching the search string and display them.
        System.out.println("Libraries:");
        for (Library l : data.libraries) {
            if (l.getName().contains(searchString)) {
                System.out.println((count + 1) + " " + l.getName());
                searchResults.put(l.getName(), "Library");
                searchResultsString.add(l.getName());
                count++;
            }
        }

        // Search for Compilation Albums matching the search string and display them.
        System.out.println("Compilation Albums:");
        for (Compilation c : data.compilations) {
            if (c.getName().contains(searchString)) {
                System.out.println((count + 1) + " " + c.getName());
                searchResults.put(c.getName(), "Compilation");
                searchResultsString.add(c.getName());
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Sorry, couldn't find any results :\\");
            System.out.println("Press 'Enter' to go back...");

            try {
                System.in.read();
                scanner.nextLine();
                viewInterface();  // Handle the case where no results are found and return to the view interface.
            } catch (Exception ignored) {
            }
        } else {
            System.out.print("Enter a number to play relevant content: ");
            int num = 0;

            try {
                num = scanner.nextInt() - 1;  // Prompt the user to choose an option from the search results.
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Enter a number");
                playInterface();
            }

            choice = searchResultsString.get(num);
            playSongFromSearch(searchResults, choice);  // Call the playSongFromSearch method with the selected choice.
        }
    }


    private void playSongFromSearch(LinkedHashMap<String, String> searchResults, String choice) {
        // Retrieve the type of the selected choice from the search results.
        String type = searchResults.get(choice);

        // Use a switch statement to determine the type and play relevant content.
        switch (type) {
            case "Musician":
            case "Band":
                // When the choice is a Musician or Band, play songs from their catalog.
                System.out.println("Playing songs from " + choice);
                for (Track t : data.tracks) {
                    // Check if the artist matches the chosen Musician or Band and increment the play count.
                    if (t.getArtist().contains(choice)) {
                        incrementSongPlayCount(t);
                    }
                }
                break;
            case "Track":
                // When the choice is a Track, play the selected song.
                System.out.println("Playing song " + choice);
                for (Track t : data.tracks) {
                    // Find the selected song by name and increment the play count.
                    if (t.getName().contains(choice)) {
                        incrementSongPlayCount(t);
                        break; // Break the loop once the song is found.
                    }
                }
                break;
            case "Album":
                // When the choice is an Album, play all songs from the selected album.
                Album selectedAlbum = new Album();
                System.out.println("Playing album: " + choice);
                for (Album a : data.albums) {
                    // Find the selected album by name and assign it to selectedAlbum.
                    if (a.getName().contains(choice)) {
                        selectedAlbum = a;
                        break; // Break the loop once the album is found.
                    }
                }
                for (Track t : selectedAlbum.tracks) {
                    // Play each song from the selected album and increment the play count.
                    System.out.println("Song: " + t.getName());
                    incrementSongPlayCount(t);
                }
                break;
            case "Library":
                // When the choice is a Library, play all songs from the selected library.
                Library selectedLibrary = new Library();
                System.out.println("Playing library: " + choice);
                for (Library l : data.libraries) {
                    // Find the selected library by name and assign it to selectedLibrary.
                    if (l.getName().contains(choice)) {
                        selectedLibrary = l;
                        break; // Break the loop once the library is found.
                    }
                }
                for (Track t : selectedLibrary.tracks) {
                    // Play each song from the selected library and increment the play count.
                    System.out.println("Song: " + t.getName());
                    incrementSongPlayCount(t);
                }
                for (Album a : selectedLibrary.albums) {
                    for (Track t : a.tracks) {
                        // Play each song from albums in the library and increment the play count.
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);
                    }
                }
                break;
            case "Compilation":
                // When the choice is a Compilation, play all songs from the selected compilation.
                Compilation selectedCompilation = new Compilation();
                System.out.println("Playing compilation: " + choice);
                for (Compilation c : data.compilations) {
                    // Find the selected compilation by name and assign it to selectedCompilation.
                    if (c.getName().contains(choice)) {
                        selectedCompilation = c;
                        break; // Break the loop once the compilation is found.
                    }
                }
                for (Track t : selectedCompilation.tracks) {
                    // Play each song from the selected compilation and increment the play count.
                    System.out.println("Song: " + t.getName());
                    incrementSongPlayCount(t);
                }
                for (Album a : selectedCompilation.albums) {
                    for (Track t : a.tracks) {
                        // Play each song from albums in the compilation and increment the play count.
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);
                    }
                }
                break;
        }
    }


    private void viewCompilations() {
        // Initialize a counter for numbering compilations.
        int x = 1;

        // Display a numbered list of compilation albums.
        for (Compilation c : data.compilations) {
            System.out.println(x + " " + c.getName());
            x++;
        }

        // Prompt the user to enter a number to see tracks in a compilation.
        System.out.print("Enter a number to see tracks in compilation: ");
        int choice = 0;

        try {
            // Read the user's input as an integer.
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            // Handle input that is not a valid number.
            scanner.nextLine();
            System.out.println("Enter a valid number");
            viewCompilations();
        }

        if (choice <= data.compilations.size()) {
            // Display independent tracks and tracks from albums in the chosen compilation.

            Compilation chosenCompilation = data.compilations.get(choice - 1);

            // Display independent tracks.
            System.out.println("Independent Tracks:");
            for (Track t : chosenCompilation.tracks) {
                System.out.println(t.getName());
            }

            // Display tracks from albums.
            System.out.println("Album Tracks: ");
            for (Album a : chosenCompilation.albums) {
                System.out.println("Album " + a.getName());
                for (Track t : a.tracks) {
                    System.out.println(t.getName());
                }
            }
        }

        // Prompt the user to go back.
        System.out.print("Press 'Enter' to go back...");

        try {
            // Wait for the user to press Enter and then proceed.
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
            // Handle exceptions if they occur.
        }
    }

    private void viewLibraries() {
        // Initialize a counter for numbering libraries.
        int x = 1;

        // Display a numbered list of libraries.
        for (Library l : data.libraries) {
            System.out.println(x + " " + l.getName());
            x++;
        }

        // Prompt the user to enter a number to see tracks in a library.
        System.out.print("Enter a number to see tracks in the library: ");
        int choice = 0;

        try {
            // Read the user's input as an integer.
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            // Handle input that is not a valid number.
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewLibraries();
        }

        if (choice < data.libraries.size()) {
            // Display tracks from the chosen library and tracks from albums in the library.

            Library chosenLib = data.libraries.get(choice - 1);

            // Display tracks from the library.
            for (Track t : chosenLib.tracks) {
                System.out.println(t.getName());
            }

            // Display album tracks.
            System.out.println("Album tracks: ");
            for (Album a : chosenLib.albums) {
                System.out.println("Album: " + a.getName());
                for (Track t : a.tracks) {
                    System.out.println(t.getName());
                }
            }
        }

        // Prompt the user to go back.
        System.out.print("Press 'Enter' to go back...");

        try {
            // Wait for the user to press Enter and then proceed.
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
            // Handle exceptions if they occur.
        }
    }

    private void viewAlbums() {
        // Initialize a counter for numbering albums.
        int x = 1;

        // Display a numbered list of albums.
        for (Album a : data.albums) {
            System.out.println(x + " " + a.getName());
            x++;
        }

        // Prompt the user to enter a number to see tracks in an album.
        System.out.print("Enter a number to see tracks in the album: ");
        int choice = 0;

        try {
            // Read the user's input as an integer.
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            // Handle input that is not a valid number.
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewAlbums();
        }

        if (choice <= data.albums.size()) {
            // Display tracks from the chosen album.

            Album chosenAlbum = data.albums.get(choice - 1);

            // Display tracks from the album.
            for (Track t : chosenAlbum.tracks) {
                System.out.println(t.getName());
            }
        }

        // Prompt the user to go back.
        System.out.print("Press 'Enter' to go back...");

        try {
            // Wait for the user to press Enter and then proceed.
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
            // Handle exceptions if they occur.
        }
    }

    public void viewTracks() {
        // Initialize a counter for numbering tracks.
        int x = 1;

        // Display a numbered list of tracks.
        for (Track t : data.tracks) {
            System.out.println(x + " " + t.getName());
            x++;
        }

        // Prompt the user to go back.
        System.out.print("Press 'Enter' to go back...");

        try {
            // Wait for the user to press Enter and then proceed.
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
            // Handle exceptions if they occur.
        }
    }

    private void viewBand() {
        // Initialize a counter for numbering bands.
        int x = 1;

        // Display a numbered list of bands.
        for (Band band : data.bands) {
            System.out.println(x + " " + band.getName());
            x++;
        }

        // Prompt the user to enter a number to see tracks by a band or 0 to go back.
        System.out.print("Enter a number to see tracks by a band / 0 to go back: ");
        int input2 = 0;

        try {
            // Read the user's input as an integer.
            input2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            // Handle input that is not a valid number.
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewBand();
        }

        if (input2 == 0) {
            // Go back to the main view interface.
            viewInterface();
        } else {
            // Get the name of the selected artist.
            String artistName = data.musicians.get(input2 - 1).getName();

            // Retrieve a list of songs by the selected artist.
            ArrayList<String> songsByArtist = data.listSongsByArtist(artistName);

            // Display the list of songs by the artist.
            for (String song : songsByArtist) {
                System.out.println(song);
            }

            // Prompt the user to go back.
            System.out.print("Press 'Enter' to go back...");

            try {
                // Wait for the user to press Enter and then proceed.
                System.in.read();
                scanner.nextLine();
                viewInterface();
            } catch (Exception ignored) {
                // Handle exceptions if they occur.
            }
        }
    }

    private void viewMusician() {
        // Initialize a counter for numbering musicians.
        int x = 1;

        // Display a numbered list of musicians.
        for (Musician musician : data.musicians) {
            System.out.println(x + " " + musician.getName());
            x++;
        }

        // Prompt the user to enter a number to see tracks by a musician or 0 to go back.
        System.out.print("Enter a number to see tracks by a musician / 0 to go back: ");
        int input2 = 0;

        try {
            // Read the user's input as an integer.
            input2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            // Handle input that is not a valid number.
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewMusician();
        }

        if (input2 == 0) {
            // Go back to the main view interface.
            viewInterface();
        } else {
            // Get the name of the selected artist.
            String artistName = data.musicians.get(input2 - 1).getName();

            // Retrieve a list of songs by the selected artist.
            ArrayList<String> songsByArtist = data.listSongsByArtist(artistName);

            // Display the list of songs by the artist.
            for (String song : songsByArtist) {
                System.out.println(song);
            }

            // Prompt the user to go back.
            System.out.print("Press 'Enter' to go back...");

            try {
                // Wait for the user to press Enter and then proceed.
                System.in.read();
                scanner.nextLine();
                viewInterface();
            } catch (Exception ignored) {
                // Handle exceptions if they occur.
            }
        }
    }
}