import java.util.*;
public class SuperArray implements Iterable<String>{

    private String [] data;
    private int size;

    public SuperArray(){
	size = 0;
	data = new String[10];
    }
    public SuperArray(int initialCapacity){
	if(initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	size = 0;
	data = new String[initialCapacity];
    }
    public boolean add(String n){
	if (data.length <= size){
	    grow();
	}
	data[size]= n;
	size = size + 1;
	return true;
    }
    public String get(int index) {
	if(index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public int size(){
	return size;
    }
    
    public void grow(){
	String[]another = new String[data.length * 2];
	for (int i = 0; i < size; i ++){
	    another[i] = data[i];
	}
	data = another;
    }
     public void clear(){
	String[] empty = new String[data.length];
	data = empty;
	size = 0;
    }

    public boolean isEmpty(){
	if(size == 0){
	    return true;
	}
	return false;
    }

    public String set(int index, String element){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	data[index] = element;
	return data[index];
    }
    public void add(int index, String element){
	if(index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	if(size == data.length){
	    grow();
	}
	for(int i = size; i != index; i--){
	    data[i] = data[i-1];
	}
	data[index] = element;
	size++;
    }
    public String remove(int index){
	if(index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	String n = data[index];
	for(int i = index; i< size; i++){
	    data[i] = data[i - 1];
	}
	size--;
	return n;
    }
    public String toString(){
	String nums = "[ ";
	for(int i = 0; i < size; i ++){
	    if (i == size - 1){
		nums = nums + data[i];
		    }
	    else{
		nums = nums + data[i] +", ";
		    }
	}
	return nums + "]";
    }

    public String toStringDebug(){
	String nums = "[ ";
	for(int i = 0; i < size; i++){
	    if(i == data.length - 1){
		nums = nums + data[i];
	    }
	    else{
		nums = nums + data[i] +", ";
	    }
	}
	for(int i = 0; i < data.length - size; i++){
	    if(i == data.length - size){
		nums = nums + "_";
	    }
	    else{
		nums = nums + "_, ";
	    }
	}
	return nums + "]";
    }
    public String[] toArray(){
	String [] newer = new String[size];
        for(int i = 0; i < size; i ++){
	    newer[i]= data[i];
	}
	return newer;
    }
    public int indexOf(String n){
	 for(int i = 0; i < size; i ++){
	     if(n.equals(data[i])){
		 return i;
	     }
	 }
	 return -1;
    }
    public int lastIndexOf(String n){
	 for(int i = size; i >= 0; i --){
	     if(n.equals(data[i - 1])){
		 return i - 1;
	     }
	 }
	 return -1;
    }
    public void trimToSize() {
	String[]another = new String[size];
	for (int i = 0; i < size; i ++){
	    another[i] = data[i];
	}
	data = another;
    }

}
