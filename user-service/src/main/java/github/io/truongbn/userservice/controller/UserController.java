package github.io.truongbn.userservice.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final RestTemplate restTemplate;
    private static final String ADDRESS_SERVICE_URL = "http://nginx-service:80/api/v1/addresses";
    @GetMapping("/addresses")
    public String getUserAddress() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(ADDRESS_SERVICE_URL, HttpMethod.GET,
                entity, String.class);
        return response.getBody();
    }
}
