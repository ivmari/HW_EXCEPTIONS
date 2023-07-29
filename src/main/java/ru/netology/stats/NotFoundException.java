package ru.netology.stats;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Element with id: " + id + " not found");
    }
}