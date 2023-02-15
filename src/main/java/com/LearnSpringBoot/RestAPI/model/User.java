package com.LearnSpringBoot.RestAPI.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collection;
import java.util.List;
import java.util.Random;

@Entity
@Data
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "phone"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String username;

    private String identityNumber;
    private String password;

    private String phone;
    @NotNull
    private String fullName;
    private String token;
    private String money = randomMoney(100000,100000000);
    private String accountNo = randomMoney(10000,100000000);


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userTo", cascade = CascadeType.ALL)
    @JsonBackReference
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Payment> paymentTo;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userFrom", cascade = CascadeType.ALL)
    @JsonBackReference
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Payment> paymentFrom;
    String randomMoney(int min,int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min) + min;
        return Integer.toString(randomNumber);
    }
}
