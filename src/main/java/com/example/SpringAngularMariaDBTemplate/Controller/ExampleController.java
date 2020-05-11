package com.example.SpringAngularMariaDBTemplate.Controller;

import com.example.SpringAngularMariaDBTemplate.Dtos.ExampleDto;
import com.example.SpringAngularMariaDBTemplate.Entities.Example;
import com.example.SpringAngularMariaDBTemplate.Services.ExampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@CrossOrigin
public class ExampleController {

    @Autowired
    private ExampleServiceImpl exampleServiceImpl;

    @PostConstruct
    public void createBaseDataset() {
        // can be deleted
        Example example = new Example();
        exampleServiceImpl.saveOrUpdateExample(example);
    }

    /**
     * @return: all examples from the repository
     */
    @GetMapping("getAllExamples")
    public List<Example> getAllRoofOffers() {
        return exampleServiceImpl.listAllExamples();
    }

    /**
     * Get's an example as JSON from the angular-client and saves it as a new example into the repository
     */
    @PostMapping("saveExample")
    public Boolean saveRoof(@RequestBody ExampleDto exampleDto) {
        exampleServiceImpl.saveOrUpdateExample(new Example(exampleDto.getName()));
        return true;
    }

}
