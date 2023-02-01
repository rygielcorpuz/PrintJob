/**
 * @author Rygiel Corpuz
 * 3345.001
 * Printer class
 * netID rsc190002
 * 2022-10-29
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Printer
{
    public static void main(String [] args ) throws FileNotFoundException
    {
        File file = new File("input.txt");

        Scanner scan = new Scanner(file);

        BinaryHeap<PrintJob> h = new BinaryHeap<>();
        //Scans while checking which print job it is creating object corresponding to task at hand
        while(scan.hasNext())
        {
            String name = scan.next();
            int priority = Integer.parseInt(scan.next());
            int pages = Integer.parseInt(scan.next());
            String job = scan.next();
            if (job.equals("O"))
            {
                OutsidePrintjob p = new OutsidePrintjob(name, priority, pages);
                h.insert(p);
            }
            else
            {
                PrintJob p = new PrintJob(name, priority, pages);
                h.insert(p);
            }
        }
        while(!(h.isEmpty()))
        {
            System.out.println(h.deleteMin());
        }

        }
    }

