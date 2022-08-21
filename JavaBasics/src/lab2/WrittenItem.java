package lab2;

public abstract class WrittenItem  extends  Item{
	private String author;
	
	public WrittenItem() {
		this.author="Chetan Bhagat";
		System.out.println(" ");
		
	}
	
	public WrittenItem(int id,String title,int numberOfCopies, String author) {
		super(id,title,numberOfCopies);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public  void print() {
		System.out.println("Print");
	}
	@Override
	public  void checkIn() {
		System.out.println("Checked In");
	}
	@Override
	public  void checkOut() {
		System.out.println("Checked Out");
	}
	public abstract void write();

}
