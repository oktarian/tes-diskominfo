package com.diskominfo.livecode.service;

import java.util.List;
import java.util.Optional;

import com.diskominfo.livecode.entity.livecode;
import com.diskominfo.livecode.entity.livecodeTransaksi;

public interface livecodeTransaksiService{
    List <livecodeTransaksi> findAll();

    void save(livecodeTransaksi lc);

    Optional <livecodeTransaksi> findById(Long id);

    void delete(long id);

    Optional<livecodeTransaksi> updateLivecode (livecodeTransaksi lc, Long id);
}
