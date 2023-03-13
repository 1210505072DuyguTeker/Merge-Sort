
import java.util.Random;


public class MergeSort {
    
    
      public static void main(String[] args) {
        int[] dizi= new int[1000]; 
        Random r =new Random();
        
        System.out.println("Siralanmamis Dizi:");
        
        
        for(int i=0;i<1000;i++){
            dizi[i]=r.nextInt(1000);
            System.out.println(dizi[i] + " ");
        }
        System.out.println("\n\n");
        
        mergeSort(dizi,0,dizi.length-1);
        
        System.out.println("Siralanmis Dizi: ");
        for(int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]+"");
        }
        System.out.println("\n\n");
        
    }
    
        
         public static void mergeSort(int[] dizi,int sol,int sag){
            if(sol<sag){
                int orta=(sol+sag)/2;
                mergeSort(dizi,sol,orta);
                mergeSort(dizi,orta+1,sag);
                MergeSort(dizi,sol,orta,sag);
            }
        }
        public static void MergeSort(int[] dizi,int sol,int orta,int sag){
            int[] solDizi= new int[orta-sol+1];
            int[] sagDizi = new int[sag-orta];
            for(int j=0;j<sagDizi.length;j++){
                sagDizi[j]=dizi[orta+1+j];
            }
            for(int i=0;i<solDizi.length;i++){
                solDizi[i]=dizi[sol+1];
            
                
            
               int j=0;
               int m=sol;
                
                while(i<solDizi.length && j<sagDizi.length){
                    if(solDizi[i]<=sagDizi[j]){
                        dizi[m]=solDizi[i];
                        i++;
                    }
                    else{
                        dizi[m]=sagDizi[j];
                        j++;
                    }
                    m++;
                }
                
                while(i<solDizi.length){
                    dizi[m]=solDizi[i];
                    i++;
                    m++;
                }
                while(j<sagDizi.length){
                    dizi[m]=sagDizi[j];
                    j++;
                    m++;
                }
            }
             
        }
         
    
    
}
