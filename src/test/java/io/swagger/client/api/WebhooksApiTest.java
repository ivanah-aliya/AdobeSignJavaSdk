/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.UserWebhooks;
import io.swagger.client.model.WebhookCreationResponse;
import io.swagger.client.model.WebhookInfo;
import io.swagger.client.model.WebhookStateInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Ignore
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    
    /**
     * Creates a webhook.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWebhookTest() throws ApiException {
        String authorization = null;
        WebhookInfo webhookInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        WebhookCreationResponse response = api.createWebhook(authorization, webhookInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Deletes a webhook.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String webhookId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.deleteWebhook(authorization, ifMatch, webhookId, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Retrieves the details of a webhook.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookInfoTest() throws ApiException {
        String authorization = null;
        String webhookId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        WebhookInfo response = api.getWebhookInfo(authorization, webhookId, xApiUser, xOnBehalfOfUser, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Retrieves webhooks for a user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        String authorization = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        Boolean showInActiveWebhooks = null;
        String scope = null;
        String resourceType = null;
        String cursor = null;
        Integer pageSize = null;
        UserWebhooks response = api.getWebhooks(authorization, xApiUser, xOnBehalfOfUser, showInActiveWebhooks, scope, resourceType, cursor, pageSize);

        // TODO: test validations
    }
    
    /**
     * Updates a webhook.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String webhookId = null;
        WebhookInfo webhookInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.updateWebhook(authorization, ifMatch, webhookId, webhookInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Updates the state of a webhook identified by webhookId in the path.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWebhookStateTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String webhookId = null;
        WebhookStateInfo webhookStateInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.updateWebhookState(authorization, ifMatch, webhookId, webhookStateInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
}
