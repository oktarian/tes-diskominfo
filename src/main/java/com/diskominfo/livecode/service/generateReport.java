// package com.diskominfo.livecode.service;

// import java.io.IOException;
// import java.util.Date;
// import java.util.List;
// import java.util.Optional;

// import javax.servlet.http.HttpServletResponse;

// import org.dom4j.DocumentException;
// import org.springframework.beans.factory.annotation.Autowired;

// import com.diskominfo.livecode.entity.livecodeTransaksi;
// import com.diskominfo.livecode.repository.transaksiRepository;
// import com.lowagie.text.FontFactory;
// import com.lowagie.text.PageSize;
// import com.lowagie.text.Paragraph;
// import com.lowagie.text.pdf.PdfWriter;
// import com.lowagie.text.Document;
// import com.lowagie.text.Font;
// import com.lowagie.text.FontFactory;
// import com.lowagie.text.PageSize;
// import com.lowagie.text.Paragraph;
// import com.lowagie.text.Phrase;
// import com.lowagie.text.pdf.CMYKColor;
// import com.lowagie.text.pdf.PdfPCell;
// import com.lowagie.text.pdf.PdfPTable;
// import com.lowagie.text.pdf.PdfWriter;

// public class generateReport {

//     @Autowired
//     transaksiRepository repository;
//     // List to hold all Students

// 	public void generate(Long id) throws DocumentException, IOException {

// 		// Creating the Object of Document
// 		Document document = new Document(PageSize.A4);

// 		// Getting instance of PdfWriter

// 		// Opening the created document to modify it
// 		document.open();

// 		// Creating font
// 		// Setting font style and size
// 		Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
// 		fontTiltle.setSize(20);
//                     Date now = new Date();


// 		// Creating paragraph
// 		Paragraph paragraph = new Paragraph("Palembang," + now+"<div><h2><b> Nomor: 11223344AAQ <br> perihal :Booking Lapangan "  + ",</b></h2></div>\n\n<div> <h4 style='color: #000000;'>Yth. Kepada Dinas Kepemudaan dan Olahraga</h4></div>\n<div><h4 style='color: #000000;'> <br>"+ "Kota Palembang <br>" +"di- <br>" + "Palembang"+"Bersama ini Kami bermaksud untuk memakai Palayanan Tempat Olahraga  Lapangan" +  userTrans.get().getDetail()+ "Pemerintah Kota Palembang untuk latihan yang<br>"+ "akan dilaksanakan pada: <br>"+ "Hari / Tanngal :" +userTrans.get().getTanggal()+"<br> Waktu :"+userTrans.get().getSesi()+"Tempat: Palembang"+"Lapangan :"+userTrans.get().getDetail()+"Contact Person / WA:"+userTrans.get().getContact()+"<br>Demikian disampaikan permohonan kami, atas perhatian dan pekenannya <br>"+"diucapkan terima kasih. <br>"+"<br><br><br> Pemohon,"+"<br><br><br>"+userTrans.get().getNama());


// 		// Aligning the paragraph in document
// 		paragraph.setAlignment(Paragraph.ALIGN_CENTER);

// 		// Adding the created paragraph in document
// 		document.add(paragraph);

// 		// Creating a table of 3 columns
	
//     }
// }
    