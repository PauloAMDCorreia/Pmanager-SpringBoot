package com.java360.pmanager;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {


    @GetMapping("/ok")
    public ResponseEntity<String> sayOk() {
        return ResponseEntity.ok("Tudo tranquilo!");
    }

    @PostMapping("/echo")
    public ResponseEntity<String> echo(@RequestBody String value) {
        StringBuilder sb = new  StringBuilder(value);
        return ResponseEntity.ok(sb.reverse().toString()); //reverte os dados do stringbuilder e transforma a resposta em string e responde ao contrário
    }
}
