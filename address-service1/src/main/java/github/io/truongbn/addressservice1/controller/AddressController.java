package github.io.truongbn.addressservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/addresses")
public class AddressController {
    @GetMapping
    public String getAddress() {
        return "Address Service 1";
    }
}
