public class Sorts{
    public static String name(){
	return "01.Chen.Alvin";
    }
    public static void selectionSort(int[] data){
	for(int i = 0; i < data.size(); i ++){
	    int n = 0;
	    int x = i;
	    for(int m = 0; m < data.length - i; m++){
		if (data[i + m] > n){
		    n = data[i + m];
		    x = i + m;
		}
		data[x] = data[i];
		data[i]= n;
	    }
	}
    }
    public static void insertionSort(int[]data){
	for(int first = 0; first < data.length; first++){
	    int temp = data[first];
	    int towhere = first;
	    for(int comparing = first; comparing > 0; comparing --){
		if(temp < data[comparing]){
		    data[comparing + 1] = data[comparing];
		    towhere=comparing;
		} 
	    }
	}
    }
}
