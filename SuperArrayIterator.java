import java.util.Iterator
    public class SuperArrayIterator implements Iterator<String>{
    int start,end;
    public SuperArrayIterator(int start, int end){
	this.start = start;
	this.end = end;
    }
    public integer next(){
	if(hasNext()){
	    start ++;
	    return start;
	}else{
	    throw new NoSuchElementException();
	}
    }
    public boolean hasnext(){
	return start < end;
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
