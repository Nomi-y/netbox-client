package dev.icelabs.netbox.api;

import java.util.List;

import dev.icelabs.netbox.model.*;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ExtrasApi {
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/bookmarks/")
    Call<Void> extrasBookmarksBulkDestroy(
            @retrofit2.http.Body List<BookmarkRequest> bookmarkRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/bookmarks/")
    Call<List<Bookmark>> extrasBookmarksBulkPartialUpdate(
            @retrofit2.http.Body List<BookmarkRequest> bookmarkRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/bookmarks/")
    Call<List<Bookmark>> extrasBookmarksBulkUpdate(
            @retrofit2.http.Body List<BookmarkRequest> bookmarkRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/bookmarks/")
    Call<Bookmark> extrasBookmarksCreate(
            @retrofit2.http.Body ExtrasBookmarksCreateRequest extrasBookmarksCreateRequest);

    @DELETE("api/extras/bookmarks/{id}/")
    Call<Void> extrasBookmarksDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/bookmarks/")
    Call<PaginatedBookmarkList> extrasBookmarksList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/bookmarks/{id}/")
    Call<Bookmark> extrasBookmarksPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedBookmarkRequest patchedBookmarkRequest);

    @GET("api/extras/bookmarks/{id}/")
    Call<Bookmark> extrasBookmarksRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/bookmarks/{id}/")
    Call<Bookmark> extrasBookmarksUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body BookmarkRequest bookmarkRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/config-context-profiles/")
    Call<Void> extrasConfigContextProfilesBulkDestroy(
            @retrofit2.http.Body List<ConfigContextProfileRequest> configContextProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/config-context-profiles/")
    Call<List<ConfigContextProfile>> extrasConfigContextProfilesBulkPartialUpdate(
            @retrofit2.http.Body List<ConfigContextProfileRequest> configContextProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/config-context-profiles/")
    Call<List<ConfigContextProfile>> extrasConfigContextProfilesBulkUpdate(
            @retrofit2.http.Body List<ConfigContextProfileRequest> configContextProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/config-context-profiles/")
    Call<ConfigContextProfile> extrasConfigContextProfilesCreate(
            @retrofit2.http.Body ExtrasConfigContextProfilesCreateRequest extrasConfigContextProfilesCreateRequest);

    @DELETE("api/extras/config-context-profiles/{id}/")
    Call<Void> extrasConfigContextProfilesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/config-context-profiles/")
    Call<PaginatedConfigContextProfileList> extrasConfigContextProfilesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/config-context-profiles/{id}/")
    Call<ConfigContextProfile> extrasConfigContextProfilesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedConfigContextProfileRequest patchedConfigContextProfileRequest);

    @GET("api/extras/config-context-profiles/{id}/")
    Call<ConfigContextProfile> extrasConfigContextProfilesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/config-context-profiles/{id}/sync/")
    Call<ConfigContextProfile> extrasConfigContextProfilesSyncCreate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body ConfigContextProfileRequest configContextProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/config-context-profiles/{id}/")
    Call<ConfigContextProfile> extrasConfigContextProfilesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body ConfigContextProfileRequest configContextProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/config-contexts/")
    Call<Void> extrasConfigContextsBulkDestroy(
            @retrofit2.http.Body List<ConfigContextRequest> configContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/config-contexts/")
    Call<List<ConfigContext>> extrasConfigContextsBulkPartialUpdate(
            @retrofit2.http.Body List<ConfigContextRequest> configContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/config-contexts/")
    Call<List<ConfigContext>> extrasConfigContextsBulkUpdate(
            @retrofit2.http.Body List<ConfigContextRequest> configContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/config-contexts/")
    Call<ConfigContext> extrasConfigContextsCreate(
            @retrofit2.http.Body ExtrasConfigContextsCreateRequest extrasConfigContextsCreateRequest);

    @DELETE("api/extras/config-contexts/{id}/")
    Call<Void> extrasConfigContextsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/config-contexts/")
    Call<PaginatedConfigContextList> extrasConfigContextsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/config-contexts/{id}/")
    Call<ConfigContext> extrasConfigContextsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedConfigContextRequest patchedConfigContextRequest);

    @GET("api/extras/config-contexts/{id}/")
    Call<ConfigContext> extrasConfigContextsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/config-contexts/{id}/sync/")
    Call<ConfigContext> extrasConfigContextsSyncCreate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ConfigContextRequest configContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/config-contexts/{id}/")
    Call<ConfigContext> extrasConfigContextsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ConfigContextRequest configContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/config-templates/")
    Call<Void> extrasConfigTemplatesBulkDestroy(
            @retrofit2.http.Body List<ConfigTemplateRequest> configTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/config-templates/")
    Call<List<ConfigTemplate>> extrasConfigTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<ConfigTemplateRequest> configTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/config-templates/")
    Call<List<ConfigTemplate>> extrasConfigTemplatesBulkUpdate(
            @retrofit2.http.Body List<ConfigTemplateRequest> configTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/config-templates/")
    Call<ConfigTemplate> extrasConfigTemplatesCreate(
            @retrofit2.http.Body ExtrasConfigTemplatesCreateRequest extrasConfigTemplatesCreateRequest);

    @DELETE("api/extras/config-templates/{id}/")
    Call<Void> extrasConfigTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/config-templates/")
    Call<PaginatedConfigTemplateList> extrasConfigTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/config-templates/{id}/")
    Call<ConfigTemplate> extrasConfigTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedConfigTemplateRequest patchedConfigTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/config-templates/{id}/render/")
    Call<ConfigTemplate> extrasConfigTemplatesRenderCreate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ConfigTemplateRequest configTemplateRequest);

    @GET("api/extras/config-templates/{id}/")
    Call<ConfigTemplate> extrasConfigTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/config-templates/{id}/sync/")
    Call<ConfigTemplate> extrasConfigTemplatesSyncCreate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ConfigTemplateRequest configTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/config-templates/{id}/")
    Call<ConfigTemplate> extrasConfigTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ConfigTemplateRequest configTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/custom-field-choice-sets/")
    Call<Void> extrasCustomFieldChoiceSetsBulkDestroy(
            @retrofit2.http.Body List<CustomFieldChoiceSetRequest> customFieldChoiceSetRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/custom-field-choice-sets/")
    Call<List<CustomFieldChoiceSet>> extrasCustomFieldChoiceSetsBulkPartialUpdate(
            @retrofit2.http.Body List<CustomFieldChoiceSetRequest> customFieldChoiceSetRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/custom-field-choice-sets/")
    Call<List<CustomFieldChoiceSet>> extrasCustomFieldChoiceSetsBulkUpdate(
            @retrofit2.http.Body List<CustomFieldChoiceSetRequest> customFieldChoiceSetRequest);

    @GET("api/extras/custom-field-choice-sets/{id}/choices/")
    Call<CustomFieldChoiceSet> extrasCustomFieldChoiceSetsChoicesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/custom-field-choice-sets/")
    Call<CustomFieldChoiceSet> extrasCustomFieldChoiceSetsCreate(
            @retrofit2.http.Body ExtrasCustomFieldChoiceSetsCreateRequest extrasCustomFieldChoiceSetsCreateRequest);

    @DELETE("api/extras/custom-field-choice-sets/{id}/")
    Call<Void> extrasCustomFieldChoiceSetsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/custom-field-choice-sets/")
    Call<PaginatedCustomFieldChoiceSetList> extrasCustomFieldChoiceSetsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/custom-field-choice-sets/{id}/")
    Call<CustomFieldChoiceSet> extrasCustomFieldChoiceSetsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableCustomFieldChoiceSetRequest patchedWritableCustomFieldChoiceSetRequest);

    @GET("api/extras/custom-field-choice-sets/{id}/")
    Call<CustomFieldChoiceSet> extrasCustomFieldChoiceSetsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/custom-field-choice-sets/{id}/")
    Call<CustomFieldChoiceSet> extrasCustomFieldChoiceSetsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableCustomFieldChoiceSetRequest writableCustomFieldChoiceSetRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/custom-fields/")
    Call<Void> extrasCustomFieldsBulkDestroy(
            @retrofit2.http.Body List<CustomFieldRequest> customFieldRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/custom-fields/")
    Call<List<CustomField>> extrasCustomFieldsBulkPartialUpdate(
            @retrofit2.http.Body List<CustomFieldRequest> customFieldRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/custom-fields/")
    Call<List<CustomField>> extrasCustomFieldsBulkUpdate(
            @retrofit2.http.Body List<CustomFieldRequest> customFieldRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/custom-fields/")
    Call<CustomField> extrasCustomFieldsCreate(
            @retrofit2.http.Body ExtrasCustomFieldsCreateRequest extrasCustomFieldsCreateRequest);

    @DELETE("api/extras/custom-fields/{id}/")
    Call<Void> extrasCustomFieldsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/custom-fields/")
    Call<PaginatedCustomFieldList> extrasCustomFieldsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/custom-fields/{id}/")
    Call<CustomField> extrasCustomFieldsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableCustomFieldRequest patchedWritableCustomFieldRequest);

    @GET("api/extras/custom-fields/{id}/")
    Call<CustomField> extrasCustomFieldsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/custom-fields/{id}/")
    Call<CustomField> extrasCustomFieldsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableCustomFieldRequest writableCustomFieldRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/custom-links/")
    Call<Void> extrasCustomLinksBulkDestroy(
            @retrofit2.http.Body List<CustomLinkRequest> customLinkRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/custom-links/")
    Call<List<CustomLink>> extrasCustomLinksBulkPartialUpdate(
            @retrofit2.http.Body List<CustomLinkRequest> customLinkRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/custom-links/")
    Call<List<CustomLink>> extrasCustomLinksBulkUpdate(
            @retrofit2.http.Body List<CustomLinkRequest> customLinkRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/custom-links/")
    Call<CustomLink> extrasCustomLinksCreate(
            @retrofit2.http.Body ExtrasCustomLinksCreateRequest extrasCustomLinksCreateRequest);

    @DELETE("api/extras/custom-links/{id}/")
    Call<Void> extrasCustomLinksDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/custom-links/")
    Call<PaginatedCustomLinkList> extrasCustomLinksList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/custom-links/{id}/")
    Call<CustomLink> extrasCustomLinksPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedCustomLinkRequest patchedCustomLinkRequest);

    @GET("api/extras/custom-links/{id}/")
    Call<CustomLink> extrasCustomLinksRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/custom-links/{id}/")
    Call<CustomLink> extrasCustomLinksUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body CustomLinkRequest customLinkRequest);

    @DELETE("api/extras/dashboard/")
    Call<Void> extrasDashboardDestroy();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/dashboard/")
    Call<Dashboard> extrasDashboardPartialUpdate(
            @retrofit2.http.Body PatchedDashboardRequest patchedDashboardRequest);

    @GET("api/extras/dashboard/")
    Call<Dashboard> extrasDashboardRetrieve();

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/dashboard/")
    Call<Dashboard> extrasDashboardUpdate(
            @retrofit2.http.Body DashboardRequest dashboardRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/event-rules/")
    Call<Void> extrasEventRulesBulkDestroy(
            @retrofit2.http.Body List<EventRuleRequest> eventRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/event-rules/")
    Call<List<EventRule>> extrasEventRulesBulkPartialUpdate(
            @retrofit2.http.Body List<EventRuleRequest> eventRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/event-rules/")
    Call<List<EventRule>> extrasEventRulesBulkUpdate(
            @retrofit2.http.Body List<EventRuleRequest> eventRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/event-rules/")
    Call<EventRule> extrasEventRulesCreate(
            @retrofit2.http.Body ExtrasEventRulesCreateRequest extrasEventRulesCreateRequest);

    @DELETE("api/extras/event-rules/{id}/")
    Call<Void> extrasEventRulesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/event-rules/")
    Call<PaginatedEventRuleList> extrasEventRulesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/event-rules/{id}/")
    Call<EventRule> extrasEventRulesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableEventRuleRequest patchedWritableEventRuleRequest);

    @GET("api/extras/event-rules/{id}/")
    Call<EventRule> extrasEventRulesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/event-rules/{id}/")
    Call<EventRule> extrasEventRulesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableEventRuleRequest writableEventRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/export-templates/")
    Call<Void> extrasExportTemplatesBulkDestroy(
            @retrofit2.http.Body List<ExportTemplateRequest> exportTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/export-templates/")
    Call<List<ExportTemplate>> extrasExportTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<ExportTemplateRequest> exportTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/export-templates/")
    Call<List<ExportTemplate>> extrasExportTemplatesBulkUpdate(
            @retrofit2.http.Body List<ExportTemplateRequest> exportTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/export-templates/")
    Call<ExportTemplate> extrasExportTemplatesCreate(
            @retrofit2.http.Body ExtrasExportTemplatesCreateRequest extrasExportTemplatesCreateRequest);

    @DELETE("api/extras/export-templates/{id}/")
    Call<Void> extrasExportTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/export-templates/")
    Call<PaginatedExportTemplateList> extrasExportTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/export-templates/{id}/")
    Call<ExportTemplate> extrasExportTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedExportTemplateRequest patchedExportTemplateRequest);

    @GET("api/extras/export-templates/{id}/")
    Call<ExportTemplate> extrasExportTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/export-templates/{id}/sync/")
    Call<ExportTemplate> extrasExportTemplatesSyncCreate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ExportTemplateRequest exportTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/export-templates/{id}/")
    Call<ExportTemplate> extrasExportTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ExportTemplateRequest exportTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/image-attachments/")
    Call<Void> extrasImageAttachmentsBulkDestroy(
            @retrofit2.http.Body List<ImageAttachmentRequest> imageAttachmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/image-attachments/")
    Call<List<ImageAttachment>> extrasImageAttachmentsBulkPartialUpdate(
            @retrofit2.http.Body List<ImageAttachmentRequest> imageAttachmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/image-attachments/")
    Call<List<ImageAttachment>> extrasImageAttachmentsBulkUpdate(
            @retrofit2.http.Body List<ImageAttachmentRequest> imageAttachmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/image-attachments/")
    Call<ImageAttachment> extrasImageAttachmentsCreate(
            @retrofit2.http.Body ExtrasImageAttachmentsCreateRequest extrasImageAttachmentsCreateRequest);

    @DELETE("api/extras/image-attachments/{id}/")
    Call<Void> extrasImageAttachmentsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/image-attachments/")
    Call<PaginatedImageAttachmentList> extrasImageAttachmentsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/image-attachments/{id}/")
    Call<ImageAttachment> extrasImageAttachmentsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedImageAttachmentRequest patchedImageAttachmentRequest);

    @GET("api/extras/image-attachments/{id}/")
    Call<ImageAttachment> extrasImageAttachmentsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/image-attachments/{id}/")
    Call<ImageAttachment> extrasImageAttachmentsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ImageAttachmentRequest imageAttachmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/journal-entries/")
    Call<Void> extrasJournalEntriesBulkDestroy(
            @retrofit2.http.Body List<JournalEntryRequest> journalEntryRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/journal-entries/")
    Call<List<JournalEntry>> extrasJournalEntriesBulkPartialUpdate(
            @retrofit2.http.Body List<JournalEntryRequest> journalEntryRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/journal-entries/")
    Call<List<JournalEntry>> extrasJournalEntriesBulkUpdate(
            @retrofit2.http.Body List<JournalEntryRequest> journalEntryRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/journal-entries/")
    Call<JournalEntry> extrasJournalEntriesCreate(
            @retrofit2.http.Body ExtrasJournalEntriesCreateRequest extrasJournalEntriesCreateRequest);

    @DELETE("api/extras/journal-entries/{id}/")
    Call<Void> extrasJournalEntriesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/journal-entries/")
    Call<PaginatedJournalEntryList> extrasJournalEntriesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/journal-entries/{id}/")
    Call<JournalEntry> extrasJournalEntriesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableJournalEntryRequest patchedWritableJournalEntryRequest);

    @GET("api/extras/journal-entries/{id}/")
    Call<JournalEntry> extrasJournalEntriesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/journal-entries/{id}/")
    Call<JournalEntry> extrasJournalEntriesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableJournalEntryRequest writableJournalEntryRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/notification-groups/")
    Call<Void> extrasNotificationGroupsBulkDestroy(
            @retrofit2.http.Body List<NotificationGroupRequest> notificationGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/notification-groups/")
    Call<List<NotificationGroup>> extrasNotificationGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<NotificationGroupRequest> notificationGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/notification-groups/")
    Call<List<NotificationGroup>> extrasNotificationGroupsBulkUpdate(
            @retrofit2.http.Body List<NotificationGroupRequest> notificationGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/notification-groups/")
    Call<NotificationGroup> extrasNotificationGroupsCreate(
            @retrofit2.http.Body ExtrasNotificationGroupsCreateRequest extrasNotificationGroupsCreateRequest);

    @DELETE("api/extras/notification-groups/{id}/")
    Call<Void> extrasNotificationGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/notification-groups/")
    Call<PaginatedNotificationGroupList> extrasNotificationGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/notification-groups/{id}/")
    Call<NotificationGroup> extrasNotificationGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedNotificationGroupRequest patchedNotificationGroupRequest);

    @GET("api/extras/notification-groups/{id}/")
    Call<NotificationGroup> extrasNotificationGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/notification-groups/{id}/")
    Call<NotificationGroup> extrasNotificationGroupsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body NotificationGroupRequest notificationGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/notifications/")
    Call<Void> extrasNotificationsBulkDestroy(
            @retrofit2.http.Body List<NotificationRequest> notificationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/notifications/")
    Call<List<Notification>> extrasNotificationsBulkPartialUpdate(
            @retrofit2.http.Body List<NotificationRequest> notificationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/notifications/")
    Call<List<Notification>> extrasNotificationsBulkUpdate(
            @retrofit2.http.Body List<NotificationRequest> notificationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/notifications/")
    Call<Notification> extrasNotificationsCreate(
            @retrofit2.http.Body ExtrasNotificationsCreateRequest extrasNotificationsCreateRequest);

    @DELETE("api/extras/notifications/{id}/")
    Call<Void> extrasNotificationsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/notifications/")
    Call<PaginatedNotificationList> extrasNotificationsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/notifications/{id}/")
    Call<Notification> extrasNotificationsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedNotificationRequest patchedNotificationRequest);

    @GET("api/extras/notifications/{id}/")
    Call<Notification> extrasNotificationsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/notifications/{id}/")
    Call<Notification> extrasNotificationsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body NotificationRequest notificationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/saved-filters/")
    Call<Void> extrasSavedFiltersBulkDestroy(
            @retrofit2.http.Body List<SavedFilterRequest> savedFilterRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/saved-filters/")
    Call<List<SavedFilter>> extrasSavedFiltersBulkPartialUpdate(
            @retrofit2.http.Body List<SavedFilterRequest> savedFilterRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/saved-filters/")
    Call<List<SavedFilter>> extrasSavedFiltersBulkUpdate(
            @retrofit2.http.Body List<SavedFilterRequest> savedFilterRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/saved-filters/")
    Call<SavedFilter> extrasSavedFiltersCreate(
            @retrofit2.http.Body ExtrasSavedFiltersCreateRequest extrasSavedFiltersCreateRequest);

    @DELETE("api/extras/saved-filters/{id}/")
    Call<Void> extrasSavedFiltersDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/saved-filters/")
    Call<PaginatedSavedFilterList> extrasSavedFiltersList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/saved-filters/{id}/")
    Call<SavedFilter> extrasSavedFiltersPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedSavedFilterRequest patchedSavedFilterRequest);

    @GET("api/extras/saved-filters/{id}/")
    Call<SavedFilter> extrasSavedFiltersRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/saved-filters/{id}/")
    Call<SavedFilter> extrasSavedFiltersUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SavedFilterRequest savedFilterRequest);

    @POST("api/extras/scripts/")
    Call<Script> extrasScriptsCreate();

    @DELETE("api/extras/scripts/{id}/")
    Call<Void> extrasScriptsDestroy(
            @retrofit2.http.Path("id") String id);

    @GET("api/extras/scripts/")
    Call<PaginatedScriptList> extrasScriptsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/scripts/{id}/")
    Call<Script> extrasScriptsPartialUpdate(
            @retrofit2.http.Path("id") String id,
            @retrofit2.http.Body PatchedScriptInputRequest patchedScriptInputRequest);

    @GET("api/extras/scripts/{id}/")
    Call<Script> extrasScriptsRetrieve(
            @retrofit2.http.Path("id") String id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/scripts/{id}/")
    Call<Script> extrasScriptsUpdate(
            @retrofit2.http.Path("id") String id, @retrofit2.http.Body ScriptInputRequest scriptInputRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/subscriptions/")
    Call<Void> extrasSubscriptionsBulkDestroy(
            @retrofit2.http.Body List<SubscriptionRequest> subscriptionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/subscriptions/")
    Call<List<Subscription>> extrasSubscriptionsBulkPartialUpdate(
            @retrofit2.http.Body List<SubscriptionRequest> subscriptionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/subscriptions/")
    Call<List<Subscription>> extrasSubscriptionsBulkUpdate(
            @retrofit2.http.Body List<SubscriptionRequest> subscriptionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/subscriptions/")
    Call<Subscription> extrasSubscriptionsCreate(
            @retrofit2.http.Body ExtrasSubscriptionsCreateRequest extrasSubscriptionsCreateRequest);

    @DELETE("api/extras/subscriptions/{id}/")
    Call<Void> extrasSubscriptionsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/subscriptions/")
    Call<PaginatedSubscriptionList> extrasSubscriptionsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/subscriptions/{id}/")
    Call<Subscription> extrasSubscriptionsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedSubscriptionRequest patchedSubscriptionRequest);

    @GET("api/extras/subscriptions/{id}/")
    Call<Subscription> extrasSubscriptionsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/subscriptions/{id}/")
    Call<Subscription> extrasSubscriptionsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SubscriptionRequest subscriptionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/table-configs/")
    Call<Void> extrasTableConfigsBulkDestroy(
            @retrofit2.http.Body List<TableConfigRequest> tableConfigRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/table-configs/")
    Call<List<TableConfig>> extrasTableConfigsBulkPartialUpdate(
            @retrofit2.http.Body List<TableConfigRequest> tableConfigRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/table-configs/")
    Call<List<TableConfig>> extrasTableConfigsBulkUpdate(
            @retrofit2.http.Body List<TableConfigRequest> tableConfigRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/table-configs/")
    Call<TableConfig> extrasTableConfigsCreate(
            @retrofit2.http.Body ExtrasTableConfigsCreateRequest extrasTableConfigsCreateRequest);

    @DELETE("api/extras/table-configs/{id}/")
    Call<Void> extrasTableConfigsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/table-configs/")
    Call<PaginatedTableConfigList> extrasTableConfigsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/table-configs/{id}/")
    Call<TableConfig> extrasTableConfigsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedTableConfigRequest patchedTableConfigRequest);

    @GET("api/extras/table-configs/{id}/")
    Call<TableConfig> extrasTableConfigsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/table-configs/{id}/")
    Call<TableConfig> extrasTableConfigsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body TableConfigRequest tableConfigRequest);

    @GET("api/extras/tagged-objects/")
    Call<PaginatedTaggedItemList> extrasTaggedObjectsList();

    @GET("api/extras/tagged-objects/{id}/")
    Call<TaggedItem> extrasTaggedObjectsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/tags/")
    Call<Void> extrasTagsBulkDestroy(
            @retrofit2.http.Body List<TagRequest> tagRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/tags/")
    Call<List<Tag>> extrasTagsBulkPartialUpdate(
            @retrofit2.http.Body List<TagRequest> tagRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/tags/")
    Call<List<Tag>> extrasTagsBulkUpdate(
            @retrofit2.http.Body List<TagRequest> tagRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/tags/")
    Call<Tag> extrasTagsCreate(
            @retrofit2.http.Body ExtrasTagsCreateRequest extrasTagsCreateRequest);

    @DELETE("api/extras/tags/{id}/")
    Call<Void> extrasTagsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/tags/")
    Call<PaginatedTagList> extrasTagsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/tags/{id}/")
    Call<Tag> extrasTagsPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedTagRequest patchedTagRequest);

    @GET("api/extras/tags/{id}/")
    Call<Tag> extrasTagsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/tags/{id}/")
    Call<Tag> extrasTagsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body TagRequest tagRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/extras/webhooks/")
    Call<Void> extrasWebhooksBulkDestroy(
            @retrofit2.http.Body List<WebhookRequest> webhookRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/webhooks/")
    Call<List<Webhook>> extrasWebhooksBulkPartialUpdate(
            @retrofit2.http.Body List<WebhookRequest> webhookRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/webhooks/")
    Call<List<Webhook>> extrasWebhooksBulkUpdate(
            @retrofit2.http.Body List<WebhookRequest> webhookRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/extras/webhooks/")
    Call<Webhook> extrasWebhooksCreate(
            @retrofit2.http.Body ExtrasWebhooksCreateRequest extrasWebhooksCreateRequest);

    @DELETE("api/extras/webhooks/{id}/")
    Call<Void> extrasWebhooksDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/extras/webhooks/")
    Call<PaginatedWebhookList> extrasWebhooksList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/extras/webhooks/{id}/")
    Call<Webhook> extrasWebhooksPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWebhookRequest patchedWebhookRequest);

    @GET("api/extras/webhooks/{id}/")
    Call<Webhook> extrasWebhooksRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/extras/webhooks/{id}/")
    Call<Webhook> extrasWebhooksUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WebhookRequest webhookRequest);

}
