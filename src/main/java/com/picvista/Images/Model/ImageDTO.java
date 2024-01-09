package com.picvista.Images.Model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ImageDTO {

    private String title;
    private String description;
    private String author;
    private MultipartFile image;

    public ImageDTO(String title, String description, String author, MultipartFile image) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.image = image;
    }
}
