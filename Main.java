public class Main
{
    
   
    public Main()
    {
       Fraction f1= new Fraction(2,3);
                System.out.println(f1.ConsulteNumerateur());
                System.out.println(f1.ConsulteDenominateur());
                System.out.println(f1.FractionEnDouble());
                System.out.println(f1.toString());
            
                  
       Fraction f2= new Fraction(5,6);
       Fraction f3= new Fraction();
       f3=f1.addition(f2);
                System.out.println(f3);
       
                
       boolean test= f1.test_egalite_fraction(f2);
               System.out.println(test); 
                
                
       Fraction f5= new Fraction(10,12);
       Fraction f6= new Fraction(1,2);
       int res;
       res=f5.ComparaisonFraction(f6);
                System.out.println(res);
    }

    
    
}