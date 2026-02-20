package dev.icelabs.netbox.token;

import java.util.Arrays;

/**
 * NetboxApiToken
 *
 * Represents a secure API token for Netbox authentification.
 */
public abstract class NetboxApiToken implements AutoCloseable {

    public static final NetboxApiV1Token createV1(final String secret) {
        if (secret == null)
            throw new IllegalArgumentException();
        var chars = secret.toCharArray();
        try {
            return new NetboxApiV1Token(chars);
        } finally {
            Arrays.fill(chars, '\0');
        }
    }

    public static final NetboxApiV2Token createV2(final String key, final String secret) {
        if (secret == null)
            throw new IllegalArgumentException();
        var chars = secret.toCharArray();
        try {
            return new NetboxApiV2Token(key, chars);
        } finally {

            Arrays.fill(chars, '\0');
        }
    }

    private final char[] secret;

    private boolean closed = false;

    protected NetboxApiToken(final char[] secret) {
        this.secret = Arrays.copyOf(secret, secret.length);
        Arrays.fill(secret, '\0');
    }

    public abstract String getAuthString();

    @Override
    public final void close() {
        if (!closed && secret != null) {
            Arrays.fill(secret, '\0');
            closed = true;
        }
    }

    public final boolean isClosed() {
        return closed;
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName()
                + "@" + Integer.toHexString(System.identityHashCode(this))
                + "[closed=" + closed + "]";
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    protected final char[] getSecret() {
        if (closed)
            throw new IllegalStateException("Token has been closed");
        return Arrays.copyOf(secret, secret.length);
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("NetboxApiToken cannot be cloned");
    }

}
