package dev.thallesrafael.currencycoverter.service;

import dev.thallesrafael.currencycoverter.models.Moedas;
import dev.thallesrafael.currencycoverter.models.MoedasLogDTO;
import dev.thallesrafael.currencycoverter.util.ParseStringToLocalDateTime;

import java.io.FileWriter;
import java.io.IOException;

public class CurrencyConverter {

    public Double converterCurrency(String nomeMoedaDestino, String nomeMoedaOrigem, Double quantidade) throws IOException, InterruptedException {
        ParseStringToLocalDateTime data = new ParseStringToLocalDateTime();
        Moedas moedaDestino = new ApiService().consultarMoedas(nomeMoedaOrigem);
        Log logs = new Log();

        double valorMoedaDestino = moedaDestino.getConvercoes().get(nomeMoedaDestino);
        double valorfinal = quantidade *valorMoedaDestino;
        MoedasLogDTO moedasLogDTO = new MoedasLogDTO(data.getDate(),nomeMoedaDestino,nomeMoedaOrigem,quantidade,valorfinal);
        logs.logs(moedasLogDTO);
        return valorfinal;

    }
}
