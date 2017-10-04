
/**
 * Write a description of class Fraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction
{
    private final int numérateur;
    private final int dénominateur;
    
    public static final Fraction ZERO = new Fraction();
    public static final Fraction UN = new Fraction(1,1);
    
    /**
     * Constructor for objects of class Fraction
     */
    public Fraction(int numerateur,int denominateur)
    {
        
        this.numérateur = numerateur;
        this.dénominateur = denominateur;
        if(denominateur==0)
        {
        throw new ArithmeticException();
        }
    }
    
    public Fraction(int numerateur)
    {
        this(numerateur,1);
    }
    
    public Fraction()
    {
        this(0,1);
    }

    
     public int ConsulteNumerateur()
     { 
         return numérateur;
     }
     
    public int ConsulteDenominateur()
    {
        return dénominateur; 
    }
    
    
    
        public double FractionEnDouble()
        { 
            double a,b,c;
            a=numérateur;
            b=dénominateur;
            c=a/b;
            
            return c;
        }

        
       public Fraction addition(Fraction f2)
    {
        Fraction resultat;
        resultat= new Fraction(numérateur * f2.dénominateur + f2.numérateur * dénominateur, 
                                    dénominateur * f2.dénominateur );
        return resultat;
    }
        
    public boolean test_egalite_fraction(Fraction f2)
    {
       double val_f1=this.FractionEnDouble();
       double val_f2=f2.FractionEnDouble();
       
       if (val_f1==val_f2)
       return true;
       else
       return false;
        
    }
        
    
    public String toString()
    {
        return (this.numérateur + "/" + this.dénominateur);
        
    }
    
     public int ComparaisonFraction(Fraction f2)
    {
        double val_f1=this.FractionEnDouble();
        double val_f2=f2.FractionEnDouble();
       
       if (val_f1>val_f2)
       return 1;
       else if (val_f1<val_f2)
       return 2;
       else
       return 0;
    }
    
    
    
    
}
