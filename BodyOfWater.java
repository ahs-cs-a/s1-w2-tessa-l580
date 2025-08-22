
public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;
    
    public BodyOfWater(String n, int l, double a, boolean s){
        name = n;
        largestDiameter = l;
        avgDepth = a;
        isSaltWater = s;

    }
    public BodyOfWater(String n, double a){
        name = n;
        avgDepth = a;
    }
    public void setName(String n) {
        name = n;
        
    }
    public void setLargestDiameter(int l){
        largestDiameter = l;

    }
    public void printState(){
        System.out.println("name:" + name);
        System.out.println("largest diameter:" + largestDiameter);
        System.out.println("average depth:" + avgDepth);
        System.out.println("is salt water" + isSaltWater);

    }

         
    }

