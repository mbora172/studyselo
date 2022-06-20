package studys.seleniumrah.javastream;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    //count of name start with A in list
    @Test
    public void regular(){
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ali","veli","kirk","Adokuz","Elli"));
        int count=0;
        for (String eac:names){
            if(eac.startsWith("A")){
                count++;
            }
        }
        System.out.println("count = " + count);}

    @Test
    public void streamFilter(){
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ali","veli","kirk","Adokuz","Elli"));
      long coun=  names.stream().filter(scan->scan.startsWith("A")).count();//last count bring life
        //how to use filter in Stream API
        System.out.println(coun);
      long d=  Stream.of("Ali","veli","kirk","Adokuz","Elli").filter(scan->
        {
         return    scan.startsWith("A");
                    //return false; //its not work
        }).count();
        System.out.println(d);
       // names.stream().filter(s -> s.length()>3).forEach(s-> System.out.println(s));
        names.stream().filter(s -> s.length()>3).limit(1).forEach(s -> System.out.println(s));
}

@Test
    public void streamMap(){
   Stream.of("Ali","veli","kirk","Adokuz","Elli").filter(scan-> scan.endsWith("i")).map(s->s.toUpperCase())
           .forEach(s -> System.out.println(s));

    //make first letter upper and sorted
    List<String> names=Arrays.asList("Ali","veli","kirk","Adokuz","Elli");
    List<String> names2=Arrays.asList("sdfAli","veli","sdafkirk","Adsafdokuz","Eldsfli");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    Stream<String> stream=Stream.concat(names.stream(),names2.stream());
    //stream.sorted().forEach(s -> System.out.println(s));
   boolean a= stream.anyMatch(s -> s.equalsIgnoreCase("veli"));
    System.out.println(a);
    Assert.assertTrue(a);
    }
    @Test
    public void streamCollect(){

      List<String> list= Stream.of("Ali","veli","kirk","Adokuz","Elli").filter(scan-> scan.endsWith("i")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("list.get(0) = " + list.get(0));

        List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
        //print unique number
        //sort array
        values.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println(values.stream().distinct().sorted().collect(Collectors.toList()).get(2));

    }




}
