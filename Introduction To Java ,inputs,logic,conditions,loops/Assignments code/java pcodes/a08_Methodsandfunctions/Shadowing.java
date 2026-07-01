public class Shadowing {

    static int x = 90;   // CLASS-LEVEL x — available everywhere

    public static void main(String[] args) {
        System.out.println(x);   // prints 90 — local x not created yet

        int x = 40;              // LOCAL x — shadows class x inside main()

        System.out.println(x);   // prints 40 — local x used now

        fun();                   // calls fun()
    }

    static void fun() {
        System.out.println(x);   // prints 90 — no local x here, uses class x
    }
}


//notes made in notebook also pdf available