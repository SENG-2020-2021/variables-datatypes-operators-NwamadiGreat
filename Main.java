class Main {
  public static void main(String[] args) {
     // kindly use appropriate data types for your declaration
        // declare variables days the debtor defaulted, amount the debtor is to pay per day, amount the debtor paid and assign values to them
        int daysDebtorDefaulted = 4;
        int amountDebtorPayPerDay = 500;
        int amountPaid = 1700;

        //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
        int totalAmountToPay;
        int daysDebtorPaid;
        int amountLeft;
        int daysNotPaid;

        // calculate and print total amount the debtor is to pay
        totalAmountToPay = daysDebtorDefaulted * amountDebtorPayPerDay;
        System.out.println("The total amount the debtor is to pay: " + totalAmountToPay);

        // calculate and print the days the debtor paid for
         daysDebtorPaid = amountPaid/amountDebtorPayPerDay;
        System.out.println("The days the debtor paid for: " + daysDebtorPaid);

        // calculate and print the amount whose day was not captured because the amount was incomplete
        int amountNotCovered = amountPaid % amountDebtorPayPerDay;
        System.out.println("The amount not captured: " + amountNotCovered);

        // calculate and print amount the debtor is left to pay
        amountLeft = totalAmountToPay - amountPaid;
        System.out.println("Amount the Debtor is left to pay: " + amountLeft);

        // calculate and print days the debtor has not payed for
        daysNotPaid = daysDebtorDefaulted - daysDebtorPaid; 
        System.out.println("The days debtor has not paid before: " + daysNotPaid);


  }
}