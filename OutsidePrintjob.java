/**
 * @author Rygiel Corpuz
 * 3345.001
 * OutsidePrintJob class
 * subclass of Printjob
 * netID rsc190002
 * 2022-10-29
 */
public class OutsidePrintjob extends PrintJob
{


    /**
     * Constructor of OutSidePrintJob subclass
     * @param n
     * @param pr
     * @param pg
     */
    public OutsidePrintjob(String n,int pr,int pg)
    {
            super(n, pr, pg);
    }

    /**
     * computeCost method
     * 10 cents each page
     * @return computed cost if outside printjob
     */
    public int computeCost()
    {
        int cost = 0;
        cost = getPages()*(10);
        return cost;



    }
    @Override
    public String toString()
    {
            return "User Name: " + getName() + " | User Priority: " + getPriority() + " | Pages: " + getPages() + " | Cost: " + computeCost() + " cents";

    }
}
