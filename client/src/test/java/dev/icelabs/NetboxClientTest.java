package dev.icelabs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

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
    void api_should_be_reachable_v1() {
        try {
            var status = client.status()
                    .statusRetrieve()
                    .execute();
            assertNotNull(status);
            assertTrue(status.isSuccessful());
        } catch (IOException e) {
            fail(e);
        }
    }

    @Test
    void api_should_be_reachable_v2() {
        var client_with_v2_auth = new NetboxClient(
                env.get("NETBOX_URL"),
                NetboxApiToken.createV2(
                        env.get("V2KEY"), env.get("V2TOKEN")));
        try {
            var status = client_with_v2_auth.status()
                    .statusRetrieve()
                    .execute();
            assertNotNull(status);
            System.out.println(status);
            assertTrue(status.isSuccessful());
        } catch (IOException e) {
            fail(e);
        }
    }

    // @Test
    // void authentication_check_returns_admin_user() {
    // try {
    // var status = client.auth()
    // .authenticationCheckRetrieve()
    // .execute()
    // .body();
    // System.out.println(status);
    // } catch (IOException e) {
    // fail(e);
    // }
    // }

    // @Test
    // void device_id_1_should_have_specific_name() {
    // try {
    // var dev = client.dcim()
    // .dcimDevicesRetrieve(1)
    // .execute()
    // .body();
    // assertEquals("dmi01-akron-rtr01", dev.getName());
    // } catch (IOException e) {
    // fail(e);
    // }
    // }

    // @Test
    // void manufacturer_id_1_should_be_Arista() {
    // var manufacturer = client.dcim().manufacturers().get(1);
    // assertEquals("Arista", manufacturer.getName());
    // }
    //
    // @Test
    // void device_role_id_2_name_should_be_core_switch() {
    // var role = client.dcim().device_roles().get(2);
    // assertEquals("Core Switch", role.getName());
    // }

}
