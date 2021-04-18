package mgrube.homework4.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    public HomeworkController() {
    }
    @GetMapping("/get/{param}")
    ResponseEntity<String> getWithPathVar(@PathVariable String param) {
        return ResponseEntity.ok(param);
    }

    @GetMapping("/get")
    ResponseEntity<String> getWithParam(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/post")
    ResponseEntity<String> postWithParams(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @PutMapping("/put/{param}")
    ResponseEntity<String> putWithPathVar(@PathVariable String param) {
        return ResponseEntity.ok(param);
    }

    @PutMapping("/put")
    ResponseEntity<String> putWithParam(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @DeleteMapping("/delete/{pathVar}")
    ResponseEntity<String> deleteWithPathVar(@PathVariable String pathVar) {
        return ResponseEntity.ok("");
    }
}
