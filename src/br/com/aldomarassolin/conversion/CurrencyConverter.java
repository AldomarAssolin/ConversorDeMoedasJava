package br.com.aldomarassolin.conversion;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CurrencyConverter {
    private final String apiUrl = "https://api.exchangerate-api.com/v4/latest/BRL";
    private final JsonObject conversionRates;

    public CurrencyConverter() {
        this.conversionRates = fetchConversionRates();
    }

    private JsonObject fetchConversionRates() {
        try {
            URL url = new URL(apiUrl);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            return new Gson().fromJson(reader, JsonObject.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void getConvertBRLToUSD(double amount) {
        double conversionRate = conversionRates.getAsJsonObject("rates").get("BRL").getAsDouble();
        double result = amount * conversionRate;
        System.out.printf("%.2f BRL equivalem a %.2f USD%n", amount, result);
    }

    public void getConvertUSDToBRL(double amount) {
        double conversionRate = 1 / conversionRates.getAsJsonObject("rates").get("USD").getAsDouble();
        double result = amount * conversionRate;
        System.out.printf("%.2f USD equivalem a %.2f BRL%n", amount, result);
    }

    public void getConvertBRLToEUR(double amount) {
        double conversionRate = conversionRates.getAsJsonObject("rates").get("BRL").getAsDouble();
        double result = amount * conversionRate;
        System.out.printf("%.2f BRL equivalem a %.2f USD%n", amount, result);
    }

    public void getConvertEURToBRL(double amount) {
        double conversionRate = 1 / conversionRates.getAsJsonObject("rates").get("EUR").getAsDouble();
        double result = amount * conversionRate;
        System.out.printf("%.2f EUR equivalem a %.2f BRL%n", amount, result);
    }

}

