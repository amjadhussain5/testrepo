package com.wellsfargo.crcd.service;

import com.wellsfargo.crcd.constant.CRCDConstants;
import com.wellsfargo.crcd.util.CRCDUtil;
import com.wellsfargo.crcd.util.PropertiesFileLoader;

import java.util.Arrays;
import java.util.List;

public class CRCDService {

    public void processFile() {
        CRCDUtil crcdUtil = new CRCDUtil();
        String header = crcdUtil.getFileHeader();
        this.validateHeader(header);
    }

    public void validateHeader(String header) {
        List<String> columns = Arrays.asList(header.split(CRCDConstants.PIPE_DELIMITER));
        //get column size from properties file
      //  PropertiesFileLoader.getProperties("column_sequence");
        //validate column size

        //get column names from properties file

        //validate column name
        for(int i=0; i<columns.size(); i++) {
            String column = columns.get(i);
            System.out.println(column);
        }
    }
}
