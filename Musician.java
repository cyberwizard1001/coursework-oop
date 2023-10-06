import java.util.ArrayList;

public class Musician {

    public Musician(String name, Boolean band_status, ArrayList<String> current_bands, int age, ArrayList<String> past_bands, ArrayList<String> roles){
        this.name = name;
        this.band_status = band_status;
        this.age = age;
        this.past_bands = past_bands;
        this.roles = roles;
        this.current_bands = current_bands;
    }

    Boolean band_status;
    String name;
    int age;
    ArrayList<String> current_bands;
    ArrayList<String> past_bands;
    ArrayList<String> roles;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getPast_bands() {
        return past_bands;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public ArrayList<String> getCurrent_bands() {
        return current_bands;
    }

    public Boolean getBandStatus(){
        return band_status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBandStatus(Boolean band) {
        this.band_status = band;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updatePastBands(String band) {
        this.past_bands.add(band);
    }

    public void setCurrent_bands(ArrayList<String> current_bands){
        this.current_bands = current_bands;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public void printMusician(){
        System.out.println("Artist: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roles: " + roles);
        System.out.println("Band Status: " + band_status);
        System.out.println("Current bands: " + current_bands);
        System.out.println("Past bands: " + past_bands);
    }

    //Write function to move current_bands to past_bands when band_status is set to false
}

