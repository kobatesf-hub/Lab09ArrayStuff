import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100) + 1;

        }
        System.out.println("Array Values:");
        for(int i = 0; i < dataPoints.length; i++){
            System.out.print(dataPoints[i]);
            if(i < dataPoints.length - 1) System.out.print(" | ");
        }
        System.out.println();
        int sum = 0;
        for (int val : dataPoints){
            sum += val;
        }
        double avg = (double) sum / dataPoints.length;
        System.out.println("\nThe Sum Of the Array is: " + sum);
        System.out.println("The Average of the random Array is: " + avg);

        int userValue = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100", 1, 100);
        int count = 0;
        for (int val : dataPoints){
            if (val == userValue) count++;
        }
        System.out.println("\nThe Value " + userValue + " was Found " + count +" Times in the Array");
        int searchVal = SafeInput.getRangedInt(in, "Enter another integer Value between 1 to 100 to search for", 1, 100);
        boolean found = false;
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == searchVal){
                found = true;
                position = i;
                break;

            }
        }
        if (found) {
            System.out.println("THe Value " + searchVal + " was Found at Array index" + position + ".");
        }else{
            System.out.println("The Value " + searchVal + " was Not Found in the Array");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int val : dataPoints){
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("\nThe minimum value is " + min);
        System.out.println("The maximun value is " + max);

        int sum2 = 0;
        for (int val : dataPoints){
            sum2 += val;
        }
        double avg2 = (double) sum2 / dataPoints.length;
        System.out.println("\nThe Average of sataPoint is: " + avg2);

        in.close();

    }
}