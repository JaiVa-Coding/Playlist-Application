import java.util.ArrayList;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songList;
	public Album(String name, String artist, ArrayList<Song> songList) {
		super();
		this.name = name;
		this.artist = artist;
		this.songList = songList;
	}
	
	public Album() {
		
	}
	
	public boolean addSong(String title, double duration ) {
		if(title == null) {
			songList.add(new Song(title,duration));
			System.out.println(title + "successfully added to SongList");
			return true;
		}
		else {
			System.out.println("Sorry the song already exists in List");
			return false;
		}
		
	}
}
