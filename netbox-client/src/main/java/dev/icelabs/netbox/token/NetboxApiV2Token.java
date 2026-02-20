package dev.icelabs.netbox.token;

public class NetboxApiV2Token extends NetboxApiToken {

    private final String key;
    private static final String PREFIX = "nbt_";
    private static final String SCHEME = "";

    protected NetboxApiV2Token(
            String key,
            char[] secret) {
        super(secret);
        this.key = key;
    }

    public String getAuthString() {
        return SCHEME
                + PREFIX
                + key
                + "."
                + new String(getSecret());
    }

}
