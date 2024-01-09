package com.picvista.Images.Controller;

import com.picvista.Images.Model.Image;
import com.picvista.Images.Model.ImageDTO;
import com.picvista.Images.Model.SortField;
import com.picvista.Images.Service.ImageService;
import com.picvista.Images.Utils.ImageMapper;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    ImageService imageService;

    @PostMapping("/add")
    public String addPhoto(@ModelAttribute ImageDTO imageDTO) throws IOException {
        Image image = ImageMapper.mapImageDTOtoImage(imageDTO);
        return imageService.addImage(image);
    }

    @GetMapping("/getAllImages")
    public Page<Image> findAllByImage (@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "3") int sizePerPage,
                                       @RequestParam(defaultValue = "ID") SortField sortField,
                                       @RequestParam(defaultValue = "DESC") Sort.Direction sortDirection) {
        Pageable pageable = PageRequest.of(page, sizePerPage, sortDirection, sortField.getDatabaseFieldName());
        return imageService.findAllByPage(pageable);
    }

}
