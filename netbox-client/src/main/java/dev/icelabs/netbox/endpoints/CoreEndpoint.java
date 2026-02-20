package dev.icelabs.netbox.endpoints;

import java.util.List;
import java.util.Map;

import dev.icelabs.netbox.api.CoreApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class CoreEndpoint extends Endpoint<CoreApi> {

    public CoreEndpoint(CoreApi service) {
        super(service);
    }

    public final Background background = new Background();
    public final DataSources dataSources = new DataSources();
    public final DataFiles dataFiles = new DataFiles();
    public final Jobs jobs = new Jobs();
    public final ObjectChanges objectChanges = new ObjectChanges();
    public final ObjectTypes objectTypes = new ObjectTypes();

    public Background background() {
        return background;
    }

    public DataSources dataSources() {
        return dataSources;
    }

    public DataFiles dataFiles() {
        return dataFiles;
    }

    public Jobs jobs() {
        return jobs;
    }

    public ObjectChanges objectChanges() {
        return objectChanges;
    }

    public ObjectTypes objectTypes() {
        return objectTypes;
    }

    // ==================== BACKGROUND ====================
    public class Background {
        public final Queues queues = new Queues();
        public final Tasks tasks = new Tasks();
        public final Workers workers = new Workers();

        public Queues queues() {
            return queues;
        }

        public Tasks tasks() {
            return tasks;
        }

        public Workers workers() {
            return workers;
        }

        public class Queues {
            public Call<Map<String, Object>> list() {
                return service.coreBackgroundQueuesRetrieve();
            }

            public Call<Map<String, Object>> get(String name) {
                return service.coreBackgroundQueuesRetrieveByName(name);
            }
        }

        public class Tasks {
            public Call<BackgroundTask> delete(String id, BackgroundTaskRequest request) {
                return service.coreBackgroundTasksDeleteCreate(id, request);
            }

            public Call<BackgroundTask> enqueue(String id, BackgroundTaskRequest request) {
                return service.coreBackgroundTasksEnqueueCreate(id, request);
            }

            public Call<BackgroundTask> requeue(String id, BackgroundTaskRequest request) {
                return service.coreBackgroundTasksRequeueCreate(id, request);
            }

            public Call<Map<String, Object>> list() {
                return service.coreBackgroundTasksRetrieve();
            }

            public Call<Map<String, Object>> get(String id) {
                return service.coreBackgroundTasksRetrieveById(id);
            }

            public Call<BackgroundTask> stop(String id, BackgroundTaskRequest request) {
                return service.coreBackgroundTasksStopCreate(id, request);
            }
        }

        public class Workers {
            public Call<Map<String, Object>> list() {
                return service.coreBackgroundWorkersRetrieve();
            }

            public Call<Map<String, Object>> get(String name) {
                return service.coreBackgroundWorkersRetrieveByName(name);
            }
        }
    }

    // ==================== DATA SOURCES ====================
    public class DataSources {
        public Call<Void> bulkDestroy(List<DataSourceRequest> request) {
            return service.coreDataSourcesBulkDestroy(request);
        }

        public Call<List<DataSource>> bulkPartialUpdate(List<DataSourceRequest> request) {
            return service.coreDataSourcesBulkPartialUpdate(request);
        }

        public Call<List<DataSource>> bulkUpdate(List<DataSourceRequest> request) {
            return service.coreDataSourcesBulkUpdate(request);
        }

        public Call<DataSource> create(CoreDataSourcesCreateRequest request) {
            return service.coreDataSourcesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.coreDataSourcesDestroy(id);
        }

        public Call<PaginatedDataSourceList> list() {
            return service.coreDataSourcesList();
        }

        public Call<DataSource> partialUpdate(Integer id, PatchedWritableDataSourceRequest request) {
            return service.coreDataSourcesPartialUpdate(id, request);
        }

        public Call<DataSource> get(Integer id) {
            return service.coreDataSourcesRetrieve(id);
        }

        public Call<DataSource> sync(Integer id, WritableDataSourceRequest request) {
            return service.coreDataSourcesSyncCreate(id, request);
        }

        public Call<DataSource> update(Integer id, WritableDataSourceRequest request) {
            return service.coreDataSourcesUpdate(id, request);
        }
    }

    // ==================== DATA FILES ====================
    public class DataFiles {
        public Call<PaginatedDataFileList> list() {
            return service.coreDataFilesList();
        }

        public Call<DataFile> get(Integer id) {
            return service.coreDataFilesRetrieve(id);
        }
    }

    // ==================== JOBS ====================
    public class Jobs {
        public Call<PaginatedJobList> list() {
            return service.coreJobsList();
        }

        public Call<Job> get(Integer id) {
            return service.coreJobsRetrieve(id);
        }
    }

    // ==================== OBJECT CHANGES ====================
    public class ObjectChanges {
        public Call<PaginatedObjectChangeList> list() {
            return service.coreObjectChangesList();
        }

        public Call<ObjectChange> get(Integer id) {
            return service.coreObjectChangesRetrieve(id);
        }
    }

    // ==================== OBJECT TYPES ====================
    public class ObjectTypes {
        public Call<PaginatedObjectTypeList> list() {
            return service.coreObjectTypesList();
        }

        public Call<ObjectType> get(Integer id) {
            return service.coreObjectTypesRetrieve(id);
        }
    }
}
