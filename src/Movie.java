public class Movie {
    String title;
    String studio;
    String rating;
    public Movie(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }
    public Movie(String t, String s) {
        title = t;
        studio =s;
        rating = "PG";
    }
    public String getTitle(){
        return title;
    }

    public static void main(String[] args) {
        Movie m = new Movie("Avengers", "Marvel");
        System.out.println(m.getTitle());
    }
}
