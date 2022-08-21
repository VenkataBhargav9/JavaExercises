package lab2;

public abstract class Video extends MediaItem{

	private String director;
	private String genre;
	private int yearReleased;
	
	/*public Video() {
		
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
	*/

	public Video(String director, String genre, int yearReleased) {
		super();
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	

	public Video(int id, String title, int copies, int runtime) {
		super(id, title, copies, runtime);
		// TODO Auto-generated constructor stub
	}
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", toString()="
				+ super.toString() + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getnumberOfCopies()="
				+ getNumberOfCopies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

	
}
