package com.Library.Library.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LibraryDTO {

    @Id
    private int id;

    private String LibraryName;
    private String Address;
    private String OpenStatus;
    private String Phonenumber;

}
