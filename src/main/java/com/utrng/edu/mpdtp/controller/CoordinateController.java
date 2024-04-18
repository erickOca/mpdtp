package com.utrng.edu.mpdtp.controller;

import com.utrng.edu.mpdtp.service.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coordinates")
public class CoordinateController {

    @Autowired
    private CoordinateService coordinateService;

    @GetMapping("/printAll")
    public void printCoordinatesInDirectory() {
        String directoryPath = "C:/desarrollo/cordenadas";
        coordinateService.readAndPrintCoordinatesInDirectory(directoryPath);
    }
}
