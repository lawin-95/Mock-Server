package com.MockServer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.security.PublicKey;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminService {
    @Value("${configPath}")
    String path ;
    @Value("${defaultUrl}")
    String defaultUrl;
    @Value("${mockUrl}")
    String mockUrl ;
    @Value("${customer}")
    static String customer="";

    public List <String> getConfigLines() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader((path)));
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        bufferedReader.close();
        return lines;
    }
    public void setServerEnabled(boolean enabled) throws IOException {
        List<String> lines = getConfigLines();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.contains(defaultUrl) && enabled) {
                line = mockUrl;
            } else if (line.contains((mockUrl)) && !enabled) {
                line = defaultUrl;
            }
            lines.set(i,line);

        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        for (String line : lines) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();

        }
            bufferedWriter.close();
    }

    public boolean isServerEnabled() throws IOException{
        List<String> lines = getConfigLines();
        for (String line : lines) {
            if (line.contains(defaultUrl)) {
                return false;
            } else if (line.contains(mockUrl)) {
                return true;
            }

        }
        return false;
    }

    public String getCustomer(){

        return customer;


    }
    public void setCustomer(String cust){
        customer = cust;

    }

}
