package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.ExtrasApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class ExtrasEndpoint extends Endpoint<ExtrasApi> {

    public ExtrasEndpoint(ExtrasApi service) {
        super(service);
    }

    // ==================== CORE EXTRAS ====================
    public final Bookmarks bookmarks = new Bookmarks();
    public final Dashboard_ dashboard = new Dashboard_();
    public final Scripts scripts = new Scripts();
    public final TaggedObjects taggedObjects = new TaggedObjects();
    public final Tags tags = new Tags();
    public final Webhooks webhooks = new Webhooks();

    // ==================== CONFIG CONTEXTS ====================
    public final ConfigContexts configContexts = new ConfigContexts();
    public final ConfigContextProfiles configContextProfiles = new ConfigContextProfiles();
    public final ConfigTemplates configTemplates = new ConfigTemplates();

    // ==================== CUSTOM FIELDS ====================
    public final CustomFields customFields = new CustomFields();
    public final CustomFieldChoiceSets customFieldChoiceSets = new CustomFieldChoiceSets();
    public final CustomLinks customLinks = new CustomLinks();

    // ==================== NOTIFICATIONS ====================
    public final Notifications notifications = new Notifications();
    public final NotificationGroups notificationGroups = new NotificationGroups();
    public final Subscriptions subscriptions = new Subscriptions();

    // ==================== OTHER EXTRAS ====================
    public final EventRules eventRules = new EventRules();
    public final ExportTemplates exportTemplates = new ExportTemplates();
    public final ImageAttachments imageAttachments = new ImageAttachments();
    public final JournalEntries journalEntries = new JournalEntries();
    public final SavedFilters savedFilters = new SavedFilters();
    public final TableConfigs tableConfigs = new TableConfigs();

    // CORE EXTRAS
    public Bookmarks bookmarks() {
        return bookmarks;
    }

    public Dashboard_ dashboard() {
        return dashboard;
    }

    public Scripts scripts() {
        return scripts;
    }

    public TaggedObjects taggedObjects() {
        return taggedObjects;
    }

    public Tags tags() {
        return tags;
    }

    public Webhooks webhooks() {
        return webhooks;
    }

    // CONFIG CONTEXTS
    public ConfigContexts configContexts() {
        return configContexts;
    }

    public ConfigContextProfiles configContextProfiles() {
        return configContextProfiles;
    }

    public ConfigTemplates configTemplates() {
        return configTemplates;
    }

    // CUSTOM FIELDS
    public CustomFields customFields() {
        return customFields;
    }

    public CustomFieldChoiceSets customFieldChoiceSets() {
        return customFieldChoiceSets;
    }

    public CustomLinks customLinks() {
        return customLinks;
    }

    // NOTIFICATIONS
    public Notifications notifications() {
        return notifications;
    }

    public NotificationGroups notificationGroups() {
        return notificationGroups;
    }

    public Subscriptions subscriptions() {
        return subscriptions;
    }

    // OTHER EXTRAS
    public EventRules eventRules() {
        return eventRules;
    }

    public ExportTemplates exportTemplates() {
        return exportTemplates;
    }

    public ImageAttachments imageAttachments() {
        return imageAttachments;
    }

    public JournalEntries journalEntries() {
        return journalEntries;
    }

    public SavedFilters savedFilters() {
        return savedFilters;
    }

    public TableConfigs tableConfigs() {
        return tableConfigs;
    }

    // ==================== BOOKMARKS ====================
    public class Bookmarks {
        public Call<Void> bulkDestroy(List<BookmarkRequest> request) {
            return service.extrasBookmarksBulkDestroy(request);
        }

        public Call<List<Bookmark>> bulkPartialUpdate(List<BookmarkRequest> request) {
            return service.extrasBookmarksBulkPartialUpdate(request);
        }

        public Call<List<Bookmark>> bulkUpdate(List<BookmarkRequest> request) {
            return service.extrasBookmarksBulkUpdate(request);
        }

        public Call<Bookmark> create(ExtrasBookmarksCreateRequest request) {
            return service.extrasBookmarksCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasBookmarksDestroy(id);
        }

        public Call<PaginatedBookmarkList> list() {
            return service.extrasBookmarksList();
        }

        public Call<Bookmark> partialUpdate(Integer id, PatchedBookmarkRequest request) {
            return service.extrasBookmarksPartialUpdate(id, request);
        }

        public Call<Bookmark> get(Integer id) {
            return service.extrasBookmarksRetrieve(id);
        }

        public Call<Bookmark> update(Integer id, BookmarkRequest request) {
            return service.extrasBookmarksUpdate(id, request);
        }
    }

    // ==================== DASHBOARD ====================
    public class Dashboard_ {
        public Call<Void> delete() {
            return service.extrasDashboardDestroy();
        }

        public Call<Dashboard> partialUpdate(PatchedDashboardRequest request) {
            return service.extrasDashboardPartialUpdate(request);
        }

        public Call<Dashboard> get() {
            return service.extrasDashboardRetrieve();
        }

        public Call<Dashboard> update(DashboardRequest request) {
            return service.extrasDashboardUpdate(request);
        }
    }

    // ==================== SCRIPTS ====================
    public class Scripts {
        public Call<Script> create() {
            return service.extrasScriptsCreate();
        }

        public Call<Void> delete(String id) {
            return service.extrasScriptsDestroy(id);
        }

        public Call<PaginatedScriptList> list() {
            return service.extrasScriptsList();
        }

        public Call<Script> partialUpdate(String id, PatchedScriptInputRequest request) {
            return service.extrasScriptsPartialUpdate(id, request);
        }

        public Call<Script> get(String id) {
            return service.extrasScriptsRetrieve(id);
        }

        public Call<Script> update(String id, ScriptInputRequest request) {
            return service.extrasScriptsUpdate(id, request);
        }
    }

    // ==================== TAGGED OBJECTS ====================
    public class TaggedObjects {
        public Call<PaginatedTaggedItemList> list() {
            return service.extrasTaggedObjectsList();
        }

        public Call<TaggedItem> get(Integer id) {
            return service.extrasTaggedObjectsRetrieve(id);
        }
    }

    // ==================== TAGS ====================
    public class Tags {
        public Call<Void> bulkDestroy(List<TagRequest> request) {
            return service.extrasTagsBulkDestroy(request);
        }

        public Call<List<Tag>> bulkPartialUpdate(List<TagRequest> request) {
            return service.extrasTagsBulkPartialUpdate(request);
        }

        public Call<List<Tag>> bulkUpdate(List<TagRequest> request) {
            return service.extrasTagsBulkUpdate(request);
        }

        public Call<Tag> create(ExtrasTagsCreateRequest request) {
            return service.extrasTagsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasTagsDestroy(id);
        }

        public Call<PaginatedTagList> list() {
            return service.extrasTagsList();
        }

        public Call<Tag> partialUpdate(Integer id, PatchedTagRequest request) {
            return service.extrasTagsPartialUpdate(id, request);
        }

        public Call<Tag> get(Integer id) {
            return service.extrasTagsRetrieve(id);
        }

        public Call<Tag> update(Integer id, TagRequest request) {
            return service.extrasTagsUpdate(id, request);
        }
    }

    // ==================== WEBHOOKS ====================
    public class Webhooks {
        public Call<Void> bulkDestroy(List<WebhookRequest> request) {
            return service.extrasWebhooksBulkDestroy(request);
        }

        public Call<List<Webhook>> bulkPartialUpdate(List<WebhookRequest> request) {
            return service.extrasWebhooksBulkPartialUpdate(request);
        }

        public Call<List<Webhook>> bulkUpdate(List<WebhookRequest> request) {
            return service.extrasWebhooksBulkUpdate(request);
        }

        public Call<Webhook> create(ExtrasWebhooksCreateRequest request) {
            return service.extrasWebhooksCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasWebhooksDestroy(id);
        }

        public Call<PaginatedWebhookList> list() {
            return service.extrasWebhooksList();
        }

        public Call<Webhook> partialUpdate(Integer id, PatchedWebhookRequest request) {
            return service.extrasWebhooksPartialUpdate(id, request);
        }

        public Call<Webhook> get(Integer id) {
            return service.extrasWebhooksRetrieve(id);
        }

        public Call<Webhook> update(Integer id, WebhookRequest request) {
            return service.extrasWebhooksUpdate(id, request);
        }
    }

    // ==================== CONFIG CONTEXTS ====================
    public class ConfigContexts {
        public Call<Void> bulkDestroy(List<ConfigContextRequest> request) {
            return service.extrasConfigContextsBulkDestroy(request);
        }

        public Call<List<ConfigContext>> bulkPartialUpdate(List<ConfigContextRequest> request) {
            return service.extrasConfigContextsBulkPartialUpdate(request);
        }

        public Call<List<ConfigContext>> bulkUpdate(List<ConfigContextRequest> request) {
            return service.extrasConfigContextsBulkUpdate(request);
        }

        public Call<ConfigContext> create(ExtrasConfigContextsCreateRequest request) {
            return service.extrasConfigContextsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasConfigContextsDestroy(id);
        }

        public Call<PaginatedConfigContextList> list() {
            return service.extrasConfigContextsList();
        }

        public Call<ConfigContext> partialUpdate(Integer id, PatchedConfigContextRequest request) {
            return service.extrasConfigContextsPartialUpdate(id, request);
        }

        public Call<ConfigContext> get(Integer id) {
            return service.extrasConfigContextsRetrieve(id);
        }

        public Call<ConfigContext> sync(Integer id, ConfigContextRequest request) {
            return service.extrasConfigContextsSyncCreate(id, request);
        }

        public Call<ConfigContext> update(Integer id, ConfigContextRequest request) {
            return service.extrasConfigContextsUpdate(id, request);
        }
    }

    // ==================== CONFIG CONTEXT PROFILES ====================
    public class ConfigContextProfiles {
        public Call<Void> bulkDestroy(List<ConfigContextProfileRequest> request) {
            return service.extrasConfigContextProfilesBulkDestroy(request);
        }

        public Call<List<ConfigContextProfile>> bulkPartialUpdate(List<ConfigContextProfileRequest> request) {
            return service.extrasConfigContextProfilesBulkPartialUpdate(request);
        }

        public Call<List<ConfigContextProfile>> bulkUpdate(List<ConfigContextProfileRequest> request) {
            return service.extrasConfigContextProfilesBulkUpdate(request);
        }

        public Call<ConfigContextProfile> create(ExtrasConfigContextProfilesCreateRequest request) {
            return service.extrasConfigContextProfilesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasConfigContextProfilesDestroy(id);
        }

        public Call<PaginatedConfigContextProfileList> list() {
            return service.extrasConfigContextProfilesList();
        }

        public Call<ConfigContextProfile> partialUpdate(Integer id, PatchedConfigContextProfileRequest request) {
            return service.extrasConfigContextProfilesPartialUpdate(id, request);
        }

        public Call<ConfigContextProfile> get(Integer id) {
            return service.extrasConfigContextProfilesRetrieve(id);
        }

        public Call<ConfigContextProfile> sync(Integer id, ConfigContextProfileRequest request) {
            return service.extrasConfigContextProfilesSyncCreate(id, request);
        }

        public Call<ConfigContextProfile> update(Integer id, ConfigContextProfileRequest request) {
            return service.extrasConfigContextProfilesUpdate(id, request);
        }
    }

    // ==================== CONFIG TEMPLATES ====================
    public class ConfigTemplates {
        public Call<Void> bulkDestroy(List<ConfigTemplateRequest> request) {
            return service.extrasConfigTemplatesBulkDestroy(request);
        }

        public Call<List<ConfigTemplate>> bulkPartialUpdate(List<ConfigTemplateRequest> request) {
            return service.extrasConfigTemplatesBulkPartialUpdate(request);
        }

        public Call<List<ConfigTemplate>> bulkUpdate(List<ConfigTemplateRequest> request) {
            return service.extrasConfigTemplatesBulkUpdate(request);
        }

        public Call<ConfigTemplate> create(ExtrasConfigTemplatesCreateRequest request) {
            return service.extrasConfigTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasConfigTemplatesDestroy(id);
        }

        public Call<PaginatedConfigTemplateList> list() {
            return service.extrasConfigTemplatesList();
        }

        public Call<ConfigTemplate> partialUpdate(Integer id, PatchedConfigTemplateRequest request) {
            return service.extrasConfigTemplatesPartialUpdate(id, request);
        }

        public Call<ConfigTemplate> render(Integer id, ConfigTemplateRequest request) {
            return service.extrasConfigTemplatesRenderCreate(id, request);
        }

        public Call<ConfigTemplate> get(Integer id) {
            return service.extrasConfigTemplatesRetrieve(id);
        }

        public Call<ConfigTemplate> sync(Integer id, ConfigTemplateRequest request) {
            return service.extrasConfigTemplatesSyncCreate(id, request);
        }

        public Call<ConfigTemplate> update(Integer id, ConfigTemplateRequest request) {
            return service.extrasConfigTemplatesUpdate(id, request);
        }
    }

    // ==================== CUSTOM FIELDS ====================
    public class CustomFields {
        public Call<Void> bulkDestroy(List<CustomFieldRequest> request) {
            return service.extrasCustomFieldsBulkDestroy(request);
        }

        public Call<List<CustomField>> bulkPartialUpdate(List<CustomFieldRequest> request) {
            return service.extrasCustomFieldsBulkPartialUpdate(request);
        }

        public Call<List<CustomField>> bulkUpdate(List<CustomFieldRequest> request) {
            return service.extrasCustomFieldsBulkUpdate(request);
        }

        public Call<CustomField> create(ExtrasCustomFieldsCreateRequest request) {
            return service.extrasCustomFieldsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasCustomFieldsDestroy(id);
        }

        public Call<PaginatedCustomFieldList> list() {
            return service.extrasCustomFieldsList();
        }

        public Call<CustomField> partialUpdate(Integer id, PatchedWritableCustomFieldRequest request) {
            return service.extrasCustomFieldsPartialUpdate(id, request);
        }

        public Call<CustomField> get(Integer id) {
            return service.extrasCustomFieldsRetrieve(id);
        }

        public Call<CustomField> update(Integer id, WritableCustomFieldRequest request) {
            return service.extrasCustomFieldsUpdate(id, request);
        }
    }

    // ==================== CUSTOM FIELD CHOICE SETS ====================
    public class CustomFieldChoiceSets {
        public Call<Void> bulkDestroy(List<CustomFieldChoiceSetRequest> request) {
            return service.extrasCustomFieldChoiceSetsBulkDestroy(request);
        }

        public Call<List<CustomFieldChoiceSet>> bulkPartialUpdate(List<CustomFieldChoiceSetRequest> request) {
            return service.extrasCustomFieldChoiceSetsBulkPartialUpdate(request);
        }

        public Call<List<CustomFieldChoiceSet>> bulkUpdate(List<CustomFieldChoiceSetRequest> request) {
            return service.extrasCustomFieldChoiceSetsBulkUpdate(request);
        }

        public Call<CustomFieldChoiceSet> choices(Integer id) {
            return service.extrasCustomFieldChoiceSetsChoicesRetrieve(id);
        }

        public Call<CustomFieldChoiceSet> create(ExtrasCustomFieldChoiceSetsCreateRequest request) {
            return service.extrasCustomFieldChoiceSetsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasCustomFieldChoiceSetsDestroy(id);
        }

        public Call<PaginatedCustomFieldChoiceSetList> list() {
            return service.extrasCustomFieldChoiceSetsList();
        }

        public Call<CustomFieldChoiceSet> partialUpdate(Integer id,
                PatchedWritableCustomFieldChoiceSetRequest request) {
            return service.extrasCustomFieldChoiceSetsPartialUpdate(id, request);
        }

        public Call<CustomFieldChoiceSet> get(Integer id) {
            return service.extrasCustomFieldChoiceSetsRetrieve(id);
        }

        public Call<CustomFieldChoiceSet> update(Integer id, WritableCustomFieldChoiceSetRequest request) {
            return service.extrasCustomFieldChoiceSetsUpdate(id, request);
        }
    }

    // ==================== CUSTOM LINKS ====================
    public class CustomLinks {
        public Call<Void> bulkDestroy(List<CustomLinkRequest> request) {
            return service.extrasCustomLinksBulkDestroy(request);
        }

        public Call<List<CustomLink>> bulkPartialUpdate(List<CustomLinkRequest> request) {
            return service.extrasCustomLinksBulkPartialUpdate(request);
        }

        public Call<List<CustomLink>> bulkUpdate(List<CustomLinkRequest> request) {
            return service.extrasCustomLinksBulkUpdate(request);
        }

        public Call<CustomLink> create(ExtrasCustomLinksCreateRequest request) {
            return service.extrasCustomLinksCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasCustomLinksDestroy(id);
        }

        public Call<PaginatedCustomLinkList> list() {
            return service.extrasCustomLinksList();
        }

        public Call<CustomLink> partialUpdate(Integer id, PatchedCustomLinkRequest request) {
            return service.extrasCustomLinksPartialUpdate(id, request);
        }

        public Call<CustomLink> get(Integer id) {
            return service.extrasCustomLinksRetrieve(id);
        }

        public Call<CustomLink> update(Integer id, CustomLinkRequest request) {
            return service.extrasCustomLinksUpdate(id, request);
        }
    }

    // ==================== NOTIFICATIONS ====================
    public class Notifications {
        public Call<Void> bulkDestroy(List<NotificationRequest> request) {
            return service.extrasNotificationsBulkDestroy(request);
        }

        public Call<List<Notification>> bulkPartialUpdate(List<NotificationRequest> request) {
            return service.extrasNotificationsBulkPartialUpdate(request);
        }

        public Call<List<Notification>> bulkUpdate(List<NotificationRequest> request) {
            return service.extrasNotificationsBulkUpdate(request);
        }

        public Call<Notification> create(ExtrasNotificationsCreateRequest request) {
            return service.extrasNotificationsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasNotificationsDestroy(id);
        }

        public Call<PaginatedNotificationList> list() {
            return service.extrasNotificationsList();
        }

        public Call<Notification> partialUpdate(Integer id, PatchedNotificationRequest request) {
            return service.extrasNotificationsPartialUpdate(id, request);
        }

        public Call<Notification> get(Integer id) {
            return service.extrasNotificationsRetrieve(id);
        }

        public Call<Notification> update(Integer id, NotificationRequest request) {
            return service.extrasNotificationsUpdate(id, request);
        }
    }

    // ==================== NOTIFICATION GROUPS ====================
    public class NotificationGroups {
        public Call<Void> bulkDestroy(List<NotificationGroupRequest> request) {
            return service.extrasNotificationGroupsBulkDestroy(request);
        }

        public Call<List<NotificationGroup>> bulkPartialUpdate(List<NotificationGroupRequest> request) {
            return service.extrasNotificationGroupsBulkPartialUpdate(request);
        }

        public Call<List<NotificationGroup>> bulkUpdate(List<NotificationGroupRequest> request) {
            return service.extrasNotificationGroupsBulkUpdate(request);
        }

        public Call<NotificationGroup> create(ExtrasNotificationGroupsCreateRequest request) {
            return service.extrasNotificationGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasNotificationGroupsDestroy(id);
        }

        public Call<PaginatedNotificationGroupList> list() {
            return service.extrasNotificationGroupsList();
        }

        public Call<NotificationGroup> partialUpdate(Integer id, PatchedNotificationGroupRequest request) {
            return service.extrasNotificationGroupsPartialUpdate(id, request);
        }

        public Call<NotificationGroup> get(Integer id) {
            return service.extrasNotificationGroupsRetrieve(id);
        }

        public Call<NotificationGroup> update(Integer id, NotificationGroupRequest request) {
            return service.extrasNotificationGroupsUpdate(id, request);
        }
    }

    // ==================== SUBSCRIPTIONS ====================
    public class Subscriptions {
        public Call<Void> bulkDestroy(List<SubscriptionRequest> request) {
            return service.extrasSubscriptionsBulkDestroy(request);
        }

        public Call<List<Subscription>> bulkPartialUpdate(List<SubscriptionRequest> request) {
            return service.extrasSubscriptionsBulkPartialUpdate(request);
        }

        public Call<List<Subscription>> bulkUpdate(List<SubscriptionRequest> request) {
            return service.extrasSubscriptionsBulkUpdate(request);
        }

        public Call<Subscription> create(ExtrasSubscriptionsCreateRequest request) {
            return service.extrasSubscriptionsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasSubscriptionsDestroy(id);
        }

        public Call<PaginatedSubscriptionList> list() {
            return service.extrasSubscriptionsList();
        }

        public Call<Subscription> partialUpdate(Integer id, PatchedSubscriptionRequest request) {
            return service.extrasSubscriptionsPartialUpdate(id, request);
        }

        public Call<Subscription> get(Integer id) {
            return service.extrasSubscriptionsRetrieve(id);
        }

        public Call<Subscription> update(Integer id, SubscriptionRequest request) {
            return service.extrasSubscriptionsUpdate(id, request);
        }
    }

    // ==================== EVENT RULES ====================
    public class EventRules {
        public Call<Void> bulkDestroy(List<EventRuleRequest> request) {
            return service.extrasEventRulesBulkDestroy(request);
        }

        public Call<List<EventRule>> bulkPartialUpdate(List<EventRuleRequest> request) {
            return service.extrasEventRulesBulkPartialUpdate(request);
        }

        public Call<List<EventRule>> bulkUpdate(List<EventRuleRequest> request) {
            return service.extrasEventRulesBulkUpdate(request);
        }

        public Call<EventRule> create(ExtrasEventRulesCreateRequest request) {
            return service.extrasEventRulesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasEventRulesDestroy(id);
        }

        public Call<PaginatedEventRuleList> list() {
            return service.extrasEventRulesList();
        }

        public Call<EventRule> partialUpdate(Integer id, PatchedWritableEventRuleRequest request) {
            return service.extrasEventRulesPartialUpdate(id, request);
        }

        public Call<EventRule> get(Integer id) {
            return service.extrasEventRulesRetrieve(id);
        }

        public Call<EventRule> update(Integer id, WritableEventRuleRequest request) {
            return service.extrasEventRulesUpdate(id, request);
        }
    }

    // ==================== EXPORT TEMPLATES ====================
    public class ExportTemplates {
        public Call<Void> bulkDestroy(List<ExportTemplateRequest> request) {
            return service.extrasExportTemplatesBulkDestroy(request);
        }

        public Call<List<ExportTemplate>> bulkPartialUpdate(List<ExportTemplateRequest> request) {
            return service.extrasExportTemplatesBulkPartialUpdate(request);
        }

        public Call<List<ExportTemplate>> bulkUpdate(List<ExportTemplateRequest> request) {
            return service.extrasExportTemplatesBulkUpdate(request);
        }

        public Call<ExportTemplate> create(ExtrasExportTemplatesCreateRequest request) {
            return service.extrasExportTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasExportTemplatesDestroy(id);
        }

        public Call<PaginatedExportTemplateList> list() {
            return service.extrasExportTemplatesList();
        }

        public Call<ExportTemplate> partialUpdate(Integer id, PatchedExportTemplateRequest request) {
            return service.extrasExportTemplatesPartialUpdate(id, request);
        }

        public Call<ExportTemplate> get(Integer id) {
            return service.extrasExportTemplatesRetrieve(id);
        }

        public Call<ExportTemplate> sync(Integer id, ExportTemplateRequest request) {
            return service.extrasExportTemplatesSyncCreate(id, request);
        }

        public Call<ExportTemplate> update(Integer id, ExportTemplateRequest request) {
            return service.extrasExportTemplatesUpdate(id, request);
        }
    }

    // ==================== IMAGE ATTACHMENTS ====================
    public class ImageAttachments {
        public Call<Void> bulkDestroy(List<ImageAttachmentRequest> request) {
            return service.extrasImageAttachmentsBulkDestroy(request);
        }

        public Call<List<ImageAttachment>> bulkPartialUpdate(List<ImageAttachmentRequest> request) {
            return service.extrasImageAttachmentsBulkPartialUpdate(request);
        }

        public Call<List<ImageAttachment>> bulkUpdate(List<ImageAttachmentRequest> request) {
            return service.extrasImageAttachmentsBulkUpdate(request);
        }

        public Call<ImageAttachment> create(ExtrasImageAttachmentsCreateRequest request) {
            return service.extrasImageAttachmentsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasImageAttachmentsDestroy(id);
        }

        public Call<PaginatedImageAttachmentList> list() {
            return service.extrasImageAttachmentsList();
        }

        public Call<ImageAttachment> partialUpdate(Integer id, PatchedImageAttachmentRequest request) {
            return service.extrasImageAttachmentsPartialUpdate(id, request);
        }

        public Call<ImageAttachment> get(Integer id) {
            return service.extrasImageAttachmentsRetrieve(id);
        }

        public Call<ImageAttachment> update(Integer id, ImageAttachmentRequest request) {
            return service.extrasImageAttachmentsUpdate(id, request);
        }
    }

    // ==================== JOURNAL ENTRIES ====================
    public class JournalEntries {
        public Call<Void> bulkDestroy(List<JournalEntryRequest> request) {
            return service.extrasJournalEntriesBulkDestroy(request);
        }

        public Call<List<JournalEntry>> bulkPartialUpdate(List<JournalEntryRequest> request) {
            return service.extrasJournalEntriesBulkPartialUpdate(request);
        }

        public Call<List<JournalEntry>> bulkUpdate(List<JournalEntryRequest> request) {
            return service.extrasJournalEntriesBulkUpdate(request);
        }

        public Call<JournalEntry> create(ExtrasJournalEntriesCreateRequest request) {
            return service.extrasJournalEntriesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasJournalEntriesDestroy(id);
        }

        public Call<PaginatedJournalEntryList> list() {
            return service.extrasJournalEntriesList();
        }

        public Call<JournalEntry> partialUpdate(Integer id, PatchedWritableJournalEntryRequest request) {
            return service.extrasJournalEntriesPartialUpdate(id, request);
        }

        public Call<JournalEntry> get(Integer id) {
            return service.extrasJournalEntriesRetrieve(id);
        }

        public Call<JournalEntry> update(Integer id, WritableJournalEntryRequest request) {
            return service.extrasJournalEntriesUpdate(id, request);
        }
    }

    // ==================== SAVED FILTERS ====================
    public class SavedFilters {
        public Call<Void> bulkDestroy(List<SavedFilterRequest> request) {
            return service.extrasSavedFiltersBulkDestroy(request);
        }

        public Call<List<SavedFilter>> bulkPartialUpdate(List<SavedFilterRequest> request) {
            return service.extrasSavedFiltersBulkPartialUpdate(request);
        }

        public Call<List<SavedFilter>> bulkUpdate(List<SavedFilterRequest> request) {
            return service.extrasSavedFiltersBulkUpdate(request);
        }

        public Call<SavedFilter> create(ExtrasSavedFiltersCreateRequest request) {
            return service.extrasSavedFiltersCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasSavedFiltersDestroy(id);
        }

        public Call<PaginatedSavedFilterList> list() {
            return service.extrasSavedFiltersList();
        }

        public Call<SavedFilter> partialUpdate(Integer id, PatchedSavedFilterRequest request) {
            return service.extrasSavedFiltersPartialUpdate(id, request);
        }

        public Call<SavedFilter> get(Integer id) {
            return service.extrasSavedFiltersRetrieve(id);
        }

        public Call<SavedFilter> update(Integer id, SavedFilterRequest request) {
            return service.extrasSavedFiltersUpdate(id, request);
        }
    }

    // ==================== TABLE CONFIGS ====================
    public class TableConfigs {
        public Call<Void> bulkDestroy(List<TableConfigRequest> request) {
            return service.extrasTableConfigsBulkDestroy(request);
        }

        public Call<List<TableConfig>> bulkPartialUpdate(List<TableConfigRequest> request) {
            return service.extrasTableConfigsBulkPartialUpdate(request);
        }

        public Call<List<TableConfig>> bulkUpdate(List<TableConfigRequest> request) {
            return service.extrasTableConfigsBulkUpdate(request);
        }

        public Call<TableConfig> create(ExtrasTableConfigsCreateRequest request) {
            return service.extrasTableConfigsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.extrasTableConfigsDestroy(id);
        }

        public Call<PaginatedTableConfigList> list() {
            return service.extrasTableConfigsList();
        }

        public Call<TableConfig> partialUpdate(Integer id, PatchedTableConfigRequest request) {
            return service.extrasTableConfigsPartialUpdate(id, request);
        }

        public Call<TableConfig> get(Integer id) {
            return service.extrasTableConfigsRetrieve(id);
        }

        public Call<TableConfig> update(Integer id, TableConfigRequest request) {
            return service.extrasTableConfigsUpdate(id, request);
        }
    }
}
