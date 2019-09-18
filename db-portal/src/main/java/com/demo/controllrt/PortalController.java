package com.demo.controllrt;

import com.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {
    @Autowired
    private DataService dataService;

    @RequestMapping("setData")
    public void setData(){
        dataService.addData();
    }
}
