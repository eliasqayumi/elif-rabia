package com.dsi.atfollow.repository;

import com.dsi.atfollow.model.Financial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRepo extends JpaRepository<Financial,Long> {
}
