package com.picvista.Images.Model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Image {

    @Id
    private String imageId;

    private String title;
    private String description;
    private String author;
    private String uploadDate;
    private Binary image;

    public Image(String title, String description, String author, Binary image, String uploadDate) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.image = image;
        this.uploadDate = uploadDate;
    }
}
