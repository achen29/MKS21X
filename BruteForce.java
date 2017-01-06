public class BruteForce{
    private ArrayList<Routes> permutations = new ArrayList<Routes>();
    public class(ArrayList<cities> a){
    }
    public void PermSolver(ArrayList<Cities> a, int b){
	ArrayList<Cities> combolist = a;
	int[]matrix = new int[a.length];
	for (int i = 2; i < combolist.length(); i ++){
	    matrix[matrix.length() - i] = b % i; 
	    b = b - (b % i);
    }
}
