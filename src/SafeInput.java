import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high ){
        int ret = 0;
        boolean ok = false;
        while(!ok){
            System.out.println(prompt + "(" + low + "-" + high + "): ");
            if(pipe.hasNextInt()){
                ret = pipe.nextInt();
                pipe.nextLine();
                if(ret >= low && ret <= high){
                    ok = true;
                }else{
                    System.out.println("Error: Value not in range. Try again.");
                }
            }else{
                String bad = pipe.nextLine();
                System.out.println("Error: \"" + bad +"\" is not an integer. Try again.");
            }
        }
        return ret;
    }
}
