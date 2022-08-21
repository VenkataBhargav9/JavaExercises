package lab2;

public abstract class Item {
	private int id;
	private String title;
	private int numberOfCopies;
	
	public Item() {

		this(0,"0",0);
		System.out.println("Default Constructor in Item class");
	}
	
	public Item(int id,String title,int numberOfCopies) {
		this.id=id;
	    this.title=title;
		this.numberOfCopies=numberOfCopies;
		System.out.println("Parametrised Constructor in Item Class");
	}
	
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
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
	public String toString() {
		return "Item[ id= "+id+","+"title= "+title+","+"numberOfCopies= "+numberOfCopies+"]";
		
	}
	public abstract void checkIn();
    public abstract void checkOut();
    public abstract void addItem();
    public abstract void print();

}
