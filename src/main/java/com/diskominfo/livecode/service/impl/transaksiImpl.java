package com.diskominfo.livecode.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diskominfo.livecode.entity.livecode;
import com.diskominfo.livecode.entity.livecodeTransaksi;
import com.diskominfo.livecode.repository.livecodeRepository;
import com.diskominfo.livecode.repository.transaksiRepository;
import com.diskominfo.livecode.service.livecodeTransaksiService;

@Service
public class transaksiImpl implements livecodeTransaksiService{
      @Autowired
        transaksiRepository repository;

  
    public transaksiImpl(transaksiRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<livecodeTransaksi>findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<livecodeTransaksi> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(livecodeTransaksi lc) {
        repository.save(lc);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

	@Override
	public Optional<livecodeTransaksi> updateLivecode(livecodeTransaksi lc, Long id) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        Optional<livecodeTransaksi> dbLivecode = repository.findById(id);
        livecodeTransaksi _lc = dbLivecode.get();
            _lc.setNama(lc.getNama());
            _lc.setContact(lc.getContact());
            _lc.setCatatan(lc.getCatatan());
            _lc.setDetail(lc.getDetail());
            _lc.setTanggal(now);
            _lc.setTotal(lc.getTotal());
            _lc.setSesi(lc.getSesi());
            _lc.setWaktu(lc.getWaktu());

         repository.save(_lc);

         return null;

	}
}
