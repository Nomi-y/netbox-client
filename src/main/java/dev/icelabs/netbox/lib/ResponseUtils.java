package dev.icelabs.netbox.lib;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import dev.icelabs.netbox.model.common.PagedResponse;

public abstract class ResponseUtils {

    private static final JsonMapper MAPPER = new JsonMapper();

    // public static <T> T parseResponse(String json, Class<T> elementType) {
    // try {
    // return MAPPER.readValue(json, elementType);
    // } catch (JsonProcessingException e) {
    // throw new NetboxClientException("JSON Processing Error", e);
    // }
    // }

    public static <T> PagedResponse<T> parseResponseList(String jsonBody, Class<T> elementType) {
        try {
            return MAPPER.readValue(
                    jsonBody,
                    MAPPER.getTypeFactory()
                            .constructParametricType(PagedResponse.class, elementType));
        } catch (JsonProcessingException e) {
            throw new NetboxClientException("JSON Processing Error", e);
        }

    }

}
