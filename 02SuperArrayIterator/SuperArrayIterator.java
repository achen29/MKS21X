import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
    private int i;
    private SuperArray suparry;
    public SuperArrayIterator(SuperArray theone){
	i = 0;
	suparry = theone;
    }
    public String next(){
	if(hasNext()){
	    i++;
	    return suparry[i-1];
	}
	else{
	    throw new NoSuchElementException();
	}
    }
     public boolean hasNext(){
	return i+1 < suparry.size();
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
	    
	
