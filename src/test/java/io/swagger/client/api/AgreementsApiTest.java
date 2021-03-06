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
import io.swagger.client.model.AgreementCreationResponse;
import io.swagger.client.model.AgreementDocumentImageUrlsInfo;
import io.swagger.client.model.AgreementDocuments;
import io.swagger.client.model.AgreementEventList;
import io.swagger.client.model.AgreementFormFields;
import io.swagger.client.model.AgreementInfo;
import io.swagger.client.model.AgreementRejectionInfo;
import io.swagger.client.model.AgreementStateInfo;
import io.swagger.client.model.AgreementViewInfo;
import io.swagger.client.model.AgreementViews;
import io.swagger.client.model.CombinedDocumentPagesInfo;
import io.swagger.client.model.DelegatedParticipantSetInfo;
import io.swagger.client.model.DelegationResponse;
import io.swagger.client.model.DetailedParticipantSetInfo;
import io.swagger.client.model.DocumentsImageUrlsInfo;
import io.swagger.client.model.FormFieldMergeInfo;
import io.swagger.client.model.FormFieldPostInfo;
import io.swagger.client.model.FormFieldPutInfo;
import io.swagger.client.model.MembersInfo;
import io.swagger.client.model.Note;
import io.swagger.client.model.ReminderCreationResult;
import io.swagger.client.model.ReminderInfo;
import io.swagger.client.model.RemindersResponse;
import io.swagger.client.model.ShareCreationInfoList;
import io.swagger.client.model.ShareCreationResponseList;
import io.swagger.client.model.SigningUrlResponse;
import io.swagger.client.model.UserAgreements;
import io.swagger.client.model.VisibilityInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgreementsApi
 */
@Ignore
public class AgreementsApiTest {

