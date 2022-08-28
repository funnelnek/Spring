package com.funnelnek.spring.specifications.contracts;

public abstract class PropertyFilter<T> {
    protected String name;
    protected String operator;
    protected T value;
}
