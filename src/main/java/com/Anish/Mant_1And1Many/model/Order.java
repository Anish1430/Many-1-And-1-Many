package com.Anish.Mant_1And1Many.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserOrder")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Order.class,property="orderId")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer orderId;
     private String orderName;

 @OneToMany(mappedBy = "order")
    List<Product> products;

}
