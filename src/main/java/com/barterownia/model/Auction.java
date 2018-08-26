package com.barterownia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "auction")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private AppUser user;

    @OneToOne
    private Item item;

    private LocalDateTime expirationDate;

    private String title;

    @Column(length = 600)
    private String description;

    private Boolean isAccepted;

    private Boolean isSold;


}
