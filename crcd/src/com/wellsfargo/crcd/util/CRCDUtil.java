package com.wellsfargo.crcd.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CRCDUtil {

    public String getFileHeader() {
        String fileName = "C://projects//crcd//test.txt";
        String header = null;

        try{
            header = Files.lines(Paths.get(fileName)).findFirst().get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return header;
    }
}
