package java8;

import java.util.Arrays;

import static java.util.stream.Collectors.toList;

/**
 * Created by zhaooyii on 2018/3/6.
 */
public class FlatMapTest {
    public static void main(String[] args) {
    addLog();
    }

    private static void addLog(){
        String[] words={"Hello","World"};
        Arrays.stream(words).map(word->word.split("")).distinct().collect(toList()).stream().forEach(e-> System.out.println(e));
        Arrays.stream(words).map(word -> word.split("")).map(Arrays::stream).distinct().collect(toList());
	    System.out.print("----------1------------------");
	    System.out.print("-------------branch2-------------");
        System.out.println("-----------branch1--------------------");

        System.out.println("master commit");

	    System.out.println("commit from local222");


        System.out.println("continue master dev");

        System.out.println("hot fix 1");

        System.out.println("bug fix 1");
        System.out.println("bug fix 2");
        System.out.println("bug fix 3");
        System.out.println("bug fix 4");


        System.out.println("bug fix 11");
    }
}
