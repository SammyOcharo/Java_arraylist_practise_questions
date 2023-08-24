//Music Playlist:
//Build a music playlist manager using ArrayLists. Store songs with details like title, artist, album, and duration.
// Implement features to add songs, remove songs, shuffle the playlist, and display the current playing song.

import java.util.ArrayList;
import java.util.Scanner;

class Song{

    private String title;
    private String artist;
    private String album;
    private double duration;

    public Song(String title, String artist, String album, double duration){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' + ", artist='" + artist + '\'' + ", album='" + album + '\'' + ", duration=" + duration;
    }
}
public class MusicPlayer {

    public static void main(String[] args) {
        ArrayList<Song> PlayList = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song to Playlist");
            System.out.println("2. Remove Song from Playlist");
            System.out.println("3. Shuffle Playlist");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    System.out.println("Add song to playlist");
                    System.out.println("Enter the title of the song: ");
                    String songTitle = scanner.nextLine();

                    System.out.println("Enter the Artist of the song: ");
                    String songArtist= scanner.nextLine();

                    System.out.println("Enter the Album of the song: ");
                    String songAlbum = scanner.nextLine();

                    System.out.println("Enter the Duration of the song: ");
                    double songDuration = scanner.nextDouble();

                    PlayList.add(new Song(songTitle, songArtist, songAlbum, songDuration));

                    System.out.println("Song added successfully!");

                    break;

                case 2:
                    System.out.println("Remove song to playlist");
                    System.out.println("Here is a list of the Songs in the Playlist");

                    for (Song song: PlayList){
                        System.out.println(song.toString());
                    }

                    break;


            }
        }

    }

}
