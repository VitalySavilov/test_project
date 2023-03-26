package com.vsdev.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "t_user")
public class AppUser {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "INFO_ID")
    private AppUserInfo appUserInfo;
    @ManyToOne
    @JoinColumn(name = "R_ID")
    private AppUserRole role;
}
