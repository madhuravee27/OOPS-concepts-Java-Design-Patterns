public class SongTesting {
    public static void main(String[] args) {
        SongComponent industrialMusic =
                new SongGroup("Industrial",
                        "is a style of experimental music that draws on transgressive and provocative themes");

        SongComponent heavyMetalMusic =
                new SongGroup("Heavy Metal",
                        "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");

        SongComponent dubstepMusic =
                new SongGroup("Dubstep",
                        "is a genre of electronic dance music that originated in South London, England");

        // Top level component that holds everything

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        // Composite that holds individual groups of songs
        // This holds Songs plus a SongGroup with Songs

        everySong.addSongComponent(industrialMusic);

        industrialMusic.addSongComponent(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.addSongComponent(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.addSongComponent(dubstepMusic);

        dubstepMusic.addSongComponent(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.addSongComponent(new Song("Tetris", "Doctor P", 2011));

        // This is a SongGroup that just holds Songs

        everySong.addSongComponent(heavyMetalMusic);

        heavyMetalMusic.addSongComponent(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.addSongComponent(new Song("Ace of Spades", "Motorhead", 1980));

        DJ crazyLarry = new DJ(everySong);

        crazyLarry.getSongList();
    }
}
