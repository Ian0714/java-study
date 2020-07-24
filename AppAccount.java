public class AppAccount {
    public static double sup;
    public static double vatrate;
    public static double expenserate;
    public static void main(String[] args) {
        sup = 10000.0;
        vatrate = 0.1;
        expenserate = 0.3;
        double vat = VAT();
        double total = TOTAL();
        double expense = EXPENSE();
        double income = INCOME();

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

        print();

        int i = 0;
        while(i < divendRates.length){
            System.out.println("Dividend "+ i + " : "+ (income*divendRates[i]));
            i += 1;
        }
    }

    public static void print(){
        System.out.println("Value of Supply : "+ sup);
        System.out.println("Value of VAT : "+ VAT());
        System.out.println("Total : "+ TOTAL());
        System.out.println("Expense : "+ EXPENSE());
        System.out.println("Income : "+ INCOME());
    }

    public static double INCOME() {
        return sup - EXPENSE();
    }

    public static double EXPENSE() {
        return sup * expenserate;
    }

    public static double TOTAL() {
        return sup + VAT();
    }

    public static double VAT() {
        return sup * vatrate;
    }
}