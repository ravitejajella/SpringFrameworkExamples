import com.sun.source.doctree.SeeTree;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Javademo1 {

    public static void main(String[] args) throws IOException {

    /*
    //Example 1 is creating an Integer stream and printing them
        IntStream.range(1,10)
                .forEach(System.out::println);*/
    //Example 2 is creating an Integer stream and skipping few rwo elements and printing them
        IntStream.range(1,10)
                .skip(2)
                .forEach(System.out::println);
    //Example 3 is creating an Integer stream and finding the sum and printing them
        System.out.println(IntStream.range(1,10)
                .sum() );
    //Example 4 is creating an stream of strings and sorting them
        Stream.of("Ravi","Alicia","Hugo")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
     //Example 5 is creting and array from that stream the elements sorting them and filtering them and then print
        String[] s= {"Hugo","Kanut","Alicia","GreenLander"};
        Arrays.stream(s)
                .sorted()
                .filter(x->x.length()>3)
                .filter(x->x.endsWith("a"))
                .filter(x->x.startsWith("A")) //Starting with some number
                .forEach(System.out::println);
     //Example 5 is taking an int array print
        int[] a= {8,9,7,3};
        System.out.println(Arrays.stream(a).map(x->x*x)
                .sorted()
                .max());
                //.forEach(System.out::println);
        //Example 6 is read data from file and give it to stream
        Stream<String> band= Files.lines(Paths.get("intro.txt"));
        band.sorted()
                    .filter(x->x.length()>1)
                    .forEach(System.out::println);
        //Example 6 is read data from file and give it to stream

        Stream<String> band2= Files.lines(Paths.get("data.csv"));
        band2.map(x->x.split(","))
                .skip(1)
                .filter(x->x.length==4)
                .filter(x->Integer.parseInt(x[1])>5)
                .forEach(x->System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]));
        //Example 8 is read data from file aand add it to  a map

        Map<String,Integer> map= new HashMap<>();
        Stream<String> l= Files.lines(Paths.get("data.csv"));
         map=l.skip(1)
                 .map(x->x.split(","))
                 .filter(x->x.length>3)
                 .collect(Collectors.toMap(
                         x->x[0],
                         x->Integer.parseInt(x[1])
                 ) );

         for (String key: map.keySet()){
             System.out.println(key+"   "+map.get(key));
         }
        //Example 8 is read data from file aand add it to  a map

        IntSummaryStatistics summaryStatistics= IntStream.of(5,8,5846,586)
                .summaryStatistics();
        System.out.println(summaryStatistics);




    }
}
