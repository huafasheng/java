package Ma;

public class Box {
    public static void main(String[] args) {
        int i = 5;
        short j = 5;
        float f = 5.3f;
        double d = 6.66;
        byte b = 8;
        Integer it1 = i;
        String str2 = it1.toString();
        String str = String.valueOf(i);
        String str3 = String.valueOf(3.14);
        float str4 = Float.parseFloat(str3);
        float str5 = Float.parseFloat("3.1a4");
        System.out.println(str5);
        System.out.println(Byte.MAX_VALUE);
    }
}
