package collection.queue;

import java.util.Arrays;

public class PlayList {

	private String name;
	private int cap;
	
	private int count;

	private PlayList() {
		super();
		// TODO Auto-generated constructor stub
	}

	Song[] songs;
	public PlayList(String name, int cap) {
		super();
		this.name = name;
		this.cap = cap;
		
		songs = new Song[cap];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCap() {
		return cap;
	}
	
	public void showPlaylist() {
		if (count>0) {
			for (int i = 0; i < count; i++) {
				System.out.println(songs[i]);
			}
		}
		else {
			System.out.println(" PlayList is Empty ... ");
		}
	}
	
	public boolean addSong(String name, String singer, String duration, String writer, String movie) {
		
		if (count<songs.length) {
			int i;
			Song tobeAdded = new Song(name, singer, duration, writer, movie);
			for (i = 0; i < count; i++) {
				if (songs[i].equals(tobeAdded)) {
					break;
				}
			}
			if (i==count) {
				songs[count] = tobeAdded;
				count++;
				
				return true;
			}else {
				System.out.println("Song already in the list..");
			}
		}
		else {
			System.out.println(" Playlist is full..");
		}
		return false;
	}
	
	public boolean removeSong(String name,String movie) {
		if (count!=0) {
			boolean found = false;
			int i;
			for (i = 0; i < count-1; i++) {
				if (!found) {
					if (songs[i].getName().equalsIgnoreCase(name)&&songs[i].getMovie().equalsIgnoreCase(movie)) {
						songs[i]=null;
						found = true;
					}
				}else {
					songs[i-1] = songs[i];
				}
			}
			if (found) {
				System.out.println(name + " Song removed !");
//				System.out.println("i: "+i);
//				System.out.println("count: "+count);
				
				songs[i] = null;
				count--;
			}else {
				System.out.println(name+ " Not in the playlist ");
			}
			return found;
		}else {
			System.out.println("Playlist is Empty...!");
		}
		return false;
	}
	public void shuffle() {
		
		for (int i = count-1;i>0;) {
			int j = (int) (Math.random()*10);
			
			if (j>=0 && j<count) {
				Song temp = songs[i];
				songs[i] = songs[j];
				songs[j]=temp;
				
				i--;
			}
		}
	}
	
	
	
}
