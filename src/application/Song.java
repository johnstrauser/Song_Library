package application;

/*
 * Joshua Pineda
 * John Strauser
 */
public class Song {

	private String Name;
	private String Artist;
	private int Year = -1; 
	private String Album = "";
	
	//int used to determine if detail is to be added to the toString
	private int detail = 0;
	//int used to determine if Year and Artist are not default
	private int aPresent = 0;
	private int yPresent = 0;
	//string for toString
	private String outString;
	
	public Song() {
		super();
	}
	public Song(String name, String artist) {
		setName(name);
		setArtist(artist);
		setAPresent(0);
		setYPresent(0);
		updateString();
	}
	public Song(String name, String artist, int year){
		setName(name);
		setArtist(artist);
		setYear(year);
		setYPresent(1);
		updateString();
	}
	public Song(String name, String artist, String album){
		setName(name);
		setArtist(artist);
		setAlbum(album);
		setAPresent(1);
		updateString();
	}
	public Song(String name, String artist, int year, String album) {
		setName(name);
		setArtist(artist);
		setYear(year);
		setAlbum(album);
		setAPresent(1);
		setYPresent(1);
		updateString();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getNameLower(){
		String temp = Name;
		temp = temp.toLowerCase();
		return temp;
	}
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		this.Artist = artist;
		
	}
	public String getArtistLower(){
		String temp = Artist;
		temp = temp.toLowerCase();
		return temp;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		this.Year = year;
		if(year == -1) {
			setYPresent(0);
		}else {
			setYPresent(1);
		}
	}
	public String getAlbum() {
		return Album;
	}
	public void setAlbum(String album) {
		this.Album = album;
		if(Album.equals("")) {
			setAPresent(0);
		}else {
			setAPresent(1);
		}
	}
	public int getDetail(){
		return detail;
	}
	public void setDetail(int detail){
		this.detail=detail;
		updateString();
	}
	public int getYPresent() {
		return yPresent;
	}
	public void setYPresent(int yPresent) {
		this.yPresent = yPresent;
	}
	public int getAPresent() {
		return aPresent;
	}
	public void setAPresent(int aPresent) {
		this.aPresent = aPresent;
	}
	public void updateString(){
		outString = Name+" - "+Artist;
		if(getDetail()==1){
			if(getYPresent()==1){
				outString += " - "+Year;
			}
			if(getAPresent()==1){
				outString += " - "+Album;
			}
		}
	}
	@Override
	public String toString() {
		//return "Song [Name=" + Name + ", Artist=" + Artist + ", Year=" + Year + ", Album=" + Album + "]";
		return outString;
	}
	public String saveString(){
		String out = Name+"-"+Artist;
		if(getYPresent()==1){
			out += "-"+Year;
		}else{
			out += "-none";
		}
		if(getAPresent() == 1) {
			out += "-"+Album;
		}else {
			out += "-none";
		}
		
		return out;
	}
}
