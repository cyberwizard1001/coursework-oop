import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MusicLibrary {

    Data data = new Data();
    Scanner scanner = new Scanner(System.in);

    public MusicLibrary(){
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
        data.addTrack(new Track("Track 29", "Sumithra S", false, new Date(), 4.30, 4, "", 3240, null));


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
        System.out.println("oTunes");
        System.out.println("Pick your poison!");
        System.out.println("1. Add");
        System.out.println("2. Play");
        System.out.println("3. View");
        System.out.println("4. Burn to disk");
        System.out.println("5. View some statistics");

        try {
            input = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid number");
            homeInterface();
        }

        switch (input) {
            case 1:
                addInterface();
                break;
            case 2:
                playInterface();
                break;
            case 3:
                viewInterface();
                break;
            case 4:
                burnInterface();
                break;
            case 5:
                viewStatistics();
            default: {
                System.out.println("Error, try again!");
                homeInterface();
                break;
            }

        }
    }

    private void viewStatistics() {
        System.out.println("Album lengths");
        for (Album a:data.albums) {
            System.out.println(a.getName() + ": " + a.calculateTotalRunTime());
        }
        System.out.println("Album disk size");
        for (Album a:data.albums)
        {
            System.out.println(a.getName() + ": " + a.calculateTotalSize());
        }
    }

    private void burnInterface() {

        BurnInterface burnInterface = new BurnInterface(data);
        burnInterface.burnInterface();
    }

    private void viewInterface() {
        int input1 = 0;
        System.out.println("View Menu");
        System.out.println("1. Musician");
        System.out.println("2. Band");
        System.out.println("3. Track");
        System.out.println("4. Album");
        System.out.println("5. Library");
        System.out.println("6. Compilation Album");
        System.out.println("7. Go back");

        try{
            System.out.print("Choose a number: ");
            input1 = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Invalid character, choose a number");
            scanner.nextLine();
            viewInterface();
        }


        switch (input1) {
            case 1 -> {
                viewMusician();

            }
            case 2 -> {
                viewBand();
            }
            case 3 -> {
                viewTracks();
            }
            case 4 -> {
                viewAlbums();
            }
            case 5 -> {
                viewLibraries();
            }
            case 6 -> {
                viewCompilations();
            }
            case 7 -> {
                homeInterface();
            }
            default -> {
                System.out.println("Enter a valid number");
                scanner.nextLine();
                homeInterface();
            }

        }
    }

    public void addInterface() {
        int input1 = 0;
        System.out.println("Add music");
        System.out.println("1. Musician");
        System.out.println("2. Band");
        System.out.println("3. Track");
        System.out.println("4. Album");
        System.out.println("5. Library");
        System.out.println("6. Compilation Album");
        System.out.println("7. Go back");

        System.out.print("Choose a number: ");
        try {
            input1 = scanner.nextInt();
        } catch(InputMismatchException e){
            scanner.nextLine();
            System.out.println("Enter a valid number");
            addInterface();
        }

        switch(input1){
            case 1: {
                addMusician();
                break;
            }
            case 2: {
                addBand();
                break;
            }
            case 3: {
                addTrack();
                break;
            }
            case 4: {
                addAlbum();
                break;
            }
            case 5: {
                addLibrary();
                break;
            }
            case 6: {
                addCompilation();
                break;
            }
            case 7: {
                homeInterface();
                break;
            }
        }
    }

    private void addCompilation() {
        String name;
        ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<String> artists = new ArrayList<>();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Enter names of tracks (Enter x to stop): ");
        ArrayList<String> trackNames = new ArrayList<>();
        while(!Objects.equals(scanner.nextLine(), "x")){
            trackNames.add(scanner.nextLine());
        }
        for(String n : trackNames){
            for(Track t : data.tracks){
                if(t.getName().contains(n)){
                    tracks.add(t);
                }
            }
        }
        System.out.print("Enter names of albums (Enter x to stop): ");
        ArrayList<String> albumNames = new ArrayList<>();
        while(!Objects.equals(scanner.nextLine(), "x")){
            albumNames.add(scanner.nextLine());
        }
        for(String n : albumNames){
            for(Album a : data.albums){
                if(a.getName().contains(n)){
                    albums.add(a);
                }
            }
        }
        System.out.print("Enter names of compilation artists (Enter x to stop): ");
        while(!Objects.equals(scanner.nextLine(), "x")){
            artists.add(scanner.nextLine());
        }
        Compilation finalCompilation = new Compilation(name, albums, tracks, artists);
        data.addCompilation(finalCompilation);
    }

    private void addLibrary() {
        String name;
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<Album> albums = new ArrayList<>();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Enter names of tracks (Enter x to stop): ");
        ArrayList<String> trackNames = new ArrayList<>();
        while(!Objects.equals(scanner.nextLine(), "x")){
            trackNames.add(scanner.nextLine());
        }
        for(String n : trackNames){
            for(Track t : data.tracks){
                if(t.getName().contains(n)){
                    tracks.add(t);
                }
            }
        }
        System.out.print("Enter names of albums (Enter x to stop): ");
        ArrayList<String> albumNames = new ArrayList<>();
        while(!Objects.equals(scanner.nextLine(), "x")){
            albumNames.add(scanner.nextLine());
        }
        for(String n : albumNames){
            for(Album a : data.albums){
                if(a.getName().contains(n)){
                    albums.add(a);
                }
            }
        }
        Library finalLibrary = new Library(name, tracks, albums);
        data.addLibrary(finalLibrary);
    }

    private void addAlbum() {
        String name;
        ArrayList<Track> tracks = new ArrayList<>();
        String type;
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Enter names of tracks (Enter x to stop): ");
        ArrayList<String> trackNames = new ArrayList<>();
        while(!Objects.equals(scanner.nextLine(), "x")){
            trackNames.add(scanner.nextLine());
        }
        for(String n : trackNames){
            for(Track t : data.tracks){
                if(t.getName().contains(n)){
                    tracks.add(t);
                }
            }
        }
        System.out.print("Type: ");
        type = scanner.nextLine();
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
        name = scanner.nextLine();
        System.out.print("Artist: ");
        artist = scanner.nextLine();
        System.out.print("Is this song by a band? (Type true / false): ");
        try{
            band = scanner.nextBoolean();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid boolean");
            scanner.nextLine();
            addTrack();
        }
        date = new Date();
        System.out.print("Enter length of track in minutes (Eg: 4.26): ");
        try{
            length = scanner.nextDouble();
        } catch(InputMismatchException e){
            System.out.println("Enter valid time: ");
            scanner.nextLine();
            addTrack();
        }
        System.out.print("Enter song rating (1-5): ");
        try{
            rating = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid digit");
            scanner.nextLine();
            addTrack();
        }
        if(rating>5)
        {
            System.out.println("Choose a rating between 1-5");
            addTrack();
        }
        scanner.nextLine();
        System.out.print("Enter file location on disk: ");
        location = scanner.nextLine();
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
        name = scanner.nextLine();
        System.out.print("Enter year of establishment: ");
        try{
            established = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid number: ");
            scanner.nextLine();
            addBand();
        }
        System.out.print("Enter names of band members (Enter x to stop): ");
        while(!Objects.equals(scanner.nextLine(), "x")){
            musicianNames.add(scanner.nextLine());
        }
        for(String n : musicianNames){
            for(Musician m : data.musicians){
                if(m.getName().contains(n)){
                    musicians.add(m);
                }
            }
        }
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
        System.out.println("Enter musician details");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Is " + name + " in a band? (Type true / false) ");
        try{
            band_status = scanner.nextBoolean();
        } catch(InputMismatchException e){
            System.out.print("Enter 'true' or 'false");
            scanner.nextLine();
            addInterface();
        }
        if(band_status){
            System.out.print("Enter current bands " + name + " is part of (Type x to stop):");
            while(!Objects.equals(scanner.nextLine(), "x")){
                current_bands.add(scanner.nextLine());
            }
        }
        System.out.print("Enter age: ");
        try {
            age = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid number");
            scanner.nextLine();
            addInterface();
        }
        System.out.print("Enter bands " + name + " was part of (Type x to stop):");
        while(!Objects.equals(scanner.nextLine(), "x")){
            past_bands.add(scanner.nextLine());
        }
        System.out.print("Enter roles " + name + " performs in (Type x to stop):");
        while(!Objects.equals(scanner.nextLine(), "x")){
            roles.add(scanner.nextLine());
        }
        Musician musician = new Musician(name,band_status,current_bands, age, past_bands, roles);
        data.addMusician(musician);
    }

    public void playInterface() {
        while (true) {
            int input1 = 0, input2 = 0;
            System.out.println("Play music");
            System.out.println("Pick your poison!");
            System.out.println("1. Universal Search (song, artist, libraries, compilation albums)");
            System.out.println("2. Choose from list");
            System.out.println("Any key to go to home menu");

            System.out.print("Choose a number: ");
            try {
                input1 = scanner.nextInt();
            } catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("Enter a valid number");
                playInterface();
            }

            if (input1 == 1) {
                scanner.nextLine();
                System.out.println("Universal search");
                System.out.print("Enter a string: ");
                String searchString = scanner.nextLine();
                universalSearch(searchString);
            } else if (input1 == 2) {
                System.out.println("List Menu");
                System.out.println("Pick your poison!");
                System.out.println("1. Track");
                System.out.println("2. Album");
                System.out.println("3. Library");
                System.out.println("4. Compilation Album");
                System.out.println("Any key to go to home menu");

                System.out.print("Choose a number: ");
                try{
                input2 = scanner.nextInt();}
                catch(InputMismatchException e){
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
                    System.out.print("Choose a number: ");
                    try{
                    choice = scanner.nextInt();}
                    catch(InputMismatchException e){
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }

                    System.out.println("Playing " + data.tracks.get(choice - 1).getName());
                    incrementSongPlayCount(data.tracks.get(choice - 1));
                } else if (input2 == 2) {
                    int x = 1;
                    for (Album album : data.albums) {
                        System.out.println(x + " " + album.getName());
                        x++;
                    }
                    int choice = 0;
                    System.out.print("Choose a number: ");
                    try{
                    choice = scanner.nextInt();}
                    catch(InputMismatchException e){
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }

                    System.out.println("Playing from " + data.albums.get(choice - 1).getName());
                    for(Track t : data.albums.get(choice-1).tracks){
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);
                    }
                } else if (input2 == 3) {
                    int x = 1;
                    for (Library library : data.libraries) {
                        System.out.println(x + " " + library.getName());
                        x++;
                    }
                    int choice = 0;
                    System.out.print("Choose a number: ");
                    try {
                        choice = scanner.nextInt();
                    }
                    catch(InputMismatchException e){
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }

                    System.out.println("Playing from " + data.libraries.get(choice - 1).getName());
                    for(Track t : data.libraries.get(choice - 1).tracks){
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);

                    }
                    for(Album a : data.libraries.get(choice - 1).albums){
                        for(Track t : a.tracks){
                            System.out.println("Song: " + t.getName());
                            incrementSongPlayCount(t);
                        }
                    }
                } else if (input2 == 4) {
                    int x = 1;
                    for (Compilation compilation : data.compilations) {
                        System.out.println(x + " " + compilation.getName());
                        x++;
                    }
                    int choice = 0;
                    System.out.print("Choose a number: ");
                    try {
                        choice = scanner.nextInt();
                    } catch (InputMismatchException e){
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                        playInterface();
                    }

                    System.out.println("Playing from " + data.compilations.get(choice - 1).getName());
                    for(Track t : data.compilations.get(choice-1).tracks){
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);

                    }
                    for(Album a : data.compilations.get(choice-1).albums){
                        for(Track t : a.tracks){
                            System.out.println("Song: " + t.getName());
                            incrementSongPlayCount(t);
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

            homeInterface();

        }


    }

    private void incrementSongPlayCount(Track track){
        String filePath = "tracks.txt";
        String toReplace = "";
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(filePath));
        } catch(FileNotFoundException e){
            System.out.println("Couldn't find play_count file");
            homeInterface();
        }
        StringBuilder stringBuffer = new StringBuilder();
        while(true){
            assert fileScanner != null;
            if (!fileScanner.hasNextLine()) break;
            stringBuffer.append(fileScanner.nextLine()).append(System.lineSeparator());
        }
        String fileContents = stringBuffer.toString();
        String trackName = track.getName();
        if(fileContents.contains(trackName)){
            int trackIndex = fileContents.indexOf(trackName);
            toReplace = fileContents.substring(trackIndex,(trackIndex+trackName.length()+3));

            String prevCountString = toReplace.replace(trackName, "");

            prevCountString = prevCountString.replaceAll("[^0-9]", "");

            track.playCount = Integer.parseInt(prevCountString) + 1;
            String replacement = trackName + " " + track.playCount;
            fileContents = fileContents.replaceAll(toReplace, replacement);
            System.out.println("Play count: " + track.playCount);
            try {
                FileWriter writer = new FileWriter(filePath);
                writer.append(fileContents);
                writer.flush();
            } catch(IOException e){
                System.out.println("Error reading file");
            }
        }
        else{
            System.out.println("Song not found on record, cannot play");
        }

    }

    private void universalSearch(String searchString) {
        LinkedHashMap<String, String> searchResults = new LinkedHashMap<>();
        ArrayList<String> searchResultsString = new ArrayList<>();
        String choice;
        int count = 0;
        //Musicians
        System.out.println("Musicians:");
        for(Musician m : data.musicians){
            if(m.getName().contains(searchString)){
                System.out.println((count+1) + " " + m.getName());
                searchResults.put(m.getName(), "Musician");
                searchResultsString.add(m.getName());
                count++;
            }
        }
        //Bands
        System.out.println("Bands:");
        for(Band b : data.bands){
            if(b.getName().contains(searchString)){
                System.out.println((count+1) + " " + b.getName());
                searchResults.put(b.getName(), "Band");
                searchResultsString.add(b.getName());
                count++;
            }
        }
        //Tracks
        System.out.println("Tracks:");
        for(Track t : data.tracks){
            if(t.getName().contains(searchString)){
                System.out.println((count+1) + " " + t.getName());
                searchResults.put(t.getName(), "Track");
                searchResultsString.add(t.getName());
                count++;
            }
        }
        //Albums
        System.out.println("Albums:");
        for(Album a : data.albums){
            if(a.getName().contains(searchString)){
                System.out.println((count+1) + " " + a.getName());
                searchResults.put(a.getName(), "Album");
                searchResultsString.add(a.getName());
                count++;
            }
        }
        //Libraries
        System.out.println("Libraries");
        for(Library l : data.libraries){
            if(l.getName().contains(searchString)){
                System.out.println((count+1) + " " + l.getName());
                searchResults.put(l.getName(), "Library");
                searchResultsString.add(l.getName());
                count++;
            }
        }
        //Compilation Albums
        System.out.println("Compilation Albums:");
        for(Compilation c: data.compilations){
            if(c.getName().contains(searchString)){
                System.out.println((count+1) + " " + c.getName());
                searchResults.put(c.getName(), "Compilation" );
                searchResultsString.add(c.getName());
                count++;
            }
        }

        if(count==0){
            System.out.println("Sorry, couldn't find any results :\\");
            System.out.println("Press 'Enter' to go back...");
            try {
                System.in.read();
                scanner.nextLine();
                viewInterface();
            } catch (Exception ignored) {
            }
        }

        else{
            System.out.print("Enter a number to play relevant content: ");
            int num = 0;
            try{
                num = scanner.nextInt()-1;}
            catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("Enter a number");
                playInterface();
            }
            choice = searchResultsString.get(num);
            playSongFromSearch(searchResults, choice);
        }

    }

    private void playSongFromSearch(LinkedHashMap<String, String> searchResults, String choice) {
        String type = searchResults.get(choice);
        switch (type){
            case "Musician":
            case "Band": {
                System.out.println("Playing songs from " + choice);
                for(Track t : data.tracks){
                    if(t.getArtist().contains(choice)){
                        incrementSongPlayCount(t);
                    }
                }
                break;
            }
            case "Track": {
                System.out.println("Playing song " + choice);
                for(Track t: data.tracks){
                    if(t.getName().contains(choice)){
                        incrementSongPlayCount(t);
                        break;
                    }
                }

                break;
            }
            case "Album": {
                Album selectedAlbum = new Album();
                System.out.println("Playing album: " + choice);
                for(Album a : data.albums){
                    if(a.getName().contains(choice)){
                        selectedAlbum = a;
                        break;
                    }
                }
                for(Track t : selectedAlbum.tracks){
                    System.out.println("Song: " + t.getName());
                    incrementSongPlayCount(t);
                }
                break;
            }
            case "Library": {
                Library selectedLibrary = new Library();
                System.out.println("Playing library: " + choice);
                for(Library l : data.libraries) {
                    if (l.getName().contains(choice)) {
                        selectedLibrary = l;
                        break;
                    }
                }
                for(Track t : selectedLibrary.tracks){
                    System.out.println("Song: " + t.getName());
                    incrementSongPlayCount(t);

                }
                for(Album a : selectedLibrary.albums){
                    for(Track t : a.tracks){
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);
                    }
                }
                break;
            }
            case "Compilation": {
               Compilation selectedCompilation = new Compilation();
                System.out.println("Playing compilation: " + choice);
                for(Compilation c : data.compilations) {
                    if (c.getName().contains(choice)) {
                        selectedCompilation = c;
                        break;
                    }
                }
                for(Track t : selectedCompilation.tracks){
                    System.out.println("Song: " + t.getName());
                    incrementSongPlayCount(t);

                }
                for(Album a : selectedCompilation.albums){
                    for(Track t : a.tracks){
                        System.out.println("Song: " + t.getName());
                        incrementSongPlayCount(t);
                    }
                }
                break;
            }
        }
    }

    private void viewCompilations() {
        int x = 1;
        for (Compilation c : data.compilations) {
            System.out.println(x + " " + c.getName());
            x++;
        }
        System.out.print("Enter number to see tracks in compilation: ");
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("Enter a valid number");
            viewCompilations();
        }
        if (choice <= data.compilations.size()) {
            Compilation chosenCompilation = data.compilations.get(choice - 1);
            System.out.println("Independent Tracks:");
            for (Track t : chosenCompilation.tracks) {
                System.out.println(t.getName());
            }
            System.out.println("Album Tracks: ");
            for (Album a : chosenCompilation.albums) {
                System.out.println("Album " + a.getName());
                for (Track t : a.tracks) {
                    System.out.println(t.getName());
                }
            }
        }
        System.out.print("Press 'Enter' to go back...");
        try {
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
        }
    }

    private void viewLibraries() {
        int x = 1;
        for (Library l : data.libraries) {
            System.out.println(x    + " " + l.getName());
            x++;
        }
        System.out.print("Enter number to see tracks in library: ");
        int choice = 0;
        try{ choice = scanner.nextInt();} catch(InputMismatchException e){
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewLibraries();
        }
        if (choice < data.libraries.size()) {
            Library chosenLib = data.libraries.get(choice - 1);
            for (Track t : chosenLib.tracks) {
                System.out.println(t.getName());
            }
            System.out.println("Album tracks: ");
            for (Album a : chosenLib.albums) {
                System.out.println("Album: " + a.getName());
                for (Track t : a.tracks) {
                    System.out.println(t.getName());
                }
            }
        }
        System.out.print("Press 'Enter' to go back...");
        try {
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
        }
    }

    private void viewAlbums() {
        int x = 1;
        for (Album a : data.albums) {
            System.out.println(x + " " + a.getName());
            x++;
        }
        System.out.print("Enter number to see tracks in album: ");
        int choice = 0;
        try{
            choice = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewAlbums();
        }
        if (choice <= data.albums.size()) {
            Album chosenAlbum = data.albums.get(choice - 1);
            for (Track t : chosenAlbum.tracks) {
                System.out.println(t.getName());
            }
        }
        System.out.print("Press 'Enter' to go back...");
        try {
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
        }
    }

    public void viewTracks() {
        int x = 1;
        for (Track t : data.tracks) {
            System.out.println(x + " " + t.getName());
            x++;
        }
        System.out.print("Press 'Enter' to go back...");
        try {
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
        }
    }

    private void viewBand() {
        int x = 1;
        for (Band band : data.bands) {
            System.out.println(x + " " + band.getName());
            x++;
        }
        System.out.print("\nEnter a number to see tracks by band / 0 to go back: ");
        int input2 = 0;
        try{
            input2 = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewBand();
        }
        if (input2 == 0) {
            viewInterface();
        } else {
            String artistName = data.musicians.get(input2 - 1).getName();
            ArrayList<String> songsByArtist = data.listSongsByArtist(artistName);
            for (String song : songsByArtist) {
                System.out.println(song);
            }
            System.out.print("Press 'Enter' to go back...");
            try {
                System.in.read();
                scanner.nextLine();
                viewInterface();
            } catch (Exception ignored) {
            }
        }
    }

    private void viewMusician() {
        int x = 1;
        for (Musician musician : data.musicians) {
            System.out.println(x + " " + musician.getName());
            x++;
        }
        System.out.print("\nEnter a number to see tracks by musician / 0 to go back: ");
        int input2 = 0;
        try{
            input2 = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid number");
            scanner.nextLine();
            viewMusician();
        }
        if (input2 == 0) {
            viewInterface();
        } else {
            String artistName = data.musicians.get(input2 - 1).getName();
            ArrayList<String> songsByArtist = data.listSongsByArtist(artistName);
            for (String song : songsByArtist) {
                System.out.println(song);
            }
            System.out.print("Press 'Enter' to go back...");
            try {
                System.in.read();
                scanner.nextLine();
                viewInterface();
            } catch (Exception ignored) {
            }
        }
    }
}
