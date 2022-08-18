package com.CheckingCollections.map;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ObjectsForMap implements Comparator<ObjectsForMap> {
    private int number;
    private String name;
    private String town;

    public ObjectsForMap(int number, String name, String town) {
        this.number = number;
        this.name = name;
        this.town = town;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "ObjectsForMap{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    @Override
    public int compare(ObjectsForMap o1, ObjectsForMap o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectsForMap that = (ObjectsForMap) o;
        return number == that.number && Objects.equals(name, that.name) && Objects.equals(town, that.town);
    }

    @Override
    public Comparator<ObjectsForMap> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<ObjectsForMap> thenComparing(Comparator<? super ObjectsForMap> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<ObjectsForMap> thenComparing(Function<? super ObjectsForMap, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<ObjectsForMap> thenComparing(Function<? super ObjectsForMap, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<ObjectsForMap> thenComparingInt(ToIntFunction<? super ObjectsForMap> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<ObjectsForMap> thenComparingLong(ToLongFunction<? super ObjectsForMap> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<ObjectsForMap> thenComparingDouble(ToDoubleFunction<? super ObjectsForMap> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, town);
    }


}
