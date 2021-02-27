package com.wellsfargo.crcd;

import com.wellsfargo.crcd.service.CRCDService;
import com.wellsfargo.crcd.util.CRCDUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CRCDMain {
    public static void main(String args[]) {
        System.out.println("Welcome to CRCD");
        CRCDService crcdService = new CRCDService();
        crcdService.processFile();
    }
}
