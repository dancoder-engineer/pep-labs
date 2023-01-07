public class ArraySum {
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr.
     */
    public int sum(int[] arr){
        Integer l = arr.length;
        Integer sum = 0;
        for(Integer i = 0; i < l; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
