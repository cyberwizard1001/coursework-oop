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

        //TODO: Finish view interface
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
            System.out.println("1. Search (song, artist, libraries, compilation albums)");
            System.out.println("2. List");
            System.out.println("Any key to go to home menu");

            System.out.print("Choose a number: ");
            input1 = scanner.nextInt();

            if (input1 == 1) {
                //TODO: Write code for universal search
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
                    }

                    System.out.print("Choose a number: ");
                    int choice = scanner.nextInt();

                    System.out.println("Playing " + data.tracks.get(choice - 1).getName());
                    //TODO: Increment song play count by 1
                } else if (input2 == 2) {
                    int x = 1;
                    for (Album album : data.albums) {
                        System.out.println(x + " " + album.getName());
                    }

                    System.out.print("Choose a number: ");
                    int choice = scanner.nextInt();

                    System.out.println("Playing from " + data.albums.get(choice - 1).getName());
                    //TODO: Increment song play count by 1
                } else if (input2 == 3) {
                    int x = 1;
                    for (Library library : data.libraries) {
                        System.out.println(x + " " + library.getName());
                    }

                    System.out.print("Choose a number: ");
                    int choice = scanner.nextInt();

                    System.out.println("Playing from " + data.libraries.get(choice - 1).getName());
                    //TODO: Increment song play count by 1
                } else if (input2 == 4) {
                    int x = 1;
                    for (Compilation compilation : data.compilations) {
                        System.out.println(x + " " + compilation.getName());
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
}
