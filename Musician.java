import java.util.ArrayList;

public class Musician {
    Boolean band_status;
    String name;
    int age;
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

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }
}
