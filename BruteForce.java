public class BruteForce{
    private ArrayList<Routes> permutations = new ArrayList<Routes>();
    public BruteForce(ArrayList<City> c){   
    }
    public double[] PermSolver(ArrayList<Cities> a, int b){
	ArrayList<Cities> combolist = a;
	int keeper = b;
	int[]matrix = new int[a.length];
	for (int i = 2; i < combolist.length(); i ++){
	    matrix[matrix.length() - i] = keeper % i; 
	    keeper = keeper - (keeper % i);
	}
	double[]permutation = new double[a.length];
	for(int i = 0; i < a.length; i ++){
	    permutations[i] = combolist.get(matrix[i]);
	    combolist.remove(matrix[i]);
	}
	return permutation;
    }
}
