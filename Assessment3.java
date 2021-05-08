//NIRMIT SHAH
//19MIM10049
//ASSESSMENT-3

import java.util.*;
import java.util.stream.Collectors;
public class Assessment3 {

    public static void main(String[] args) {
        //Generating list of Radii of circles
        List<Double> radius= new ArrayList<Double>();
        //adding radii to the list
        Collections.addAll(radius,1.0,2.3,3.5,4.5,5.5,6.7);
        // map() is used to multiply elements of stream
        List<Double> area = radius.stream().map(p-> 3.14*p*p).collect(Collectors.<Double>toList());
        System.out.println("AREA OF CIRCLES :-");
        System.out.println(area);
    }

}
