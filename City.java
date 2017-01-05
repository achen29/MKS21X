public class City {
    private String name;
    private double xcor;
    private double ycor;
    public City(String n, double x, double y){
	name = n;
	xcor = x;
	ycor = y;
    }
    public String getname(){
	return name;
    }
    public double distance(City c){
	double xdis = c.xcor - this.xcor;
	double ydis = c.ycor - this.ycor;
	double distance = Math.sqrt(Math.pow(xdis,2) + Math.pow(ydis,2));
	return distance;
    }
    public String toString(){
	return getname();
    }
				  
    
}
