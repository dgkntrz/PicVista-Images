package com.picvista.Images.Repository;

import com.picvista.Images.Model.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends MongoRepository<Image, String> {

    Page<Image> findAllByAuthor(String author, Pageable pageable);
}
