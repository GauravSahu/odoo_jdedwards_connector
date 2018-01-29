package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;


public class Stock extends ValueObject implements Serializable {
    public Stock() {
    }

    /**
     * Ticker
     * This field contains the stock ticker symbol for the company.
     * EnterpriseOne field length:  10 (Data exceeding this length will be truncated)
     */
    private String stockTickerSymbol;

    /**
     * Stock Exchange
     * This field indicates the exchange where a stock is listed.
     * EnterpriseOne field length:  10 (Data exceeding this length will be truncated)
     */
    private String stockExchange;

    public void setStockTickerSymbol(String stockTickerSymbol) {
        this.stockTickerSymbol = stockTickerSymbol;
    }

    public String getStockTickerSymbol() {
        return stockTickerSymbol;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public String getStockExchange() {
        return stockExchange;
    }
}
