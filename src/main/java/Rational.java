public class Rational {
    int numerator;
    int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator==0){
            throw new IllegalArgumentException("denominator can not be zero");
        }
        this.denominator = denominator;
    }

    //public Rational(int numerator,int denominator){

    }

}
