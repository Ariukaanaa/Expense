import java.util.InputMismatchException;
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
                System.out.println("5. Delete Expense By Id   ") ; 
                System.out.println("6. exit ") ;
                int choix = 0 ; 
                boolean number = true ; 
                 

                try
                {

                    choix = scanner.nextInt();
                    switch( choix )
                    {
                        case 1 -> 
                        {
                            Zardal zardal = new Zardal(0 , ""); 
                            System.out.print( " Entrez le nom de depense : ");
                            zardal.setNameOfZardal( scanner.next());
                            
                            while( number )
                            {
                                try
                                {
                                    System.out.print( " Entrez le montant de depense : ");
                                    zardal.setZardal( scanner.nextInt()); 
                                    number = false ; 
                                } catch( InputMismatchException e ){
                                    System.out.println("Il faut entre un number fils de pute "); 
                                    scanner.next() ; 
                                }
                            }
                            
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
                        case 5 -> 
                        {
                            System.out.println( " Entrez le id de depense que vous voulez supprimer : "); 
                            secretary.deleteById( scanner.nextInt()); 
                        }
                        case 6 -> repete = false ; 
                        default -> 
                        System.out.println(" T'es con ou quoi ???? tu sais pas lire connarddddd !!!!!!!!! Entrez le numero entre 1 et 6 !!!!! ") ; 
                            
                    }
                }
                catch( InputMismatchException e ){
                    System.out.println("Il faut entre un number fils de pute "); 
                    scanner.next();
                }

                
            }
        

        
       
    }
}
