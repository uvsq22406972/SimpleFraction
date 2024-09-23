public class Main {
    public static void main(String[] args){
        //JEU DE TESTS À LA FIN DU MAIN

        //Objet en utilisant le constructeur numérateur et dénominateur
        Fraction f1 = new Fraction(2,3);

        //System.out.println(f1.toString());
        /*
        System.out.println("####################");
        System.out.println("Fraction f1 :");
        System.out.println(f1.ShowFraction());
        */

        //Objet en utilisant le constructeur numérateur
        Fraction f2 = new Fraction(5);
        //System.out.println(f2.toString());
        /*
        System.out.println("####################");
        System.out.println("Fraction f2 :");
        System.out.println(f2.ShowFraction());
        */

        //Objet en utilisant le constructeur sans argument
        Fraction f3 = new Fraction();
        //System.out.println(f3.toString());
        /*
        System.out.println("####################");
        System.out.println("Fraction f3 :");
        System.out.println(f3.ShowFraction());
        */

        //Méthode FractionToFlottant
        /*
        System.out.println("Fraction f3 en décimal :");
        System.out.println(String.format("%.3f", f1.FractionToFlottant()));
        */

        //Méthode AddFraction
        Fraction f4 = f1.AddFraction(f2);
        //System.out.println(f4.toString());
        /*
        System.out.println("####################");
        System.out.println("Fraction f4 :");
        System.out.println(f4.ShowFraction());
        */

        //Methode SimplifyFraction
        Fraction f5 = new Fraction(15,12);
        Fraction f6 = new Fraction(105,84);
        /*
        System.out.println("####################");
        System.out.println("Fraction f5 :");
        System.out.println(f5.ShowFraction());
        System.out.println("PGCD f5 :");
        System.out.println(f5.pgcd(15,12));
        System.out.println("Fraction f5 simplifié :");
        f5.SimplifyFraction();
        System.out.println(f5.ShowFraction());
        System.out.println("####################");
        System.out.println("Fraction f6 :");
        System.out.println(f6.ShowFraction());
        System.out.println("PGCD f6 :");
        System.out.println(f6.pgcd(105,84));
        System.out.println("Fraction f6 simplifié :");
        f6.SimplifyFraction();
        System.out.println(f6.ShowFraction());
        */

        //Test d'égalité (En comparant en forme de fraction, ça aurait été plus simple si on fait une comparaison par décimal)
        /*
        System.out.println("####################");
        System.out.println("Test d'égalité f5 et f6 :");
        System.out.println(f6.equals(f5));
        */

        //Test de comparaison (En comparant en forme de fraction, ça aurait été plus simple si on fait une comparaison par décimal)
        /*
        System.out.println("####################");
        System.out.println("Test de comparaison f5 et f6 :");
        System.out.println(f5.compareTo(f6));
        System.out.println("Test de comparaison f2 et f5 :");
        System.out.println(f2.compareTo(f5));
        System.out.println("Test de comparaison f1 et f5 :");
        System.out.println(f1.compareTo(f5));
        */

        //Test d'héritage
        /*
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
        */

        //JEU DE TESTS (GUIDE DE COMPILATION: javac Main.java, ensuite java -ea Main)
        //FonctionToFlottant()
        assert (f1.FractionToFlottant() <= 0.667);
        assert (f2.FractionToFlottant() == 5.0);
        assert (f3.FractionToFlottant() == 0);
        assert (f4.FractionToFlottant() <= 5.667);
        assert (f5.FractionToFlottant() == 1.25);
        assert (f6.FractionToFlottant() == 1.25);
        System.out.println("Test FonctionToFlottant() OK");

        //AddFraction(Fraction f)
        assert (f1.AddFraction(f1).equals(new Fraction(4,3)));  
        assert (f1.AddFraction(f2).equals(new Fraction(17,3)));
        assert (f1.AddFraction(f3).equals(new Fraction(2,3)));
        assert (f1.AddFraction(f4).equals(new Fraction(19,3)));
        assert (f1.AddFraction(f5).equals(new Fraction(69,36)));
        assert (f1.AddFraction(f6).equals(new Fraction(483,252)));
        System.out.println("Test AddFonction(Fraction f) OK");

        //equals(Object object) et SimplifyFraction()
        f5.SimplifyFraction();
        f6.SimplifyFraction();
        assert(f5.equals(f6));
        assert(f6.equals(f5));
        System.out.println("Test SimplifyFraction() OK");
        System.out.println("Test equals(Object object) OK");

        //compareTo(Fraction f)
        assert(f5.compareTo(f6) == 0);
        assert(f2.compareTo(f5) == 1);
        assert(f1.compareTo(f5) == -1);
        System.out.println("TescompareTo(Fraction f) OK");      
    }
}
