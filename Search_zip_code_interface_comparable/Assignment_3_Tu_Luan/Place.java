public class Place implements Comparable <Place>  {
    private String zip;
    private String town;
    private String state;


protected Place (String zip,String town, String state ) {
    this.zip = zip;
    this.town = town;
    this.state = state;
}
public String toString() {
    String str = state + ", " + zip+ ", " + town;
    return str;//return the collective values of the objects
}

    public String  getZip() {
	return zip;
    }
   
    protected String getTown() {
	return town;
    }

   
    protected String getState() {
	return state;
    }

   
   

    
    public int compareTo (Place t) {
	//compare to method used here. return different values to be used in sorting
    int inputZip = Integer.parseInt(this.getZip());
    int zip = Integer.parseInt(t.getZip());
    if (inputZip < zip)
        return -1;
    else if (inputZip > zip)
	return 1;
    else
        return 0;
    }
    
    
    
}
