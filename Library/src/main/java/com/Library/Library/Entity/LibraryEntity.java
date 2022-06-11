package com.Library.Library.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LibraryEntity {
    @Id
    private int id;

    private String LibraryName;

    private String Address;
    private String OpenStatus;
    private String Phonenumber;


}
