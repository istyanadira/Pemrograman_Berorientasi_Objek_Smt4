public class PopSong extends Song {
    public PopSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing pop song: " + getTitle() + " - " + getArtist());
    }
}