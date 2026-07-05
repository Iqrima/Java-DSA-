public class sum {
    public static void main(String[] args) {
        int result = addNumbers();
        System.out.println(result);
    }

    static int addNumbers() {//// return integer so static int not void ,,use void directly in method while calling if dont want use retun (int,string etc)
        int a = 10;
        int b = 20;
        int ans = a + b;
        return ans;
        }
}
