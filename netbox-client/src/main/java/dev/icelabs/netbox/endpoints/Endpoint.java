package dev.icelabs.netbox.endpoints;

public abstract class Endpoint<T> {
    protected T service;

    public Endpoint(T service) {
        this.service = service;
    }
}
