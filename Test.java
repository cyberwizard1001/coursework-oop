import java.util.ArrayList;

public class Test {

    static public void main(String[] args){
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


        //Testing Musician
        Musician musician1 = new Musician("Harry Styles", false, current_bands1, 31, past_bands1, roles1 );
        Musician musician2 = new Musician("Bruno Mars", true, current_bands2, 27, past_bands2, roles2 );

        musician1.printMusician();
        musician2.printMusician();
    }
}
