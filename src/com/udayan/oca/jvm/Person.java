package com.udayan.oca.jvm;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

 private int id;
 private String name;
 private String surname;
}
