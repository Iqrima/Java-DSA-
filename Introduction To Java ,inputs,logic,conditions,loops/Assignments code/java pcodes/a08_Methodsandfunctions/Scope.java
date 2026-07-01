//Important see how functions and intilozations there variables are working in blocks
// where they can be aasigned where not ,,learn carefully also when u come agian here
// read properplyy u will understand .
//pdf will also provided on github


public class Scope{
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "iqrima";



        {
            a = 100;  // here a is reassigned the original ref variable so this a is pointing to 100
                       // a here in this block cannot be intitiazlized with int a again ,,it can only
                       // be updated modified here not outside the block ,,outside can be used inside
                       // u can use this inside outside the block

            //System.out.println(a); this also prints 100
          name = "amarjeet"; // is availbe inside to update modify bcz uses same ref variable same
                            // for a =10;
            //System.out.println(name); print name here and outside too can be used but not intizlized outside

         int c = 99; // u can use this outside block for updating ,printing but u cannot access fully  it
                     // outside the block bcz this c dosent exist outside the block { }
                      // u can create a new assign variable outside
           // System.out.println(c); prints


        }

        int c = 22;//reintialized here bcz it dont know upside c exist
        System.out.println(c);
        System.out.println(a);
        System.out.println(name);








    }

}