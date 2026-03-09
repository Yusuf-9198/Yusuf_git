/*Array
#1D
1.sum of elements of array 
2.largest and smallest elements
3.reverse of an array 
4.searching an element in an array 
#2D



*/

package college;

public class P4L2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int sumarr=0;
        for(int i=0 ; i<7;i++){
            sumarr=sumarr+arr[i];
          
        }
        System.out.println(sumarr);//1
        int max,min;
        max=min=arr[1];
        for(int j=0; j<7; j++){
            if(arr[j]<min)
                min=arr[j];
            if (arr[j]>max) 
               max=arr[j];
        
    
        }
    
    System.out.println("minimum element is : "+min);
    System.out.println("maximuim element is : "+max);
            
   

        }
    }


    

