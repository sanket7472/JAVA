package collection.queue;

public class Song {

	private String name;
	private String singer;
	private String duration;
	private String writer;
	private String movie; 
	
	
	private Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}


	public String getSinger() {
		return singer;
	}


	public String getDuration() {
		return duration;
	}


	public String getWriter() {
		return writer;
	}


	public String getMovie() {
		return movie;
	}

	public Song(String name, String singer, String duration, String writer, String movie) {
		super();
		this.name = name;
		this.singer = singer;
		this.duration = duration;
		this.writer = writer;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", singer=" + singer + ", duration=" + duration + ", writer=" + writer
				+ ", movie=" + movie + "]";
	}

	@Override
	public int hashCode() {
		return name.hashCode()+duration.hashCode()+movie.hashCode()+singer.hashCode()+writer.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Song s = (Song) obj;
		return this.name.equalsIgnoreCase(s.name) && this.duration.equals(s.duration)&& this.movie.equalsIgnoreCase(s.movie)&&
				this.singer.equalsIgnoreCase(s.singer)&& this.writer.equalsIgnoreCase(s.writer);
	}
	
	
	



	
	
	
}
