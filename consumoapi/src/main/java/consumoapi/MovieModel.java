package consumoapi;

import com.google.gson.annotations.SerializedName;

public class MovieModel {
	@SerializedName("Title")
	private String title;
	
	@SerializedName("Year")
	private String year;
	
	private String imdbRating;
	
	@SerializedName("Type")
	private String type;
	
	@SerializedName("Genre")
	private String genre;
	
	@SerializedName("Actors")
	private String actors;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public MovieModel(String title, String year, String imdbRating, String type, String genre, String actors) {
		this.title = title;
		this.year = year;
		this.imdbRating = imdbRating;
		this.type = type;
		this.genre = genre;
		this.actors = actors;
	}

	public MovieModel() {}
	
	@Override
	public String toString() {
	
		return "Nome " + getTitle() + " Ano " + year +
				"\nNota " + getImdbRating() + " Tipo " + getType()+
				"\nAtores " + getActors()
				;
	}
	
	
}
