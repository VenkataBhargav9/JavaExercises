package lab2;

public abstract class MediaItem extends Item{
	
	private int runTime;
	public MediaItem() {
		super();
		
	}
	public MediaItem(int id,String title,int numberOfCopies,int runTime) {
		super(id,title,numberOfCopies);
		this.runTime=runTime;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	@Override
	public String toString() {
		return "MediaItem [runtime=" + runTime + ", getId()=" + getId() + ", getTitle()=" + getTitle()
		+ ", getnumberOfCopies()=" + getNumberOfCopies() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + "]";
		
	}

}
