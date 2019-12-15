
package arithmu_package;

import java.util.Comparator;
import javafx.util.Pair;


public class RangeComparator implements Comparator<Pair<Double, Double>>{
    
    public int compare(Pair<Double, Double> p1, Pair<Double, Double> p2){
        return Double.compare(p1.getKey(), p2.getKey());
    }
    
}
