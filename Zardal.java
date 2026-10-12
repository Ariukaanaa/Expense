public class Zardal {
    
    private static int id = 0  ; 
    private int zardal ; 
    private String nameOfZardal ; 

    public Zardal( int zardal , String nameOfZardal )
    {   
        this.id += 1 ; 
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

    public String toString()
    {
        return this.nameOfZardal + "   :   " + this.zardal ; 
    }

}
