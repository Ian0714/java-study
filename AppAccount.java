public class AppAccount {
    public static void main(String[] args) {
        double sup = 1000.0;
        double vat = sup * 0.1;
        double total = sup + vat;
        double expense = 0.3 * sup;
        double income = sup - expense;
        double divend1 = income * 0.5;
        double divend2 = income * 0.3;
        double divend3 = income * 0.2;

        System.out.println("Value of Supply : "+ sup);
        System.out.println("Value of VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);
        System.out.println("Dividend : "+ divend1);
        System.out.println("Dividend : "+ divend2);
        System.out.println("Dividend : "+ divend3);
    }
}