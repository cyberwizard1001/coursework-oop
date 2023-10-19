import java.util.*;

public class BurnInterface {
    Data data;
    Scanner scanner = new Scanner(System.in);
    public HashMap<Integer, Integer> sizeMap;

    public BurnInterface(Data data) {
        this.data = data;
        sizeMap = new HashMap<>();
        sizeMap.put(1,700);
        sizeMap.put(2,4700);
        sizeMap.put(3,8500);
        sizeMap.put(4,25000);
    }


    public void burnInterface() {
        int choice1 = 0, choice2 = 0;



        System.out.println("Choose two disk types");
        System.out.println("1. CD (700MB)");
        System.out.println("2. DVD (4.7GB)");
        System.out.println("3. Double layer DVD (8.5GB)");
        System.out.println("4. Blu-ray disk (25GB)");
        System.out.print("Choose type of disk 1: ");

        try {
            choice1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number");
            burnInterface();
        }
        System.out.print("Choose type of disk 2: ");

        try {
            choice2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number");
            burnInterface();
        }
        System.out.println("Chosen disks: " + choice1 + "," + choice2);
        burn(sizeMap.get(choice1),sizeMap.get(choice2));
    }

    public void burn(int diskSize1, int diskSize2) {
        int fileSize = 0;
        ArrayList<Integer> fileSizeArray = new ArrayList<>();
        for (Album a : data.albums) {
            for (Track t: a.tracks) {
                fileSizeArray.add((int)t.getSize());
            }
            fileSizeArray.sort(Collections.reverseOrder());
            fileSize += (int) a.calculateTotalSize();
        }
        System.out.println(fileSize);
        System.out.println("Disk sizes: " + diskSize1 + "," + diskSize2);
    }
}
