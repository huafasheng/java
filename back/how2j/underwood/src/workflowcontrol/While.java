package workflowcontrol;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int n = ns.nextInt();
        int z = n;
        while(n>=2){
           z = z*(--n);
        }
        System.out.println(z);
    }

}
