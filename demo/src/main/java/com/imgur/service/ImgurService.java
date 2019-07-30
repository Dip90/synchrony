package com.imgur.service;

import com.imgur.model.image.upload.UploadImage;
import com.imgur.model.image.view.ViewImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class ImgurService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${imgur.api.url}")
    private String url;

    @Value("${imgur.api.client-id}")
    private String clientId;


    public String getImageUrl(String imageHash){

        String viewImageUrl = url.concat("/").concat(imageHash);

        ResponseEntity<ViewImage> exchange = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity(getAuthHeaders()), ViewImage.class);

        ViewImage image = exchange.getBody();

        return image.getData().getLink();
    }

    public boolean uploadImage(UploadImage uploadImage){

        String uploadImageUrl = url.concat("/").concat("upload");

        HttpEntity<ViewImage> viewImageHttpEntity = new HttpEntity(uploadImage,getAuthHeaders());

        if(restTemplate.exchange(url, HttpMethod.POST, viewImageHttpEntity, ViewImage.class)!=null)
            return true;
        return false;
    }

    private MultiValueMap<String,String> getAuthHeaders(){

        MultiValueMap<String,String> headers = new HttpHeaders();

        headers.add("Authorization","Client-ID "+clientId);

        return headers;
    }


}
