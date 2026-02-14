package dev.icelabs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import dev.icelabs.netbox.token.NetboxApiToken;

class NetboxApiTokenTest {

    @Nested
    class V1TokenTests {

        @Test
        void should_create_v1_token_and_generate_auth_header() {
            try (var token = NetboxApiToken.createV1("my-secret-token")) {
                var authHeader = token.createAuthHeader();

                assertNotNull(authHeader);
                assertFalse(authHeader.isBlank());
                assertFalse(token.isClosed());
            }
        }

        @Test
        void should_throw_exception_when_v1_secret_is_null() {
            assertThrows(IllegalArgumentException.class,
                    () -> NetboxApiToken.createV1(null));
        }
    }

    @Nested
    class V2TokenTests {

        @Test
        void should_create_v2_token_with_key_and_secret() {
            try (var token = NetboxApiToken.createV2("my-key", "my-secret")) {
                var authHeader = token.createAuthHeader();

                assertNotNull(authHeader);
                assertFalse(authHeader.isBlank());
                assertFalse(token.isClosed());
            }
        }

        @Test
        void should_throw_exception_when_v2_secret_is_null() {
            assertThrows(IllegalArgumentException.class,
                    () -> NetboxApiToken.createV2("some-key", null));
        }
    }

    @Nested
    class TokenLifecycleTests {

        @Test
        void should_clear_secret_when_closed() {
            var token = NetboxApiToken.createV1("test-secret");

            token.close();

            assertTrue(token.isClosed());
            assertThrows(IllegalStateException.class,
                    () -> token.createAuthHeader(),
                    "Should not allow operations after close");
        }

        @Test
        @SuppressWarnings("resource")
        void should_auto_close_via_try_with_resources() {
            NetboxApiToken token;
            try (var t = NetboxApiToken.createV1("test")) {
                // INFO: token is implicitly closed after the
                // try-with-resources block finishes
                token = t;
                assertFalse(token.isClosed());
            }
            assertTrue(token.isClosed());
        }

        @Test
        void should_prevent_cloning() {
            var token = NetboxApiToken.createV1("test");

            assertThrows(CloneNotSupportedException.class,
                    () -> token.clone());
        }

        @Test
        void should_treat_tokens_as_distinct_even_with_same_secret() {
            var token1 = NetboxApiToken.createV1("same-secret");
            var token2 = NetboxApiToken.createV1("same-secret");

            assertNotEquals(token1, token2);
            assertNotEquals(token1.hashCode(), token2.hashCode());
        }
    }
}
