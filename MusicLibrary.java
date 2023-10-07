import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MusicLibrary {

    Data data = new Data();
    Scanner scanner = new Scanner(System.in);

    public void homeInterface() {
        int input = 0;
        System.out.println("oTunes");
        System.out.println("Pick your poison!");
        System.out.println("1. Add");
        System.out.println("2. Play");
        System.out.println("3. View");
        System.out.println("4. Burn to disk");

        input = scanner.nextInt();

        switch (input) {
            case 1:
                addInterface();
            case 2:
                playInterface();
            case 3:
                viewInterface();
            case 4:
                burnInterface();
            default: {
                System.out.println("Error, try again!");
                homeInterface();
            }

        }
    }

    private void burnInterface() {

        //TODO: Write method
    }

    private void viewInterface() {
        int input1 = 0;
        System.out.println("1. Musician");
        System.out.println("2. Band");
        System.out.println("3. Track");
        System.out.println("4. Album");
        System.out.println("5. Library");
        System.out.println("6. Compilation Album");

        System.out.print("Choose a number: ");
        input1 = scanner.nextInt();

        switch (input1) {
            case 1: {
                viewMusician();
            }
            case 2: {
                viewBand();
            }
            case 3: {
                viewTracks();
            }
            case 4: {
                viewAlbums();
            }
            case 5: {
                viewLibraries();
            }
            case 6: {
                viewCompilations();
            }
        }
    }

    public void addInterface() {
        int input1 = 0;
        System.out.println("Add music");
        System.out.println("Pick your poison!");
        System.out.println("1. Musician");
        System.out.println("2. Band");
        System.out.println("3. Track");
        System.out.println("4. Album");
        System.out.println("5. Library");
        System.out.println("6. Compilation Album");

        System.out.print("Choose a number: ");
        input1 = scanner.nextInt();

        //TODO: Finish add interface
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
            input1 = scanner.nextInt();

            if (input1 == 1) {
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
                input2 = scanner.nextInt();

                if (input2 == 1) {
                    int x = 1;
                    for (Track track : data.tracks) {
                        System.out.println(x + " " + track.getName());
                        x++;
                    }

                    System.out.print("Choose a number: ");
                    int choice = scanner.nextInt();

                    System.out.println("Playing " + data.tracks.get(choice - 1).getName());
                    //TODO: Increment song play count by 1
                } else if (input2 == 2) {
                    int x = 1;
                    for (Album album : data.albums) {
                        System.out.println(x + " " + album.getName());
                        x++;
                    }

                    System.out.print("Choose a number: ");
                    int choice = scanner.nextInt();

                    System.out.println("Playing from " + data.albums.get(choice - 1).getName());
                    //TODO: Increment song play count by 1
                } else if (input2 == 3) {
                    int x = 1;
                    for (Library library : data.libraries) {
                        System.out.println(x + " " + library.getName());
                        x++;
                    }

                    System.out.print("Choose a number: ");
                    int choice = scanner.nextInt();

                    System.out.println("Playing from " + data.libraries.get(choice - 1).getName());
                    //TODO: Increment song play count by 1
                } else if (input2 == 4) {
                    int x = 1;
                    for (Compilation compilation : data.compilations) {
                        System.out.println(x + " " + compilation.getName());
                        x++;
                    }

                    System.out.print("Choose a number: ");
                    int choice = scanner.nextInt();

                    System.out.println("Playing from " + data.compilations.get(choice - 1).getName());
                    //TODO: Increment song play count by 1
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
            System.out.println("Press Enter key to go back...");
            try {
                System.in.read();
                scanner.nextLine();
                viewInterface();
            } catch (Exception ignored) {
            }
        }

        else{
            System.out.print("Enter a number to play relevant content: ");
            choice = searchResultsString.get(scanner.nextInt()-1);
            playSongFromSearch(searchResults, choice);
        }

    }

    private void playSongFromSearch(LinkedHashMap<String, String> searchResults, String choice) {
        String type = searchResults.get(choice);
        switch (type){
            case "Musician":{}
            case "Band": {}
            case "Track": {}
            case "Album": {}
            case "Library": {}
            case "Compilation": {}
        }
        //TODO: Complete method
    }

    private void viewCompilations() {
        int x = 1;
        for (Compilation c : data.compilations) {
            System.out.println(x + " " + c.getName());
            x++;
        }
        System.out.print("Enter number to see tracks in compilation: ");
        int choice = scanner.nextInt();
        if (choice < data.compilations.size()) {
            Compilation chosenCompilation = data.compilations.get(choice - 1);
            for (Track t : chosenCompilation.tracks) {
                System.out.println(t.getName());
            }
            System.out.println("Album tracks: ");
            for (Album a : chosenCompilation.albums) {
                System.out.println("Album: " + a.getName());
                for (Track t : a.tracks) {
                    System.out.println(t.getName());
                }
            }
        }
        System.out.println("Press Enter key to go back...");
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
        int choice = scanner.nextInt();
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
        System.out.println("Press Enter key to go back...");
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
        System.out.print("Enter number to see songs in album: ");
        int choice = scanner.nextInt();
        if (choice < data.albums.size()) {
            Album chosenAlbum = data.albums.get(choice - 1);
            for (Track t : chosenAlbum.tracks) {
                System.out.println(t.getName());
            }
        }
        System.out.println("Press Enter key to go back...");
        try {
            System.in.read();
            scanner.nextLine();
            viewInterface();
        } catch (Exception ignored) {
        }
    }

    private void viewTracks() {
        int x = 1;
        for (Track t : data.tracks) {
            System.out.println(x + " " + t.getName());
            x++;
        }
        System.out.println("Press Enter key to go back...");
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
        System.out.println("\nEnter a number to see songs by band / 0 to go back");
        int input2 = scanner.nextInt();
        if (input2 == 0) {
            viewInterface();
        } else {
            String artistName = data.musicians.get(input2 - 1).getName();
            ArrayList<String> songsByArtist = data.listSongsByArtist(artistName);
            for (String song : songsByArtist) {
                System.out.println(song);
            }
            System.out.println("Press Enter key to go back...");
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
        System.out.println("\nEnter a number to see songs by musician / 0 to go back");
        int input2 = scanner.nextInt();
        if (input2 == 0) {
            viewInterface();
        } else {
            String artistName = data.musicians.get(input2 - 1).getName();
            ArrayList<String> songsByArtist = data.listSongsByArtist(artistName);
            for (String song : songsByArtist) {
                System.out.println(song);
            }
            System.out.println("Press Enter key to go back...");
            try {
                System.in.read();
                scanner.nextLine();
                viewInterface();
            } catch (Exception ignored) {
            }
        }
    }
}
