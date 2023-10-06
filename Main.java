import java.util.ArrayList;

public class Main {
    static public void main(String[] args){
//        Test test = new Test();
//        test.testMusician();
//        test.testBands();

        Data data = new Data();
        ArrayList<String> current_bands = new ArrayList<>();
        current_bands.add("Band 1");
        ArrayList<String> past_bands = new ArrayList<>();
        ArrayList<String> roles = new ArrayList<>();
        data.addMusician(new Musician("Nirmal K", false, null, 23, past_bands, roles));
        data.addMusician(new Musician("Sumithra S", true, current_bands, 23, past_bands, roles));

    }
}
