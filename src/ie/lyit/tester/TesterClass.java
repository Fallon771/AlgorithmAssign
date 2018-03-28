package ie.lyit.tester;

/**
 * @author jim
 */
public class TesterClass {
    
    public static void main(String args[]){
        
        int[] data = {45,67,3,23,11,45,66,688};
        insertionSort(data);
        
        for(int x:data){
            System.out.print(x+", ");
        }   
    }
    
    public static void insertionSort(int[] data){
        for(int i = 1;i < data.length;i++){
        int next = data[i];
        int j = i;
        while(j > 0 && data[j-1] > next){
            data[j] = data[j-1];
            j--;
            }
            data[j] = next;
        }
    }
}
