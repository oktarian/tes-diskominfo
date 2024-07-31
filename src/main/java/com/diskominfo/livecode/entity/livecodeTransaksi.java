package com.diskominfo.livecode.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lc_diskominfo_transaksi")
public class livecodeTransaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nama;

    private String contact;

    private String catatan;

    private String detail;

    private Date tanggal;

    private String total;

    private String sesi;
    
    private String waktu;
 
}
