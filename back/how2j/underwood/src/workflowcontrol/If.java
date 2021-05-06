package workflowcontrol;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        System.out.println("请输入身高");
        Scanner hs = new Scanner(System.in);
        float height = hs.nextFloat();
        System.out.println("请输入体重");
        Scanner ws = new Scanner(System.in);
        float weight = ws.nextFloat();
        float BMI=weight/(height*height);
        System.out.println(BMI);
        if(BMI<18.5){
            System.out.println("体重过轻"+"BMI指数为"+BMI);

        }else if (18.5<=BMI&&BMI<24){
            System.out.println("体重正常"+"BMI指数为"+BMI);
        }else if (24<=BMI&&BMI<27){
            System.out.println("体重过重"+"BMI指数为"+BMI);
    }else if (27<=BMI&&BMI<30){
            System.out.println("轻度肥胖"+"BMI指数为"+BMI);
        }else if (30<=BMI&&BMI<35){
            System.out.println("轻度肥胖"+"BMI指数为"+BMI);
        }else if (35<=BMI){
            System.out.println("轻度肥胖"+"BMI指数为"+BMI);
        }
    }
}
