package com.lavendor.printfarm.material;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "materials")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private MaterialColor color;

    @Column(name = "type")
    private String type;

    @Column(name = "quantity_available")
    private int quantityAvailable;

    @Column(name = "quantity_used")
    private int quantityUsed;
}
