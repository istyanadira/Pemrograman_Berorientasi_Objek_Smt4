public class JazzSong extends Song {
    public JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing jazz song: " + getTitle() + " - " + getArtist());
    }
}