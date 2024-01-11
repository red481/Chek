package com.example.chek.domain.book;


public enum CategoryType {
    NOVEL("novel"), ESSAY("essay"), POETRY("poetry"), HISTORY("history"), SCIENCE("science"), COMPUTER("computer"), COMIC("comic"), OTHER("other");

    private final String type;

    CategoryType(String value) {
        this.type = value;
    }

    CategoryType() {
        this.type = this.name();
    }
}
