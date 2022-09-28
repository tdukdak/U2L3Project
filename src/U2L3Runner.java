public class U2L3Runner {
    public static void main(String[] args) {
        Box box = new Box(10.5, 12.6, 15.75);
        double boxVolume = box.volume();
        System.out.println("My box has a volume of " + boxVolume);
        System.out.println("My box has a volume of " + box.volume());
        box.volume();

    }
}
