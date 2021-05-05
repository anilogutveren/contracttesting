package com.company.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@SpringBootTest(classes =  ProducerApplication.class)
@RunWith(SpringRunner.class)
public class BaseClass {

    @Autowired
    EmployeeController employeeController;

    @MockBean
    private EmployeeService employeeService;

    @Before
    public void before() {
        final Employee employee = new Employee(1, "Jane", "Doe", 123000.00, "M");
        Mockito.when(this.employeeService.findById(1)).thenReturn(Optional.of(employee));
        RestAssuredMockMvc.standaloneSetup(this.employeeController);
    }
}