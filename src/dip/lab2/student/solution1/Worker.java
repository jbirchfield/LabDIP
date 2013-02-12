package dip.lab2.student.solution1;

 /*
 * @author Jim Birchfield
 */
public interface Worker {

    /**
     * Returns tips for any worker. Note that each
     * specific type of worker will implement this differently. But
     * since all worker sub classes are guaranteed to have this method
     * because of the contractual obligation to re-declare all abstract
     * methods in the sub classes, we are guaranteed to have polymorphic
     * behavior with respect to this method.
     *
     * @return tips for a worker
     */
    public abstract double getTotalTips();


 

}
