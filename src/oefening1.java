public class oefening1{
    public static void main (String [] args){
        int price = 35;
        int quantity = 5;
        double tax = 0.21;
        int total = price*quantity;
        double totaltax = price*quantity*tax;

        System.out.println("The total price is €" + (total+totaltax) );
    }
}