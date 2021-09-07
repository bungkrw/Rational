import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testAdd2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 1;
        x.add(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testEqual() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(2,4);
        Assert.assertEquals(true,x.equals(y));
    }

    @Test (expected = Rational.Illegal.class)
    public void testConstruct() throws Rational.Illegal {
        Rational x = new Rational(1,0);
    }

    @Test
    //-1
    public void testComparedTo() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(5,1);
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    //0
    public void testComparedTo1() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(2,4);
        Assert.assertEquals(0, x.compareTo(y));
    }

    @Test
    //1
    public void testComparedTo2() throws Rational.Illegal {
        Rational x = new Rational(5,1);
        Rational y = new Rational(1,4);
        Assert.assertEquals(1, x.compareTo(y));
    }

    @Test
    //1
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(4,3);
        Assert.assertEquals("4/3", x.toString());
    }
}
