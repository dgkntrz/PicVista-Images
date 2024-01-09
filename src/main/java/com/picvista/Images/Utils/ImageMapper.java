package com.picvista.Images.Utils;

import com.picvista.Images.Model.Image;
import com.picvista.Images.Model.ImageDTO;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import java.time.LocalDateTime;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ImageMapper {

    public static Image mapImageDTOtoImage(ImageDTO imageDTO) throws IOException {
        return new Image(imageDTO.getTitle(), imageDTO.getDescription(), imageDTO.getAuthor(), new Binary(BsonBinarySubType.BINARY,
                imageDTO.getImage().getBytes()), LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString().replace("T", " "));
    }
}
