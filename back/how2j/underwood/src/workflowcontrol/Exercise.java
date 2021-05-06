package workflowcontrol;

public class  Exercise {
    public static void main(String[] args) {
        double l=0.618;
        double minDiff=10;
        int n=0;
        int d=0;
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                float z=(float) i/j;
                double diff=Math.abs(z-l);
                if(diff<minDiff){
                    minDiff=diff;
                    n=i;
                    d=j;
                }
              }
            }
        System.out.println(minDiff+" "+n+" "+d);

        }
    }

