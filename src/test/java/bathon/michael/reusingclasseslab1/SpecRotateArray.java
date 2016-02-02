package bathon.michael.reusingclasseslab1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Created by michaelbathon on 2/2/16.
 */
public class SpecRotateArray {
    RotateArray r1;
    ArrayList<Integer> testList;

    @Before
    public void setUp(){
        r1 = new RotateArray();
        testList = new ArrayList<Integer>();

        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);



    }

    @Test
    public void testRotateMethod(){
        Integer x = 2;

        r1.rotate(testList, 2);


        assertEquals("Test fails if 2 is not the last number after rotating the array",  x, testList.get(4));



    }

}
