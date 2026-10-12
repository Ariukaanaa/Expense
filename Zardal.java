public class Zardal {
    
    private static int id = 1  ; 
    private int zardal ; 
    private String nameOfZardal ; 
    private int idExpense ; 

    public Zardal( int zardal , String nameOfZardal )
    {   
        idExpense = Zardal.id++ ;  
        this.zardal       = zardal ;
        this.nameOfZardal = nameOfZardal  ;  
    }

    public void setZardal( int zardal )
    {
        if( zardal > 0 )
        {
            this.zardal = zardal ; 
        }
    }

    public void setNameOfZardal( String nameOfZardal )
    {
        this.nameOfZardal = nameOfZardal ; 
    }

    public int    getZardal      () { return this.zardal       ;  }
    public String getNameOfZardal() { return this.nameOfZardal ;  }
    public int    getIdExpense   () { return this.idExpense    ;  }

    public String toString()
    {
        return " Number -> " + this.idExpense +  " | "  + this.nameOfZardal + "   :   " + this.zardal ; 
    }

}
