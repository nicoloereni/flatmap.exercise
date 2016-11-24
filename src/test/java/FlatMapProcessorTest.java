import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class FlatMapProcessorTest {

    private FlatMapProcessor flatMapProcessor;

    @Before
    public void setUp() throws Exception {

        flatMapProcessor = new FlatMapProcessor();

    }

    @Test
    public void flatMapProcessorReturnProperResponse() throws Exception {

        Integer[] array1 = {1,2,3};
        Integer[] array2 = {3,4};

        ArrayList<Integer[]> result = flatMapProcessor.pairs(array1, array2);

        assertNotNull(result);
        assertEquals(6, result.size());

    }


}
