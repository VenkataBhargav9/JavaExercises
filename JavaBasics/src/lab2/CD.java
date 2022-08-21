package lab2;

public abstract class CD extends MediaItem {

	
	private String artist;
	private String genre;
	
	
	/*public String getArtist() {
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
	}*/
	
	public CD(String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
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
		return "CD [artist=" + artist + ", genre=" + genre + ", toString()=" + super.toString() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getnumberOfCopies()=" + getNumberOfCopies() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

	
}
