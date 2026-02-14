package dev.icelabs.netbox.lib;

import java.util.*;

public class PathBuilder {
    private final List<String> parts = new ArrayList<>();

    public PathBuilder addSegment(String part) {
        parts.add(normalize(part));
        return this;
    }

    public PathBuilder addParameter(String param) {
        parts.add("{" + param + "}");
        return this;
    }

    public PathBuilder addArgs(String... args) {
        for (String arg : args) {
            addSegment(arg);
        }
        return this;
    }

    @Override
    public String toString() {
        if (parts.isEmpty()) {
            return "/";
        }
        return "/" + String.join("/", parts) + "/";
    }

    private static String normalize(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return removeStartSlash(removeEndSlash(str));
    }

    private static String removeEndSlash(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    private static String removeStartSlash(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return str;
    }
}
