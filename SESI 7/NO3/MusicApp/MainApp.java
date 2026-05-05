public class MainApp {
    public static void main(String[] args) {

        Playlist<Song> playlist = new Playlist<>();

        Song lagu1 = new PopSong("Shape of You", "Ed Sheeran");
        Song lagu2 = new JazzSong("Fly Me to the Moon", "Frank Sinatra");

        playlist.addSong(lagu1);
        playlist.addSong(lagu2);

        playlist.playAll();
    }
}