public class Playlist {
    private String playlistName;
    private String[] songs = new String[10];
    private int songCount = 0;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void addSong(String song) {
        if (songCount == songs.length) {
            System.out.println("Playlist is full, cannot add: " + song);
            return;
        }
        songs[songCount] = song;
        songCount++;
    }

    public void displaySongs() {
        System.out.println("Playlist: " + playlistName);
        if (songCount == 0) {
            System.out.println("No songs");
            return;
        }
        for (int i = 0; i < songCount; i++) {
            System.out.println((i + 1) + ". " + songs[i]);
        }
    }

    public int getSongCount() {
        return songCount;
    }
    public boolean containsSong(String song) {
        for (int i = 0; i < songCount; i++) {
            if (songs[i].equals(song)) {
                return true;
            }
        }
        return false;
    }
    public static boolean searchSong(String[] songs, String song) {
        for (String s : songs) {
            if (song.equals(s)) {
                return true;
            }
        }
        return false;
    }
}