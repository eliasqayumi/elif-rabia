package com.dsi.atfollow.service.serviceImpl;

import com.dsi.atfollow.model.Financial;
import com.dsi.atfollow.repository.FinancialRepo;
import com.dsi.atfollow.service.FinancialService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialServiceImpl implements FinancialService {
    private FinancialRepo FinancialRepo;

    public FinancialServiceImpl(FinancialRepo FinancialRepo) {
        this.FinancialRepo = FinancialRepo;
    }

    @Override
    public List<Financial> getAll() {
        return this.FinancialRepo.findAll();
    }

    @Override
    public Financial getFinancialById(Long id) {
        return this.FinancialRepo.findById(id).orElseThrow();
    }

    @Override
    public Financial insert(Financial Financial) {
        return this.FinancialRepo.save(Financial);
    }

    @Override
    public Financial update(Long id, Financial financial) {
        Financial currentFinancial = this.FinancialRepo.findById(id).orElseThrow();

        currentFinancial.setTheContractor(financial.getTheContractor());
        currentFinancial.setDiscoveryAndContactFeeEntry(financial.getDiscoveryAndContactFeeEntry());
        currentFinancial.setDiscoveryAndContactFee(financial.getDiscoveryAndContactFee());

        currentFinancial.setDate(financial.getDate());
        currentFinancial.setDateInYear(financial.getDateInYear());
        currentFinancial.setProgressNo(financial.getProgressNo());

        currentFinancial.setExpenditureSF(financial.getExpenditureSF());
        currentFinancial.setFf(financial.getFf());
        currentFinancial.setKDV(financial.getKDV());

        currentFinancial.setTotalPayment(financial.getTotalPayment());
        currentFinancial.setRemainder(financial.getRemainder());
        currentFinancial.setCashRealization(financial.getCashRealization());

        currentFinancial.setAgreement(financial.getAgreement());
        currentFinancial.setPart(financial.getPart());
        return this.FinancialRepo.save(currentFinancial);
    }

    @Override
    public void delete(Long id) {
        this.FinancialRepo.deleteById(id);
    }
}
