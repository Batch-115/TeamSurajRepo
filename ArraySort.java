public class ArraySort{

 public static void main(String args[]){
  
  int[] element={14,0,5,2,0,3,0};
  for(int i=0;i<element.length;i++){
for(int j=0;j<element.length-1;j++){

   if(element[j]==0){
    
   int temp=element[j];
   element[j]=element[j+1];
   element[j+1]=temp;
   }
  }
}
   for(int i : element)
{
System.out.print(i+" ");
}
 }
}