package com.example.setrack.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {

    @Qualifier
    @Autowired
    private DemoRepository demoRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Demo> getAll(){
        return demoRepository.findAll();
    }

    @RequestMapping(value = "/find-one", method = RequestMethod.GET)
    public Demo getOne(@RequestParam long id){
        return demoRepository.findOne(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveDemo(@RequestBody Demo demo){
        Demo d = new Demo();
        d.setName(demo.getName());
        d.setId(demo.getId());
        demoRepository.save(d);
    }

    @RequestMapping(value= "/delete", method = RequestMethod.DELETE)
    public void deleteDemo(@RequestParam long id){
        demoRepository.deleteById(id);
    }


}
