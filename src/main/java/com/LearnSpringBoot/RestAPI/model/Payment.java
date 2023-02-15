package com.LearnSpringBoot.RestAPI.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@Table(name = "payments")

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String amount;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "toAcc")
    @EqualsAndHashCode.Exclude

    @ToString.Exclude
    private User userTo;
    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "fromAcc")
    @EqualsAndHashCode.Exclude

    @ToString.Exclude
    private User userForm;


}
