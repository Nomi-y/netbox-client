package dev.icelabs;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import dev.icelabs.netbox.token.NetboxApiToken;

class NetboxApiTokenTest {

    @Test
    void assert_throws_when_secret_null() {
        assertThrows(IllegalArgumentException.class,
                () -> NetboxApiToken.createV1(null));
    }

}
