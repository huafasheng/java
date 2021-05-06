package workflowcontrol;

public class Exercisess {
    public static void main(String[] args) {
        for (int i = 0; i <100; i++) {
            for (int j = 0; j <100; j++) {
                if((i+j)==8) {
                    for (int k = 0; k < 100; k++) {
                        if((i+k)==14)
                        for (int l = 0; l < 100; l++) {
                            if ((j+l)==10&&(k-l)==6){
                                System.out.println(i+" "+j+" "+k+" "+l);
                            }


                        }
                    }
                }
            }
        }
    }
}
