package dev.icelabs.netbox.api;

import java.util.List;
import java.util.Map;

import dev.icelabs.netbox.model.BackgroundTask;
import dev.icelabs.netbox.model.BackgroundTaskRequest;
import dev.icelabs.netbox.model.CoreDataSourcesCreateRequest;
import dev.icelabs.netbox.model.DataFile;
import dev.icelabs.netbox.model.DataSource;
import dev.icelabs.netbox.model.DataSourceRequest;
import dev.icelabs.netbox.model.Job;
import dev.icelabs.netbox.model.ObjectChange;
import dev.icelabs.netbox.model.ObjectType;
import dev.icelabs.netbox.model.PaginatedDataFileList;
import dev.icelabs.netbox.model.PaginatedDataSourceList;
import dev.icelabs.netbox.model.PaginatedJobList;
import dev.icelabs.netbox.model.PaginatedObjectChangeList;
import dev.icelabs.netbox.model.PaginatedObjectTypeList;
import dev.icelabs.netbox.model.PatchedWritableDataSourceRequest;
import dev.icelabs.netbox.model.WritableDataSourceRequest;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface CoreApi {
    @GET("api/core/background-queues/")
    Call<Map<String, Object>> coreBackgroundQueuesRetrieve();

    @GET("api/core/background-queues/{name}/")
    Call<Map<String, Object>> coreBackgroundQueuesRetrieveByName(
            @retrofit2.http.Path("name") String name);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/core/background-tasks/{id}/delete/")
    Call<BackgroundTask> coreBackgroundTasksDeleteCreate(
            @retrofit2.http.Path("id") String id, @retrofit2.http.Body BackgroundTaskRequest backgroundTaskRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/core/background-tasks/{id}/enqueue/")
    Call<BackgroundTask> coreBackgroundTasksEnqueueCreate(
            @retrofit2.http.Path("id") String id, @retrofit2.http.Body BackgroundTaskRequest backgroundTaskRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/core/background-tasks/{id}/requeue/")
    Call<BackgroundTask> coreBackgroundTasksRequeueCreate(
            @retrofit2.http.Path("id") String id, @retrofit2.http.Body BackgroundTaskRequest backgroundTaskRequest);

    @GET("api/core/background-tasks/")
    Call<Map<String, Object>> coreBackgroundTasksRetrieve();

    @GET("api/core/background-tasks/{id}/")
    Call<Map<String, Object>> coreBackgroundTasksRetrieveById(
            @retrofit2.http.Path("id") String id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/core/background-tasks/{id}/stop/")
    Call<BackgroundTask> coreBackgroundTasksStopCreate(
            @retrofit2.http.Path("id") String id, @retrofit2.http.Body BackgroundTaskRequest backgroundTaskRequest);

    @GET("api/core/background-workers/")
    Call<Map<String, Object>> coreBackgroundWorkersRetrieve();

    @GET("api/core/background-workers/{name}/")
    Call<Map<String, Object>> coreBackgroundWorkersRetrieveByName(
            @retrofit2.http.Path("name") String name);

    @GET("api/core/data-files/")
    Call<PaginatedDataFileList> coreDataFilesList();

    @GET("api/core/data-files/{id}/")
    Call<DataFile> coreDataFilesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/core/data-sources/")
    Call<Void> coreDataSourcesBulkDestroy(
            @retrofit2.http.Body List<DataSourceRequest> dataSourceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/core/data-sources/")
    Call<List<DataSource>> coreDataSourcesBulkPartialUpdate(
            @retrofit2.http.Body List<DataSourceRequest> dataSourceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/core/data-sources/")
    Call<List<DataSource>> coreDataSourcesBulkUpdate(
            @retrofit2.http.Body List<DataSourceRequest> dataSourceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/core/data-sources/")
    Call<DataSource> coreDataSourcesCreate(
            @retrofit2.http.Body CoreDataSourcesCreateRequest coreDataSourcesCreateRequest);

    @DELETE("api/core/data-sources/{id}/")
    Call<Void> coreDataSourcesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/core/data-sources/")
    Call<PaginatedDataSourceList> coreDataSourcesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/core/data-sources/{id}/")
    Call<DataSource> coreDataSourcesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableDataSourceRequest patchedWritableDataSourceRequest);

    @GET("api/core/data-sources/{id}/")
    Call<DataSource> coreDataSourcesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/core/data-sources/{id}/sync/")
    Call<DataSource> coreDataSourcesSyncCreate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableDataSourceRequest writableDataSourceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/core/data-sources/{id}/")
    Call<DataSource> coreDataSourcesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableDataSourceRequest writableDataSourceRequest);

    @GET("api/core/jobs/")
    Call<PaginatedJobList> coreJobsList();

    @GET("api/core/jobs/{id}/")
    Call<Job> coreJobsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/core/object-changes/")
    Call<PaginatedObjectChangeList> coreObjectChangesList();

    @GET("api/core/object-changes/{id}/")
    Call<ObjectChange> coreObjectChangesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/core/object-types/")
    Call<PaginatedObjectTypeList> coreObjectTypesList();

    @GET("api/core/object-types/{id}/")
    Call<ObjectType> coreObjectTypesRetrieve(
            @retrofit2.http.Path("id") Integer id);

}
