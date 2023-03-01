package dizidekactanevar;

public class Main
{
	public static void main(String[] args) {
           //         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, n, count;
        size = 20;
        
        count = 0;
        
        System.out.print("bir sayı giriniz : ");
        n = kb.nextInt();
        
        
        for (i = 0; i < size; i++)
            if (n == a[i]) { 
                a[i] = count;
                count++;
            }
            System.out.print(n + " den dizide : " + count + " adet var");
	    // if (n == a[i]) 
	      //  count++; ile  de yapılabiilir..
	                        
	    
	  
	}
	            
	
}


