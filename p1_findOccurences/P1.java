public class P1 {

     public static void main(String []args){
        int[] list = {2,5,1,6,5,4,3,23,43,2,3};
        findOcurrence(list);
     }
     
     public static void findOcurrence(int[] list) {
         int count;
         int times = 0;
         int[] scoreList = new int[101];
         
         for (count = 0; count < list.length; count++) {
             
            scoreList[list[count]] = scoreList[list[count]]+1;
          
         }
        
        for ( int i = 0; i < scoreList.length; i++) {
            
            System.out.format("%d occurs %d times", i,scoreList[i]);
            System.out.println();
           
        }
    
     }
}

