import java.util.Scanner;

/**
 * Created by kathleendevos on 13/06/17.
 */
public class oefening5_2_4 {
    public static void main(String[] args) {

        double inkom;
        Scanner sc = new Scanner(System.in);
        System.out.println("MONTHLY INCOME: ");
        double income = sc.nextDouble();

        double social_security_value = 0.1307;
        double social_security = income * social_security_value;
        double ssround = (Math.round(social_security * 100) / 100.0);

        System.out.println("SOCIAL SECURITY: " + ssround);

        Double taxable_income = income - social_security;
        System.out.println("TAXABLE INCOME: " + taxable_income);


        if (taxable_income > 0 && taxable_income <= 8680) {

            double taxation = taxable_income * 0.25;
            double netincome = taxable_income - taxation;
            System.out.println("TAXATION: " + taxation);
            System.out.println("MONTHLY NET INCOME: " + netincome);


        } else {
            if (taxable_income > 8681 && taxable_income <= 12360) {
                double taxation = taxable_income * 0.30;
                System.out.println("TAXATION: " + taxation);

            } else {

                if (taxable_income > 12361 && taxable_income <= 20600) {
                    double taxation = taxable_income * 0.40;
                    System.out.println("TAXATION: " + taxation);

                } else {
                    if (taxable_income > 20601 && taxable_income <= 37750) {
                        double taxation = taxable_income * 0.45;
                        System.out.println("TAXATION: " + taxation);

                    } else {
                        if (taxable_income > 37750) {
                            double taxation = taxable_income * 0.50;
                            System.out.println("TAXATION: " + taxation);

                        }
                    }
                }
            }
        }
    }

}

