import org.junit.jupiter.api.Test;
import q1.Rational;

import static org.junit.jupiter.api.Assertions.*;
class RationalTest {

    @Test
    void add() {
        Rational rational1=new Rational(1,2);
        Rational rational2=new Rational(1,3);

        Rational result =rational1.add(rational2);

        assertEquals(5,result.getNumerator());
        assertEquals(6,result.getDenominator());
    }

    @Test
    void sub() {
        Rational rational1=new Rational(1,2);
        Rational rational2=new Rational(1,3);

        Rational result =rational1.sub(rational2);

        assertEquals(1,result.getNumerator());
        assertEquals(6,result.getDenominator());
    }

    @Test
    void mul() {
        Rational rational1=new Rational(1,2);
        Rational rational2=new Rational(1,3);

        Rational result =rational1.mul(rational2);

        assertEquals(1,result.getNumerator());
        assertEquals(6,result.getDenominator());

    }

    @Test
    void div() {
        Rational rational1=new Rational(1,2);
        Rational rational2=new Rational(1,3);

        Rational result =rational1.div(rational2);

        assertEquals(3,result.getNumerator());
        assertEquals(2,result.getDenominator());
    }

    @Test
    void toFloatingPoint() {
        Rational rational1=new Rational(1,2);
        Rational rational2=new Rational(1,3);

        Rational result1 = rational1;
        Rational result2 = rational2;

        assertEquals(1,result1.getNumerator());
        assertEquals(2,result1.getDenominator());

        assertEquals(1,result2.getNumerator());
        assertEquals(3,result2.getDenominator());

    }
}