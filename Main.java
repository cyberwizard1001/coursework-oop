import java.util.ArrayList;
import java.util.Date;

public class Main {
    static public void main(String[] args){
//        Test test = new Test();
//        test.testMusician();
//        test.testBands();

        Data data = new Data();

        ArrayList<String> current_bands = new ArrayList<>();
        ArrayList<Musician> band1_musicians = new ArrayList<>();
        current_bands.add("Band 1");
        ArrayList<String> past_bands = new ArrayList<>();
        ArrayList<String> roles = new ArrayList<>();
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<Album> albums = new ArrayList<>();
        tracks.add(new Track("Track 1", "Nirmal K", false, new Date(), 4.28, 4, "", 4040, null));
        tracks.add(new Track("Track 2", "One Direction", true, new Date(), 4.30, 5, "", 3840, null));
        band1_musicians.add(new Musician("Sumithra S", true, current_bands, 23, past_bands, roles));


        data.addMusician(new Musician("Nirmal K", false, null, 23, past_bands, roles));
        data.addMusician(new Musician("Sumithra S", true, current_bands, 23, past_bands, roles));
        data.addBand(new Band("One Direction", 2001, band1_musicians));
        data.addTrack(new Track("Track 1", "Nirmal K", false, new Date(), 4.28, 4, "", 4040, null));
        data.addTrack(new Track("Track 2", "One Direction", true, new Date(), 4.30, 5, "", 3840, null));
        albums.add(new Album("Album 1", tracks, "Melody"));

        data.addAlbum(new Album("Album 1", tracks, "Melody"));
        //data.removeTrack("Track 2");

        data.addLibrary(new Library("Library 1", tracks, albums));
        data.libraries.get(0).getTracks();

        data.addCompilation(new Compilation("Compilation 1", albums, tracks, null));
    }
}
