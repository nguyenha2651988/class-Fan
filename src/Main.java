public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan(fan.fast,true,10.0,"yellow");
        Fan fan2 = new Fan(fan.medium,false,5.0,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
