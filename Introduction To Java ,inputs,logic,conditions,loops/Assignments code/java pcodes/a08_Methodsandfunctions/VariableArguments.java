import java.util.Arrays;

public class VariableArguments {
   public static void main(String[] args) {
    fun(2,3,5,6,17,07);  // nums inside are arguements ,,fun()name of method  called from main
    }

    static void fun(int...v){          // created parameter to for above called ,method here
        System.out.println(Arrays.toString(v));
    }

}
//Varaibles store the values
//arguments valuepasss into a methods
/