package workflowcontrol;

public class Break {
    public static void main(String[] args) {
        double F = 0;
        double p = 12000;
        double r = 0.2;
        double n = 1;
        for (int i = 1; i <101 ; i++) {
            System.out.println(i);
            F = p* ( Math.pow(1+r,n) );
            System.out.println(F);
            p=12000+F;
            System.out.println(p);
            if(F>=1E6){
                break;
            }

        }
    }
}
