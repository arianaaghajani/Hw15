import org.junit.jupiter.api.Test;

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
    }

    @Test
    void div() {
    }
}