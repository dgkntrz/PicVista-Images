package com.picvista.Images.Service;

import com.picvista.Images.Model.Image;
import com.picvista.Images.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public String addImage(Image image){
        return imageRepository.insert(image).getImageId();
    }

    public String deleteImage(String id){
        imageRepository.deleteById(id);
        return id;
    }

    public Page<Image> findAllByPage(Pageable pageable){
        return imageRepository.findAll(pageable);
    }

    public Page<Image> findAllImagesByAuthor(Pageable pageable, String author) {
        return imageRepository.findAllByAuthor(author, pageable);
    }
}
