public class LoanPayment
{
    public static void main(String[] args)
    {
        double years, principal, rate, pay;
        years = Double.parseDouble(args[0]);
        principal = Double.parseDouble(args[1]);
        rate = Double.parseDouble(args[2]);

        pay = principal * Math.exp(rate * years);

        System.out.println("Payment: " + pay);
    }    
}
