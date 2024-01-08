package com.picvista.Images.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SortField {
    ID("imageId"),
    TITLE("title"),
    DATE("uploadDate"),
    AUTHOR("author");

    private final String databaseFieldName;
}