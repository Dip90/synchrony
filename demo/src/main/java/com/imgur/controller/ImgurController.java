package com.imgur.controller;

import com.imgur.model.image.upload.UploadImage;
import com.imgur.service.ImgurService;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/image")
public class ImgurController {

    @Autowired
    private ImgurService imgurService;

    @RequestMapping(value = "/view/{imageHash}", method = RequestMethod.GET)
    public String getImageUrl(@PathVariable("imageHash") String imageHash) {
        return imgurService.getImageUrl(imageHash);
    }

    @PostMapping("/upload")
    public ResponseEntity uploadFile(@RequestParam(name = "imageFile") MultipartFile file
            , @RequestParam(name = "imageName") String name,
                                     @RequestParam(name = "title") String title) {




        if (imgurService.uploadImage(getUploadImageData(file,name,title))){
            return new ResponseEntity(HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);

    }


    private UploadImage getUploadImageData(MultipartFile file,String name,String title){
        UploadImage image = new UploadImage();
        image.setMultipartFile(file);
        image.setName(name);
        image.setTitle(title);
        return image;
    }
}