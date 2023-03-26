package com.vsdev.mapper;

public interface Mapper<F, T> {
    T map(F object);
}
