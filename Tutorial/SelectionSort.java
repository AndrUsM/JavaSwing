import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
    public  SelectionSort(){
        int [] array = {1,2,4,3,4,68,235,-90};
        for(int i = 0; i < array.length; i++) {

            int min = array[i];
            int min_i = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        //bubble sort

        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( array[j] > array[j+1] ){
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
            }
         }
        }

        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i: array){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        new SelectionSort();
    }
}
