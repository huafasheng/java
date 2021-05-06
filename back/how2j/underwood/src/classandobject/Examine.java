package classandobject;


import java.math.BigDecimal;

public class Examine {
    public static void main(String[] args) {
        Item bloodContainer=new Item();
        bloodContainer.setName("血瓶");
        bloodContainer.setPrice(50);
        Item longSword=new Item();
        longSword.setName("长剑");
        longSword.setPrice(350);
        BigDecimal bigDecimal = new BigDecimal("12.236655");
        String string = bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(string);

    }

}
