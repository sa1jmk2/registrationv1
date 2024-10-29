package com.api;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A   {

    public static void main(String[ ]args) {

        List<Integer> data = Arrays.asList(10,44,55);
        List<Integer> integerStream = data.stream().filter(x -> x%2==0).collect(Collectors.toList());

 System.out.println("  4444 "+ integerStream );
//        Predicate<Integer >s= x-> x > 3;
//        System.out.println(s.test(1 ));




//        List<Employee> employees = Arrays.asList(
//                new Employee(1, "mike"),
//                new Employee(2, "stallin"),
//                new Employee(3, "adam")
//         );
//         List<EmployeeDto> collect = employees.stream().map(A:: mapToDto ).collect(Collectors.toList());
//
//        //List<EmployeeDto> collect = employees.stream().map(e -> mapToDto(e)).collect(Collectors.toList());
//
//
//    }
//
//        static EmployeeDto mapToDto (Employee employee){
//              EmployeeDto dto=new EmployeeDto();
//            dto.setId(employee.getId());
//            dto.setName(employee.getName());
//             return dto;
         }



}
