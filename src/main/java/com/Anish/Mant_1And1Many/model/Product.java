package com.Anish.Mant_1And1Many.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Product.class,property="id")
public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String productName;

    @Enumerated(value = EnumType.STRING)
    private CategoryEnum productCategoryEnum;

    @ManyToOne
    @JoinColumn(name = "Fk_order_id" )
    Order order;
}
