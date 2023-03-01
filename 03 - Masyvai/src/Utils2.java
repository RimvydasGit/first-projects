
public class Utils2 {
	public static int sum(int[] arr) {
        int suma = 0;
        //1,2,3,5,7,8,9,5,4
        for( int index = 0 ; index < arr.length ; index++) {
            suma = suma + arr[index];
        }
        return suma;
    }
    public static float average(int[] arr) {
        float suma = sum(arr);
        return suma / arr.length;
    }
    public static int max(int[] arr) {
        int rezultatas = Integer.MIN_VALUE;
        for( int index = 0 ; index < arr.length ; index++) {
            if( rezultatas < arr[index] ) {
                rezultatas = arr[index];
            }
        }
        return rezultatas;
    }
    public static int min(int[] arr) {
        int rezultatas = Integer.MAX_VALUE;
        return rezultatas;
    }
}
