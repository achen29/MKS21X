public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    private static String[] bars = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};


    public Barcode(String zip) {
	for (int i = 0; i < 5; i++){
	    if(!(Character.isDigit(zip.charAt(i)))){
		throw new IllegalArgumentException("Needs to be a number");
	    }
	}
	if(zip.length() != 5){
	    throw new IllegalArgumentException("must be 5 digits");
	}
	_zip = zip;
    }
    public int compareTo(Barcode other){
	if (Integer.parseInt(Barcode.toZip(_zip)) - Integer.parseInt(Barcode.toZip(other._zip)) < 0){
	    return - 1;
	}
	else if (Integer.parseInt(Barcode.toZip(_zip)) - Integer.parseInt(Barcode.toZip(other._zip)) > 0){
	    return 1;
	}
	else{
	    return 0;
	}
    }
    public static String toCode(String zip){
	String str = "|";
	for ( int i= 0; i < 5; i ++){
	    str = str + bars[Integer.parseInt(zip.substring(i, i + 1))];
	}
	str = str + "|";
	return str;
    }
    
    public String toString(){
	String Str = _zip + Barcode.toCode(_zip);
	return Str;
    }
    
    public static String toZip(String code){
	int number = 0;
	if(code.length() != 32){
	    throw new IllegalArgumentException("must be 32 characters");
	}
	else if(code.charAt(0) != '|'|| code.charAt(31) != '1'){
	    throw new IllegalArgumentException("must have brackets");
	}
	    
	for (int i = 0; i < 5; i ++){
	    number = number * 10 + ("||:::,:::||,::|:|,::||:,:|::|,:|:|:,:||::,|:::|,|::|:,|:|::".indexOf(code.substring(i * 5 + 1, i * 5 + 6))/6);
	}
	return number + "";
    }
}


