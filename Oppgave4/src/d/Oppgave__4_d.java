package d;



public class Oppgave__4_d
{   
    static int n1=0;
    static int n2=1;
    static int nex=0;
    public static  void fb(int n)
 {
   if(n<10)
    {
      if(n==0)
       {
         System.out.print(" "+n);
         n++;
         fb(n);
       }
        else
           if(n==1)
       {
         System.out.print(" "+n);
         n++;
         fb(n);
       }

        else{ 
            nex=n1+n2;
            System.out.print(" "+nex);
            n1=n2;
            n2=nex;
            n++;
            fb(n);                
            }           
      }        
    }
    public static void main(String[] args)
    {
      fb(0);                                          
    }
}
