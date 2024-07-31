package com.diskominfo.livecode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diskominfo.livecode.entity.livecode;
import com.diskominfo.livecode.repository.livecodeRepository;
import com.diskominfo.livecode.service.livecodeService;

@Service
public class livecodeImpl implements livecodeService{
    @Autowired
    livecodeRepository repository;

    public livecodeImpl(livecodeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<livecode>findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<livecode> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(livecode lc) {
        repository.save(lc);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

	@Override
	public Optional<livecode> updateLivecode(livecode lc, Long id) {

        Optional<livecode> dbLivecode = repository.findById(id);
        livecode _lc = dbLivecode.get();
            _lc.setNama(lc.getNama());
            _lc.setJenis(lc.getJenis());
            _lc.setAlamat(lc.getAlamat());

         repository.save(_lc);

         return null;

	}
}
