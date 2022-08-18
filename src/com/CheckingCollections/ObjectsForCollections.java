package com.CheckingCollections;

import java.util.Objects;

public class ObjectsForCollections {

    private String name;
    private String album;
    private int year;

    ObjectsForCollections(){};

    public ObjectsForCollections(String name, String album, int year) {
        this.name = name;
        this.album = album;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ObjectsForCollections{" +
                "name='" + name + '\'' +
                ", album='" + album + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectsForCollections that = (ObjectsForCollections) o;
        return year == that.year && Objects.equals(name, that.name) && Objects.equals(album, that.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, album, year);
    }
}
