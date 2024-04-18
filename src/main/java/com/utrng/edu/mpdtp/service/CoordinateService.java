package com.utrng.edu.mpdtp.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CoordinateService {
    public void readAndPrintCoordinatesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        readAndPrintCoordinates(file);
                    }
                }
            }
        }
    }

    private void readAndPrintCoordinates(File file) {
        System.out.println("Coordinates in file: " + file.getName());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(); // Agregar una línea en blanco entre archivos
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}