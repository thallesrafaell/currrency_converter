package dev.thallesrafael.currencycoverter.service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.thallesrafael.currencycoverter.models.Moedas;
import dev.thallesrafael.currencycoverter.models.MoedasDTO;
import dev.thallesrafael.currencycoverter.models.MoedasLogDTO;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Log {


    public void logs(MoedasLogDTO moedasLogDTO) throws IOException {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("logs.txt", true)))) {
            writer.println(moedasLogDTO.toString());
        }
    }
}



