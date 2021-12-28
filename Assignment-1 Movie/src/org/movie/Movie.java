package org.movie;

public class Movie {

	private String movieName;
	private String movieCategory;
	private int ticketCost;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieCategory() {
		return movieCategory;
	}

	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int calculateTicketCost(String circle) {

		String cat = getMovieCategory();

		if (circle.equalsIgnoreCase("GOLD") && cat.equalsIgnoreCase("2d")) {
			setTicketCost(300);
			return 0;
		} else if (circle.equalsIgnoreCase("GOLD") && cat.equalsIgnoreCase("3d")) {
			setTicketCost(500);
			return 0;
		} else if (circle.equalsIgnoreCase("SILVER") && cat.equalsIgnoreCase("2d")) {
			setTicketCost(250);
			return 0;
		} else if (circle.equalsIgnoreCase("SILVER") && cat.equalsIgnoreCase("3d")) {
			setTicketCost(450);
			return 0;
			
		} else if (circle.equalsIgnoreCase("GOLD") || circle.equalsIgnoreCase("SILVER")) {
			return -1;
		} else if (cat.equalsIgnoreCase("2d") || cat.equalsIgnoreCase("3d")) {
			return -2;

		}
		return -3;
	}
}
