import java.util.InputMismatchException;
import java.util.Scanner;

public class BurnInterface {
    Data data;
    Scanner scanner = new Scanner(System.in);

    public BurnInterface(Data data){
        this.data = data;
    }
    public void burnInterface(){
        int choice = 0;
        int customSize = 0;
        System.out.println("Disk options");
        System.out.println("1. CD (700MB)");
        System.out.println("2. DVD (4.7GB)");
        System.out.println("3. Double layer DVD (8.5GB)");
        System.out.println("4. Blu-ray disk (25GB)");
        System.out.println("5. custom ISO image");
        System.out.print("Choose type of disk: ");

        scanner.nextLine();
        try{
            choice = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid number");
            burnInterface();
        }
        switch (choice){
            case 1 -> { burn(700); }
            case 2 -> { burn(4700); }
            case 3 -> { burn(8500); }
            case 4 -> { burn(25000); }
            case 5 -> {
                System.out.print("Enter size of disk in MB: ");
                scanner.nextLine();
                try{
                    customSize = scanner.nextInt();
                } catch(InputMismatchException e){
                    System.out.println("Enter a valid number");
                    burnInterface();
                }
                burn(customSize);
            }
            default -> {
                System.out.println("Enter a valid choice (1-5)");
                burnInterface();
            }

        }
    }

    public void burn(int diskSize){
        boolean cont = true;
        while(cont==true){
            System.out.println("Choose content to add to disk");
            System.out.println("1. Tracks");
            System.out.println("2. Albums");
            System.out.println("3. Libraries");
            System.out.println("4. Compilations");
            scanner.nextLine();

        }

    }
}
