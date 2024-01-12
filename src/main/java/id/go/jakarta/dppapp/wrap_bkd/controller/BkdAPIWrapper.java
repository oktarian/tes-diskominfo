package id.go.jakarta.dppapp.wrap_bkd.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://10.15.82.40:8908")
public class BkdAPIWrapper {
    @GetMapping
    public Object getAll(
                         @RequestParam(required = false) String nrk) throws SQLException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity request = new HttpEntity(headers);
        headers.set("x-Gateway-APIKey", "2786bfe5-4c30-4f0d-9285-0fed2e440f54");
        String username = "dppappdev";
        String password = "dpp4ppd3v1!";
        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor(username, password));
        String url = "https://wsdev.jakarta.go.id/gateway/DataJabatanPegawai/1.0/simpeg/ws/pegdppapp?nrk="+nrk;
        System.out.println(url);

        ResponseEntity<JsonNode> response = restTemplate.exchange(url, HttpMethod.GET, request, JsonNode.class);
        JsonNode responseBody = response.getBody();
        System.out.println(response);
        return responseBody;
    }

    @GetMapping("test")
	public ResponseEntity<Object> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body("TEST DULU");
    }
}
