public class Fraction{
    //Déclaration des variables
    private int numerateur,denominateur;
    
    //Déclaration des constantes
    public static final Fraction ZERO = new Fraction(0,1);
    public static final Fraction ONE = new Fraction (1,1);

    //Constructeurs
    //Constructeur avec nominateur et dénominateur
    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    //Constructeur avec nominateur
    public Fraction (int numerateur){
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    //Constructeur sans argument
    public Fraction (){
        this.numerateur = 0;
        this.denominateur = 1;
    }
    //Méthode
    //Nombre à virgule flottante
    public double FractionToFlottant(){
        return (double) this.numerateur / (double) this.denominateur;
    }

    //Addition des fractions
    public Fraction AddFraction (Fraction f){
        return new Fraction(f.numerateur*this.denominateur + this.numerateur*f.denominateur, f.denominateur * this.denominateur);
    }

    //Simplification des fractions
    public int pgcd(int num, int denom) {
        while(num != denom){
            if(num > denom)
                num = num - denom;
            else
                denom = denom - num;
        }
        return denom;
    }

    public void SimplifyFraction(){
        int pgcd = pgcd(this.numerateur, this.denominateur);
        this.numerateur = this.numerateur/pgcd;
        this.denominateur = this.denominateur/pgcd;

    }

    //Accesseur
    //Numérateur
    public int getNumerateur(){
        return this.numerateur;
    }
    //Dénominateur
    public int getDenominateur(){
        return this.denominateur;
    }

    //Affichage
    public String toString(){
        return "Je suis une fraction (" + this.numerateur + "/" + this.denominateur + ")";
    }
}