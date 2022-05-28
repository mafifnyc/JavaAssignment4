public class Average {
     double x;
     double y;
     double z;
    public Average(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getAverage() {
        double avg = (x+y+z)/3;
        return avg;
    }

    public static void main(String[] args) {
        Average a = new Average(10.00, 20.00, 30.00);
        System.out.println(a.getAverage());
    }

}
