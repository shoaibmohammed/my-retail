package com.shoaib.myretail.remoteclient;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

public class RedskyClient {

    public static final String URL = "https://redsky-uat.perf.target.com/redsky_aggregations/v1/redsky/case_study_v1?key=3yUxt7WltYG7MFKPp7uyELi1K40ad2ys&tcin=";

    public static String getProductName(long id) {

        String name = "";

        RestTemplate restTemplate = new RestTemplate();

        String redsky = URL + id;

        try {
            JSONObject jsonObject = new JSONObject(Objects.requireNonNull(restTemplate.getForObject(redsky, String.class)));
            name = jsonObject.getJSONObject("data")
                    .getJSONObject("product")
                    .getJSONObject("item")
                    .getJSONObject("product_description")
                    .getString("title");
        } catch (JSONException err){
            err.printStackTrace();
        }
        
        return name;
    }
}

