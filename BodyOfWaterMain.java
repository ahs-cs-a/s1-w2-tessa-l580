public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("pacific", 100, 26.5, true);
        BodyOfWater a = new BodyOfWater("atlantic", 50.5);
        b.printState();
        a.printState();
        a.setName("atlantic");
        a.printState();
    }
}
