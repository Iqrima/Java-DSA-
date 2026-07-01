public class MethodOverloading {
    public static void main(String[] args) {

    fun(07);
    fun("Iqrima");

    }
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

}
//method overloading means 2 or more methods with same name same return type stuff,but with diff
// parameters and arguements