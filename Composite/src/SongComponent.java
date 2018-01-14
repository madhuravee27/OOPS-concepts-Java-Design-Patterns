import java.util.ArrayList;
import java.util.Iterator;

public abstract class SongComponent {
    public void addSongComponent(SongComponent newSongComponent){

    }

    public void removeSongComponent(SongComponent newSongComponent){

    }

    public SongComponent getSongComponent(int indexSongComponent){
        throw new UnsupportedOperationException();
    }

    public String getSongName(){
        throw new UnsupportedOperationException();
    }

    public String getSongescription(){
        throw new UnsupportedOperationException();
    }

    public int getSongReleaseYear(){
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo(){

    }

}

class SongGroup extends SongComponent{

    ArrayList songComponents = new ArrayList();

    private String groupName;
    private String groupDescription;

    SongGroup(String newGroupName, String newGroupDescription){
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void addSongComponent(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void removeSongComponent(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    @Override
    public SongComponent getSongComponent(int indexSongComponent) {
        return (SongComponent) songComponents.get(indexSongComponent);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getGroupName()+" "+getGroupDescription());
        Iterator songIterator = songComponents.iterator();
        while(songIterator.hasNext())
        {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}

class Song extends SongComponent{
    private String songName;
    private String songDescription;
    private int releaseYear;

    Song(String newSongName, String newSongDescription, int newReleaseYear){
        songName = newSongName;
        songDescription = newSongDescription;
        releaseYear = newReleaseYear;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    public String getSongDescription() {
        return songDescription;
    }

    @Override
    public int getSongReleaseYear() {
        return releaseYear;
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getSongName()+" "+getSongDescription()+" "+getSongReleaseYear());
    }
}

class DJ{
    SongComponent songList;
    DJ(SongComponent newSongComponent){
        songList = newSongComponent;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}



