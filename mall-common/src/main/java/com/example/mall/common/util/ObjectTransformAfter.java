package com.example.mall.common.util;

@FunctionalInterface
public interface ObjectTransformAfter<T> {

    void after(Object source, T target);
}
