package FilterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String>longNames = new ArrayList<>();

//       longNames= names.stream().filter(str ->str.length()==7).collect(Collectors.toList());
//
//        System.out.println(longNames);
        names.stream().filter(str ->str.length()==7).forEach(str -> System.out.println(str));
        names.stream().filter(str ->str.length()==7).forEach(System.out::println);

    }
}
