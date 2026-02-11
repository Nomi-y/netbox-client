package dev.icelabs.netbox.lib;

import java.util.*;

public class PathBuilder {
    private final List<String> parts = new ArrayList<>();

    public PathBuilder addSegment(String part) {
        parts.add(normalize(part));
        return this;
    }

    @Override
    public String toString() {
        return "/" + String.join("/", parts) + "/";
    }

    private static String normalize(String str) {
        return removeStartSlash(
                removeEndSlash(str));
    }

    private static String removeEndSlash(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    private static String removeStartSlash(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1, str.length());
        }
        return str;
    }
}
