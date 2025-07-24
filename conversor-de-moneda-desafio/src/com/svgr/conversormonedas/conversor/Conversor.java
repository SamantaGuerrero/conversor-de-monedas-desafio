package com.svgr.conversormonedas.conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public static double convertir(String base, String destino, double cantidad) throws IOException, InterruptedException {
        String url = String.format("https://v6.exchangerate-api.com/v6/a6f4b4d0dfebd355c012971c/pair/%s/%s/%.2f", base, destino, cantidad);

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Error HTTP: " + response.statusCode());
        }

        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

        if (!jsonObject.get("result").getAsString().equals("success")) {
            throw new IOException("Error en la conversión: " + jsonObject.toString());
        }

        return jsonObject.get("conversion_result").getAsDouble();
    }
}
