package com.dsi.atfollow.controller;

import com.dsi.atfollow.model.Financial;
import com.dsi.atfollow.service.FinancialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/financial")
public class FinancialController {
    private FinancialService financialService;

    public FinancialController(FinancialService financialService) {
        this.financialService = financialService;
    }

    @GetMapping
    public ResponseEntity<List<Financial>> getAll() {
        return new ResponseEntity<>(this.financialService.getAll(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Financial> getFinancialById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(this.financialService.getFinancialById(id), OK);
    }

    @DeleteMapping("/{id}")
    public void deleteFinancialById(@PathVariable("id") Long id) {
        this.financialService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Financial> update(@PathVariable("id") Long id, @RequestBody Financial financial) {
        return new ResponseEntity<>(this.financialService.update(id, financial), OK);
    }

    @PostMapping
    public ResponseEntity<Financial> insert(@RequestBody Financial financial) {
        return new ResponseEntity<>(this.financialService.insert(financial), OK);
    }

}
