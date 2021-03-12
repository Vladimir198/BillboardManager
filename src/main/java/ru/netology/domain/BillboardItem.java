package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class BillboardItem {
    private int id;
    private String genre;
    private String name;

    public int getId() {
        return id;
    }
}
