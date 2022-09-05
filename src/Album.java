import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songList;
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songList = new ArrayList<Song>();
	}
	
	public Album() {
		
	}
	
	public Song findSong(String title) {
		for(Song checkedSong : songList) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
			
		}
		return null;
	}
	
	public boolean addSong(String title, double duration ) {
		if(findSong(title) == null) {
			songList.add(new Song(title,duration));
			System.out.println(title + "successfully added to SongList");
			return true;
		}
		else {
			System.out.println("Sorry the song already exists in List");
			return false;
		}
		
	}
	
	  public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
	        int index = trackNumber - 1;
	        if(index > 0 && index <= this.songList.size()){
	            PlayList.add(this.songList.get(index));
	            return true;
	        }
	        System.out.println("this album does not have song with trackNumber "+trackNumber);
	        return false;
	    }

	    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
	        for(Song checkedSong : this.songList)
	            if (checkedSong.getTitle().equals(title)){
	                PlayList.add(checkedSong);
	                return true;
	            }
	        System.out.println(title + "there is no such song in album");
	        return false;
	        }
	       
	    }


