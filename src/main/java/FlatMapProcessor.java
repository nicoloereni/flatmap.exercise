import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMapProcessor {
    public List<Integer[]> pairs(List<Integer> array1, List<Integer> array2) {

        List<Integer[]> result = 
                array1.stream()
                        .flatMap(a -> array2.stream().map(a2 -> new Integer[]{a, a2}))
                .collect(toList());

        return result;
    }
}
