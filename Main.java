import java.util.Scanner;

public class Main {
    
    private static Secretary secretary = new Secretary() ; 

    public static void main( String[] a )
    {

        boolean repete = true ; 
        Scanner scanner = new Scanner(System.in) ; 

        while( repete ) 
        {
            System.out.println("====== Expense Tracker ======") ; 
            System.out.println("1. Add Expense ") ; 
            System.out.println("2. View Expenses ") ;
            System.out.println("3. View Total Expense ") ;
            System.out.println("4. Delete Expense  ") ; 
            System.out.println(" exit ") ;

            int choix = scanner.nextInt(); 

            switch( choix )
            {
                case 1 -> 
                {
                    Zardal zardal = new Zardal(0 , ""); 
                    System.out.print( " Entrez le nom de depense : ");
                    zardal.setNameOfZardal( scanner.next()); 
                    System.out.print( " Entrez le montant de depense : ");
                    zardal.setZardal( scanner.nextInt()); 
                    secretary.addExpense( zardal  ) ; 
                }
                case 2 -> secretary.viewExpense() ; 
                case 3 -> secretary.viewTotalExpense() ; 
                case 4 ->
                {
                    Zardal zardal = new Zardal(0 , ""); 
                    System.out.print( " Entrez le nom de depense : ");
                    zardal.setNameOfZardal( scanner.next()); 
                    System.out.print( " Entrez le montant de depense : ");
                    zardal.setZardal( scanner.nextInt()); 
                    secretary.deleteExpense(zardal) ;
                } 
                default -> repete = false ; 
                    
            }
        }
       
    }
}
