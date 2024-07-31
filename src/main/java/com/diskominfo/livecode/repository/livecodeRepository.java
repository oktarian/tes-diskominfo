package com.diskominfo.livecode.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diskominfo.livecode.entity.livecode;

@Repository
public interface livecodeRepository extends JpaRepository<livecode, Long>{
    

}
