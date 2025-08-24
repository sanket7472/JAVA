package collection.queue;

public class PlayListDriver {

	public static void main(String[] args) {
		
		PlayList p1 = new PlayList("Relax", 5);
		
		p1.addSong("Suraj Dooba Hai", "Arijit Singh", "5:30", "Kumar", "Roy");
		p1.addSong("Ilahi", "Arijit Singh", "4:19", "Amitabh Bhattacharya", "Ye Jawani Hai Diwani");
		p1.addSong("Yunhi Chala Chal", "Udit Narayan", "3:07", "Hariharan", "Swadesh");
		p1.addSong("Yunhi Chala ", "Udit Narayan", "3:07", "Hariharan", "Swadesh");
		p1.addSong("Yunhi Chala Chal", "Udit Narayan", "3:15", "Hariharan", "Swadesh");
		//p1.showPlaylist();
		p1.removeSong("ilahi", "Ye Jawani Hai Diwani");
		p1.showPlaylist();
	}
}
