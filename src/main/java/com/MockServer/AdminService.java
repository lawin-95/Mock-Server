package com.MockServer;

import org.springframework.stereotype.Component;

import java.io.*;
import java.security.PublicKey;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminService {
    final String pfadPath = "C:\\Users\\sidim\\Projekte\\Mock-Server\\src\\main\\resources\\config.ini";
    final String defaultUrl ="serverUrl=https://t2c-vsrv07.de:443/ten2clickService-v433/ten2click";
    final String mockUrl ="serverUrl=localhost:8888/ws";
    static String customer="";

    public List <String> getConfigLines() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader((pfadPath)));
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

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pfadPath));

        for (int i=0; i< lines.size();i++ ){
            String line = lines.get(i);
            bufferedWriter.write(line);
            bufferedWriter.newLine();

        }
            bufferedWriter.close();
    }

    public boolean isServerEnabled() throws IOException{
        List<String> lines = getConfigLines();
        for (int i =0; i < lines.size(); i++){
            String line = lines.get(i);
            if (line.contains(defaultUrl)){
                return false;
            }
            else if(line.contains(mockUrl)){
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
