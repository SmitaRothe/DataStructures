package Tests;
import org.junit.Assert;
import org.junit.Test;
import q1.*;
import q2.PrintResults;
import q3.CustomArray;

import static org.junit.Assert.*;

public class q3Test {
    @Test
    public void TestCustomArray(){
        int[] dataToAdd1= new int[]{};   //array with no data is not acceptable
        boolean Output1=CustomArray.addAll(dataToAdd1);
        Assert.assertEquals(false,Output1);

        int[] dataToAdd2= new int[]{1,4,5}; // have some data and size is within limit
        boolean Output2=CustomArray.addAll(dataToAdd2);
        Assert.assertEquals(true,Output2);

        int[] dataToAdd3= new int[]{1,4,5,9,10,99,8,6,2,4,5,7}; // bigger size array than we have the size available
        boolean Output3=CustomArray.addAll(dataToAdd3);
        Assert.assertEquals(false,Output3);
    }

}