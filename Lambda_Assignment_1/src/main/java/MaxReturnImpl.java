import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxReturnImpl implements MaxReturn {


    @Override
    public int maxOfTwo(Integer x, Integer y) {
        List<Integer> listOfIntegers = Arrays.asList(x, y);

        Integer max = listOfIntegers
                .stream()
                .max((a, b) -> {
                    int greatest = Integer.compare(x,y);
                    return greatest;
                }).orElseThrow(NoSuchElementException::new);
        return max;


    }
}
