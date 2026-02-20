package dev.icelabs.netbox.api;

import dev.icelabs.netbox.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.math.BigDecimal;
import dev.icelabs.netbox.model.Cable;
import dev.icelabs.netbox.model.CableRequest;
import dev.icelabs.netbox.model.CableTermination;
import dev.icelabs.netbox.model.ConsolePort;
import dev.icelabs.netbox.model.ConsolePortRequest;
import dev.icelabs.netbox.model.ConsolePortTemplate;
import dev.icelabs.netbox.model.ConsolePortTemplateRequest;
import dev.icelabs.netbox.model.ConsoleServerPort;
import dev.icelabs.netbox.model.ConsoleServerPortRequest;
import dev.icelabs.netbox.model.ConsoleServerPortTemplate;
import dev.icelabs.netbox.model.ConsoleServerPortTemplateRequest;
import dev.icelabs.netbox.model.DcimCablesCreateRequest;
import dev.icelabs.netbox.model.DcimConsolePortTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimConsolePortsCreateRequest;
import dev.icelabs.netbox.model.DcimConsoleServerPortTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimConsoleServerPortsCreateRequest;
import dev.icelabs.netbox.model.DcimDeviceBayTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimDeviceBaysCreateRequest;
import dev.icelabs.netbox.model.DcimDeviceRolesCreateRequest;
import dev.icelabs.netbox.model.DcimDeviceTypesCreateRequest;
import dev.icelabs.netbox.model.DcimDevicesCreateRequest;
import dev.icelabs.netbox.model.DcimFrontPortTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimFrontPortsCreateRequest;
import dev.icelabs.netbox.model.DcimInterfaceTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimInterfacesCreateRequest;
import dev.icelabs.netbox.model.DcimInventoryItemRolesCreateRequest;
import dev.icelabs.netbox.model.DcimInventoryItemTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimInventoryItemsCreateRequest;
import dev.icelabs.netbox.model.DcimLocationsCreateRequest;
import dev.icelabs.netbox.model.DcimMacAddressesCreateRequest;
import dev.icelabs.netbox.model.DcimManufacturersCreateRequest;
import dev.icelabs.netbox.model.DcimModuleBayTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimModuleBaysCreateRequest;
import dev.icelabs.netbox.model.DcimModuleTypeProfilesCreateRequest;
import dev.icelabs.netbox.model.DcimModuleTypesCreateRequest;
import dev.icelabs.netbox.model.DcimModulesCreateRequest;
import dev.icelabs.netbox.model.DcimPlatformsCreateRequest;
import dev.icelabs.netbox.model.DcimPowerFeedsCreateRequest;
import dev.icelabs.netbox.model.DcimPowerOutletTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimPowerOutletsCreateRequest;
import dev.icelabs.netbox.model.DcimPowerPanelsCreateRequest;
import dev.icelabs.netbox.model.DcimPowerPortTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimPowerPortsCreateRequest;
import dev.icelabs.netbox.model.DcimRackReservationsCreateRequest;
import dev.icelabs.netbox.model.DcimRackRolesCreateRequest;
import dev.icelabs.netbox.model.DcimRackTypesCreateRequest;
import dev.icelabs.netbox.model.DcimRacksCreateRequest;
import dev.icelabs.netbox.model.DcimRearPortTemplatesCreateRequest;
import dev.icelabs.netbox.model.DcimRearPortsCreateRequest;
import dev.icelabs.netbox.model.DcimRegionsCreateRequest;
import dev.icelabs.netbox.model.DcimSiteGroupsCreateRequest;
import dev.icelabs.netbox.model.DcimSitesCreateRequest;
import dev.icelabs.netbox.model.DcimVirtualChassisCreateRequest;
import dev.icelabs.netbox.model.DcimVirtualDeviceContextsCreateRequest;
import dev.icelabs.netbox.model.Device;
import dev.icelabs.netbox.model.DeviceBay;
import dev.icelabs.netbox.model.DeviceBayRequest;
import dev.icelabs.netbox.model.DeviceBayTemplate;
import dev.icelabs.netbox.model.DeviceBayTemplateRequest;
import dev.icelabs.netbox.model.DeviceRole;
import dev.icelabs.netbox.model.DeviceRoleRequest;
import dev.icelabs.netbox.model.DeviceType;
import dev.icelabs.netbox.model.DeviceTypeRequest;
import dev.icelabs.netbox.model.DeviceWithConfigContext;
import dev.icelabs.netbox.model.DeviceWithConfigContextRequest;
import dev.icelabs.netbox.model.FrontPort;
import dev.icelabs.netbox.model.FrontPortRequest;
import dev.icelabs.netbox.model.FrontPortTemplate;
import dev.icelabs.netbox.model.FrontPortTemplateRequest;
import dev.icelabs.netbox.model.InterfaceRequest;
import dev.icelabs.netbox.model.InterfaceTemplate;
import dev.icelabs.netbox.model.InterfaceTemplateRequest;
import dev.icelabs.netbox.model.InventoryItem;
import dev.icelabs.netbox.model.InventoryItemRequest;
import dev.icelabs.netbox.model.InventoryItemRole;
import dev.icelabs.netbox.model.InventoryItemRoleRequest;
import dev.icelabs.netbox.model.InventoryItemTemplate;
import dev.icelabs.netbox.model.InventoryItemTemplateRequest;
import dev.icelabs.netbox.model.Location;
import dev.icelabs.netbox.model.LocationRequest;
import dev.icelabs.netbox.model.MACAddress;
import dev.icelabs.netbox.model.MACAddressRequest;
import dev.icelabs.netbox.model.Manufacturer;
import dev.icelabs.netbox.model.ManufacturerRequest;
import dev.icelabs.netbox.model.ModelInterface;
import dev.icelabs.netbox.model.Module;
import dev.icelabs.netbox.model.ModuleBay;
import dev.icelabs.netbox.model.ModuleBayRequest;
import dev.icelabs.netbox.model.ModuleBayTemplate;
import dev.icelabs.netbox.model.ModuleBayTemplateRequest;
import dev.icelabs.netbox.model.ModuleRequest;
import dev.icelabs.netbox.model.ModuleType;
import dev.icelabs.netbox.model.ModuleTypeProfile;
import dev.icelabs.netbox.model.ModuleTypeProfileRequest;
import dev.icelabs.netbox.model.ModuleTypeRequest;
import java.time.OffsetDateTime;
import dev.icelabs.netbox.model.PaginatedCableList;
import dev.icelabs.netbox.model.PaginatedCableTerminationList;
import dev.icelabs.netbox.model.PaginatedConsolePortList;
import dev.icelabs.netbox.model.PaginatedConsolePortTemplateList;
import dev.icelabs.netbox.model.PaginatedConsoleServerPortList;
import dev.icelabs.netbox.model.PaginatedConsoleServerPortTemplateList;
import dev.icelabs.netbox.model.PaginatedDeviceBayList;
import dev.icelabs.netbox.model.PaginatedDeviceBayTemplateList;
import dev.icelabs.netbox.model.PaginatedDeviceRoleList;
import dev.icelabs.netbox.model.PaginatedDeviceTypeList;
import dev.icelabs.netbox.model.PaginatedDeviceWithConfigContextList;
import dev.icelabs.netbox.model.PaginatedFrontPortList;
import dev.icelabs.netbox.model.PaginatedFrontPortTemplateList;
import dev.icelabs.netbox.model.PaginatedInterfaceList;
import dev.icelabs.netbox.model.PaginatedInterfaceTemplateList;
import dev.icelabs.netbox.model.PaginatedInventoryItemList;
import dev.icelabs.netbox.model.PaginatedInventoryItemRoleList;
import dev.icelabs.netbox.model.PaginatedInventoryItemTemplateList;
import dev.icelabs.netbox.model.PaginatedLocationList;
import dev.icelabs.netbox.model.PaginatedMACAddressList;
import dev.icelabs.netbox.model.PaginatedManufacturerList;
import dev.icelabs.netbox.model.PaginatedModuleBayList;
import dev.icelabs.netbox.model.PaginatedModuleBayTemplateList;
import dev.icelabs.netbox.model.PaginatedModuleList;
import dev.icelabs.netbox.model.PaginatedModuleTypeList;
import dev.icelabs.netbox.model.PaginatedModuleTypeProfileList;
import dev.icelabs.netbox.model.PaginatedPlatformList;
import dev.icelabs.netbox.model.PaginatedPowerFeedList;
import dev.icelabs.netbox.model.PaginatedPowerOutletList;
import dev.icelabs.netbox.model.PaginatedPowerOutletTemplateList;
import dev.icelabs.netbox.model.PaginatedPowerPanelList;
import dev.icelabs.netbox.model.PaginatedPowerPortList;
import dev.icelabs.netbox.model.PaginatedPowerPortTemplateList;
import dev.icelabs.netbox.model.PaginatedRackList;
import dev.icelabs.netbox.model.PaginatedRackReservationList;
import dev.icelabs.netbox.model.PaginatedRackRoleList;
import dev.icelabs.netbox.model.PaginatedRackTypeList;
import dev.icelabs.netbox.model.PaginatedRackUnitList;
import dev.icelabs.netbox.model.PaginatedRearPortList;
import dev.icelabs.netbox.model.PaginatedRearPortTemplateList;
import dev.icelabs.netbox.model.PaginatedRegionList;
import dev.icelabs.netbox.model.PaginatedSiteGroupList;
import dev.icelabs.netbox.model.PaginatedSiteList;
import dev.icelabs.netbox.model.PaginatedVirtualChassisList;
import dev.icelabs.netbox.model.PaginatedVirtualDeviceContextList;
import dev.icelabs.netbox.model.PatchedDeviceBayRequest;
import dev.icelabs.netbox.model.PatchedDeviceBayTemplateRequest;
import dev.icelabs.netbox.model.PatchedInventoryItemRoleRequest;
import dev.icelabs.netbox.model.PatchedInventoryItemTemplateRequest;
import dev.icelabs.netbox.model.PatchedMACAddressRequest;
import dev.icelabs.netbox.model.PatchedManufacturerRequest;
import dev.icelabs.netbox.model.PatchedModuleBayRequest;
import dev.icelabs.netbox.model.PatchedModuleBayTemplateRequest;
import dev.icelabs.netbox.model.PatchedModuleTypeProfileRequest;
import dev.icelabs.netbox.model.PatchedPowerPanelRequest;
import dev.icelabs.netbox.model.PatchedRackRoleRequest;
import dev.icelabs.netbox.model.PatchedWritableCableRequest;
import dev.icelabs.netbox.model.PatchedWritableConsolePortRequest;
import dev.icelabs.netbox.model.PatchedWritableConsolePortTemplateRequest;
import dev.icelabs.netbox.model.PatchedWritableConsoleServerPortRequest;
import dev.icelabs.netbox.model.PatchedWritableConsoleServerPortTemplateRequest;
import dev.icelabs.netbox.model.PatchedWritableDeviceRoleRequest;
import dev.icelabs.netbox.model.PatchedWritableDeviceTypeRequest;
import dev.icelabs.netbox.model.PatchedWritableDeviceWithConfigContextRequest;
import dev.icelabs.netbox.model.PatchedWritableFrontPortRequest;
import dev.icelabs.netbox.model.PatchedWritableFrontPortTemplateRequest;
import dev.icelabs.netbox.model.PatchedWritableInterfaceRequest;
import dev.icelabs.netbox.model.PatchedWritableInterfaceTemplateRequest;
import dev.icelabs.netbox.model.PatchedWritableInventoryItemRequest;
import dev.icelabs.netbox.model.PatchedWritableLocationRequest;
import dev.icelabs.netbox.model.PatchedWritableModuleRequest;
import dev.icelabs.netbox.model.PatchedWritableModuleTypeRequest;
import dev.icelabs.netbox.model.PatchedWritablePlatformRequest;
import dev.icelabs.netbox.model.PatchedWritablePowerFeedRequest;
import dev.icelabs.netbox.model.PatchedWritablePowerOutletRequest;
import dev.icelabs.netbox.model.PatchedWritablePowerOutletTemplateRequest;
import dev.icelabs.netbox.model.PatchedWritablePowerPortRequest;
import dev.icelabs.netbox.model.PatchedWritablePowerPortTemplateRequest;
import dev.icelabs.netbox.model.PatchedWritableRackRequest;
import dev.icelabs.netbox.model.PatchedWritableRackReservationRequest;
import dev.icelabs.netbox.model.PatchedWritableRackTypeRequest;
import dev.icelabs.netbox.model.PatchedWritableRearPortRequest;
import dev.icelabs.netbox.model.PatchedWritableRearPortTemplateRequest;
import dev.icelabs.netbox.model.PatchedWritableRegionRequest;
import dev.icelabs.netbox.model.PatchedWritableSiteGroupRequest;
import dev.icelabs.netbox.model.PatchedWritableSiteRequest;
import dev.icelabs.netbox.model.PatchedWritableVirtualChassisRequest;
import dev.icelabs.netbox.model.PatchedWritableVirtualDeviceContextRequest;
import dev.icelabs.netbox.model.Platform;
import dev.icelabs.netbox.model.PlatformRequest;
import dev.icelabs.netbox.model.PowerFeed;
import dev.icelabs.netbox.model.PowerFeedRequest;
import dev.icelabs.netbox.model.PowerOutlet;
import dev.icelabs.netbox.model.PowerOutletRequest;
import dev.icelabs.netbox.model.PowerOutletTemplate;
import dev.icelabs.netbox.model.PowerOutletTemplateRequest;
import dev.icelabs.netbox.model.PowerPanel;
import dev.icelabs.netbox.model.PowerPanelRequest;
import dev.icelabs.netbox.model.PowerPort;
import dev.icelabs.netbox.model.PowerPortRequest;
import dev.icelabs.netbox.model.PowerPortTemplate;
import dev.icelabs.netbox.model.PowerPortTemplateRequest;
import dev.icelabs.netbox.model.Rack;
import dev.icelabs.netbox.model.RackRequest;
import dev.icelabs.netbox.model.RackReservation;
import dev.icelabs.netbox.model.RackReservationRequest;
import dev.icelabs.netbox.model.RackRole;
import dev.icelabs.netbox.model.RackRoleRequest;
import dev.icelabs.netbox.model.RackType;
import dev.icelabs.netbox.model.RackTypeRequest;
import dev.icelabs.netbox.model.RearPort;
import dev.icelabs.netbox.model.RearPortRequest;
import dev.icelabs.netbox.model.RearPortTemplate;
import dev.icelabs.netbox.model.RearPortTemplateRequest;
import dev.icelabs.netbox.model.Region;
import dev.icelabs.netbox.model.RegionRequest;
import dev.icelabs.netbox.model.Site;
import dev.icelabs.netbox.model.SiteGroup;
import dev.icelabs.netbox.model.SiteGroupRequest;
import dev.icelabs.netbox.model.SiteRequest;
import java.util.UUID;
import dev.icelabs.netbox.model.VirtualChassis;
import dev.icelabs.netbox.model.VirtualChassisRequest;
import dev.icelabs.netbox.model.VirtualDeviceContext;
import dev.icelabs.netbox.model.VirtualDeviceContextRequest;
import dev.icelabs.netbox.model.WritableCableRequest;
import dev.icelabs.netbox.model.WritableConsolePortRequest;
import dev.icelabs.netbox.model.WritableConsolePortTemplateRequest;
import dev.icelabs.netbox.model.WritableConsoleServerPortRequest;
import dev.icelabs.netbox.model.WritableConsoleServerPortTemplateRequest;
import dev.icelabs.netbox.model.WritableDeviceRoleRequest;
import dev.icelabs.netbox.model.WritableDeviceTypeRequest;
import dev.icelabs.netbox.model.WritableDeviceWithConfigContextRequest;
import dev.icelabs.netbox.model.WritableFrontPortRequest;
import dev.icelabs.netbox.model.WritableFrontPortTemplateRequest;
import dev.icelabs.netbox.model.WritableInterfaceRequest;
import dev.icelabs.netbox.model.WritableInterfaceTemplateRequest;
import dev.icelabs.netbox.model.WritableInventoryItemRequest;
import dev.icelabs.netbox.model.WritableLocationRequest;
import dev.icelabs.netbox.model.WritableModuleRequest;
import dev.icelabs.netbox.model.WritableModuleTypeRequest;
import dev.icelabs.netbox.model.WritablePlatformRequest;
import dev.icelabs.netbox.model.WritablePowerFeedRequest;
import dev.icelabs.netbox.model.WritablePowerOutletRequest;
import dev.icelabs.netbox.model.WritablePowerOutletTemplateRequest;
import dev.icelabs.netbox.model.WritablePowerPortRequest;
import dev.icelabs.netbox.model.WritablePowerPortTemplateRequest;
import dev.icelabs.netbox.model.WritableRackRequest;
import dev.icelabs.netbox.model.WritableRackReservationRequest;
import dev.icelabs.netbox.model.WritableRackTypeRequest;
import dev.icelabs.netbox.model.WritableRearPortRequest;
import dev.icelabs.netbox.model.WritableRearPortTemplateRequest;
import dev.icelabs.netbox.model.WritableRegionRequest;
import dev.icelabs.netbox.model.WritableSiteGroupRequest;
import dev.icelabs.netbox.model.WritableSiteRequest;
import dev.icelabs.netbox.model.WritableVirtualChassisRequest;
import dev.icelabs.netbox.model.WritableVirtualDeviceContextRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DcimApi {
    @GET("api/dcim/cable-terminations/")
    Call<PaginatedCableTerminationList> dcimCableTerminationsList();

    @GET("api/dcim/cable-terminations/{id}/")
    Call<CableTermination> dcimCableTerminationsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/cables/")
    Call<Void> dcimCablesBulkDestroy(
            @retrofit2.http.Body List<CableRequest> cableRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/cables/")
    Call<List<Cable>> dcimCablesBulkPartialUpdate(
            @retrofit2.http.Body List<CableRequest> cableRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/cables/")
    Call<List<Cable>> dcimCablesBulkUpdate(
            @retrofit2.http.Body List<CableRequest> cableRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/cables/")
    Call<Cable> dcimCablesCreate(
            @retrofit2.http.Body DcimCablesCreateRequest dcimCablesCreateRequest);

    @DELETE("api/dcim/cables/{id}/")
    Call<Void> dcimCablesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/cables/")
    Call<PaginatedCableList> dcimCablesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/cables/{id}/")
    Call<Cable> dcimCablesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableCableRequest patchedWritableCableRequest);

    @GET("api/dcim/cables/{id}/")
    Call<Cable> dcimCablesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/cables/{id}/")
    Call<Cable> dcimCablesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableCableRequest writableCableRequest);

    @GET("api/dcim/connected-device/")
    Call<List<Device>> dcimConnectedDeviceList();

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/console-port-templates/")
    Call<Void> dcimConsolePortTemplatesBulkDestroy(
            @retrofit2.http.Body List<ConsolePortTemplateRequest> consolePortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-port-templates/")
    Call<List<ConsolePortTemplate>> dcimConsolePortTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<ConsolePortTemplateRequest> consolePortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-port-templates/")
    Call<List<ConsolePortTemplate>> dcimConsolePortTemplatesBulkUpdate(
            @retrofit2.http.Body List<ConsolePortTemplateRequest> consolePortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/console-port-templates/")
    Call<ConsolePortTemplate> dcimConsolePortTemplatesCreate(
            @retrofit2.http.Body DcimConsolePortTemplatesCreateRequest dcimConsolePortTemplatesCreateRequest);

    @DELETE("api/dcim/console-port-templates/{id}/")
    Call<Void> dcimConsolePortTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/console-port-templates/")
    Call<PaginatedConsolePortTemplateList> dcimConsolePortTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-port-templates/{id}/")
    Call<ConsolePortTemplate> dcimConsolePortTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableConsolePortTemplateRequest patchedWritableConsolePortTemplateRequest);

    @GET("api/dcim/console-port-templates/{id}/")
    Call<ConsolePortTemplate> dcimConsolePortTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-port-templates/{id}/")
    Call<ConsolePortTemplate> dcimConsolePortTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableConsolePortTemplateRequest writableConsolePortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/console-ports/")
    Call<Void> dcimConsolePortsBulkDestroy(
            @retrofit2.http.Body List<ConsolePortRequest> consolePortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-ports/")
    Call<List<ConsolePort>> dcimConsolePortsBulkPartialUpdate(
            @retrofit2.http.Body List<ConsolePortRequest> consolePortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-ports/")
    Call<List<ConsolePort>> dcimConsolePortsBulkUpdate(
            @retrofit2.http.Body List<ConsolePortRequest> consolePortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/console-ports/")
    Call<ConsolePort> dcimConsolePortsCreate(
            @retrofit2.http.Body DcimConsolePortsCreateRequest dcimConsolePortsCreateRequest);

    @DELETE("api/dcim/console-ports/{id}/")
    Call<Void> dcimConsolePortsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/console-ports/")
    Call<PaginatedConsolePortList> dcimConsolePortsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-ports/{id}/")
    Call<ConsolePort> dcimConsolePortsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableConsolePortRequest patchedWritableConsolePortRequest);

    @GET("api/dcim/console-ports/{id}/")
    Call<ConsolePort> dcimConsolePortsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/console-ports/{id}/trace/")
    Call<ConsolePort> dcimConsolePortsTraceRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-ports/{id}/")
    Call<ConsolePort> dcimConsolePortsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableConsolePortRequest writableConsolePortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/console-server-port-templates/")
    Call<Void> dcimConsoleServerPortTemplatesBulkDestroy(
            @retrofit2.http.Body List<ConsoleServerPortTemplateRequest> consoleServerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-server-port-templates/")
    Call<List<ConsoleServerPortTemplate>> dcimConsoleServerPortTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<ConsoleServerPortTemplateRequest> consoleServerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-server-port-templates/")
    Call<List<ConsoleServerPortTemplate>> dcimConsoleServerPortTemplatesBulkUpdate(
            @retrofit2.http.Body List<ConsoleServerPortTemplateRequest> consoleServerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/console-server-port-templates/")
    Call<ConsoleServerPortTemplate> dcimConsoleServerPortTemplatesCreate(
            @retrofit2.http.Body DcimConsoleServerPortTemplatesCreateRequest dcimConsoleServerPortTemplatesCreateRequest);

    @DELETE("api/dcim/console-server-port-templates/{id}/")
    Call<Void> dcimConsoleServerPortTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/console-server-port-templates/")
    Call<PaginatedConsoleServerPortTemplateList> dcimConsoleServerPortTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-server-port-templates/{id}/")
    Call<ConsoleServerPortTemplate> dcimConsoleServerPortTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableConsoleServerPortTemplateRequest patchedWritableConsoleServerPortTemplateRequest);

    @GET("api/dcim/console-server-port-templates/{id}/")
    Call<ConsoleServerPortTemplate> dcimConsoleServerPortTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-server-port-templates/{id}/")
    Call<ConsoleServerPortTemplate> dcimConsoleServerPortTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableConsoleServerPortTemplateRequest writableConsoleServerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/console-server-ports/")
    Call<Void> dcimConsoleServerPortsBulkDestroy(
            @retrofit2.http.Body List<ConsoleServerPortRequest> consoleServerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-server-ports/")
    Call<List<ConsoleServerPort>> dcimConsoleServerPortsBulkPartialUpdate(
            @retrofit2.http.Body List<ConsoleServerPortRequest> consoleServerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-server-ports/")
    Call<List<ConsoleServerPort>> dcimConsoleServerPortsBulkUpdate(
            @retrofit2.http.Body List<ConsoleServerPortRequest> consoleServerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/console-server-ports/")
    Call<ConsoleServerPort> dcimConsoleServerPortsCreate(
            @retrofit2.http.Body DcimConsoleServerPortsCreateRequest dcimConsoleServerPortsCreateRequest);

    @DELETE("api/dcim/console-server-ports/{id}/")
    Call<Void> dcimConsoleServerPortsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/console-server-ports/")
    Call<PaginatedConsoleServerPortList> dcimConsoleServerPortsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/console-server-ports/{id}/")
    Call<ConsoleServerPort> dcimConsoleServerPortsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableConsoleServerPortRequest patchedWritableConsoleServerPortRequest);

    @GET("api/dcim/console-server-ports/{id}/")
    Call<ConsoleServerPort> dcimConsoleServerPortsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/console-server-ports/{id}/trace/")
    Call<ConsoleServerPort> dcimConsoleServerPortsTraceRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/console-server-ports/{id}/")
    Call<ConsoleServerPort> dcimConsoleServerPortsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableConsoleServerPortRequest writableConsoleServerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/device-bay-templates/")
    Call<Void> dcimDeviceBayTemplatesBulkDestroy(
            @retrofit2.http.Body List<DeviceBayTemplateRequest> deviceBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-bay-templates/")
    Call<List<DeviceBayTemplate>> dcimDeviceBayTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<DeviceBayTemplateRequest> deviceBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-bay-templates/")
    Call<List<DeviceBayTemplate>> dcimDeviceBayTemplatesBulkUpdate(
            @retrofit2.http.Body List<DeviceBayTemplateRequest> deviceBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/device-bay-templates/")
    Call<DeviceBayTemplate> dcimDeviceBayTemplatesCreate(
            @retrofit2.http.Body DcimDeviceBayTemplatesCreateRequest dcimDeviceBayTemplatesCreateRequest);

    @DELETE("api/dcim/device-bay-templates/{id}/")
    Call<Void> dcimDeviceBayTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/device-bay-templates/")
    Call<PaginatedDeviceBayTemplateList> dcimDeviceBayTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-bay-templates/{id}/")
    Call<DeviceBayTemplate> dcimDeviceBayTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedDeviceBayTemplateRequest patchedDeviceBayTemplateRequest);

    @GET("api/dcim/device-bay-templates/{id}/")
    Call<DeviceBayTemplate> dcimDeviceBayTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-bay-templates/{id}/")
    Call<DeviceBayTemplate> dcimDeviceBayTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body DeviceBayTemplateRequest deviceBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/device-bays/")
    Call<Void> dcimDeviceBaysBulkDestroy(
            @retrofit2.http.Body List<DeviceBayRequest> deviceBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-bays/")
    Call<List<DeviceBay>> dcimDeviceBaysBulkPartialUpdate(
            @retrofit2.http.Body List<DeviceBayRequest> deviceBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-bays/")
    Call<List<DeviceBay>> dcimDeviceBaysBulkUpdate(
            @retrofit2.http.Body List<DeviceBayRequest> deviceBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/device-bays/")
    Call<DeviceBay> dcimDeviceBaysCreate(
            @retrofit2.http.Body DcimDeviceBaysCreateRequest dcimDeviceBaysCreateRequest);

    @DELETE("api/dcim/device-bays/{id}/")
    Call<Void> dcimDeviceBaysDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/device-bays/")
    Call<PaginatedDeviceBayList> dcimDeviceBaysList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-bays/{id}/")
    Call<DeviceBay> dcimDeviceBaysPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedDeviceBayRequest patchedDeviceBayRequest);

    @GET("api/dcim/device-bays/{id}/")
    Call<DeviceBay> dcimDeviceBaysRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-bays/{id}/")
    Call<DeviceBay> dcimDeviceBaysUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body DeviceBayRequest deviceBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/device-roles/")
    Call<Void> dcimDeviceRolesBulkDestroy(
            @retrofit2.http.Body List<DeviceRoleRequest> deviceRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-roles/")
    Call<List<DeviceRole>> dcimDeviceRolesBulkPartialUpdate(
            @retrofit2.http.Body List<DeviceRoleRequest> deviceRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-roles/")
    Call<List<DeviceRole>> dcimDeviceRolesBulkUpdate(
            @retrofit2.http.Body List<DeviceRoleRequest> deviceRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/device-roles/")
    Call<DeviceRole> dcimDeviceRolesCreate(
            @retrofit2.http.Body DcimDeviceRolesCreateRequest dcimDeviceRolesCreateRequest);

    @DELETE("api/dcim/device-roles/{id}/")
    Call<Void> dcimDeviceRolesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/device-roles/")
    Call<PaginatedDeviceRoleList> dcimDeviceRolesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-roles/{id}/")
    Call<DeviceRole> dcimDeviceRolesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableDeviceRoleRequest patchedWritableDeviceRoleRequest);

    @GET("api/dcim/device-roles/{id}/")
    Call<DeviceRole> dcimDeviceRolesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-roles/{id}/")
    Call<DeviceRole> dcimDeviceRolesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableDeviceRoleRequest writableDeviceRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/device-types/")
    Call<Void> dcimDeviceTypesBulkDestroy(
            @retrofit2.http.Body List<DeviceTypeRequest> deviceTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-types/")
    Call<List<DeviceType>> dcimDeviceTypesBulkPartialUpdate(
            @retrofit2.http.Body List<DeviceTypeRequest> deviceTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-types/")
    Call<List<DeviceType>> dcimDeviceTypesBulkUpdate(
            @retrofit2.http.Body List<DeviceTypeRequest> deviceTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/device-types/")
    Call<DeviceType> dcimDeviceTypesCreate(
            @retrofit2.http.Body DcimDeviceTypesCreateRequest dcimDeviceTypesCreateRequest);

    @DELETE("api/dcim/device-types/{id}/")
    Call<Void> dcimDeviceTypesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/device-types/")
    Call<PaginatedDeviceTypeList> dcimDeviceTypesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/device-types/{id}/")
    Call<DeviceType> dcimDeviceTypesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableDeviceTypeRequest patchedWritableDeviceTypeRequest);

    @GET("api/dcim/device-types/{id}/")
    Call<DeviceType> dcimDeviceTypesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/device-types/{id}/")
    Call<DeviceType> dcimDeviceTypesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableDeviceTypeRequest writableDeviceTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/devices/")
    Call<Void> dcimDevicesBulkDestroy(
            @retrofit2.http.Body List<DeviceWithConfigContextRequest> deviceWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/devices/")
    Call<List<DeviceWithConfigContext>> dcimDevicesBulkPartialUpdate(
            @retrofit2.http.Body List<DeviceWithConfigContextRequest> deviceWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/devices/")
    Call<List<DeviceWithConfigContext>> dcimDevicesBulkUpdate(
            @retrofit2.http.Body List<DeviceWithConfigContextRequest> deviceWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/devices/")
    Call<DeviceWithConfigContext> dcimDevicesCreate(
            @retrofit2.http.Body DcimDevicesCreateRequest dcimDevicesCreateRequest);

    @DELETE("api/dcim/devices/{id}/")
    Call<Void> dcimDevicesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/devices/")
    Call<PaginatedDeviceWithConfigContextList> dcimDevicesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/devices/{id}/")
    Call<DeviceWithConfigContext> dcimDevicesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableDeviceWithConfigContextRequest patchedWritableDeviceWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/devices/{id}/render-config/")
    Call<DeviceWithConfigContext> dcimDevicesRenderConfigCreate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableDeviceWithConfigContextRequest writableDeviceWithConfigContextRequest);

    @GET("api/dcim/devices/{id}/")
    Call<DeviceWithConfigContext> dcimDevicesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/devices/{id}/")
    Call<DeviceWithConfigContext> dcimDevicesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableDeviceWithConfigContextRequest writableDeviceWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/front-port-templates/")
    Call<Void> dcimFrontPortTemplatesBulkDestroy(
            @retrofit2.http.Body List<FrontPortTemplateRequest> frontPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/front-port-templates/")
    Call<List<FrontPortTemplate>> dcimFrontPortTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<FrontPortTemplateRequest> frontPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/front-port-templates/")
    Call<List<FrontPortTemplate>> dcimFrontPortTemplatesBulkUpdate(
            @retrofit2.http.Body List<FrontPortTemplateRequest> frontPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/front-port-templates/")
    Call<FrontPortTemplate> dcimFrontPortTemplatesCreate(
            @retrofit2.http.Body DcimFrontPortTemplatesCreateRequest dcimFrontPortTemplatesCreateRequest);

    @DELETE("api/dcim/front-port-templates/{id}/")
    Call<Void> dcimFrontPortTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/front-port-templates/")
    Call<PaginatedFrontPortTemplateList> dcimFrontPortTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/front-port-templates/{id}/")
    Call<FrontPortTemplate> dcimFrontPortTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableFrontPortTemplateRequest patchedWritableFrontPortTemplateRequest);

    @GET("api/dcim/front-port-templates/{id}/")
    Call<FrontPortTemplate> dcimFrontPortTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/front-port-templates/{id}/")
    Call<FrontPortTemplate> dcimFrontPortTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableFrontPortTemplateRequest writableFrontPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/front-ports/")
    Call<Void> dcimFrontPortsBulkDestroy(
            @retrofit2.http.Body List<FrontPortRequest> frontPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/front-ports/")
    Call<List<FrontPort>> dcimFrontPortsBulkPartialUpdate(
            @retrofit2.http.Body List<FrontPortRequest> frontPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/front-ports/")
    Call<List<FrontPort>> dcimFrontPortsBulkUpdate(
            @retrofit2.http.Body List<FrontPortRequest> frontPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/front-ports/")
    Call<FrontPort> dcimFrontPortsCreate(
            @retrofit2.http.Body DcimFrontPortsCreateRequest dcimFrontPortsCreateRequest);

    @DELETE("api/dcim/front-ports/{id}/")
    Call<Void> dcimFrontPortsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/front-ports/")
    Call<PaginatedFrontPortList> dcimFrontPortsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/front-ports/{id}/")
    Call<FrontPort> dcimFrontPortsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableFrontPortRequest patchedWritableFrontPortRequest);

    @GET("api/dcim/front-ports/{id}/paths/")
    Call<FrontPort> dcimFrontPortsPathsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/front-ports/{id}/")
    Call<FrontPort> dcimFrontPortsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/front-ports/{id}/")
    Call<FrontPort> dcimFrontPortsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableFrontPortRequest writableFrontPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/interface-templates/")
    Call<Void> dcimInterfaceTemplatesBulkDestroy(
            @retrofit2.http.Body List<InterfaceTemplateRequest> interfaceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/interface-templates/")
    Call<List<InterfaceTemplate>> dcimInterfaceTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<InterfaceTemplateRequest> interfaceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/interface-templates/")
    Call<List<InterfaceTemplate>> dcimInterfaceTemplatesBulkUpdate(
            @retrofit2.http.Body List<InterfaceTemplateRequest> interfaceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/interface-templates/")
    Call<InterfaceTemplate> dcimInterfaceTemplatesCreate(
            @retrofit2.http.Body DcimInterfaceTemplatesCreateRequest dcimInterfaceTemplatesCreateRequest);

    @DELETE("api/dcim/interface-templates/{id}/")
    Call<Void> dcimInterfaceTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/interface-templates/")
    Call<PaginatedInterfaceTemplateList> dcimInterfaceTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/interface-templates/{id}/")
    Call<InterfaceTemplate> dcimInterfaceTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableInterfaceTemplateRequest patchedWritableInterfaceTemplateRequest);

    @GET("api/dcim/interface-templates/{id}/")
    Call<InterfaceTemplate> dcimInterfaceTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/interface-templates/{id}/")
    Call<InterfaceTemplate> dcimInterfaceTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableInterfaceTemplateRequest writableInterfaceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/interfaces/")
    Call<Void> dcimInterfacesBulkDestroy(
            @retrofit2.http.Body List<InterfaceRequest> interfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/interfaces/")
    Call<List<ModelInterface>> dcimInterfacesBulkPartialUpdate(
            @retrofit2.http.Body List<InterfaceRequest> interfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/interfaces/")
    Call<List<ModelInterface>> dcimInterfacesBulkUpdate(
            @retrofit2.http.Body List<InterfaceRequest> interfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/interfaces/")
    Call<ModelInterface> dcimInterfacesCreate(
            @retrofit2.http.Body DcimInterfacesCreateRequest dcimInterfacesCreateRequest);

    @DELETE("api/dcim/interfaces/{id}/")
    Call<Void> dcimInterfacesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/interfaces/")
    Call<PaginatedInterfaceList> dcimInterfacesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/interfaces/{id}/")
    Call<ModelInterface> dcimInterfacesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableInterfaceRequest patchedWritableInterfaceRequest);

    @GET("api/dcim/interfaces/{id}/")
    Call<ModelInterface> dcimInterfacesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/interfaces/{id}/trace/")
    Call<ModelInterface> dcimInterfacesTraceRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/interfaces/{id}/")
    Call<ModelInterface> dcimInterfacesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableInterfaceRequest writableInterfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/inventory-item-roles/")
    Call<Void> dcimInventoryItemRolesBulkDestroy(
            @retrofit2.http.Body List<InventoryItemRoleRequest> inventoryItemRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/inventory-item-roles/")
    Call<List<InventoryItemRole>> dcimInventoryItemRolesBulkPartialUpdate(
            @retrofit2.http.Body List<InventoryItemRoleRequest> inventoryItemRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/inventory-item-roles/")
    Call<List<InventoryItemRole>> dcimInventoryItemRolesBulkUpdate(
            @retrofit2.http.Body List<InventoryItemRoleRequest> inventoryItemRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/inventory-item-roles/")
    Call<InventoryItemRole> dcimInventoryItemRolesCreate(
            @retrofit2.http.Body DcimInventoryItemRolesCreateRequest dcimInventoryItemRolesCreateRequest);

    @DELETE("api/dcim/inventory-item-roles/{id}/")
    Call<Void> dcimInventoryItemRolesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/inventory-item-roles/")
    Call<PaginatedInventoryItemRoleList> dcimInventoryItemRolesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/inventory-item-roles/{id}/")
    Call<InventoryItemRole> dcimInventoryItemRolesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedInventoryItemRoleRequest patchedInventoryItemRoleRequest);

    @GET("api/dcim/inventory-item-roles/{id}/")
    Call<InventoryItemRole> dcimInventoryItemRolesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/inventory-item-roles/{id}/")
    Call<InventoryItemRole> dcimInventoryItemRolesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body InventoryItemRoleRequest inventoryItemRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/inventory-item-templates/")
    Call<Void> dcimInventoryItemTemplatesBulkDestroy(
            @retrofit2.http.Body List<InventoryItemTemplateRequest> inventoryItemTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/inventory-item-templates/")
    Call<List<InventoryItemTemplate>> dcimInventoryItemTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<InventoryItemTemplateRequest> inventoryItemTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/inventory-item-templates/")
    Call<List<InventoryItemTemplate>> dcimInventoryItemTemplatesBulkUpdate(
            @retrofit2.http.Body List<InventoryItemTemplateRequest> inventoryItemTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/inventory-item-templates/")
    Call<InventoryItemTemplate> dcimInventoryItemTemplatesCreate(
            @retrofit2.http.Body DcimInventoryItemTemplatesCreateRequest dcimInventoryItemTemplatesCreateRequest);

    @DELETE("api/dcim/inventory-item-templates/{id}/")
    Call<Void> dcimInventoryItemTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/inventory-item-templates/")
    Call<PaginatedInventoryItemTemplateList> dcimInventoryItemTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/inventory-item-templates/{id}/")
    Call<InventoryItemTemplate> dcimInventoryItemTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedInventoryItemTemplateRequest patchedInventoryItemTemplateRequest);

    @GET("api/dcim/inventory-item-templates/{id}/")
    Call<InventoryItemTemplate> dcimInventoryItemTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/inventory-item-templates/{id}/")
    Call<InventoryItemTemplate> dcimInventoryItemTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body InventoryItemTemplateRequest inventoryItemTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/inventory-items/")
    Call<Void> dcimInventoryItemsBulkDestroy(
            @retrofit2.http.Body List<InventoryItemRequest> inventoryItemRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/inventory-items/")
    Call<List<InventoryItem>> dcimInventoryItemsBulkPartialUpdate(
            @retrofit2.http.Body List<InventoryItemRequest> inventoryItemRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/inventory-items/")
    Call<List<InventoryItem>> dcimInventoryItemsBulkUpdate(
            @retrofit2.http.Body List<InventoryItemRequest> inventoryItemRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/inventory-items/")
    Call<InventoryItem> dcimInventoryItemsCreate(
            @retrofit2.http.Body DcimInventoryItemsCreateRequest dcimInventoryItemsCreateRequest);

    @DELETE("api/dcim/inventory-items/{id}/")
    Call<Void> dcimInventoryItemsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/inventory-items/")
    Call<PaginatedInventoryItemList> dcimInventoryItemsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/inventory-items/{id}/")
    Call<InventoryItem> dcimInventoryItemsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableInventoryItemRequest patchedWritableInventoryItemRequest);

    @GET("api/dcim/inventory-items/{id}/")
    Call<InventoryItem> dcimInventoryItemsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/inventory-items/{id}/")
    Call<InventoryItem> dcimInventoryItemsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableInventoryItemRequest writableInventoryItemRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/locations/")
    Call<Void> dcimLocationsBulkDestroy(
            @retrofit2.http.Body List<LocationRequest> locationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/locations/")
    Call<List<Location>> dcimLocationsBulkPartialUpdate(
            @retrofit2.http.Body List<LocationRequest> locationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/locations/")
    Call<List<Location>> dcimLocationsBulkUpdate(
            @retrofit2.http.Body List<LocationRequest> locationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/locations/")
    Call<Location> dcimLocationsCreate(
            @retrofit2.http.Body DcimLocationsCreateRequest dcimLocationsCreateRequest);

    @DELETE("api/dcim/locations/{id}/")
    Call<Void> dcimLocationsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/locations/")
    Call<PaginatedLocationList> dcimLocationsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/locations/{id}/")
    Call<Location> dcimLocationsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableLocationRequest patchedWritableLocationRequest);

    @GET("api/dcim/locations/{id}/")
    Call<Location> dcimLocationsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/locations/{id}/")
    Call<Location> dcimLocationsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableLocationRequest writableLocationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/mac-addresses/")
    Call<Void> dcimMacAddressesBulkDestroy(
            @retrofit2.http.Body List<MACAddressRequest> maCAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/mac-addresses/")
    Call<List<MACAddress>> dcimMacAddressesBulkPartialUpdate(
            @retrofit2.http.Body List<MACAddressRequest> maCAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/mac-addresses/")
    Call<List<MACAddress>> dcimMacAddressesBulkUpdate(
            @retrofit2.http.Body List<MACAddressRequest> maCAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/mac-addresses/")
    Call<MACAddress> dcimMacAddressesCreate(
            @retrofit2.http.Body DcimMacAddressesCreateRequest dcimMacAddressesCreateRequest);

    @DELETE("api/dcim/mac-addresses/{id}/")
    Call<Void> dcimMacAddressesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/mac-addresses/")
    Call<PaginatedMACAddressList> dcimMacAddressesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/mac-addresses/{id}/")
    Call<MACAddress> dcimMacAddressesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedMACAddressRequest patchedMACAddressRequest);

    @GET("api/dcim/mac-addresses/{id}/")
    Call<MACAddress> dcimMacAddressesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/mac-addresses/{id}/")
    Call<MACAddress> dcimMacAddressesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body MACAddressRequest maCAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/manufacturers/")
    Call<Void> dcimManufacturersBulkDestroy(
            @retrofit2.http.Body List<ManufacturerRequest> manufacturerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/manufacturers/")
    Call<List<Manufacturer>> dcimManufacturersBulkPartialUpdate(
            @retrofit2.http.Body List<ManufacturerRequest> manufacturerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/manufacturers/")
    Call<List<Manufacturer>> dcimManufacturersBulkUpdate(
            @retrofit2.http.Body List<ManufacturerRequest> manufacturerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/manufacturers/")
    Call<Manufacturer> dcimManufacturersCreate(
            @retrofit2.http.Body DcimManufacturersCreateRequest dcimManufacturersCreateRequest);

    @DELETE("api/dcim/manufacturers/{id}/")
    Call<Void> dcimManufacturersDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/manufacturers/")
    Call<PaginatedManufacturerList> dcimManufacturersList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/manufacturers/{id}/")
    Call<Manufacturer> dcimManufacturersPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedManufacturerRequest patchedManufacturerRequest);

    @GET("api/dcim/manufacturers/{id}/")
    Call<Manufacturer> dcimManufacturersRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/manufacturers/{id}/")
    Call<Manufacturer> dcimManufacturersUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ManufacturerRequest manufacturerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/module-bay-templates/")
    Call<Void> dcimModuleBayTemplatesBulkDestroy(
            @retrofit2.http.Body List<ModuleBayTemplateRequest> moduleBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-bay-templates/")
    Call<List<ModuleBayTemplate>> dcimModuleBayTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<ModuleBayTemplateRequest> moduleBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-bay-templates/")
    Call<List<ModuleBayTemplate>> dcimModuleBayTemplatesBulkUpdate(
            @retrofit2.http.Body List<ModuleBayTemplateRequest> moduleBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/module-bay-templates/")
    Call<ModuleBayTemplate> dcimModuleBayTemplatesCreate(
            @retrofit2.http.Body DcimModuleBayTemplatesCreateRequest dcimModuleBayTemplatesCreateRequest);

    @DELETE("api/dcim/module-bay-templates/{id}/")
    Call<Void> dcimModuleBayTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/module-bay-templates/")
    Call<PaginatedModuleBayTemplateList> dcimModuleBayTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-bay-templates/{id}/")
    Call<ModuleBayTemplate> dcimModuleBayTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedModuleBayTemplateRequest patchedModuleBayTemplateRequest);

    @GET("api/dcim/module-bay-templates/{id}/")
    Call<ModuleBayTemplate> dcimModuleBayTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-bay-templates/{id}/")
    Call<ModuleBayTemplate> dcimModuleBayTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body ModuleBayTemplateRequest moduleBayTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/module-bays/")
    Call<Void> dcimModuleBaysBulkDestroy(
            @retrofit2.http.Body List<ModuleBayRequest> moduleBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-bays/")
    Call<List<ModuleBay>> dcimModuleBaysBulkPartialUpdate(
            @retrofit2.http.Body List<ModuleBayRequest> moduleBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-bays/")
    Call<List<ModuleBay>> dcimModuleBaysBulkUpdate(
            @retrofit2.http.Body List<ModuleBayRequest> moduleBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/module-bays/")
    Call<ModuleBay> dcimModuleBaysCreate(
            @retrofit2.http.Body DcimModuleBaysCreateRequest dcimModuleBaysCreateRequest);

    @DELETE("api/dcim/module-bays/{id}/")
    Call<Void> dcimModuleBaysDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/module-bays/")
    Call<PaginatedModuleBayList> dcimModuleBaysList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-bays/{id}/")
    Call<ModuleBay> dcimModuleBaysPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedModuleBayRequest patchedModuleBayRequest);

    @GET("api/dcim/module-bays/{id}/")
    Call<ModuleBay> dcimModuleBaysRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-bays/{id}/")
    Call<ModuleBay> dcimModuleBaysUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ModuleBayRequest moduleBayRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/module-type-profiles/")
    Call<Void> dcimModuleTypeProfilesBulkDestroy(
            @retrofit2.http.Body List<ModuleTypeProfileRequest> moduleTypeProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-type-profiles/")
    Call<List<ModuleTypeProfile>> dcimModuleTypeProfilesBulkPartialUpdate(
            @retrofit2.http.Body List<ModuleTypeProfileRequest> moduleTypeProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-type-profiles/")
    Call<List<ModuleTypeProfile>> dcimModuleTypeProfilesBulkUpdate(
            @retrofit2.http.Body List<ModuleTypeProfileRequest> moduleTypeProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/module-type-profiles/")
    Call<ModuleTypeProfile> dcimModuleTypeProfilesCreate(
            @retrofit2.http.Body DcimModuleTypeProfilesCreateRequest dcimModuleTypeProfilesCreateRequest);

    @DELETE("api/dcim/module-type-profiles/{id}/")
    Call<Void> dcimModuleTypeProfilesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/module-type-profiles/")
    Call<PaginatedModuleTypeProfileList> dcimModuleTypeProfilesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-type-profiles/{id}/")
    Call<ModuleTypeProfile> dcimModuleTypeProfilesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedModuleTypeProfileRequest patchedModuleTypeProfileRequest);

    @GET("api/dcim/module-type-profiles/{id}/")
    Call<ModuleTypeProfile> dcimModuleTypeProfilesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-type-profiles/{id}/")
    Call<ModuleTypeProfile> dcimModuleTypeProfilesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body ModuleTypeProfileRequest moduleTypeProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/module-types/")
    Call<Void> dcimModuleTypesBulkDestroy(
            @retrofit2.http.Body List<ModuleTypeRequest> moduleTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-types/")
    Call<List<ModuleType>> dcimModuleTypesBulkPartialUpdate(
            @retrofit2.http.Body List<ModuleTypeRequest> moduleTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-types/")
    Call<List<ModuleType>> dcimModuleTypesBulkUpdate(
            @retrofit2.http.Body List<ModuleTypeRequest> moduleTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/module-types/")
    Call<ModuleType> dcimModuleTypesCreate(
            @retrofit2.http.Body DcimModuleTypesCreateRequest dcimModuleTypesCreateRequest);

    @DELETE("api/dcim/module-types/{id}/")
    Call<Void> dcimModuleTypesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/module-types/")
    Call<PaginatedModuleTypeList> dcimModuleTypesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/module-types/{id}/")
    Call<ModuleType> dcimModuleTypesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableModuleTypeRequest patchedWritableModuleTypeRequest);

    @GET("api/dcim/module-types/{id}/")
    Call<ModuleType> dcimModuleTypesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/module-types/{id}/")
    Call<ModuleType> dcimModuleTypesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableModuleTypeRequest writableModuleTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/modules/")
    Call<Void> dcimModulesBulkDestroy(
            @retrofit2.http.Body List<ModuleRequest> moduleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/modules/")
    Call<List<Module>> dcimModulesBulkPartialUpdate(
            @retrofit2.http.Body List<ModuleRequest> moduleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/modules/")
    Call<List<Module>> dcimModulesBulkUpdate(
            @retrofit2.http.Body List<ModuleRequest> moduleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/modules/")
    Call<Module> dcimModulesCreate(
            @retrofit2.http.Body DcimModulesCreateRequest dcimModulesCreateRequest);

    @DELETE("api/dcim/modules/{id}/")
    Call<Void> dcimModulesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/modules/")
    Call<PaginatedModuleList> dcimModulesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/modules/{id}/")
    Call<Module> dcimModulesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableModuleRequest patchedWritableModuleRequest);

    @GET("api/dcim/modules/{id}/")
    Call<Module> dcimModulesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/modules/{id}/")
    Call<Module> dcimModulesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableModuleRequest writableModuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/platforms/")
    Call<Void> dcimPlatformsBulkDestroy(
            @retrofit2.http.Body List<PlatformRequest> platformRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/platforms/")
    Call<List<Platform>> dcimPlatformsBulkPartialUpdate(
            @retrofit2.http.Body List<PlatformRequest> platformRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/platforms/")
    Call<List<Platform>> dcimPlatformsBulkUpdate(
            @retrofit2.http.Body List<PlatformRequest> platformRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/platforms/")
    Call<Platform> dcimPlatformsCreate(
            @retrofit2.http.Body DcimPlatformsCreateRequest dcimPlatformsCreateRequest);

    @DELETE("api/dcim/platforms/{id}/")
    Call<Void> dcimPlatformsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/platforms/")
    Call<PaginatedPlatformList> dcimPlatformsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/platforms/{id}/")
    Call<Platform> dcimPlatformsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritablePlatformRequest patchedWritablePlatformRequest);

    @GET("api/dcim/platforms/{id}/")
    Call<Platform> dcimPlatformsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/platforms/{id}/")
    Call<Platform> dcimPlatformsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritablePlatformRequest writablePlatformRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/power-feeds/")
    Call<Void> dcimPowerFeedsBulkDestroy(
            @retrofit2.http.Body List<PowerFeedRequest> powerFeedRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-feeds/")
    Call<List<PowerFeed>> dcimPowerFeedsBulkPartialUpdate(
            @retrofit2.http.Body List<PowerFeedRequest> powerFeedRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-feeds/")
    Call<List<PowerFeed>> dcimPowerFeedsBulkUpdate(
            @retrofit2.http.Body List<PowerFeedRequest> powerFeedRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/power-feeds/")
    Call<PowerFeed> dcimPowerFeedsCreate(
            @retrofit2.http.Body DcimPowerFeedsCreateRequest dcimPowerFeedsCreateRequest);

    @DELETE("api/dcim/power-feeds/{id}/")
    Call<Void> dcimPowerFeedsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-feeds/")
    Call<PaginatedPowerFeedList> dcimPowerFeedsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-feeds/{id}/")
    Call<PowerFeed> dcimPowerFeedsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritablePowerFeedRequest patchedWritablePowerFeedRequest);

    @GET("api/dcim/power-feeds/{id}/")
    Call<PowerFeed> dcimPowerFeedsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-feeds/{id}/trace/")
    Call<PowerFeed> dcimPowerFeedsTraceRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-feeds/{id}/")
    Call<PowerFeed> dcimPowerFeedsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritablePowerFeedRequest writablePowerFeedRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/power-outlet-templates/")
    Call<Void> dcimPowerOutletTemplatesBulkDestroy(
            @retrofit2.http.Body List<PowerOutletTemplateRequest> powerOutletTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-outlet-templates/")
    Call<List<PowerOutletTemplate>> dcimPowerOutletTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<PowerOutletTemplateRequest> powerOutletTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-outlet-templates/")
    Call<List<PowerOutletTemplate>> dcimPowerOutletTemplatesBulkUpdate(
            @retrofit2.http.Body List<PowerOutletTemplateRequest> powerOutletTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/power-outlet-templates/")
    Call<PowerOutletTemplate> dcimPowerOutletTemplatesCreate(
            @retrofit2.http.Body DcimPowerOutletTemplatesCreateRequest dcimPowerOutletTemplatesCreateRequest);

    @DELETE("api/dcim/power-outlet-templates/{id}/")
    Call<Void> dcimPowerOutletTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-outlet-templates/")
    Call<PaginatedPowerOutletTemplateList> dcimPowerOutletTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-outlet-templates/{id}/")
    Call<PowerOutletTemplate> dcimPowerOutletTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritablePowerOutletTemplateRequest patchedWritablePowerOutletTemplateRequest);

    @GET("api/dcim/power-outlet-templates/{id}/")
    Call<PowerOutletTemplate> dcimPowerOutletTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-outlet-templates/{id}/")
    Call<PowerOutletTemplate> dcimPowerOutletTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritablePowerOutletTemplateRequest writablePowerOutletTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/power-outlets/")
    Call<Void> dcimPowerOutletsBulkDestroy(
            @retrofit2.http.Body List<PowerOutletRequest> powerOutletRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-outlets/")
    Call<List<PowerOutlet>> dcimPowerOutletsBulkPartialUpdate(
            @retrofit2.http.Body List<PowerOutletRequest> powerOutletRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-outlets/")
    Call<List<PowerOutlet>> dcimPowerOutletsBulkUpdate(
            @retrofit2.http.Body List<PowerOutletRequest> powerOutletRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/power-outlets/")
    Call<PowerOutlet> dcimPowerOutletsCreate(
            @retrofit2.http.Body DcimPowerOutletsCreateRequest dcimPowerOutletsCreateRequest);

    @DELETE("api/dcim/power-outlets/{id}/")
    Call<Void> dcimPowerOutletsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-outlets/")
    Call<PaginatedPowerOutletList> dcimPowerOutletsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-outlets/{id}/")
    Call<PowerOutlet> dcimPowerOutletsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritablePowerOutletRequest patchedWritablePowerOutletRequest);

    @GET("api/dcim/power-outlets/{id}/")
    Call<PowerOutlet> dcimPowerOutletsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-outlets/{id}/trace/")
    Call<PowerOutlet> dcimPowerOutletsTraceRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-outlets/{id}/")
    Call<PowerOutlet> dcimPowerOutletsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritablePowerOutletRequest writablePowerOutletRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/power-panels/")
    Call<Void> dcimPowerPanelsBulkDestroy(
            @retrofit2.http.Body List<PowerPanelRequest> powerPanelRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-panels/")
    Call<List<PowerPanel>> dcimPowerPanelsBulkPartialUpdate(
            @retrofit2.http.Body List<PowerPanelRequest> powerPanelRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-panels/")
    Call<List<PowerPanel>> dcimPowerPanelsBulkUpdate(
            @retrofit2.http.Body List<PowerPanelRequest> powerPanelRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/power-panels/")
    Call<PowerPanel> dcimPowerPanelsCreate(
            @retrofit2.http.Body DcimPowerPanelsCreateRequest dcimPowerPanelsCreateRequest);

    @DELETE("api/dcim/power-panels/{id}/")
    Call<Void> dcimPowerPanelsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-panels/")
    Call<PaginatedPowerPanelList> dcimPowerPanelsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-panels/{id}/")
    Call<PowerPanel> dcimPowerPanelsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedPowerPanelRequest patchedPowerPanelRequest);

    @GET("api/dcim/power-panels/{id}/")
    Call<PowerPanel> dcimPowerPanelsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-panels/{id}/")
    Call<PowerPanel> dcimPowerPanelsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PowerPanelRequest powerPanelRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/power-port-templates/")
    Call<Void> dcimPowerPortTemplatesBulkDestroy(
            @retrofit2.http.Body List<PowerPortTemplateRequest> powerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-port-templates/")
    Call<List<PowerPortTemplate>> dcimPowerPortTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<PowerPortTemplateRequest> powerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-port-templates/")
    Call<List<PowerPortTemplate>> dcimPowerPortTemplatesBulkUpdate(
            @retrofit2.http.Body List<PowerPortTemplateRequest> powerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/power-port-templates/")
    Call<PowerPortTemplate> dcimPowerPortTemplatesCreate(
            @retrofit2.http.Body DcimPowerPortTemplatesCreateRequest dcimPowerPortTemplatesCreateRequest);

    @DELETE("api/dcim/power-port-templates/{id}/")
    Call<Void> dcimPowerPortTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-port-templates/")
    Call<PaginatedPowerPortTemplateList> dcimPowerPortTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-port-templates/{id}/")
    Call<PowerPortTemplate> dcimPowerPortTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritablePowerPortTemplateRequest patchedWritablePowerPortTemplateRequest);

    @GET("api/dcim/power-port-templates/{id}/")
    Call<PowerPortTemplate> dcimPowerPortTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-port-templates/{id}/")
    Call<PowerPortTemplate> dcimPowerPortTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritablePowerPortTemplateRequest writablePowerPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/power-ports/")
    Call<Void> dcimPowerPortsBulkDestroy(
            @retrofit2.http.Body List<PowerPortRequest> powerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-ports/")
    Call<List<PowerPort>> dcimPowerPortsBulkPartialUpdate(
            @retrofit2.http.Body List<PowerPortRequest> powerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-ports/")
    Call<List<PowerPort>> dcimPowerPortsBulkUpdate(
            @retrofit2.http.Body List<PowerPortRequest> powerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/power-ports/")
    Call<PowerPort> dcimPowerPortsCreate(
            @retrofit2.http.Body DcimPowerPortsCreateRequest dcimPowerPortsCreateRequest);

    @DELETE("api/dcim/power-ports/{id}/")
    Call<Void> dcimPowerPortsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-ports/")
    Call<PaginatedPowerPortList> dcimPowerPortsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/power-ports/{id}/")
    Call<PowerPort> dcimPowerPortsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritablePowerPortRequest patchedWritablePowerPortRequest);

    @GET("api/dcim/power-ports/{id}/")
    Call<PowerPort> dcimPowerPortsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/power-ports/{id}/trace/")
    Call<PowerPort> dcimPowerPortsTraceRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/power-ports/{id}/")
    Call<PowerPort> dcimPowerPortsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritablePowerPortRequest writablePowerPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/rack-reservations/")
    Call<Void> dcimRackReservationsBulkDestroy(
            @retrofit2.http.Body List<RackReservationRequest> rackReservationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rack-reservations/")
    Call<List<RackReservation>> dcimRackReservationsBulkPartialUpdate(
            @retrofit2.http.Body List<RackReservationRequest> rackReservationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rack-reservations/")
    Call<List<RackReservation>> dcimRackReservationsBulkUpdate(
            @retrofit2.http.Body List<RackReservationRequest> rackReservationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/rack-reservations/")
    Call<RackReservation> dcimRackReservationsCreate(
            @retrofit2.http.Body DcimRackReservationsCreateRequest dcimRackReservationsCreateRequest);

    @DELETE("api/dcim/rack-reservations/{id}/")
    Call<Void> dcimRackReservationsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/rack-reservations/")
    Call<PaginatedRackReservationList> dcimRackReservationsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rack-reservations/{id}/")
    Call<RackReservation> dcimRackReservationsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableRackReservationRequest patchedWritableRackReservationRequest);

    @GET("api/dcim/rack-reservations/{id}/")
    Call<RackReservation> dcimRackReservationsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rack-reservations/{id}/")
    Call<RackReservation> dcimRackReservationsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableRackReservationRequest writableRackReservationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/rack-roles/")
    Call<Void> dcimRackRolesBulkDestroy(
            @retrofit2.http.Body List<RackRoleRequest> rackRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rack-roles/")
    Call<List<RackRole>> dcimRackRolesBulkPartialUpdate(
            @retrofit2.http.Body List<RackRoleRequest> rackRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rack-roles/")
    Call<List<RackRole>> dcimRackRolesBulkUpdate(
            @retrofit2.http.Body List<RackRoleRequest> rackRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/rack-roles/")
    Call<RackRole> dcimRackRolesCreate(
            @retrofit2.http.Body DcimRackRolesCreateRequest dcimRackRolesCreateRequest);

    @DELETE("api/dcim/rack-roles/{id}/")
    Call<Void> dcimRackRolesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/rack-roles/")
    Call<PaginatedRackRoleList> dcimRackRolesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rack-roles/{id}/")
    Call<RackRole> dcimRackRolesPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedRackRoleRequest patchedRackRoleRequest);

    @GET("api/dcim/rack-roles/{id}/")
    Call<RackRole> dcimRackRolesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rack-roles/{id}/")
    Call<RackRole> dcimRackRolesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RackRoleRequest rackRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/rack-types/")
    Call<Void> dcimRackTypesBulkDestroy(
            @retrofit2.http.Body List<RackTypeRequest> rackTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rack-types/")
    Call<List<RackType>> dcimRackTypesBulkPartialUpdate(
            @retrofit2.http.Body List<RackTypeRequest> rackTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rack-types/")
    Call<List<RackType>> dcimRackTypesBulkUpdate(
            @retrofit2.http.Body List<RackTypeRequest> rackTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/rack-types/")
    Call<RackType> dcimRackTypesCreate(
            @retrofit2.http.Body DcimRackTypesCreateRequest dcimRackTypesCreateRequest);

    @DELETE("api/dcim/rack-types/{id}/")
    Call<Void> dcimRackTypesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/rack-types/")
    Call<PaginatedRackTypeList> dcimRackTypesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rack-types/{id}/")
    Call<RackType> dcimRackTypesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableRackTypeRequest patchedWritableRackTypeRequest);

    @GET("api/dcim/rack-types/{id}/")
    Call<RackType> dcimRackTypesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rack-types/{id}/")
    Call<RackType> dcimRackTypesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableRackTypeRequest writableRackTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/racks/")
    Call<Void> dcimRacksBulkDestroy(
            @retrofit2.http.Body List<RackRequest> rackRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/racks/")
    Call<List<Rack>> dcimRacksBulkPartialUpdate(
            @retrofit2.http.Body List<RackRequest> rackRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/racks/")
    Call<List<Rack>> dcimRacksBulkUpdate(
            @retrofit2.http.Body List<RackRequest> rackRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/racks/")
    Call<Rack> dcimRacksCreate(
            @retrofit2.http.Body DcimRacksCreateRequest dcimRacksCreateRequest);

    @DELETE("api/dcim/racks/{id}/")
    Call<Void> dcimRacksDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/racks/{id}/elevation/")
    Call<PaginatedRackUnitList> dcimRacksElevationRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/racks/")
    Call<PaginatedRackList> dcimRacksList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/racks/{id}/")
    Call<Rack> dcimRacksPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableRackRequest patchedWritableRackRequest);

    @GET("api/dcim/racks/{id}/")
    Call<Rack> dcimRacksRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/racks/{id}/")
    Call<Rack> dcimRacksUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableRackRequest writableRackRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/rear-port-templates/")
    Call<Void> dcimRearPortTemplatesBulkDestroy(
            @retrofit2.http.Body List<RearPortTemplateRequest> rearPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rear-port-templates/")
    Call<List<RearPortTemplate>> dcimRearPortTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<RearPortTemplateRequest> rearPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rear-port-templates/")
    Call<List<RearPortTemplate>> dcimRearPortTemplatesBulkUpdate(
            @retrofit2.http.Body List<RearPortTemplateRequest> rearPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/rear-port-templates/")
    Call<RearPortTemplate> dcimRearPortTemplatesCreate(
            @retrofit2.http.Body DcimRearPortTemplatesCreateRequest dcimRearPortTemplatesCreateRequest);

    @DELETE("api/dcim/rear-port-templates/{id}/")
    Call<Void> dcimRearPortTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/rear-port-templates/")
    Call<PaginatedRearPortTemplateList> dcimRearPortTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rear-port-templates/{id}/")
    Call<RearPortTemplate> dcimRearPortTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableRearPortTemplateRequest patchedWritableRearPortTemplateRequest);

    @GET("api/dcim/rear-port-templates/{id}/")
    Call<RearPortTemplate> dcimRearPortTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rear-port-templates/{id}/")
    Call<RearPortTemplate> dcimRearPortTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableRearPortTemplateRequest writableRearPortTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/rear-ports/")
    Call<Void> dcimRearPortsBulkDestroy(
            @retrofit2.http.Body List<RearPortRequest> rearPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rear-ports/")
    Call<List<RearPort>> dcimRearPortsBulkPartialUpdate(
            @retrofit2.http.Body List<RearPortRequest> rearPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rear-ports/")
    Call<List<RearPort>> dcimRearPortsBulkUpdate(
            @retrofit2.http.Body List<RearPortRequest> rearPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/rear-ports/")
    Call<RearPort> dcimRearPortsCreate(
            @retrofit2.http.Body DcimRearPortsCreateRequest dcimRearPortsCreateRequest);

    @DELETE("api/dcim/rear-ports/{id}/")
    Call<Void> dcimRearPortsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/rear-ports/")
    Call<PaginatedRearPortList> dcimRearPortsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/rear-ports/{id}/")
    Call<RearPort> dcimRearPortsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableRearPortRequest patchedWritableRearPortRequest);

    @GET("api/dcim/rear-ports/{id}/paths/")
    Call<RearPort> dcimRearPortsPathsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/rear-ports/{id}/")
    Call<RearPort> dcimRearPortsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/rear-ports/{id}/")
    Call<RearPort> dcimRearPortsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableRearPortRequest writableRearPortRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/regions/")
    Call<Void> dcimRegionsBulkDestroy(
            @retrofit2.http.Body List<RegionRequest> regionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/regions/")
    Call<List<Region>> dcimRegionsBulkPartialUpdate(
            @retrofit2.http.Body List<RegionRequest> regionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/regions/")
    Call<List<Region>> dcimRegionsBulkUpdate(
            @retrofit2.http.Body List<RegionRequest> regionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/regions/")
    Call<Region> dcimRegionsCreate(
            @retrofit2.http.Body DcimRegionsCreateRequest dcimRegionsCreateRequest);

    @DELETE("api/dcim/regions/{id}/")
    Call<Void> dcimRegionsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/regions/")
    Call<PaginatedRegionList> dcimRegionsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/regions/{id}/")
    Call<Region> dcimRegionsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableRegionRequest patchedWritableRegionRequest);

    @GET("api/dcim/regions/{id}/")
    Call<Region> dcimRegionsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/regions/{id}/")
    Call<Region> dcimRegionsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableRegionRequest writableRegionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/site-groups/")
    Call<Void> dcimSiteGroupsBulkDestroy(
            @retrofit2.http.Body List<SiteGroupRequest> siteGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/site-groups/")
    Call<List<SiteGroup>> dcimSiteGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<SiteGroupRequest> siteGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/site-groups/")
    Call<List<SiteGroup>> dcimSiteGroupsBulkUpdate(
            @retrofit2.http.Body List<SiteGroupRequest> siteGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/site-groups/")
    Call<SiteGroup> dcimSiteGroupsCreate(
            @retrofit2.http.Body DcimSiteGroupsCreateRequest dcimSiteGroupsCreateRequest);

    @DELETE("api/dcim/site-groups/{id}/")
    Call<Void> dcimSiteGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/site-groups/")
    Call<PaginatedSiteGroupList> dcimSiteGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/site-groups/{id}/")
    Call<SiteGroup> dcimSiteGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableSiteGroupRequest patchedWritableSiteGroupRequest);

    @GET("api/dcim/site-groups/{id}/")
    Call<SiteGroup> dcimSiteGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/site-groups/{id}/")
    Call<SiteGroup> dcimSiteGroupsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableSiteGroupRequest writableSiteGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/sites/")
    Call<Void> dcimSitesBulkDestroy(
            @retrofit2.http.Body List<SiteRequest> siteRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/sites/")
    Call<List<Site>> dcimSitesBulkPartialUpdate(
            @retrofit2.http.Body List<SiteRequest> siteRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/sites/")
    Call<List<Site>> dcimSitesBulkUpdate(
            @retrofit2.http.Body List<SiteRequest> siteRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/sites/")
    Call<Site> dcimSitesCreate(
            @retrofit2.http.Body DcimSitesCreateRequest dcimSitesCreateRequest);

    @DELETE("api/dcim/sites/{id}/")
    Call<Void> dcimSitesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/sites/")
    Call<PaginatedSiteList> dcimSitesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/sites/{id}/")
    Call<Site> dcimSitesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableSiteRequest patchedWritableSiteRequest);

    @GET("api/dcim/sites/{id}/")
    Call<Site> dcimSitesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/sites/{id}/")
    Call<Site> dcimSitesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableSiteRequest writableSiteRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/virtual-chassis/")
    Call<Void> dcimVirtualChassisBulkDestroy(
            @retrofit2.http.Body List<VirtualChassisRequest> virtualChassisRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/virtual-chassis/")
    Call<List<VirtualChassis>> dcimVirtualChassisBulkPartialUpdate(
            @retrofit2.http.Body List<VirtualChassisRequest> virtualChassisRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/virtual-chassis/")
    Call<List<VirtualChassis>> dcimVirtualChassisBulkUpdate(
            @retrofit2.http.Body List<VirtualChassisRequest> virtualChassisRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/virtual-chassis/")
    Call<VirtualChassis> dcimVirtualChassisCreate(
            @retrofit2.http.Body DcimVirtualChassisCreateRequest dcimVirtualChassisCreateRequest);

    @DELETE("api/dcim/virtual-chassis/{id}/")
    Call<Void> dcimVirtualChassisDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/virtual-chassis/")
    Call<PaginatedVirtualChassisList> dcimVirtualChassisList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/virtual-chassis/{id}/")
    Call<VirtualChassis> dcimVirtualChassisPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableVirtualChassisRequest patchedWritableVirtualChassisRequest);

    @GET("api/dcim/virtual-chassis/{id}/")
    Call<VirtualChassis> dcimVirtualChassisRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/virtual-chassis/{id}/")
    Call<VirtualChassis> dcimVirtualChassisUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableVirtualChassisRequest writableVirtualChassisRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/dcim/virtual-device-contexts/")
    Call<Void> dcimVirtualDeviceContextsBulkDestroy(
            @retrofit2.http.Body List<VirtualDeviceContextRequest> virtualDeviceContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/virtual-device-contexts/")
    Call<List<VirtualDeviceContext>> dcimVirtualDeviceContextsBulkPartialUpdate(
            @retrofit2.http.Body List<VirtualDeviceContextRequest> virtualDeviceContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/virtual-device-contexts/")
    Call<List<VirtualDeviceContext>> dcimVirtualDeviceContextsBulkUpdate(
            @retrofit2.http.Body List<VirtualDeviceContextRequest> virtualDeviceContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/dcim/virtual-device-contexts/")
    Call<VirtualDeviceContext> dcimVirtualDeviceContextsCreate(
            @retrofit2.http.Body DcimVirtualDeviceContextsCreateRequest dcimVirtualDeviceContextsCreateRequest);

    @DELETE("api/dcim/virtual-device-contexts/{id}/")
    Call<Void> dcimVirtualDeviceContextsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/dcim/virtual-device-contexts/")
    Call<PaginatedVirtualDeviceContextList> dcimVirtualDeviceContextsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/dcim/virtual-device-contexts/{id}/")
    Call<VirtualDeviceContext> dcimVirtualDeviceContextsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableVirtualDeviceContextRequest patchedWritableVirtualDeviceContextRequest);

    @GET("api/dcim/virtual-device-contexts/{id}/")
    Call<VirtualDeviceContext> dcimVirtualDeviceContextsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/dcim/virtual-device-contexts/{id}/")
    Call<VirtualDeviceContext> dcimVirtualDeviceContextsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableVirtualDeviceContextRequest writableVirtualDeviceContextRequest);

}
