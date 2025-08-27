package collection.queue;

public class PlayListDriver {

	public static void main(String[] args) {
		
		PlayList p1 = new PlayList("morning mix", 10);
		
		p1.addSong("Hanuman Chalisa", "Arijit Singh", "5:30", "Kumar", "Roy");
		p1.addSong("Haripath", "Arijit Singh", "4:19", "Amitabh Bhattacharya", "Roy");
		p1.addSong("Janm Zala varkari", "Udit Narayan", "3:07", "Hariharan", "Roy");
		p1.addSong("Ram siya ram", "Udit Narayan", "3:07", "Hariharan", "Roy");
		p1.addSong("Shree Swami Samarth", "Udit Narayan", "3:15", "Hariharan", "Roy");
		p1.addSong("Shiv tandav stotram ", "Udit Narayan", "3:15", "Hariharan", "Roy");
		p1.addSong("Shree Krishn govind hare murari ", "Udit Narayan", "3:15", "Hariharan", "Roy");
		p1.addSong("Ram Ayenge ", "Udit Narayan", "3:15", "Hariharan", "Roy");
		p1.addSong("Jaikal Makahal ", "Udit Narayan", "3:15", "Hariharan", "Roy");
		//p1.showPlaylist();
		//p1.removeSong("Haripath", "Roy");
		
//		p1.showPlaylist();
//		System.out.println("--------------------------");
//		p1.shuffle();
		p1.playNext("haripath", "roy");
		p1.showPlaylist();
	}
}
