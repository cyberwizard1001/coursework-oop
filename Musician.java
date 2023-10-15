import java.util.ArrayList;

/**
 * The `Musician` class represents a musician with various attributes and methods
 * for accessing and updating their information.
 */
public class Musician {

    /**
     * Indicates whether the musician is currently part of a band or not.
     * - `true` if the musician is currently in a band.
     * - `false` if the musician is not in a band.
     */
    Boolean band_status;

    /**
     * The name of the musician.
     */
    String name;

    /**
     * The age of the musician.
     */
    int age;

    /**
     * List of current bands the musician is part of.
     */
    ArrayList<String> current_bands;

    /**
     * List of past bands the musician was part of.
     */
    ArrayList<String> past_bands;

    /**
     * List of roles or instruments the musician performs.
     */
    ArrayList<String> roles;

    /**
     * Constructor to initialize a `Musician` object with provided information.
     *
     * @param name         The name of the musician.
     * @param band_status  The band status of the musician (true for in a band, false for not).
     * @param current_bands List of current bands the musician is part of.
     * @param age          The age of the musician.
     * @param past_bands   List of past bands the musician was part of.
     * @param roles        List of roles or instruments the musician performs.
     */
    public Musician(String name, Boolean band_status, ArrayList<String> current_bands, int age, ArrayList<String> past_bands, ArrayList<String> roles) {
        this.name = name;
        this.band_status = band_status;
        this.age = age;
        this.past_bands = past_bands;
        this.roles = roles;
        this.current_bands = current_bands;
    }

    /**
     * Get the name of the musician.
     *
     * @return The name of the musician.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the age of the musician.
     *
     * @return The age of the musician.
     */
    public int getAge() {
        return age;
    }

    /**
     * Get the list of past bands the musician was part of.
     *
     * @return A list of past bands.
     */
    public ArrayList<String> getPastBands() {
        return past_bands;
    }

    /**
     * Get the list of roles or instruments the musician performs.
     *
     * @return A list of roles or instruments.
     */
    public ArrayList<String> getRoles() {
        return roles;
    }

    /**
     * Get the list of current bands the musician is part of.
     *
     * @return A list of current bands.
     */
    public ArrayList<String> getCurrentBands() {
        return current_bands;
    }

    /**
     * Get the band status of the musician.
     *
     * @return `true` if the musician is currently in a band, `false` if not.
     */
    public Boolean getBandStatus() {
        return band_status;
    }

    /**
     * Set the age of the musician.
     *
     * @param age The new age of the musician.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Set the band status of the musician.
     *
     * @param band `true` if the musician is currently in a band, `false` if not.
     */
    public void setBandStatus(Boolean band) {
        this.band_status = band;
    }

    /**
     * Set the name of the musician.
     *
     * @param name The new name of the musician.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Update the list of past bands with a new band name.
     *
     * @param band The name of the new band to add to the past bands.
     */
    public void updatePastBands(String band) {
        this.past_bands.add(band);
    }

    /**
     * Set the list of current bands the musician is part of.
     *
     * @param current_bands The new list of current bands.
     */
    public void setCurrentBands(ArrayList<String> current_bands) {
        this.current_bands = current_bands;
    }

    /**
     * Set the list of roles or instruments the musician performs.
     *
     * @param roles The new list of roles or instruments.
     */
    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    /**
     * Print musician information to the console.
     */
    public void printMusician() {
        System.out.println("Artist: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roles: " + roles);
        System.out.println("Band Status: " + band_status);
        System.out.println("Current bands: " + current_bands);
        System.out.println("Past bands: " + past_bands);
    }
}
