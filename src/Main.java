import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
private static ArrayList<Album> albums = new ArrayList<>();
public static void main(String args[]) {
	
	Album album = new Album("Justin_Bieber_Album","Justin_Bieber");
	album.addSong("Cold Water", 4.5);
	album.addSong("Baby", 3.5);
	album.addSong("Boyfriend", 3.7);
	albums.add(album);
	
    album = new Album("Usher_Album","Usher");
	album.addSong("Yeah", 4.7);
	album.addSong("More", 3.3);
	album.addSong("Trading Places", 5.7);
	albums.add(album);
	
	LinkedList<Song> playList = new LinkedList<>();
	albums.get(0).addToPlayList("Cold Water", playList);
	albums.get(0).addToPlayList("Boyfriend", playList);
	albums.get(1).addToPlayList("Trading Places", playList);
	albums.get(1).addToPlayList("Yeah", playList);
}
	

	
	 private static void printMenu(){
	        System.out.println("Available options\n press");
	        System.out.println("0 - to quit\n"+
	                "1 - Play next song\n"+
	                "2 - Play previous song\n"+
	                "3 - Replay the current song\n"+
	                "4 - List of all songs \n"+
	                "5 - Print all available options\n"+
	                "6 - Delete current song");
	 }
		private static void play(LinkedList<Song> playList) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			boolean quit = false;
			boolean forward = true;
			
			ListIterator<Song> listIterator = playList.listIterator();
			
			if(playList.size()==0) {
				System.out.println("This Playlist has no songs") ;
				}
			else {
				System.out.println("Now Playing" + listIterator.next().toString());
				printMenu();
			}
			
			while(!quit) {
				int action = sc.nextInt();
				sc.nextLine();
				
				switch(action) {
				case 0:
					quit = true;
					break;
				}
			}
			
		}

	public static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("---------------------------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------------------");
		


		
	}
}



