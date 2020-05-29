package pe.edu.upc.demoweb6.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {
    @Column(name = "street", length = 50)
    private String street;

    @Column(name = "city", length = 40)
    private String city;

    @Column(name = "country", length = 40)
    private String country;
}
