package ecp2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * 
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * 
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * 
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sumarFracciones(Fraction fr) {
        return new Fraction(((this.getNumerator() * fr.getDenominator()) + (fr.getNumerator() * this.getDenominator())),
                (this.getDenominator() * fr.getDenominator()));
    }

    public Fraction mayor(Fraction frac1) {
        double resp1 = frac1.getNumerator() / frac1.getDenominator();
        double resp2 = this.getNumerator() / this.getDenominator();
        if (resp1 < resp2) {
            return this;
        } else {
            return frac1;
        }
    }

    public boolean equivalente(Fraction fr1) {
        double pro1 = fr1.getNumerator() * this.getDenominator();
        double pro2 = this.getNumerator() * fr1.getDenominator();
        if (pro1 == pro2) {
            return true;
        } else {
            return false;
        }
    }

}
