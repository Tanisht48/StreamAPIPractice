package FilterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup","forest",null,"book","theatre",null);
        List<String> results = new ArrayList<>();

       results =  words.stream().filter(str -> str != null).collect(Collectors.toList());
       results =  words.stream().filter(Objects::nonNull).collect(Collectors.toList());

       System.out.println(results);
        words.stream().filter(Objects::nonNull).forEach(System.out::println);
        words.stream().filter(str -> str != null).forEach(str ->System.out.println(str));
    }
}
