/**
 * Created by anantgoel on 11/27/16.
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] unsorted = {6, 2, 5, 7, 1, 6, 8, 3, 6, 0, 1, 4, 5};

        for(int i=1; i<unsorted.length; i++){
            for(int j = 0; j<i; j++){
                if(unsorted[i]<unsorted[j]){
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }


    }
}
