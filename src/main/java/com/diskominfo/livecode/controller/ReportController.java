package com.diskominfo.livecode.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.diskominfo.livecode.entity.livecode;
import com.diskominfo.livecode.entity.livecodeTransaksi;
import com.diskominfo.livecode.repository.transaksiRepository;
import com.diskominfo.livecode.service.livecodeService;

import com.diskominfo.livecode.service.livecodeTransaksiService;


// Import statement for IronPDF for Java

import java.io.StringReader;


@RestController
@RequestMapping("/")
public class ReportController {

  @Autowired
    transaksiRepository repository;
  

/* this path not finish */

    @GetMapping("report-booking/{id}")
	public void generatePdf(@PathVariable Long id) throws IOException {
		                    Date now = new Date();
                    Optional<livecodeTransaksi> userTrans = repository.findById(id);

            //PdfDocument pdf = PdfDocument.renderHtmlAsPdf("<h6>"+"Palembang," + now+"<div><h2><b> Nomor: 11223344AAQ <br> perihal :Booking Lapangan "  + ",</b></h2></div>\n\n<div> <h4 style='color: #000000;'>Yth. Kepada Dinas Kepemudaan dan Olahraga</h4></div>\n<div><h4 style='color: #000000;'> <br>"+ "Kota Palembang <br>" +"di- <br>" + "Palembang"+"Bersama ini Kami bermaksud untuk memakai Palayanan Tempat Olahraga  Lapangan" +  userTrans.get().getDetail()+ "Pemerintah Kota Palembang untuk latihan yang<br>"+ "akan dilaksanakan pada: <br>"+ "Hari / Tanngal :" +userTrans.get().getTanggal()+"<br> Waktu :"+userTrans.get().getSesi()+"Tempat: Palembang"+"Lapangan :"+userTrans.get().getDetail()+"Contact Person / WA:"+userTrans.get().getContact()+"<br>Demikian disampaikan permohonan kami, atas perhatian dan pekenannya <br>"+"diucapkan terima kasih. <br>"+"<br><br><br> Pemohon,"+"<br><br><br>"+userTrans.get().getNama()+"</h1>");
            //pdf.saveAs("htmlstring_to_pdf.pdf");                
      
	}
}
