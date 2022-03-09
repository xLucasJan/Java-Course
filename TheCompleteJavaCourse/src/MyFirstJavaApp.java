public class MyFirstJavaApp {


    public static void main(String[] args) {
        byte numbersOfSeats = 5;
        byte numbersOfDoors = 3;
        byte numbersOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short power = 365;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 2889235923982385L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 152.324453245245343246e-1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("Registration number: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + " g/km");
        System.out.println("Emission sticker: " + emissionSticker + " (Energy efficiency category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km");
        System.out.println("Number of previous owners: " + numbersOfVehicleOwners);
        System.out.println("Number of doors " + numbersOfDoors);
        System.out.println("Number of seats " + numbersOfSeats);

        System.out.println("Conversion");
        short newNumberOfSeats = numbersOfSeats;
        System.out.println("The values of new number of seats: " + newNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + "l/100km");

        int newPower = power;
        System.out.println("The value of the new power: " + newPower + "kW ");
    }




}
