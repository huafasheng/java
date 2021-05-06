package workflowcontrol;

public class For {
    public static void main(String[] args) {
        int s = 1;
        int m=1;
        for (int i = 0; i <10; i++) {
            m= (int) Math.pow(2,i);
            System.out.println(m);
            s=m;
            m=s+m;
        }
        System.out.println(m);

    }


}
