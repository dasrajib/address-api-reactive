package com.adu.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("address")
public class Address  {

    @Id
    private Long address_id;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;
    private String county;
    private String country;
    private String zip;
    private LocalDateTime updated_at;
    private LocalDateTime created_at;

}
