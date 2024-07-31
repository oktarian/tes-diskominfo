package com.diskominfo.livecode.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.diskominfo.livecode.entity.livecode;
import com.diskominfo.livecode.entity.livecodeTransaksi;
import com.diskominfo.livecode.service.livecodeService;
import com.diskominfo.livecode.service.livecodeTransaksiService;



@RestController
@RequestMapping("/")
public class LiveCodeController {

    @Autowired
    private livecodeService service;

    @Autowired
    private livecodeTransaksiService serviceTrans;
  


    public LiveCodeController(livecodeService service, livecodeTransaksiService serviceTrans) {
        this.service = service;
        this.serviceTrans = serviceTrans;
    }
    /** THIS PATH FOR INFO LAPANGAN**/

    @GetMapping("list-lapangan")
	public ResponseEntity<Object> getAll(){
        List<livecode> lc = service.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(lc);
    }

  
    @PostMapping("add-lapangan")
    public  ResponseEntity<Object> addLiveCode(@RequestBody livecode lc) {
        service.save(lc);
        return ResponseEntity.status(HttpStatus.OK).body("data berhasil di tambahkan");
    }

    @GetMapping("lapangan/{id}")
	public ResponseEntity<Object> getLapanganById(
        @PathVariable Long id
    ){
        Optional<livecode> lc =  service.findById(id);

        return ResponseEntity.status(HttpStatus.OK).body(lc);
    }

    /** THIS PATH FOR TRANSAKSI**/

    @GetMapping("list-transaksi")
	public ResponseEntity<Object> getAllTransaksi(){
        List<livecodeTransaksi> lc = serviceTrans.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(lc);
    }

    @GetMapping("transaksi/{id}")
	public ResponseEntity<Object> getTransaksiById(
        @PathVariable Long id
    ){
        Optional<livecodeTransaksi> lc =  serviceTrans.findById(id);

        return ResponseEntity.status(HttpStatus.OK).body(lc);
    }

    @PostMapping("add-transaksi")
    public  ResponseEntity<Object> addLiveCodeTransaksi(@RequestBody livecodeTransaksi lc) {
        serviceTrans.save(lc);
        return ResponseEntity.status(HttpStatus.OK).body("data berhasil di tambahkan");
    }

    @PutMapping("transaksi/{id}")
    public  ResponseEntity<Object> updateLiveCodeTransaski(
        @PathVariable Long id,
        @RequestBody livecodeTransaksi lc)
     {
        serviceTrans.updateLivecode(lc, id);
        return ResponseEntity.status(HttpStatus.OK).body("data Transaski berhasil di update");
    }
   
   
    @DeleteMapping("transaksi/{id}")
	public ResponseEntity<Object> delete(
        @PathVariable Long id
    ){
        serviceTrans.delete(id);

        return ResponseEntity.status(HttpStatus.OK).body("id berhasil di delete");
    }

  
}
