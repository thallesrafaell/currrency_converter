package dev.thallesrafael.currencycoverter.models;

import java.util.Map;

public record MoedasLogDTO(String data, String nomeMoedaDestino, String nomeMoedaOrigem, double valorConvertido, double valorFinal){}

