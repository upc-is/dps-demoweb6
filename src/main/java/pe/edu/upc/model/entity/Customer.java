package pe.edu.upc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}
