public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan(fan.getFAST(), true, 10,"yellow");
        Fan fan2 = new Fan(fan.getMEDIUM(), false, 5,"blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
