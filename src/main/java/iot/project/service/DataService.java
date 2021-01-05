package iot.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import iot.project.dbModel.Data;
import iot.project.repository.DataRepository;


import java.util.*;
@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;

    public List<Data> getAllSensors(){
        return dataRepository.findAll();
    }

}

