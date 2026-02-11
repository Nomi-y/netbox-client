package dev.icelabs.netbox.model.response;

public record AuthenticationResponse(
        int id,
        String username,
        boolean is_active) {

}
