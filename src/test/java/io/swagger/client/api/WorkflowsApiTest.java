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
import io.swagger.client.model.UserWorkflows;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowsApi
 */
@Ignore
public class WorkflowsApiTest {

    private final WorkflowsApi api = new WorkflowsApi();

    
    /**
     * Retrieves workflows for a user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowsTest() throws ApiException {
        String authorization = null;
        String xApiUser = null;
        Boolean includeDraftWorkflows = null;
        Boolean includeInactiveWorkflows = null;
        String groupId = null;
        UserWorkflows response = api.getWorkflows(authorization, xApiUser, includeDraftWorkflows, includeInactiveWorkflows, groupId);

        // TODO: test validations
    }
    
}
