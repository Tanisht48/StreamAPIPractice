package LambdaExpression;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //Example
        Predicate<Integer> p = i ->(i>10);
        System.out.println( p.test(5));

        //Ex2
/*
        Predicate<Integer> p1 = i ->(i>4);
        String s = "hjbszjkxdhbcvjbx";
        System.out.println(p.test(s.length()));*/

        Predicate<String> pS =s -> (s.length()>=6);

      //  System.out.println(pS.test("Wel"));

        String[] names = {"Ankit","Bhavesh","Arjun","Rana Pratap","David","Sung jin Wo"};

        for(String s :names) if(pS.test(s)) System.out.print(s+" ");

         Arrays.stream(names).filter(pS).forEach(System.out::println);


    }
}
