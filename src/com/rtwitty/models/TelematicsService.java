package com.rtwitty.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelematicsService {


    void report(VehicleInfo vehicleInfo) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String fileName = Integer.toString(vehicleInfo.getVIN()) + ".json";
            objectMapper.writeValue(new File(fileName), vehicleInfo);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<VehicleInfo> jsonToOjbect() throws IOException {
        File file = new File(".");
        List<VehicleInfo> fileList = new ArrayList<>();
        for (File f : file.listFiles()) {

            if (f.getName().endsWith(".json")) {
                try {
                    ObjectMapper objectMapper = new ObjectMapper();
                    VehicleInfo vi = objectMapper.readValue(f, VehicleInfo.class);
                    fileList.add(vi);
                } catch (FileNotFoundException ex) {
                    System.out.println("File " + f.getName() + " * not found");
                    ex.printStackTrace();

                }
            }
        }
                return fileList;
            }
        }
