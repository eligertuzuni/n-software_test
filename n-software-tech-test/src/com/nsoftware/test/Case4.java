package com.nsoftware.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class Case4 {

    public void printProductTitles() {
        try {
            // Step 1: Connect to the API
            URL url = new URL("https://dummyjson.com/products");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Step 2: Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder jsonResponse = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                jsonResponse.append(line);
            }
            in.close();

            // Step 3: Parse and print titles
            JSONObject jsonObject = new JSONObject(jsonResponse.toString());
            JSONArray products = jsonObject.getJSONArray("products");

            System.out.println("Product Titles:");
            for (int i = 0; i < products.length(); i++) {
                JSONObject product = products.getJSONObject(i);
                System.out.println("- " + product.getString("title"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
