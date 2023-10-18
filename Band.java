import java.util.ArrayList;

/**
 * The `Band` class represents a musical group consisting of musicians. It stores information about the band's name,
 * establishment year, and the list of musicians who are part of the band.
 */
public class Band {
    /**
     * Stores the name of the band.
     */
    private String name;

    /**
     * Stores the year the band was established.
     */
    private int established;

    /**
     * Stores a list of musicians who are members of the band.
     */
    private ArrayList<Musician> musicians;

    /**
     * Creates a new instance of the `Band` class with the specified name, establishment year, and list of musicians.
     *
     * @param name        The name of the band.
     * @param established The year the band was established.
     * @param musicians   A list of musicians in the band.
     */
    public Band(String name, int established, ArrayList<Musician> musicians) {
        this.name = name;
        this.established = established;
        this.musicians = musicians;
    }

    /**
     * Retrieves the year the band was established.
     *
     * @return The year the band was established.
     */
    public int getEstablished() {
        return established;
    }

    /**
     * Sets the year the band was established to a new value.
     *
     * @param established The new year of establishment.
     */
    public void setEstablished(int established) {
        this.established = established;
    }

    /**
     * Retrieves the list of musicians in the band.
     *
     * @return A list of musicians who are members of the band.
     */
    public ArrayList<Musician> getMusicians() {
        return musicians;
    }

    /**
     * Sets the list of musicians in the band to a new value.
     *
     * @param musicians The new list of musicians in the band.
     */
    public void setMusicians(ArrayList<Musician> musicians) {
        this.musicians = musicians;
    }

    /**
     * Retrieves the name of the band.
     *
     * @return The name of the band.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the band to a new value.
     *
     * @param name The new name of the band.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Prints information about each musician in the band, including their name, age, roles, band status, current bands, and past bands.
     */
    public void printMusicians() {
        for (Musician musician : musicians) {
            musician.printMusician();
        }
    }

    /**
     * Prints information about the band, including its name, establishment year, and a list of musicians.
     */
    public void printBand() {
        System.out.println("Band name: " + name);
        System.out.println("Established: " + established);
        System.out.println("Musicians: ");
        printMusicians();
    }
}
