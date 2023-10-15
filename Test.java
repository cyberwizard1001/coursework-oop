import java.util.ArrayList;

public class Test {

    Musician musician1;
    Musician musician2;
    Band band;

    //Testing musician by setting up musician1 and musician2
    public void testMusician() {
        ArrayList<String> current_bands1 = new ArrayList<>();
        ArrayList<String> past_bands1 = new ArrayList<>();
        ArrayList<String> roles1 = new ArrayList<>();

        ArrayList<String> current_bands2 = new ArrayList<>();
        ArrayList<String> past_bands2 = new ArrayList<>();
        ArrayList<String> roles2 = new ArrayList<>();

        current_bands2.add("Band 2");

        past_bands1.add("Ex band 1");
        past_bands1.add("Ex band 2");
        past_bands2.add("Ex band 1");
        past_bands2.add("Ex band 2");

        roles1.add("Singer");
        roles2.add("Singer");

        musician1 = new Musician("Harry Styles", false, current_bands1, 31, past_bands1, roles1);
        musician2 = new Musician("Bruno Mars", true, current_bands2, 27, past_bands2, roles2);

//        musician1.printMusician();
//        musician2.printMusician();

        musician1.setName("Harry Styles updated");
        musician1.setAge(21);
        musician1.setBandStatus(true);
        musician1.updatePastBands("One Direction");
        musician1.setCurrentBands(current_bands2);

//        System.out.println("Musician 1 post set methods: ");
//        System.out.println("Name: " + musician1.getName());
//        System.out.println("Age: " + musician1.getAge());
//        System.out.println("Band Status: " + musician1.getBandStatus());
//        System.out.println("Current Bands: " + musician1.getCurrent_bands());
//        System.out.println("Past Bands: " + musician1.getPast_bands());
//        System.out.println("Roles: " + musician1.getRoles());
    }

    //Testing bands using musician1 and musician2
    public void testBands() {

        ArrayList<Musician> musicians = new ArrayList<>();
        musicians.add(musician1);


        band = new Band("One Direction", 2001, musicians);
        band.printBand();

        musicians.add(musician2);

        band.setName("Two Directions");
        band.setEstablished(2023);
        band.setMusicians(musicians);

        System.out.println("\nValues post update Band: ");
        System.out.println("Band name: " + band.getName());
        System.out.println("Established: " + band.getEstablished());
        System.out.println("Members: ");
        band.printMusicians();

    }
}
