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
	
	play(playList);
}
private static void play(LinkedList<Song> playList) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	boolean quit = false;
	boolean forward = true;
	
	ListIterator<Song> listIterator = playList.listIterator();
	
	if(playList.size() == 0) {
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
			System.out.println("Playlist Complete");
			quit = true;
			break;
		case 1:
			if(!forward) {
				if(listIterator.hasNext()) {
					System.out.println("Playing next Song: " + listIterator.next().toString());
					listIterator.next();
				}
				forward = true;
			}
			else {
				System.out.println("Next Song does not exist");
				forward = false;
			}
			break;
		 case 2:
                if(forward){
                    if (listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    forward = false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now playing "+listIterator.previous().toString());
                }else {
                    System.out.println("This is the first Song");
                    forward = false;
                }
                break;

            case 3:
                if(forward){
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                        forward = false;
                    }else {
                        System.out.println("we are at the beginning of the list");
                    }
                }else {
                    if(listIterator.hasNext()){
                        System.out.println("now playing "+listIterator.next().toString());
                        forward = true;
                    }else {
                        System.out.println("we have reached the end of list");
                    }
                }
                break;
                
            case 4:
            	printList(playList);
            	break;
            case 5:
            	printMenu();
            	break;
            case 6:
            	if(playList.size() > 0) {
            		listIterator.remove();
            		System.out.println("Song has been removed");
            		if(listIterator.hasNext()) {
            			System.out.println("Now Playing : " + listIterator.next().toString());
            		}
            		else if(listIterator.hasPrevious()) {
            			System.out.println("Now Playing : " + listIterator.previous().toString());
            		}
            	}
		}
		
	}
	
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
	 
	 public static void printList(LinkedList<Song> playList) {
		 Iterator<Song> iterator = playList.iterator();
		 System.out.println("---------------------------------");
		 while(iterator.hasNext()) {
		 	System.out.println(iterator.next());
		 }
		 System.out.println("-------------------------------------");




		 }
		
}



