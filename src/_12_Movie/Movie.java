package _12_Movie;

public class Movie {

	
	//Properties
//	
	public String title;
	public int year;
//	String genre;
//	String[] actorsAndActresses;
//	//ratingScore is how many stars it got
//	double ratingScore;
//	//ratingLevel is if it is G, PG, Pg-13, or R
//	String ratingLevel;
//	String director;
//	boolean onAmazon;
//	boolean onNetflix;
//	boolean onHulu;
//	String boxOfficeGross;
	
	//Constructor
	Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	//Methods
	
	public void getYear(){
		System.out.println(year);	
	}

	public void getTitle() {
		System.out.println(title);
	}
	
	

//	public void getBoxOfficeGross()
//	{
//		System.out.println("The movie made " + boxOfficeGross);
//	}	
	
}
