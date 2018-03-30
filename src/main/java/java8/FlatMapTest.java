package java8;

import java.util.Arrays;

import static java.util.stream.Collectors.toList;

/**
 * Created by zhaooyii on 2018/3/6.
 */
public class FlatMapTest {
    public static void main(String[] args) {
        String[] words={"Hello","World"};
        Arrays.stream(words).map(word->word.split("")).distinct().collect(toList()).stream().forEach(e-> System.out.println(e));
        Arrays.stream(words).map(word -> word.split("")).map(Arrays::stream).distinct().collect(toList());
	System.out.print("----------1------------------");
    }
}
