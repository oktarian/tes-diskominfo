package com.diskominfo.livecode.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diskominfo.livecode.entity.livecodeTransaksi;

@Repository
public interface transaksiRepository extends JpaRepository<livecodeTransaksi, Long>{
        
}
