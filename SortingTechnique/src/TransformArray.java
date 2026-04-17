/*
Given an array with N distinct elements,
convert the given array to a form where all elements are in the range from 0 to N-1.
The order of elements is the same, i.e., O is placed in the place of the smallest element,
1 is placed for the second smallest element, ... N-1 is placed for the largest element
*/
class TransformArray {
 public static void print(int[] arr){
  for(int ele : arr){
   System.out.print(ele + " ");
  }
  System.out.println();
 }
 static void main(String[] args) {
  int[] arr= {45,68,2,87,335,46,98};
  print(arr);
  int n = arr.length;
   int x= 0 ;
  for (int i = 0; i < n; i++) {

   int min = Integer.MAX_VALUE;
   int inx = -1;
   for (int j = 0; j < n; j++) {
    if(arr[j] < min && arr[j]>0){
     min = arr[j];
     inx = j;

    }
   }
   arr[inx] = x;
   x--;


  }
//  for(int ele: arr){
//   ele = ele*(-1);
//  } // nhi use kar skte
  for (int i = 0; i < n; i++) {
   arr[i] *= -1;
  }
  print(arr);
 }

}
