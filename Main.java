public class Main {
    public static void main(String[] args){
        //Objet en utilisant le constructeur numérateur et dénominateur
        Fraction f1 = new Fraction(2,3);
        System.out.println(f1.toString());

        //Objet en utilisant le constructeur numérateur
        Fraction f2 = new Fraction(5);
        System.out.println(f2.toString());

        //Objet en utilisant le constructeur sans argument
        Fraction f3 = new Fraction();
        System.out.println(f3.toString());

        //Méthode FractionToFlottant
        System.out.println(String.format("%.3f", f1.FractionToFlottant()));

        //Méthode AddFraction
        Fraction f4 = f1.AddFraction(f2);
        System.out.println(f4.toString());

        //Methode SimplifyFraction
        Fraction f5 = new Fraction(15,12);
        System.out.println(f5.pgcd(15,12));
        f5.SimplifyFraction();
        System.out.println(f5.toString());

        //
        Fraction f6 = new Fraction(5,4);
        System.out.println(f5 == f6);
    }
}
