import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Electricity formula => for 1 appliance -> energy = power * time,
//      unit = total energy / 1000
//      Electricity cost = units * unit rate

        double total_energy = 0;
        System.out.println("Enter total appliance: ");
        int appliance = in.nextInt();
        System.out.print("Enter unit rate: ");
        double unit_rate = in.nextDouble();

        System.out.println(ebCost(total_energy, appliance, unit_rate));

//        for(int i = 0; i < appliance; i++){
//            System.out.println("Enter appliance " + i + "'s power, hours, days : ");
//            double power = in.nextDouble();
//            double hours = in.nextDouble();
//            int days = in.nextInt();
//            double energy = power * hours * days;
//            total_energy +=energy;
//        }
//        total_energy = total_energy / 1000;
//        double electricity_cost = total_energy * unit_rate;
//        System.out.println("Electricity cost: " + electricity_cost);
    }
    static double ebCost(double total_energy, double appliance, double unit_rate){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < appliance; i++){
            System.out.println("Enter appliance " + i + "'s power, hours, days : ");
            double power = in.nextDouble();
            double hours = in.nextDouble();
            int days = in.nextInt();
            double energy = power * hours * days;
            total_energy +=energy;
        }
        total_energy = total_energy / 1000;
        double electricity_cost = total_energy * unit_rate;
//        System.out.println("Electricity cost: " + electricity_cost);
        return electricity_cost;
    }
}
