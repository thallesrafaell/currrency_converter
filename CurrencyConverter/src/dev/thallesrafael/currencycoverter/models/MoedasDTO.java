package dev.thallesrafael.currencycoverter.models;

import java.util.Map;

public record MoedasDTO(String base_code, String time_last_update_utc, Map<String, Double> conversion_rates) {
}
