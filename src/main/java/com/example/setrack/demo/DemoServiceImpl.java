package com.example.setrack.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private DemoRepository demoRepository;

    @Transactional
    public void addDemo(Demo client){
        demoRepository.save(client);
    }
}