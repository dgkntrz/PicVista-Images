package com.picvista.Images.Controller;

import com.picvista.Images.Model.Image;
import com.picvista.Images.Model.SortField;
import com.picvista.Images.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    ImageService imageService;

    @PostMapping("/add")
    public String addPhoto(@RequestBody Image image){
        return imageService.addImage(image);
    }

    @GetMapping("/getAllImages")
    public Page<Image> findAllByImage (@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "5") int sizePerPage,
                                       @RequestParam(defaultValue = "ID") SortField sortField,
                                       @RequestParam(defaultValue = "DESC") Sort.Direction sortDirection) {
        Pageable pageable = PageRequest.of(page, sizePerPage, sortDirection, sortField.getDatabaseFieldName());
        return imageService.findAllByPage(pageable);
    }
}
