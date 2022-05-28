public class Invoice {
    String partNum;
    String partDes;
    int quantity;
    double priceper;
    public Invoice(String n, String d, int q, double p) {
        partNum = n;
        partDes = d;
        if(q>0) {
            quantity = q;
        }
        else {
            quantity = 0;
        }
        if(p>0) {
            priceper = p;
        }
        else {
            priceper = 0;
        }

    }
    public double getInvoice() {

        return quantity*priceper;
    }

    public static void main(String[] args) {
        Invoice a = new Invoice("Screws", "1/4\" inch", 20, 1.50 );
        System.out.println(a.getInvoice());
    }


}
