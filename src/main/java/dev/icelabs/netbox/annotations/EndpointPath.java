package dev.icelabs.netbox.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface EndpointPath {
    String value();
}
