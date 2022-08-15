package com.dsi.atfollow.service;

import com.dsi.atfollow.model.Financial;

import java.util.List;

public interface FinancialService {
    List<Financial> getAll();
    Financial getFinancialById(Long id);
    Financial insert(Financial Financial);
    Financial update(Long id,Financial Financial);
    void delete(Long id);
}
