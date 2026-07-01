import java.util.Arrays;

public class VariableArgue2 {
    public static void main(String[] args) {

        multiple(17,07,"iqrima","amarjeet");

    }
     static void multiple(int a, int b,String...v){ //variable length v argument always at the end
         System.out.println(Arrays.toString(v));
         System.out.println(a);
         System.out.println(b);
     }
}
