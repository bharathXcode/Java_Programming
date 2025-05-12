package Numbers_PS;

public class OddEvenNumbers {
    public static void main(String[] args) {

       for(int i=1; i<=100; i++){
        if(i%2!=0){                        // (i%2==0) gives even numbers from 1 to 100
          //System.out.print(i+" ");    // for printing only odd or even 


          /*System.out.print(i+" ");      // for printing even and odd in two different columns
            System.out.println(i+1);  */

            System.out.println(i+" "+(i+1));  // for printing even and odd in two different columns
      }
    }
  }
}
