package dev.icelabs.netbox.lib;

public class NetboxClientException extends RuntimeException {
    public NetboxClientException(String message) {
        super(message);
    }

    public NetboxClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
