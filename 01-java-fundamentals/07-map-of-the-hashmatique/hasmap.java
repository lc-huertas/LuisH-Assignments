
import java.util.HashMap;
import java.util.Set;

public class hasmap {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Buddy Holly","What's with these homies dissing my girl?");
        trackList.put("Say it Ain't So","Somebodies Heini is crowding my icebox");
        trackList.put("Island in the Sun","When you're on a holiday and can't find the words to say");
        trackList.put("Undone - Sweater Song","If you want to destroy my sweater, pull this strand as I walk away");
        Set<String> songs = trackList.keySet();
            for(String song : songs){
                System.out.println("Song: "+song+" --- Lyrics: "+trackList.get(song));
            }
    }
}
