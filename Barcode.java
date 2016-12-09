public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    private int intzip;


    public Barcode(String zip) {
	try{
	    intzip = Integer.parseInt(_zip);
	}
	catch{
	    throw new RuntimeException();
	}
	if(zip.length() =! 5){
	    throw new RuntimeExcpetion();
	}
	_zip = zip;
	_checkDigit = checkSum() % 10;
    }
    public Barcode clone(){
	Barcode bc = new Barcode(_zip);
	return bc;
    }


  private int checkSum(){
      int chksm = 0;
      for(int i = 0; i < 5; i++){
	  chksm += Integer.parseint(_zip.charAt(i));
      }
      return chksm
  }
	 
  public String toString(){
  }




  public int compareTo(Barcode other){}
    return (Integer.valueOf(_zip + _checkDigit)).compareTo(Integer.valueOf(Other._zip + other._checkDigit));
}


