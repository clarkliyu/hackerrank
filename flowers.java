/* Sample program illustrating input/output methods */
import java.util.*;

class flowers{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
      Arrays.sort(C);
      int output=0;
      for(int i=1; i<N/K+1; i++){
          int count = K;
          while(count>0){
              output += i*C[N-(i-1)*K-count];
              count--;
          }
      }
      for(int i=0; i<N%K; i++){
          output += (N/K+1)*C[i];
      }
      int result = 0;
      System.out.println( output );
      
   }
}
