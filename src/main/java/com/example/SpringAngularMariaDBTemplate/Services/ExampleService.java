package com.example.SpringAngularMariaDBTemplate.Services;

import com.example.SpringAngularMariaDBTemplate.Entities.Example;
import java.util.List;
import java.util.Optional;

public interface ExampleService {

    List<Example> listAllExamples();

    void saveOrUpdateExample(Example example);

    Optional<Example> getExampleById(Long id);

    void deleteExample(Long id);
}
