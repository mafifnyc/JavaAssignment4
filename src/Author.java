public class Author {
    String firstName;
    String lastName;
    public Author(String f, String l) {
        firstName = f;
        lastName = l;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String toString(){
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Author a = new Author("John", "Smith");
        a.setFirstName("John");
        a.setLastName("Smith");
        System.out.println(a.getFirstName());
        System.out.println(a.getLastName());
        System.out.println(a.toString());
    }

}
