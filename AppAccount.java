public class AppAccount {
    public static void main(String[] args) {
        System.out.println("Value of Supply : "+ 1000.0);
        System.out.println("Value of VAT : "+ (1000.0*0.1));
        System.out.println("Total : "+ (1000.0+(1000.0*0.1)));
        System.out.println("Expense : "+ (1000.0*0.3));
        System.out.println("Income : "+ (1000.0-(1000.0*0.3)));
        System.out.println("Dividend : "+ (1000.0-(1000.0*0.5)));
        System.out.println("Dividend : "+ (1000.0-(1000.0*0.3)));
        System.out.println("Dividend : "+ (1000.0-(1000.0*0.2)));
    }
}