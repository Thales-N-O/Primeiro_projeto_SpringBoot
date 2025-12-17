package com.olivth.demo.service;

import com.olivth.demo.dto.ChampionRotation;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

public class ChampionService {

    private static final String API_KEY="RGAPI-68668367-9c67-44cf-b6fc-17b34db050c0";
    private static final String URL=
            "https://br1.api.riotgames.com/lol/platform/v3/champion-rotations"+API_KEY;

        public ChampionRotation getChampionRotation(){
            RestTemplate rest=new RestTemplate();
            return rest.getForObject(URL, ChampionRotation.class);
        }

}
