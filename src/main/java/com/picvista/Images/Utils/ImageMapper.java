package com.picvista.Images.Utils;

import com.picvista.Images.Model.Image;
import com.picvista.Images.Model.ImageDTO;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class ImageMapper {

    public static Image mapImageDTOtoImage(ImageDTO imageDTO) throws IOException {
        String pattern = "dd/MM/yyyy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("en", "GB"));
        String date = simpleDateFormat.format(new Date());
        return new Image(imageDTO.getTitle(), imageDTO.getDescription(), imageDTO.getAuthor(), new Binary(BsonBinarySubType.BINARY,
                imageDTO.getImage().getBytes()), date);
    }
}
