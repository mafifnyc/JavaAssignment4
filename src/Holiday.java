public class Holiday {
    String name;
    int day;
    String month;
    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }
    public boolean inSameMonth(Holiday h) {
        return this.month.equals(h.month);
    }

    public static void main(String[] args) {
        Holiday h1 = new Holiday("Independence day", 4, "July");
        Holiday h2 = new Holiday("Memorial Day", 29, "July");
        System.out.println(h1.inSameMonth(h2));
    }
}
