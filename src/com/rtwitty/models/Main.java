package com.rtwitty.models;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleInfo vehicle1Info = new VehicleInfo();
        TelematicsService result = new TelematicsService();

        System.out.println("VIN: ");
        int jsonFileName = scanner.nextInt();
        vehicle1Info.setVIN(jsonFileName);

        System.out.println("Current Odometer: ");
        double odometer = scanner.nextDouble();
        vehicle1Info.setOdometer(odometer);

        System.out.println("Gallons of gas consumed: ");
        double consumption = scanner.nextDouble();
        vehicle1Info.setConsumption(consumption);

        System.out.println("Miles since last Oil Change: ");
        double oilOdometer = scanner.nextDouble();
        vehicle1Info.setOilOdometer(oilOdometer);

        System.out.println("Engine size: ");
        double engineSize = scanner.nextDouble();
        vehicle1Info.setEngineSize(engineSize);

        result.report(vehicle1Info);


        VehicleInfo vehicle2Info = new VehicleInfo();
        vehicle2Info.setVIN(23456789);
        vehicle2Info.setOdometer(23000);
        vehicle2Info.setConsumption(138.8);
        vehicle2Info.setOilOdometer(2500);
        vehicle2Info.setEngineSize(2.0);

        result.report(vehicle2Info);

        VehicleInfo vehicle3Info = new VehicleInfo();
        vehicle3Info.setVIN(34567890);
        vehicle3Info.setOdometer(36000);
        vehicle3Info.setConsumption(120);
        vehicle3Info.setOilOdometer(3000);
        vehicle3Info.setEngineSize(1.6);

        result.report(vehicle3Info);


        }

    }

