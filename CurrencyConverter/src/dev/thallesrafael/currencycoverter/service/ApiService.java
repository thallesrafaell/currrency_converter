package dev.thallesrafael.currencycoverter.service;

import com.google.gson.Gson;
import dev.thallesrafael.currencycoverter.models.Moedas;
import dev.thallesrafael.currencycoverter.models.MoedasDTO;
import dev.thallesrafael.currencycoverter.util.ParseStringToLocalDateTime;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

public class ApiService {

    public Moedas consultarMoedas(String moedas) throws IOException, InterruptedException {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/e81d23187fdbe69f41f564a4/latest/" + moedas);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = null;
        try {
             response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (Exception e){
            System.out.println("Por favor verique se a moeda foi digitada corretamente!");
        }
        ParseStringToLocalDateTime converteLocalTime = new ParseStringToLocalDateTime();
        MoedasDTO dto = new Gson().fromJson(response.body(), MoedasDTO.class);
        LocalDateTime ultimaAtt = converteLocalTime.parseStringToLocalDateTime(dto.time_last_update_utc());
        return new Moedas(dto.base_code(), ultimaAtt, dto.conversion_rates());
    }

}
