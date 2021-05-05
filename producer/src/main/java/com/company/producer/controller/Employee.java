package com.company.producer.controller;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    public Integer id;

    public String fname;

    public String lname;

    public Double salary;

    public String gender;

}