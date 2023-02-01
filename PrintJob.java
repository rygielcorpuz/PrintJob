/**
 * @author Rygiel Corpuz
 * 3345.001
 * PrintJob class
 * netID rsc190002
 * 2022-10-29
 */
public class PrintJob implements Comparable<PrintJob>
{
    private String name;
    private int priority;
    private int pages;

    /**
     * Constructor of PrintJob class
     * @param n
     * @param pr
     * @param pg
     */
    public PrintJob(String n,int pr,int pg)
    {
        name = n;
        priority = pr;
        pages = pg;
    }

    /**
     * getName method
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * getPriority method
     * @return priority
     */
    public int getPriority()
    {
        return priority;
    }

    /**
     * getPages method
     * @return pages
     */
    public int getPages()
    {
        return pages;
    }

    /**
     * computes job Priority
     * @return job priority
     */
    public int jobPriority()
    {
        return priority*pages;
    }

    /**
     * compareTo method
     * compares printjob object's job priority
     * @param p the object to be compared.
     * @return 0,1,-1
     */
    @Override
    public int compareTo(PrintJob p)
    {
        if (jobPriority() == p.jobPriority())
        {
            return 0;
        }
        else if (jobPriority() > p.jobPriority())
        {
            return 1;
        } else
        {
            return -1;
        }
    }

    /**
     * toString method
     * @return the User's name,priority,and pages
     */
    @Override
    public String toString()
    {
        return "User Name: "+ getName() + " | User Priority: " + getPriority() + " | Pages: " + getPages();
    }

}
