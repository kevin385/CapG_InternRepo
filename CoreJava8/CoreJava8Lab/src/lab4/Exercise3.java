package lab4;

abstract class Item {
	private int id;
	private String title;
	private String numberOfCopies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(String numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public Item(int id, String title, String numberOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}
}

abstract class WrittenItem extends Item{
	private String author;
	public WrittenItem(int id, String title, String numberOfCopies, String author) {
		super(id, title, numberOfCopies);
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}
}

class Book extends WrittenItem {
	public Book(int id, String title, String numberOfCopies, String author) {
		super(id, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}
	
}

class JournalPaper extends WrittenItem {
	private int yearPublished;
	public JournalPaper(int id, String title, String numberOfCopies, String author, int yearPublished) {
		super(id, title, numberOfCopies, author);
		this.yearPublished = yearPublished;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
}

abstract class MediaItem extends Item{
	private int runtime;
	public MediaItem(int id, String title, String numberOfCopies,int runtime) {
		super(id, title, numberOfCopies);
		this.runtime = runtime;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
}

class Video extends MediaItem {
	private String director; 
	private String genre;
	private int yearReleased;
	public Video(int id, String title, String numberOfCopies, int runtime, String director, String genre, int yearReleased) {
		super(id, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
}

class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD(int id, String title, String numberOfCopies, int runtime, String artist, String genre) {
		super(id, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
