import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numDecodingsTest1() {
        String s = "12";
        int output = 2;
        Assert.assertEquals(output, new Solution().numDecodings(s));
    }

    @Test
    public void numDecodingsTest2() {
        String s = "226";
        int output = 3;
        Assert.assertEquals(output, new Solution().numDecodings(s));
    }

    @Test
    public void numDecodingsTest3() {
        String s = "06";
        int output = 0;
        Assert.assertEquals(output, new Solution().numDecodings(s));
    }
}
