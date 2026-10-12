import java.util.ArrayList;
import java.util.List;

public class Secretary
{
    private List<Zardal> liste ;
    
    public Secretary()
    {
        this.liste = new ArrayList<>() ; 
    }

    public void addExpense( Zardal zardal )
    {
        if( zardal != null )
            this.liste.add(zardal) ; 
    }

    public void deleteExpense( Zardal zardal )
    {
        Zardal element = null ; 
        for( Zardal expense : liste )
        {
            if( expense.getNameOfZardal().equals(zardal.getNameOfZardal()) && expense.getZardal() == zardal.getZardal() )
            {
                element = expense ;  
                break ; 
            }

        }
        if( element != null ) liste.remove(element) ; 
        
    }

    public void viewExpense()
    {
        for( Zardal expense : liste )
        {
            System.out.println( expense.toString() ) ; 
        }
    }

    public void viewTotalExpense()
    {
        int total = 0 ; 

        for( Zardal expense : liste )
        {
            total += expense.getZardal() ; 
        }

        System.out.println("Total expnse  === " + total ) ; 
    }
}