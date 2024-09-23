public class Fraction extends Number implements Comparable<Fraction>{
    //Déclaration des variables
    private int numerateur,denominateur;
    
    //Déclaration des constantes
    public static final Fraction ZERO = new Fraction(0,1);
    public static final Fraction ONE = new Fraction (1,1);

    //Constructeurs
    //Constructeur avec numérateur et dénominateur
    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    //Constructeur avec numérateur
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
        if (this.denominateur == f.denominateur)
            return new Fraction(this.numerateur + f.numerateur, this.denominateur);

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

    //Override equals (Renvoie true lorsque le contenu est égal)
    @Override
    public boolean equals(Object object) {
    Fraction autreFraction= (Fraction) object;
        if (this.numerateur != autreFraction.numerateur)
            return false;
        if (this.denominateur != autreFraction.denominateur)
            return false;
        return true;
    }

    //Même dénominateur
    public int ppcm(Fraction f){
        int denom_f1 = this.denominateur;
        int denom_f2 = f.denominateur;
        return (denom_f1 * denom_f2) / pgcd(denom_f1, denom_f2);
    }

    public int compareTo(Fraction f) {
        //0 définit égale
        //1 définit la droite est plus grande que la gauche
        //-1 définit la droite est plus petite que la gauche

        int ppcm = ppcm(f);
        int compare_f1 = this.numerateur * (ppcm / this.denominateur);
        int compare_f2 = f.numerateur * (ppcm / f.denominateur);

        if (compare_f1 == compare_f2) return 0;
        if (compare_f1 > compare_f2) return 1;

        return -1; 
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
    public String ShowFraction(){
        return this.numerateur + "/" + this.denominateur;
    }

    @Override
    public String toString(){
        return "Je suis une fraction (" + this.numerateur + "/" + this.denominateur + ")";
    }

    //Héritage de la classe Number
    @Override
    public byte byteValue() {
        return (byte) FractionToFlottant();
    }   

    @Override
    public double doubleValue() {
        return FractionToFlottant();
    }

    @Override
    public float floatValue() {
        return (float) FractionToFlottant();
    }

    @Override
    public int intValue() {
        return (int) FractionToFlottant();
    }
 
    @Override
    public long longValue() {
        return (long) FractionToFlottant();
    }

    @Override
    public short shortValue() {
        return (short) FractionToFlottant();
    }
}