package dev.icelabs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.icelabs.netbox.NetboxClient;
import dev.icelabs.netbox.token.NetboxApiToken;
import io.github.cdimascio.dotenv.Dotenv;

class NetboxClientTest {

    Dotenv env = Dotenv.configure()
            .directory("./")
            .filename(".env")
            .load();
    NetboxApiToken token;
    NetboxClient client;

    @BeforeEach
    void setup() {
        token = NetboxApiToken.createV1(
                env.get("V1TOKEN"));
        client = new NetboxClient(
                env.get("NETBOX_URL"),
                token);
    }

    @Test
    void assert_api_reachable() {
        assertTrue(client.status().isApiReachable());
    }

    @Test
    void fetch_device_with_id_1() {
        var camera1 = client.dcim().devices().get(1);
        assertEquals("camera 1", camera1.name());
    }

    @Test
    void fetch_manufacturer_with_id_1() {
        var manufacturer = client.dcim().manufacturers().get(1);
        assertEquals("sony", manufacturer.name());
    }

}
