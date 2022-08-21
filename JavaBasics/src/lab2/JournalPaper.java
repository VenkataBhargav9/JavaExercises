package lab2;

public abstract class JournalPaper extends WrittenItem {
	
	private int year;
	
	public JournalPaper() {
		
	}
     
	public JournalPaper(int id,String title,int numberOfCopies,String author,int yearPublished) {
		super(id,title,numberOfCopies,author);
		this.year=yearPublished;
		
	}
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
@Override
public void write() {
	System.out.println("This Method is is Journal Paper");
}
}
