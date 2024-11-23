import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {
    public static void main(String[] args) {
        //Data structures are ways in which data can be stored, manipulated, accessed and deleted, there are 7 main
        //data strucutures and I will cover 4 of them in this class.

        //Arrays: have a limited size, easy to access elements via their index.
        String[] metalBandsArray = new String[4];
        //The array above has a limited size of 4 elements, from index 0 to 3.
        //The commands below are adding something to those values, since they are declared but not initialized, thereby they're null
        metalBandsArray[0] = "Avenged Sevenfold";
        metalBandsArray[1] = "System of a Down";
        metalBandsArray[2] = "Slipknot";
        metalBandsArray[3] = "Three Days Grace";
        //What happens if I try to add a new element in index 4?
        //metalBands[4] = "Metallica";
        //Index 4 out of bounds for length 4
        //at DataStructures.main(DataStructures.java:17)
        //Let's print the bands
        System.out.println("Best metal bands: " + metalBandsArray[0] + ", " + metalBandsArray[1] + ", " + metalBandsArray[2] + ", " + metalBandsArray[3] + ".");
        //How do I get the last element from an array?
        Integer metalBandsLength = metalBandsArray.length - 1;
        System.out.println("Last metal band index: " + metalBandsLength);

        

        //Lists: Are dynamic in size and elements are linked. Elements can't be accessed through index. Can access the first and the last element
        List<String> metalBandsList = new ArrayList<String>();
        //The method below adds an element to the list.
        metalBandsList.add("Avenged Sevenfold");
        metalBandsList.add("Slipknot");
        //The method below removes and returns the first element of the list.
        metalBandsList.removeFirst();
        //The method below removes and returns the last element of the list.
        metalBandsList.removeLast();
        //The method below removes all elements of the list.
        metalBandsList.removeAll(metalBandsList);
        //The method below checks the size of the list and returns it.
        metalBandsList.size();

        

        //Stacks: Store data vertically and follows the Last In, First Out (LIFO) principle.
        Stack<String> metalBandsStack = new Stack<>();
        //The method below adds an element at the top of the stack
        metalBandsStack.push("Avenged Sevenfold");
        metalBandsStack.push("Slipknot");
        //The method below removes the element at the top of the stack, in this case it removes Slipknot (NOOOOO).
        metalBandsStack.pop();
        //The method below peeks at the next element at the top of the stack and returns it.
        metalBandsStack.peek();
        //The method below checks the size of the stack and returns it.
        metalBandsStack.size();



        //Queues: Store data horizontally and follows the First In, First Out (FIFO) principle.
        Queue<String> metalBandsQueue = new LinkedList<>();
        //The method below adds an element to the end of the queue or to the start if the queue is empty.
        metalBandsQueue.add("Three Days Grace"); //Queue Head
        metalBandsQueue.add("System of a Down");
        metalBandsQueue.add("Slipknot"); //Queue Tail
        //The method below removes the Queue Head and returns it.
        metalBandsQueue.poll(); //Now System of a Down is the Queue Head and Slipknot is still the Queue Tail.
        //The method below peeks at the Queue Head and returns it.
        metalBandsQueue.peek(); //This will return System of a Down.
        //The method below removes the Queue Tail.
        //metalBandsQueue.fuckYou();
        metalBandsQueue.poll();
        metalBandsQueue.poll();
        //The method below checks if the queue is empty
        metalBandsQueue.isEmpty(); //It is empty cause I used poll till it was.
    }
}
