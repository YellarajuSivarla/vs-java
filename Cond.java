import java.util.*;
public class Cond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // apply conditions
        if(age>18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}
