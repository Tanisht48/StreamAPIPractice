package FilterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
//        List<Integer> numberList = new ArrayList<>();
//
//        numberList.add(10);
//        numberList.add(22);
//        numberList.add(24);
//        numberList.add(225);
//        numberList.add(67);
//        numberList.add(54);
//
     List<Integer> numberList = Arrays.asList(10,20,45,12,78,23);
        System.out.println(numberList);
        List<Integer>evenNumberList = new ArrayList<>();

        /*for (int n : numberList) {
            if (n % 2 == 0) evenNumberList.add(n);
        }
        System.out.println(evenNumberList);*/

        //filter

      /* evenNumberList= numberList.stream().filter(n -> n%2==0).collect(Collectors.toList());

        System.out.println(evenNumberList); predicate argument*/

//       // numberList.stream().filter(n ->n%2==0).forEach(n -> System.out.print(n+" ")); consumer argument

        numberList.stream().filter(n ->n%2==0).forEach(System.out::println);
    }
}
