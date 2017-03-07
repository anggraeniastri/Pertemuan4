public class jualantas {
      String nama,warna;
            

     public void Chanel () {
            System.out.println ("Chanel : Maroon");
     }

     public void Hermes () {
            System.out.println ("Hermes : Gold" );
     }

     public void Dior () {
            System.out.println ("Dior   : Silver" );
     }
     
     public void Guess () {
            System.out.println ("Guess  : Caramel" );
     }



     public static void main (String[] args) {
            System.out.println ("\n\t-----------------------");
            System.out.println ("\t  Authentic Bag Store");
            System.out.println ("\t-----------------------\n");
            
            

            jualantas original = new jualantas();

             original.nama = "original";
             original.Chanel();
             
             
             original.nama = "original";
             original.Hermes();
             
             
             original.nama = "original";
             original.Dior();
             

             original.nama = "original";
             original.Guess();
             
     }
}




