package workflowcontrol;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            if(0==i%3||0==i%5)
                continue;
                System.out.println(i);



        }
    }
}
