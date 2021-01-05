package iot.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import iot.project.dbModel.Data;
import iot.project.service.DataService;
import java.util.*;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/allSensors")
    public List<Data> getAllSensors(){
        return dataService.getAllSensors();
    }
}
