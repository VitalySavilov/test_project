package com.vsdev.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_role")
public class AppUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "R_ID")
    private Long id;
    @Column(name = "U_R_NAME")
    private String name;
}