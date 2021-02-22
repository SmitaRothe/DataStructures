package Tests;
import org.junit.Test;
import org.junit.Assert;
import q1.*;
import static org.junit.Assert.*;
public class q1Test {

    @Test
    public void TestseparateString(){
         String Input1=SeparateString.separateString("program");
         Assert.assertEquals("p#r#o#g#r#a#m",Input1);

        String Input2=SeparateString.separateString("abc");
        Assert.assertEquals("a#b#c",Input2);

        String Input3=SeparateString.separateString("ab");
        Assert.assertEquals("a#b",Input3);

        String Input4 =SeparateString.separateString("");
        Assert.assertEquals("Error: The string can not be null",Input4);

    }
}