    private final AgreementsApi api = new AgreementsApi();

    
    /**
     * Adds template fields to an agreement
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTemplateFieldsToAgreementTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        FormFieldPostInfo formFieldPostInfo = null;
        String xApiUser = null;
        AgreementFormFields response = api.addTemplateFieldsToAgreement(authorization, ifMatch, agreementId, formFieldPostInfo, xApiUser);

        // TODO: test validations
    }
    
    /**
     * Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
     *
     * This is a primary endpoint which is used to create a new agreement. An agreement can be created using transientDocument, libraryDocument or a URL. You can create an agreement in one of the 3 mentioned states: a) &lt;b&gt;DRAFT&lt;/b&gt; - to incrementally build the agreement before sending out, b) &lt;b&gt;AUTHORING&lt;/b&gt; - to add/edit form fields in the agreement, c) &lt;b&gt;IN_PROCESS&lt;/b&gt; - to immediately send the agreement. You can use the PUT /agreements/{agreementId}/state endpoint to transition an agreement between the above mentioned states. An allowed transition would follow the following sequence: DRAFT -&gt; AUTHORING -&gt; IN_PROCESS -&gt; CANCELLED.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAgreementTest() throws ApiException {
        String authorization = null;
        AgreementInfo agreementInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        AgreementCreationResponse response = api.createAgreement(authorization, agreementInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Retrieves the latest state view url of agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAgreementViewTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        AgreementViewInfo agreementViewInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        AgreementViews response = api.createAgreementView(authorization, agreementId, agreementViewInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Creates a participantSet to which the agreement is forwarded for taking appropriate action.
     *
     * Participants marked as delegator can call this API endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDelegatedParticipantSetsTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String participantSetId = null;
        DelegatedParticipantSetInfo delegatedParticipantSetInfo = null;
        String xApiUser = null;
        DelegationResponse response = api.createDelegatedParticipantSets(authorization, agreementId, participantSetId, delegatedParticipantSetInfo, xApiUser);

        // TODO: test validations
    }
    
    /**
     * Creates a reminder on the specified participants of an agreement identified by agreementId in the path.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReminderOnParticipantTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        ReminderInfo reminderInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        ReminderCreationResult response = api.createReminderOnParticipant(authorization, agreementId, reminderInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Share an agreement with someone.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createShareOnAgreementTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        ShareCreationInfoList shareCreationInfoList = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        ShareCreationResponseList response = api.createShareOnAgreement(authorization, agreementId, shareCreationInfoList, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Deletes all the documents of an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentsTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.deleteDocuments(authorization, ifMatch, agreementId, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Retrieves the current status of an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgreementInfoTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        AgreementInfo response = api.getAgreementInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Retrieves the latest note associated with an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgreementNoteForApiUserTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        Note response = api.getAgreementNoteForApiUser(authorization, agreementId, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Retrieves the reminders of an agreement, identified by agreementId in the path.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgreementRemindersTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String status = null;
        RemindersResponse response = api.getAgreementReminders(authorization, agreementId, xApiUser, xOnBehalfOfUser, status);

        // TODO: test validations
    }
    
    /**
     * Retrieves agreements for the user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgreementsTest() throws ApiException {
        String authorization = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String externalId = null;
        Boolean showHiddenAgreements = null;
        String cursor = null;
        Integer pageSize = null;
        UserAgreements response = api.getAgreements(authorization, xApiUser, xOnBehalfOfUser, externalId, showHiddenAgreements, cursor, pageSize);

        // TODO: test validations
    }
    
    /**
     * Retrieves the IDs of the documents of an agreement identified by agreementId.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDocumentsTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        String versionId = null;
        String participantId = null;
        String supportingDocumentContentFormat = null;
        AgreementDocuments response = api.getAllDocuments(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, supportingDocumentContentFormat);

        // TODO: test validations
    }
    
    /**
     * Retrieves image urls of all visible pages of all the documents associated with an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDocumentsImageUrlsTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String versionId = null;
        String participantId = null;
        String imageSizes = null;
        Boolean includeSupportingDocumentsImageUrls = null;
        Boolean showImageAvailabilityOnly = null;
        DocumentsImageUrlsInfo response = api.getAllDocumentsImageUrls(authorization, agreementId, xApiUser, xOnBehalfOfUser, versionId, participantId, imageSizes, includeSupportingDocumentsImageUrls, showImageAvailabilityOnly);

        // TODO: test validations
    }
    
    /**
     * Retrieves information of members of the agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMembersTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        Boolean includeNextParticipantSet = null;
        MembersInfo response = api.getAllMembers(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeNextParticipantSet);

        // TODO: test validations
    }
    
    /**
     * Retrieves the audit trail of an agreement identified by agreementId.
     *
     * PDF file stream containing audit trail information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditTrailTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        byte[] response = api.getAuditTrail(authorization, agreementId, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Retrieves a single combined PDF document for the documents associated with an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCombinedDocumentTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        String versionId = null;
        String participantId = null;
        Boolean attachSupportingDocuments = null;
        Boolean attachAuditReport = null;
        byte[] response = api.getCombinedDocument(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, attachSupportingDocuments, attachAuditReport);

        // TODO: test validations
    }
    
    /**
     * Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCombinedDocumentPagesInfoTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        Boolean includeSupportingDocumentsPagesInfo = null;
        CombinedDocumentPagesInfo response = api.getCombinedDocumentPagesInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeSupportingDocumentsPagesInfo);

        // TODO: test validations
    }
    
    /**
     * Retrieves the file stream of a document of an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String documentId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        byte[] response = api.getDocument(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Retrieves image urls of all visible pages of a document associated with an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentImageUrlsTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String documentId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String imageSizes = null;
        Boolean showImageAvailabilityOnly = null;
        Integer startPage = null;
        Integer endPage = null;
        AgreementDocumentImageUrlsInfo response = api.getDocumentImageUrls(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, imageSizes, showImageAvailabilityOnly, startPage, endPage);

        // TODO: test validations
    }
    
    /**
     * Retrieves the events information for an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        AgreementEventList response = api.getEvents(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Retrieves data entered into the interactive form fields of the agreement.
     *
     * This API can only be called by the creator of the agreement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFormDataTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        byte[] response = api.getFormData(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Retrieves details of form fields of an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFormFieldsTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String participantEmail = null;
        AgreementFormFields response = api.getFormFields(authorization, agreementId, xApiUser, participantEmail);

        // TODO: test validations
    }
    
    /**
     * Retrieves the merge info stored with an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMergeInfoTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        FormFieldMergeInfo response = api.getMergeInfo(authorization, agreementId, xApiUser);

        // TODO: test validations
    }
    
    /**
     * Retrieves the participant set of an agreement identified by agreementId in the path.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParticipantSetTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String participantSetId = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String ifNoneMatch = null;
        DetailedParticipantSetInfo response = api.getParticipantSet(authorization, agreementId, participantSetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Retrieves the URL for the e-sign page for the current signer(s) of an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSigningUrlTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        String xApiUser = null;
        String ifNoneMatch = null;
        SigningUrlResponse response = api.getSigningUrl(authorization, agreementId, xApiUser, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Rejects the agreement for a participant.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rejectAgreementForParticipationTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        String participantSetId = null;
        String participantId = null;
        AgreementRejectionInfo agreementRejectionInfo = null;
        String xApiUser = null;
        api.rejectAgreementForParticipation(authorization, ifMatch, agreementId, participantSetId, participantId, agreementRejectionInfo, xApiUser);

        // TODO: test validations
    }
    
    /**
     * Updates the agreement in draft state.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAgreementTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        AgreementInfo agreementInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.updateAgreement(authorization, ifMatch, agreementId, agreementInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Set the merge info for an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAgreementMergeInfoTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        FormFieldMergeInfo formFieldMergeInfo = null;
        String xApiUser = null;
        api.updateAgreementMergeInfo(authorization, ifMatch, agreementId, formFieldMergeInfo, xApiUser);

        // TODO: test validations
    }
    
    /**
     * Updates the state of an agreement identified by agreementId in the path.
     *
     * This endpoint can be used by originator/sender of an agreement to transition between the states of agreement. An allowed transition would follow the following sequence: DRAFT -&gt; AUTHORING -&gt; IN_PROCESS -&gt; CANCELLED.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAgreementStateTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        AgreementStateInfo agreementStateInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.updateAgreementState(authorization, ifMatch, agreementId, agreementStateInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Updates the visibility of an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAgreementVisibilityTest() throws ApiException {
        String authorization = null;
        String agreementId = null;
        VisibilityInfo visibilityInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.updateAgreementVisibility(authorization, agreementId, visibilityInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
    /**
     * Updates form fields of an agreement.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFormFieldsTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        FormFieldPutInfo formFieldPutInfo = null;
        String xApiUser = null;
        AgreementFormFields response = api.updateFormFields(authorization, ifMatch, agreementId, formFieldPutInfo, xApiUser);

        // TODO: test validations
    }
    
    /**
     * Updates the participant set of an agreement identified by agreementId in the path.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateParticipantSetTest() throws ApiException {
        String authorization = null;
        String ifMatch = null;
        String agreementId = null;
        String participantSetId = null;
        DetailedParticipantSetInfo detailedParticipantSetInfo = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        api.updateParticipantSet(authorization, ifMatch, agreementId, participantSetId, detailedParticipantSetInfo, xApiUser, xOnBehalfOfUser);

        // TODO: test validations
    }
    
}
