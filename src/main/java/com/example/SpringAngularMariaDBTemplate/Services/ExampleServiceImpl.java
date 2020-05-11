package com.example.SpringAngularMariaDBTemplate.Services;

import com.example.SpringAngularMariaDBTemplate.Entities.Example;
import com.example.SpringAngularMariaDBTemplate.Repositories.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    @Override
    public void saveOrUpdateExample(Example example) {
        exampleRepository.save(example);
    }

    @Override
    public Optional<Example> getExampleById(Long id) {
        return exampleRepository.findById(id);
    }

    @Override
    public void deleteExample(Long id) {
        exampleRepository.deleteById(id);
    }

    @Override
    public List<Example> listAllExamples() {
        List<Example> examples = new ArrayList<>();
        exampleRepository.findAll().forEach(examples::add);
        return examples;
    }
}
