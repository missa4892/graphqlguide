package com.graphqlguide.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String id;
    private String name;
//    private List<Class> classes;
}