package com.MockServer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class AdminEndpoint {

    private AdminService adminService;

    public AdminEndpoint(AdminService adminService){
        this.adminService = adminService;

    }

    @GetMapping(value = "/login")
    public String login(){
        return login();
    }

    @GetMapping(value = "/index")
    public String index()
    {
        return "index";
    }

    @GetMapping(value = "/setServerEnabled")
    public ResponseEntity <String> setServerEnabled(boolean enabled) throws IOException {
        adminService.setServerEnabled(enabled);
        return new ResponseEntity<String>("Succes", HttpStatus.OK);
    }

    @GetMapping(value = "/isServerEnabled")
    public ResponseEntity <String>isServerEnabled() throws IOException{
        boolean isEnabled = adminService.isServerEnabled();
        return new ResponseEntity<String>(""+ isEnabled,HttpStatus.OK);
    }

    @GetMapping(value = "/getCustomer")
    public ResponseEntity<String> getCustomer(){
           String customer = adminService.getCustomer();
        return new ResponseEntity<String>(""+ customer,HttpStatus.OK );

    }
    @GetMapping(value = "/setCustomer")
    public ResponseEntity<String> setCustomer(String customer){
        adminService.setCustomer(customer);
        return new ResponseEntity<String>("Succes",HttpStatus.OK );
    }
}
