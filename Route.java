import Java.util.ArrayList;

public class Route{
    private double length;
    ArrayList<City> Cities = new ArrayList<City>();
    public Route(ArrayList<City> a){
	Cities = a;
	double length = 0;
    }
}
