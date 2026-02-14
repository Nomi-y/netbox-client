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
    void api_should_be_reachable() {
        assertTrue(client.status().isApiReachable());
    }

    @Test
    void device_id_1_should_have_specific_name() {
        var camera1 = client.dcim().devices().get(1);
        assertEquals("dmi01-akron-rtr01", camera1.getName());
    }

    @Test
    void manufacturer_id_1_should_be_Arista() {
        var manufacturer = client.dcim().manufacturers().get(1);
        assertEquals("Arista", manufacturer.getName());
    }

    @Test
    void device_role_id_2_name_should_be_core_switch() {
        var role = client.dcim().device_roles().get(2);
        assertEquals("Core Switch", role.getName());
    }

}
