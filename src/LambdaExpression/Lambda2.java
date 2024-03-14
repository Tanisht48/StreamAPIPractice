package LambdaExpression;

import javax.print.attribute.standard.Destination;

interface  Cab1{
    public String bookCab(String source,String destination);
}
//class Ola implements  Cab1
//{
//    @Override
//    public void bookCab(String source,String destination) {
//        System.out.println("The Cab is Booked from "+ source+" To "+ destination);
//    }
//}
public class Lambda2 {
    public static void main(String[] args) {
        Cab1 cab = (a,b) -> {
            System.out.println("The Cab is Booked from " + a + " To " + b);
            return "The fair price will be 5000";
        };
   String s= cab.bookCab("xyz","ABC");

        System.out.println(s);
    }
}
