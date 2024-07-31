package com.diskominfo.livecode.service;

import java.util.List;
import java.util.Optional;

import com.diskominfo.livecode.entity.livecode;

public interface livecodeService {
  
    List <livecode> findAll();

    void save(livecode lc);

    Optional <livecode> findById(Long id);

    void delete(long id);

    Optional<livecode> updateLivecode (livecode lc, Long id);
}
