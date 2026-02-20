package dev.icelabs.netbox.token;

public class NetboxApiV1Token extends NetboxApiToken {

    private static final String SCHEME = "Token ";

    public NetboxApiV1Token(char[] secret) {
        super(secret);
    }

    public String getAuthString() {
        return SCHEME
                + new String(getSecret());
    }

}
