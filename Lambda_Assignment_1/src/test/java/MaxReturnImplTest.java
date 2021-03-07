import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MaxReturnImplTest {

    @org.junit.jupiter.api.Test
    void maxOfTwo() {
        MaxReturnImpl re = new MaxReturnImpl();
        int max = re.maxOfTwo(0,0);
        Assert.assertEquals(0,max);
        int max1 = re.maxOfTwo(-1,0);
        Assert.assertEquals(0,max1);
        int max2 =re.maxOfTwo(15,0);
        Assert.assertEquals(15,max2);
        int max3 =re.maxOfTwo(15,80);
        Assert.assertEquals(80,max3);

    }
}