package Zajavka.Project_calc.service;

import Zajavka.Project_calc.Model.InputData;
import Zajavka.Project_calc.Model.Rate;
import Zajavka.Project_calc.Model.Summary;

import java.util.List;

public interface PrintingService {

    String INTEREST_SUM = "SUMA ODSETEK: ";
    String OVERPAYMENT_PROVISION = "PROWIZJA ZA NADPLATY: ";
    String LOSTS_SUM = "SUMA STRAT ";

    String OVERPAYMENT_REDUCE_RATE = "NADPLATA, ZMNIEJSZENIE RATY";
    String OVERPAYMENT_REDUCE_PERIOD = "NADPLATA, SKROCENIE OKRESU";
    String OVERPAYMENT_FREQUENCY = "SCHEMAT DOKONYWANIA NADPLAT: ";
    String RATE_NUMBER = "NR: ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIAC: ";
    String DATE = "DATA: ";
    String MONTHS = "MIESIECY";
    String RATE = "RATA: ";
    String INTEREST = "ODSETKI: ";
    String CAPITAL = "KAPITAL: ";
    String OVERPAYMENT = "NADPLATA: ";
    String LEFT_AMOUNT = "PKWOTA: ";

    String LEFT_MONTHS = "PMSC: ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";

    String CURRENCY = " ZL ";
    String NEW_LINE = "\n";
    String PERCENT = "% ";

    public void printInputDataInfo(InputData inputData);

    void printRate(List<Rate> rates);

    void printSummary(Summary summary);
}