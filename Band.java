import java.util.ArrayList;

public class Band {
    String name;
    int established;
    ArrayList<Musician> musicians;

    public Band(String name, int established, ArrayList<Musician> musicians) {
        this.name = name;
        this.established = established;
        this.musicians = musicians;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public ArrayList<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(ArrayList<Musician> musicians) {
        this.musicians = musicians;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMusicians() {
        for (Musician musician : musicians) {
            musician.printMusician();
        }
    }

    public void printBand() {
        System.out.println("Band name: " + name);
        System.out.println("Established: " + established);
        System.out.println("Musicians: ");
        printMusicians();
    }


}
