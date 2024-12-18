package agenda.sortbyint;
import java.util.*;

public class SortByInt implements Comparator<String>{
    @Override
    public int compare(String userOne, String userTwo){
        Long stringOne = Long.parseLong(userOne);
        Long stringTwo = Long.parseLong(userTwo);
        return stringOne.compareTo(stringTwo);
    }
}