/*
 * Locations API
 * This document describes the Kiwi.com locations search API.  **Locations** is a simple API used to search, suggest and resolve locations in various situations.  ## Contact us In case you cannot find what you are looking for in this document please contact us directly at **[tequila-support@kiwi.com](mailto:tequila-support@kiwi.com)**.  **The responses are G-zipped and need to be unpacked (response header Content-Encoding: gzip).**
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-10T23:04:34.003+02:00[Europe/Ljubljana]")public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
