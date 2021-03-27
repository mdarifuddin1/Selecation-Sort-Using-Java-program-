
package code;


public class SelectionSort {
    
    public static void main(String[] args) {
        
        int a[] ={ 2,8,46,1,5};
        
        int temp,min_index,i,j;
        
        for(i=0; i<5; i++)
        {
            min_index = i;
            
            for(j= i+1; j<5; j++)
            {
                if(a[j] <a[min_index]){
                    
                    min_index = j;
                }
            }
            
            temp= a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
            
        }
        for(i=0; i<5; i++)
        {
            System.out.print(" " +a[i]); 
        }
       
    }
    
}
