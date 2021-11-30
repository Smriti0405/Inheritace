import java.util.Scanner;

public class CustomerPurchase {
    String fname, lname, product;
    double price;
    int quantity;
    CustomerPurchase(){
        Scanner s = new Scanner(System.in);
        fname = s.next();
        lname = s.next();
        price = s.nextDouble();
        product = s.next();
        quantity = s.nextInt();
    }
}
class Printing extends CustomerPurchase{
    public void printDetails() {
        System.out.println(fname + " " + lname);
        System.out.println(product + " " + "Qty " + quantity);

    }
    public void CustomerPurchaseReport(){
        System.out.println("TAX 15%");
        System.out.println("COMMISSION 8.5%");
        System.out.println("TOTAL (Price + Tax) - Discount + Commission");
        double total = (15*price/100 + 8.5*price/100);
        System.out.println(total);
    }

    public static void main(String[] args) {
        Printing obj = new Printing();
        obj.printDetails();
        obj.CustomerPurchaseReport();
    }

    }


