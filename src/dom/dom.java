package dom;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class dom {
	public static void SongsAndArtists(HashMap<String, String> data ){

        data.put("Chief Keef" , "Finally rich");
        data.put("Denzel Curry" , "TA13OO");
        data.put("Dr. Dre" , "The Chronic");
        data.put("Dr. Dre" , "2014");
    }
	public static void main(String[] args) {

        //create data
        HashMap<String, String> ArtistsAndAlbums = new HashMap<String, String>();
        // all songs and artists in
        SongsAndArtists(ArtistsAndAlbums);
        //dialog with user
        ArtistsAndAlbums.get("Finally rich");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter artist or album for us to search (to cancel type END): ");
        String AlbumOrArtist = sc.nextLine();


        while(!AlbumOrArtist.equals("END")){
            if(ArtistsAndAlbums.containsKey(AlbumOrArtist)){
                System.out.printf("Album [%s] is by %s%n" , ArtistsAndAlbums.get(AlbumOrArtist) , AlbumOrArtist);
            }else if(ArtistsAndAlbums.containsValue(AlbumOrArtist)){
                for (Map.Entry< String, String> items : ArtistsAndAlbums.entrySet()){
                    if(items.getValue().equals(AlbumOrArtist)){
                        System.out.printf("Artist [%s] sings %s%n" , items.getKey() , AlbumOrArtist);
                    }
                }

            }

            System.out.print("Enter another album or artist : ");
            AlbumOrArtist = sc.next();

        }

        System.out.println("Have a nice day!");
	}
}
