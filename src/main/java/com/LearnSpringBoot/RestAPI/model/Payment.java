package com.LearnSpringBoot.RestAPI.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String amount;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "user_id")
    @EqualsAndHashCode.Exclude

    @ToString.Exclude
    private User user;


}
