public class AppAccount {
    public static void main(String[] args) {
        double sup = Double.parseDouble(args[0]);
        double vat = sup * 0.1;
        double total = sup + vat;
        double expense = 0.3 * sup;
        double income = sup - expense;

        double[] divendRates = new double[3];

        if(income >= 10000){
            divendRates[0] = income * 0.5;
            divendRates[1] = income * 0.3;
            divendRates[2] = income * 0.2;
        } else {
            divendRates[0] = income * 1;
            divendRates[1] = income * 0;
            divendRates[2] = income * 0;
        }

        System.out.println("Value of Supply : "+ sup);
        System.out.println("Value of VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);

        int i = 0;
        while(i < divendRates.length){
            System.out.println("Dividend "+ i + " : "+ (income*divendRates[i]));
            i += 1;
        }
    }
}