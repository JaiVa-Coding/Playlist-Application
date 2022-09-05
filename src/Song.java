
public class Song {
private String title;
private double duration;
public Song(String title, Double duration) {
	super();
	this.title = title;
	this.duration = duration;
}
public Song() {
	
}
public String getTitle() {
	return title;
}
public Double getDuration() {
	return duration;
}
@Override
public String toString() {
	return "Song [title=" + title + ", duration=" + duration + "]";
}



}
