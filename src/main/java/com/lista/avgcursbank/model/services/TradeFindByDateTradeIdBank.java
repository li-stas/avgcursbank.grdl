package com.lista.avgcursbank.model.services;

import com.lista.avgcursbank.model.AO_trade;
import com.lista.avgcursbank.model.Trades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.time.LocalDate;
import java.util.List;

@Component
public class TradeFindByDateTradeIdBank {
    private static final Logger log = LoggerFactory.getLogger(TradeFindByDateTradeIdBank.class);
    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;
    private final EntityManager em;
    private final TradeResult2Trades tradeResult2Trades;

    public TradeFindByDateTradeIdBank(EntityManager em, TradeResult2Trades tradeResult2Trades) {
        this.em = em;
        this.tradeResult2Trades = tradeResult2Trades;
    }

    public List<AO_trade> findByDateTradeIdBank(LocalDate date_trade, Integer id_bank) {
        List<AO_trade> aoTrade = null;
        Trades oTrades = new Trades(SUCCESS_STATUS, CODE_SUCCESS);
        String hql = "select t from AO_trade t WHERE t.date_trade = ?1 and t.id_bank = ?2";

        Query query = em.createNativeQuery(hql);
        query.setParameter(1, date_trade);
        query.setParameter(2, id_bank);

        List<Object[]> aResultList = query.getResultList();

        oTrades = tradeResult2Trades.getTrades(aResultList);
        aoTrade = oTrades.getTrades();
        return aoTrade;

    }
}
