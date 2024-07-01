package dev.thallesrafael.currencycoverter.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseStringToLocalDateTime {


        public LocalDateTime parseStringToLocalDateTime(String data) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
            return LocalDateTime.parse(data, formatter);
        }

        public String getDate(){
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String date = now.format(formatter);

            return date;

        }
    }

