public class MainOperators {
    public static void main(String[] args) {

        //Arithematic operators
        int x=50,y=60;
        boolean a=true, b=false;
        System.out.println("The addition value "+(x+y));
        System.out.println("The Subtraction value "+ (x-y));
        System.out.println("The Division value "+ (x/y));
        System.out.println("The Multiplication value "+(x*y));
        System.out.println("The Module value "+(x%y));

        //Assignment Operators
        int z=x;//z=10
        System.out.println("The originl value of z "+z);
        z+=y;//z=z+y
        System.out.println("The increment value of z "+z);
        z-=y;//z=z+y
        System.out.println("The decrement of z "+z);

        //Relational operators
        System.out.println(x!=y);
        System.out.println(a==b);

        //Logical operators(&,^,&&,||,~)
        //truth table
        //& --> 1 & 1=1
        //or --> 0|0 =0
        //-->     8 4 2 1
        //x=10    1 0 1 0
        //y=2     0 0 1 0
        //        0 0 1 0  = 2
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        
        //unary operators(++,--)
        int d=10;
        d++;//post 
        //System.out.println(d++);10 without d++ before
        //System.out.println("value"+d);   11 with d++ before
        ++d;//pre
        System.out.println(d);
        d--;
        System.out.println(d);
        --d;
        System.out.println(d);

        //ternary operator(condition?true:false)
        String max=(x<y)?"True":"False";
        System.out.println(max);
    }
}
