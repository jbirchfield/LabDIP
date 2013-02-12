package dip.lab2.student.solution1;

// An useful import if you need it.

import java.text.NumberFormat;


/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        
        BaggageServiceTipCalculator bagwrk1 =
                new BaggageServiceTipCalculator("FAIR",5);
        
        FoodServiceTipCalculator fswrk1 =
                new FoodServiceTipCalculator("GOOD", 50.00);
        
        CustomerService cs = new CustomerService();
        
        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        System.out.println("Worker 1 total tips: " +
            nf.format(cs.getTotalTipsForWorker(bagwrk1)));
        System.out.println("Worker 2 total tips: " +
            nf.format(cs.getTotalTipsForWorker(fswrk1)));
        
        
        
    }

}
