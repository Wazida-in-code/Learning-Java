public class JavaPrblmTwo {
    public static void main(String[] args){
        int batteryPower = 1000;
        int flightPower;
        flightPower = 300;

        // int remainingPower = batteryPower-flightPower;
        batteryPower -= flightPower;

        System.out.println("Power Remaining is: " + batteryPower);
        System.out.println("Flight Possible: " + (batteryPower / flightPower));
        System.out.println(batteryPower);
    }
}
