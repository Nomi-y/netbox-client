package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.DcimApi;
import dev.icelabs.netbox.model.*;

import dev.icelabs.netbox.model.Module;

import retrofit2.Call;

public class DcimEndpoint extends Endpoint<DcimApi> {

    public DcimEndpoint(DcimApi service) {
        super(service);
    }

    // ==================== SITES & LOCATIONS ====================
    public final Sites sites = new Sites();
    public final SiteGroups siteGroups = new SiteGroups();
    public final Regions regions = new Regions();
    public final Locations locations = new Locations();

    // ==================== RACKS ====================
    public final Racks racks = new Racks();
    public final RackTypes rackTypes = new RackTypes();
    public final RackRoles rackRoles = new RackRoles();
    public final RackReservations rackReservations = new RackReservations();

    // ==================== DEVICES ====================
    public final Devices devices = new Devices();
    public final DeviceTypes deviceTypes = new DeviceTypes();
    public final DeviceRoles deviceRoles = new DeviceRoles();
    public final Platforms platforms = new Platforms();
    public final VirtualChassis_ virtualChassis = new VirtualChassis_();
    public final VirtualDeviceContexts virtualDeviceContexts = new VirtualDeviceContexts();

    // ==================== INVENTORY ====================
    public final Manufacturers manufacturers = new Manufacturers();
    public final InventoryItems inventoryItems = new InventoryItems();
    public final InventoryItemRoles inventoryItemRoles = new InventoryItemRoles();
    public final InventoryItemTemplates inventoryItemTemplates = new InventoryItemTemplates();

    // ==================== MODULES ====================
    public final Modules modules = new Modules();
    public final ModuleTypes moduleTypes = new ModuleTypes();
    public final ModuleTypeProfiles moduleTypeProfiles = new ModuleTypeProfiles();
    public final ModuleBays moduleBays = new ModuleBays();
    public final ModuleBayTemplates moduleBayTemplates = new ModuleBayTemplates();

    // ==================== PORTS & CONNECTIONS ====================
    public final Interfaces interfaces = new Interfaces();
    public final InterfaceTemplates interfaceTemplates = new InterfaceTemplates();
    public final Cables cables = new Cables();
    public final CableTerminations cableTerminations = new CableTerminations();
    public final ConnectedDevice connectedDevice = new ConnectedDevice();

    // ==================== CONSOLE ====================
    public final ConsolePorts consolePorts = new ConsolePorts();
    public final ConsolePortTemplates consolePortTemplates = new ConsolePortTemplates();
    public final ConsoleServerPorts consoleServerPorts = new ConsoleServerPorts();
    public final ConsoleServerPortTemplates consoleServerPortTemplates = new ConsoleServerPortTemplates();

    // ==================== POWER ====================
    public final PowerPorts powerPorts = new PowerPorts();
    public final PowerPortTemplates powerPortTemplates = new PowerPortTemplates();
    public final PowerOutlets powerOutlets = new PowerOutlets();
    public final PowerOutletTemplates powerOutletTemplates = new PowerOutletTemplates();
    public final PowerPanels powerPanels = new PowerPanels();
    public final PowerFeeds powerFeeds = new PowerFeeds();

    // ==================== FRONT/REAR PORTS ====================
    public final FrontPorts frontPorts = new FrontPorts();
    public final FrontPortTemplates frontPortTemplates = new FrontPortTemplates();
    public final RearPorts rearPorts = new RearPorts();
    public final RearPortTemplates rearPortTemplates = new RearPortTemplates();

    // ==================== DEVICE BAYS ====================
    public final DeviceBays deviceBays = new DeviceBays();
    public final DeviceBayTemplates deviceBayTemplates = new DeviceBayTemplates();

    // ==================== MAC ADDRESSES ====================
    public final MacAddresses macAddresses = new MacAddresses();

    // SITES & LOCATIONS
    public Sites sites() {
        return sites;
    }

    public SiteGroups siteGroups() {
        return siteGroups;
    }

    public Regions regions() {
        return regions;
    }

    public Locations locations() {
        return locations;
    }

    // RACKS
    public Racks racks() {
        return racks;
    }

    public RackTypes rackTypes() {
        return rackTypes;
    }

    public RackRoles rackRoles() {
        return rackRoles;
    }

    public RackReservations rackReservations() {
        return rackReservations;
    }

    // DEVICES
    public Devices devices() {
        return devices;
    }

    public DeviceTypes deviceTypes() {
        return deviceTypes;
    }

    public DeviceRoles deviceRoles() {
        return deviceRoles;
    }

    public Platforms platforms() {
        return platforms;
    }

    public VirtualChassis_ virtualChassis() {
        return virtualChassis;
    }

    public VirtualDeviceContexts virtualDeviceContexts() {
        return virtualDeviceContexts;
    }

    // INVENTORY
    public Manufacturers manufacturers() {
        return manufacturers;
    }

    public InventoryItems inventoryItems() {
        return inventoryItems;
    }

    public InventoryItemRoles inventoryItemRoles() {
        return inventoryItemRoles;
    }

    public InventoryItemTemplates inventoryItemTemplates() {
        return inventoryItemTemplates;
    }

    // MODULES
    public Modules modules() {
        return modules;
    }

    public ModuleTypes moduleTypes() {
        return moduleTypes;
    }

    public ModuleTypeProfiles moduleTypeProfiles() {
        return moduleTypeProfiles;
    }

    public ModuleBays moduleBays() {
        return moduleBays;
    }

    public ModuleBayTemplates moduleBayTemplates() {
        return moduleBayTemplates;
    }

    // PORTS & CONNECTIONS
    public Interfaces interfaces() {
        return interfaces;
    }

    public InterfaceTemplates interfaceTemplates() {
        return interfaceTemplates;
    }

    public Cables cables() {
        return cables;
    }

    public CableTerminations cableTerminations() {
        return cableTerminations;
    }

    public ConnectedDevice connectedDevice() {
        return connectedDevice;
    }

    // CONSOLE
    public ConsolePorts consolePorts() {
        return consolePorts;
    }

    public ConsolePortTemplates consolePortTemplates() {
        return consolePortTemplates;
    }

    public ConsoleServerPorts consoleServerPorts() {
        return consoleServerPorts;
    }

    public ConsoleServerPortTemplates consoleServerPortTemplates() {
        return consoleServerPortTemplates;
    }

    // POWER
    public PowerPorts powerPorts() {
        return powerPorts;
    }

    public PowerPortTemplates powerPortTemplates() {
        return powerPortTemplates;
    }

    public PowerOutlets powerOutlets() {
        return powerOutlets;
    }

    public PowerOutletTemplates powerOutletTemplates() {
        return powerOutletTemplates;
    }

    public PowerPanels powerPanels() {
        return powerPanels;
    }

    public PowerFeeds powerFeeds() {
        return powerFeeds;
    }

    // FRONT/REAR PORTS
    public FrontPorts frontPorts() {
        return frontPorts;
    }

    public FrontPortTemplates frontPortTemplates() {
        return frontPortTemplates;
    }

    public RearPorts rearPorts() {
        return rearPorts;
    }

    public RearPortTemplates rearPortTemplates() {
        return rearPortTemplates;
    }

    // DEVICE BAYS
    public DeviceBays deviceBays() {
        return deviceBays;
    }

    public DeviceBayTemplates deviceBayTemplates() {
        return deviceBayTemplates;
    }

    // MAC ADDRESSES
    public MacAddresses macAddresses() {
        return macAddresses;
    }

    // ==================== SITES ====================
    public class Sites {
        public Call<Void> bulkDestroy(List<SiteRequest> request) {
            return service.dcimSitesBulkDestroy(request);
        }

        public Call<List<Site>> bulkPartialUpdate(List<SiteRequest> request) {
            return service.dcimSitesBulkPartialUpdate(request);
        }

        public Call<List<Site>> bulkUpdate(List<SiteRequest> request) {
            return service.dcimSitesBulkUpdate(request);
        }

        public Call<Site> create(DcimSitesCreateRequest request) {
            return service.dcimSitesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimSitesDestroy(id);
        }

        public Call<PaginatedSiteList> list() {
            return service.dcimSitesList();
        }

        public Call<Site> partialUpdate(Integer id, PatchedWritableSiteRequest request) {
            return service.dcimSitesPartialUpdate(id, request);
        }

        public Call<Site> get(Integer id) {
            return service.dcimSitesRetrieve(id);
        }

        public Call<Site> update(Integer id, WritableSiteRequest request) {
            return service.dcimSitesUpdate(id, request);
        }
    }

    // ==================== SITE GROUPS ====================
    public class SiteGroups {
        public Call<Void> bulkDestroy(List<SiteGroupRequest> request) {
            return service.dcimSiteGroupsBulkDestroy(request);
        }

        public Call<List<SiteGroup>> bulkPartialUpdate(List<SiteGroupRequest> request) {
            return service.dcimSiteGroupsBulkPartialUpdate(request);
        }

        public Call<List<SiteGroup>> bulkUpdate(List<SiteGroupRequest> request) {
            return service.dcimSiteGroupsBulkUpdate(request);
        }

        public Call<SiteGroup> create(DcimSiteGroupsCreateRequest request) {
            return service.dcimSiteGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimSiteGroupsDestroy(id);
        }

        public Call<PaginatedSiteGroupList> list() {
            return service.dcimSiteGroupsList();
        }

        public Call<SiteGroup> partialUpdate(Integer id, PatchedWritableSiteGroupRequest request) {
            return service.dcimSiteGroupsPartialUpdate(id, request);
        }

        public Call<SiteGroup> get(Integer id) {
            return service.dcimSiteGroupsRetrieve(id);
        }

        public Call<SiteGroup> update(Integer id, WritableSiteGroupRequest request) {
            return service.dcimSiteGroupsUpdate(id, request);
        }
    }

    // ==================== REGIONS ====================
    public class Regions {
        public Call<Void> bulkDestroy(List<RegionRequest> request) {
            return service.dcimRegionsBulkDestroy(request);
        }

        public Call<List<Region>> bulkPartialUpdate(List<RegionRequest> request) {
            return service.dcimRegionsBulkPartialUpdate(request);
        }

        public Call<List<Region>> bulkUpdate(List<RegionRequest> request) {
            return service.dcimRegionsBulkUpdate(request);
        }

        public Call<Region> create(DcimRegionsCreateRequest request) {
            return service.dcimRegionsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimRegionsDestroy(id);
        }

        public Call<PaginatedRegionList> list() {
            return service.dcimRegionsList();
        }

        public Call<Region> partialUpdate(Integer id, PatchedWritableRegionRequest request) {
            return service.dcimRegionsPartialUpdate(id, request);
        }

        public Call<Region> get(Integer id) {
            return service.dcimRegionsRetrieve(id);
        }

        public Call<Region> update(Integer id, WritableRegionRequest request) {
            return service.dcimRegionsUpdate(id, request);
        }
    }

    // ==================== LOCATIONS ====================
    public class Locations {
        public Call<Void> bulkDestroy(List<LocationRequest> request) {
            return service.dcimLocationsBulkDestroy(request);
        }

        public Call<List<Location>> bulkPartialUpdate(List<LocationRequest> request) {
            return service.dcimLocationsBulkPartialUpdate(request);
        }

        public Call<List<Location>> bulkUpdate(List<LocationRequest> request) {
            return service.dcimLocationsBulkUpdate(request);
        }

        public Call<Location> create(DcimLocationsCreateRequest request) {
            return service.dcimLocationsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimLocationsDestroy(id);
        }

        public Call<PaginatedLocationList> list() {
            return service.dcimLocationsList();
        }

        public Call<Location> partialUpdate(Integer id, PatchedWritableLocationRequest request) {
            return service.dcimLocationsPartialUpdate(id, request);
        }

        public Call<Location> get(Integer id) {
            return service.dcimLocationsRetrieve(id);
        }

        public Call<Location> update(Integer id, WritableLocationRequest request) {
            return service.dcimLocationsUpdate(id, request);
        }
    }

    // ==================== RACKS ====================
    public class Racks {
        public Call<Void> bulkDestroy(List<RackRequest> request) {
            return service.dcimRacksBulkDestroy(request);
        }

        public Call<List<Rack>> bulkPartialUpdate(List<RackRequest> request) {
            return service.dcimRacksBulkPartialUpdate(request);
        }

        public Call<List<Rack>> bulkUpdate(List<RackRequest> request) {
            return service.dcimRacksBulkUpdate(request);
        }

        public Call<Rack> create(DcimRacksCreateRequest request) {
            return service.dcimRacksCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimRacksDestroy(id);
        }

        public Call<PaginatedRackUnitList> elevation(Integer id) {
            return service.dcimRacksElevationRetrieve(id);
        }

        public Call<PaginatedRackList> list() {
            return service.dcimRacksList();
        }

        public Call<Rack> partialUpdate(Integer id, PatchedWritableRackRequest request) {
            return service.dcimRacksPartialUpdate(id, request);
        }

        public Call<Rack> get(Integer id) {
            return service.dcimRacksRetrieve(id);
        }

        public Call<Rack> update(Integer id, WritableRackRequest request) {
            return service.dcimRacksUpdate(id, request);
        }
    }

    // ==================== RACK TYPES ====================
    public class RackTypes {
        public Call<Void> bulkDestroy(List<RackTypeRequest> request) {
            return service.dcimRackTypesBulkDestroy(request);
        }

        public Call<List<RackType>> bulkPartialUpdate(List<RackTypeRequest> request) {
            return service.dcimRackTypesBulkPartialUpdate(request);
        }

        public Call<List<RackType>> bulkUpdate(List<RackTypeRequest> request) {
            return service.dcimRackTypesBulkUpdate(request);
        }

        public Call<RackType> create(DcimRackTypesCreateRequest request) {
            return service.dcimRackTypesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimRackTypesDestroy(id);
        }

        public Call<PaginatedRackTypeList> list() {
            return service.dcimRackTypesList();
        }

        public Call<RackType> partialUpdate(Integer id, PatchedWritableRackTypeRequest request) {
            return service.dcimRackTypesPartialUpdate(id, request);
        }

        public Call<RackType> get(Integer id) {
            return service.dcimRackTypesRetrieve(id);
        }

        public Call<RackType> update(Integer id, WritableRackTypeRequest request) {
            return service.dcimRackTypesUpdate(id, request);
        }
    }

    // ==================== RACK ROLES ====================
    public class RackRoles {
        public Call<Void> bulkDestroy(List<RackRoleRequest> request) {
            return service.dcimRackRolesBulkDestroy(request);
        }

        public Call<List<RackRole>> bulkPartialUpdate(List<RackRoleRequest> request) {
            return service.dcimRackRolesBulkPartialUpdate(request);
        }

        public Call<List<RackRole>> bulkUpdate(List<RackRoleRequest> request) {
            return service.dcimRackRolesBulkUpdate(request);
        }

        public Call<RackRole> create(DcimRackRolesCreateRequest request) {
            return service.dcimRackRolesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimRackRolesDestroy(id);
        }

        public Call<PaginatedRackRoleList> list() {
            return service.dcimRackRolesList();
        }

        public Call<RackRole> partialUpdate(Integer id, PatchedRackRoleRequest request) {
            return service.dcimRackRolesPartialUpdate(id, request);
        }

        public Call<RackRole> get(Integer id) {
            return service.dcimRackRolesRetrieve(id);
        }

        public Call<RackRole> update(Integer id, RackRoleRequest request) {
            return service.dcimRackRolesUpdate(id, request);
        }
    }

    // ==================== RACK RESERVATIONS ====================
    public class RackReservations {
        public Call<Void> bulkDestroy(List<RackReservationRequest> request) {
            return service.dcimRackReservationsBulkDestroy(request);
        }

        public Call<List<RackReservation>> bulkPartialUpdate(List<RackReservationRequest> request) {
            return service.dcimRackReservationsBulkPartialUpdate(request);
        }

        public Call<List<RackReservation>> bulkUpdate(List<RackReservationRequest> request) {
            return service.dcimRackReservationsBulkUpdate(request);
        }

        public Call<RackReservation> create(DcimRackReservationsCreateRequest request) {
            return service.dcimRackReservationsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimRackReservationsDestroy(id);
        }

        public Call<PaginatedRackReservationList> list() {
            return service.dcimRackReservationsList();
        }

        public Call<RackReservation> partialUpdate(Integer id, PatchedWritableRackReservationRequest request) {
            return service.dcimRackReservationsPartialUpdate(id, request);
        }

        public Call<RackReservation> get(Integer id) {
            return service.dcimRackReservationsRetrieve(id);
        }

        public Call<RackReservation> update(Integer id, WritableRackReservationRequest request) {
            return service.dcimRackReservationsUpdate(id, request);
        }
    }

    // ==================== DEVICES ====================
    public class Devices {
        public Call<Void> bulkDestroy(List<DeviceWithConfigContextRequest> request) {
            return service.dcimDevicesBulkDestroy(request);
        }

        public Call<List<DeviceWithConfigContext>> bulkPartialUpdate(List<DeviceWithConfigContextRequest> request) {
            return service.dcimDevicesBulkPartialUpdate(request);
        }

        public Call<List<DeviceWithConfigContext>> bulkUpdate(List<DeviceWithConfigContextRequest> request) {
            return service.dcimDevicesBulkUpdate(request);
        }

        public Call<DeviceWithConfigContext> create(DcimDevicesCreateRequest request) {
            return service.dcimDevicesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimDevicesDestroy(id);
        }

        public Call<PaginatedDeviceWithConfigContextList> list() {
            return service.dcimDevicesList();
        }

        public Call<DeviceWithConfigContext> partialUpdate(Integer id,
                PatchedWritableDeviceWithConfigContextRequest request) {
            return service.dcimDevicesPartialUpdate(id, request);
        }

        public Call<DeviceWithConfigContext> renderConfig(Integer id, WritableDeviceWithConfigContextRequest request) {
            return service.dcimDevicesRenderConfigCreate(id, request);
        }

        public Call<DeviceWithConfigContext> get(Integer id) {
            return service.dcimDevicesRetrieve(id);
        }

        public Call<DeviceWithConfigContext> update(Integer id, WritableDeviceWithConfigContextRequest request) {
            return service.dcimDevicesUpdate(id, request);
        }
    }

    // ==================== DEVICE TYPES ====================
    public class DeviceTypes {
        public Call<Void> bulkDestroy(List<DeviceTypeRequest> request) {
            return service.dcimDeviceTypesBulkDestroy(request);
        }

        public Call<List<DeviceType>> bulkPartialUpdate(List<DeviceTypeRequest> request) {
            return service.dcimDeviceTypesBulkPartialUpdate(request);
        }

        public Call<List<DeviceType>> bulkUpdate(List<DeviceTypeRequest> request) {
            return service.dcimDeviceTypesBulkUpdate(request);
        }

        public Call<DeviceType> create(DcimDeviceTypesCreateRequest request) {
            return service.dcimDeviceTypesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimDeviceTypesDestroy(id);
        }

        public Call<PaginatedDeviceTypeList> list() {
            return service.dcimDeviceTypesList();
        }

        public Call<DeviceType> partialUpdate(Integer id, PatchedWritableDeviceTypeRequest request) {
            return service.dcimDeviceTypesPartialUpdate(id, request);
        }

        public Call<DeviceType> get(Integer id) {
            return service.dcimDeviceTypesRetrieve(id);
        }

        public Call<DeviceType> update(Integer id, WritableDeviceTypeRequest request) {
            return service.dcimDeviceTypesUpdate(id, request);
        }
    }

    // ==================== DEVICE ROLES ====================
    public class DeviceRoles {
        public Call<Void> bulkDestroy(List<DeviceRoleRequest> request) {
            return service.dcimDeviceRolesBulkDestroy(request);
        }

        public Call<List<DeviceRole>> bulkPartialUpdate(List<DeviceRoleRequest> request) {
            return service.dcimDeviceRolesBulkPartialUpdate(request);
        }

        public Call<List<DeviceRole>> bulkUpdate(List<DeviceRoleRequest> request) {
            return service.dcimDeviceRolesBulkUpdate(request);
        }

        public Call<DeviceRole> create(DcimDeviceRolesCreateRequest request) {
            return service.dcimDeviceRolesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimDeviceRolesDestroy(id);
        }

        public Call<PaginatedDeviceRoleList> list() {
            return service.dcimDeviceRolesList();
        }

        public Call<DeviceRole> partialUpdate(Integer id, PatchedWritableDeviceRoleRequest request) {
            return service.dcimDeviceRolesPartialUpdate(id, request);
        }

        public Call<DeviceRole> get(Integer id) {
            return service.dcimDeviceRolesRetrieve(id);
        }

        public Call<DeviceRole> update(Integer id, WritableDeviceRoleRequest request) {
            return service.dcimDeviceRolesUpdate(id, request);
        }
    }

    // ==================== PLATFORMS ====================
    public class Platforms {
        public Call<Void> bulkDestroy(List<PlatformRequest> request) {
            return service.dcimPlatformsBulkDestroy(request);
        }

        public Call<List<Platform>> bulkPartialUpdate(List<PlatformRequest> request) {
            return service.dcimPlatformsBulkPartialUpdate(request);
        }

        public Call<List<Platform>> bulkUpdate(List<PlatformRequest> request) {
            return service.dcimPlatformsBulkUpdate(request);
        }

        public Call<Platform> create(DcimPlatformsCreateRequest request) {
            return service.dcimPlatformsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimPlatformsDestroy(id);
        }

        public Call<PaginatedPlatformList> list() {
            return service.dcimPlatformsList();
        }

        public Call<Platform> partialUpdate(Integer id, PatchedWritablePlatformRequest request) {
            return service.dcimPlatformsPartialUpdate(id, request);
        }

        public Call<Platform> get(Integer id) {
            return service.dcimPlatformsRetrieve(id);
        }

        public Call<Platform> update(Integer id, WritablePlatformRequest request) {
            return service.dcimPlatformsUpdate(id, request);
        }
    }

    // ==================== VIRTUAL CHASSIS ====================
    public class VirtualChassis_ {
        public Call<Void> bulkDestroy(List<VirtualChassisRequest> request) {
            return service.dcimVirtualChassisBulkDestroy(request);
        }

        public Call<List<VirtualChassis>> bulkPartialUpdate(List<VirtualChassisRequest> request) {
            return service.dcimVirtualChassisBulkPartialUpdate(request);
        }

        public Call<List<VirtualChassis>> bulkUpdate(List<VirtualChassisRequest> request) {
            return service.dcimVirtualChassisBulkUpdate(request);
        }

        public Call<VirtualChassis> create(DcimVirtualChassisCreateRequest request) {
            return service.dcimVirtualChassisCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimVirtualChassisDestroy(id);
        }

        public Call<PaginatedVirtualChassisList> list() {
            return service.dcimVirtualChassisList();
        }

        public Call<VirtualChassis> partialUpdate(Integer id, PatchedWritableVirtualChassisRequest request) {
            return service.dcimVirtualChassisPartialUpdate(id, request);
        }

        public Call<VirtualChassis> get(Integer id) {
            return service.dcimVirtualChassisRetrieve(id);
        }

        public Call<VirtualChassis> update(Integer id, WritableVirtualChassisRequest request) {
            return service.dcimVirtualChassisUpdate(id, request);
        }
    }

    // ==================== VIRTUAL DEVICE CONTEXTS ====================
    public class VirtualDeviceContexts {
        public Call<Void> bulkDestroy(List<VirtualDeviceContextRequest> request) {
            return service.dcimVirtualDeviceContextsBulkDestroy(request);
        }

        public Call<List<VirtualDeviceContext>> bulkPartialUpdate(List<VirtualDeviceContextRequest> request) {
            return service.dcimVirtualDeviceContextsBulkPartialUpdate(request);
        }

        public Call<List<VirtualDeviceContext>> bulkUpdate(List<VirtualDeviceContextRequest> request) {
            return service.dcimVirtualDeviceContextsBulkUpdate(request);
        }

        public Call<VirtualDeviceContext> create(DcimVirtualDeviceContextsCreateRequest request) {
            return service.dcimVirtualDeviceContextsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimVirtualDeviceContextsDestroy(id);
        }

        public Call<PaginatedVirtualDeviceContextList> list() {
            return service.dcimVirtualDeviceContextsList();
        }

        public Call<VirtualDeviceContext> partialUpdate(Integer id,
                PatchedWritableVirtualDeviceContextRequest request) {
            return service.dcimVirtualDeviceContextsPartialUpdate(id, request);
        }

        public Call<VirtualDeviceContext> get(Integer id) {
            return service.dcimVirtualDeviceContextsRetrieve(id);
        }

        public Call<VirtualDeviceContext> update(Integer id, WritableVirtualDeviceContextRequest request) {
            return service.dcimVirtualDeviceContextsUpdate(id, request);
        }
    }

    // ==================== MANUFACTURERS ====================
    public class Manufacturers {
        public Call<Void> bulkDestroy(List<ManufacturerRequest> request) {
            return service.dcimManufacturersBulkDestroy(request);
        }

        public Call<List<Manufacturer>> bulkPartialUpdate(List<ManufacturerRequest> request) {
            return service.dcimManufacturersBulkPartialUpdate(request);
        }

        public Call<List<Manufacturer>> bulkUpdate(List<ManufacturerRequest> request) {
            return service.dcimManufacturersBulkUpdate(request);
        }

        public Call<Manufacturer> create(DcimManufacturersCreateRequest request) {
            return service.dcimManufacturersCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimManufacturersDestroy(id);
        }

        public Call<PaginatedManufacturerList> list() {
            return service.dcimManufacturersList();
        }

        public Call<Manufacturer> partialUpdate(Integer id, PatchedManufacturerRequest request) {
            return service.dcimManufacturersPartialUpdate(id, request);
        }

        public Call<Manufacturer> get(Integer id) {
            return service.dcimManufacturersRetrieve(id);
        }

        public Call<Manufacturer> update(Integer id, ManufacturerRequest request) {
            return service.dcimManufacturersUpdate(id, request);
        }
    }

    // ==================== INVENTORY ITEMS ====================
    public class InventoryItems {
        public Call<Void> bulkDestroy(List<InventoryItemRequest> request) {
            return service.dcimInventoryItemsBulkDestroy(request);
        }

        public Call<List<InventoryItem>> bulkPartialUpdate(List<InventoryItemRequest> request) {
            return service.dcimInventoryItemsBulkPartialUpdate(request);
        }

        public Call<List<InventoryItem>> bulkUpdate(List<InventoryItemRequest> request) {
            return service.dcimInventoryItemsBulkUpdate(request);
        }

        public Call<InventoryItem> create(DcimInventoryItemsCreateRequest request) {
            return service.dcimInventoryItemsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimInventoryItemsDestroy(id);
        }

        public Call<PaginatedInventoryItemList> list() {
            return service.dcimInventoryItemsList();
        }

        public Call<InventoryItem> partialUpdate(Integer id, PatchedWritableInventoryItemRequest request) {
            return service.dcimInventoryItemsPartialUpdate(id, request);
        }

        public Call<InventoryItem> get(Integer id) {
            return service.dcimInventoryItemsRetrieve(id);
        }

        public Call<InventoryItem> update(Integer id, WritableInventoryItemRequest request) {
            return service.dcimInventoryItemsUpdate(id, request);
        }
    }

    // ==================== INVENTORY ITEM ROLES ====================
    public class InventoryItemRoles {
        public Call<Void> bulkDestroy(List<InventoryItemRoleRequest> request) {
            return service.dcimInventoryItemRolesBulkDestroy(request);
        }

        public Call<List<InventoryItemRole>> bulkPartialUpdate(List<InventoryItemRoleRequest> request) {
            return service.dcimInventoryItemRolesBulkPartialUpdate(request);
        }

        public Call<List<InventoryItemRole>> bulkUpdate(List<InventoryItemRoleRequest> request) {
            return service.dcimInventoryItemRolesBulkUpdate(request);
        }

        public Call<InventoryItemRole> create(DcimInventoryItemRolesCreateRequest request) {
            return service.dcimInventoryItemRolesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimInventoryItemRolesDestroy(id);
        }

        public Call<PaginatedInventoryItemRoleList> list() {
            return service.dcimInventoryItemRolesList();
        }

        public Call<InventoryItemRole> partialUpdate(Integer id, PatchedInventoryItemRoleRequest request) {
            return service.dcimInventoryItemRolesPartialUpdate(id, request);
        }

        public Call<InventoryItemRole> get(Integer id) {
            return service.dcimInventoryItemRolesRetrieve(id);
        }

        public Call<InventoryItemRole> update(Integer id, InventoryItemRoleRequest request) {
            return service.dcimInventoryItemRolesUpdate(id, request);
        }
    }

    // ==================== INVENTORY ITEM TEMPLATES ====================
    public class InventoryItemTemplates {
        public Call<Void> bulkDestroy(List<InventoryItemTemplateRequest> request) {
            return service.dcimInventoryItemTemplatesBulkDestroy(request);
        }

        public Call<List<InventoryItemTemplate>> bulkPartialUpdate(List<InventoryItemTemplateRequest> request) {
            return service.dcimInventoryItemTemplatesBulkPartialUpdate(request);
        }

        public Call<List<InventoryItemTemplate>> bulkUpdate(List<InventoryItemTemplateRequest> request) {
            return service.dcimInventoryItemTemplatesBulkUpdate(request);
        }

        public Call<InventoryItemTemplate> create(DcimInventoryItemTemplatesCreateRequest request) {
            return service.dcimInventoryItemTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimInventoryItemTemplatesDestroy(id);
        }

        public Call<PaginatedInventoryItemTemplateList> list() {
            return service.dcimInventoryItemTemplatesList();
        }

        public Call<InventoryItemTemplate> partialUpdate(Integer id, PatchedInventoryItemTemplateRequest request) {
            return service.dcimInventoryItemTemplatesPartialUpdate(id, request);
        }

        public Call<InventoryItemTemplate> get(Integer id) {
            return service.dcimInventoryItemTemplatesRetrieve(id);
        }

        public Call<InventoryItemTemplate> update(Integer id, InventoryItemTemplateRequest request) {
            return service.dcimInventoryItemTemplatesUpdate(id, request);
        }
    }

    // ==================== MODULES ====================
    public class Modules {
        public Call<Void> bulkDestroy(List<ModuleRequest> request) {
            return service.dcimModulesBulkDestroy(request);
        }

        public Call<List<Module>> bulkPartialUpdate(List<ModuleRequest> request) {
            return service.dcimModulesBulkPartialUpdate(request);
        }

        public Call<List<Module>> bulkUpdate(List<ModuleRequest> request) {
            return service.dcimModulesBulkUpdate(request);
        }

        public Call<Module> create(DcimModulesCreateRequest request) {
            return service.dcimModulesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimModulesDestroy(id);
        }

        public Call<PaginatedModuleList> list() {
            return service.dcimModulesList();
        }

        public Call<Module> partialUpdate(Integer id, PatchedWritableModuleRequest request) {
            return service.dcimModulesPartialUpdate(id, request);
        }

        public Call<Module> get(Integer id) {
            return service.dcimModulesRetrieve(id);
        }

        public Call<Module> update(Integer id, WritableModuleRequest request) {
            return service.dcimModulesUpdate(id, request);
        }
    }

    // ==================== MODULE TYPES ====================
    public class ModuleTypes {
        public Call<Void> bulkDestroy(List<ModuleTypeRequest> request) {
            return service.dcimModuleTypesBulkDestroy(request);
        }

        public Call<List<ModuleType>> bulkPartialUpdate(List<ModuleTypeRequest> request) {
            return service.dcimModuleTypesBulkPartialUpdate(request);
        }

        public Call<List<ModuleType>> bulkUpdate(List<ModuleTypeRequest> request) {
            return service.dcimModuleTypesBulkUpdate(request);
        }

        public Call<ModuleType> create(DcimModuleTypesCreateRequest request) {
            return service.dcimModuleTypesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimModuleTypesDestroy(id);
        }

        public Call<PaginatedModuleTypeList> list() {
            return service.dcimModuleTypesList();
        }

        public Call<ModuleType> partialUpdate(Integer id, PatchedWritableModuleTypeRequest request) {
            return service.dcimModuleTypesPartialUpdate(id, request);
        }

        public Call<ModuleType> get(Integer id) {
            return service.dcimModuleTypesRetrieve(id);
        }

        public Call<ModuleType> update(Integer id, WritableModuleTypeRequest request) {
            return service.dcimModuleTypesUpdate(id, request);
        }
    }

    // ==================== MODULE TYPE PROFILES ====================
    public class ModuleTypeProfiles {
        public Call<Void> bulkDestroy(List<ModuleTypeProfileRequest> request) {
            return service.dcimModuleTypeProfilesBulkDestroy(request);
        }

        public Call<List<ModuleTypeProfile>> bulkPartialUpdate(List<ModuleTypeProfileRequest> request) {
            return service.dcimModuleTypeProfilesBulkPartialUpdate(request);
        }

        public Call<List<ModuleTypeProfile>> bulkUpdate(List<ModuleTypeProfileRequest> request) {
            return service.dcimModuleTypeProfilesBulkUpdate(request);
        }

        public Call<ModuleTypeProfile> create(DcimModuleTypeProfilesCreateRequest request) {
            return service.dcimModuleTypeProfilesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimModuleTypeProfilesDestroy(id);
        }

        public Call<PaginatedModuleTypeProfileList> list() {
            return service.dcimModuleTypeProfilesList();
        }

        public Call<ModuleTypeProfile> partialUpdate(Integer id, PatchedModuleTypeProfileRequest request) {
            return service.dcimModuleTypeProfilesPartialUpdate(id, request);
        }

        public Call<ModuleTypeProfile> get(Integer id) {
            return service.dcimModuleTypeProfilesRetrieve(id);
        }

        public Call<ModuleTypeProfile> update(Integer id, ModuleTypeProfileRequest request) {
            return service.dcimModuleTypeProfilesUpdate(id, request);
        }
    }

    // ==================== MODULE BAYS ====================
    public class ModuleBays {
        public Call<Void> bulkDestroy(List<ModuleBayRequest> request) {
            return service.dcimModuleBaysBulkDestroy(request);
        }

        public Call<List<ModuleBay>> bulkPartialUpdate(List<ModuleBayRequest> request) {
            return service.dcimModuleBaysBulkPartialUpdate(request);
        }

        public Call<List<ModuleBay>> bulkUpdate(List<ModuleBayRequest> request) {
            return service.dcimModuleBaysBulkUpdate(request);
        }

        public Call<ModuleBay> create(DcimModuleBaysCreateRequest request) {
            return service.dcimModuleBaysCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimModuleBaysDestroy(id);
        }

        public Call<PaginatedModuleBayList> list() {
            return service.dcimModuleBaysList();
        }

        public Call<ModuleBay> partialUpdate(Integer id, PatchedModuleBayRequest request) {
            return service.dcimModuleBaysPartialUpdate(id, request);
        }

        public Call<ModuleBay> get(Integer id) {
            return service.dcimModuleBaysRetrieve(id);
        }

        public Call<ModuleBay> update(Integer id, ModuleBayRequest request) {
            return service.dcimModuleBaysUpdate(id, request);
        }
    }

    // ==================== MODULE BAY TEMPLATES ====================
    public class ModuleBayTemplates {
        public Call<Void> bulkDestroy(List<ModuleBayTemplateRequest> request) {
            return service.dcimModuleBayTemplatesBulkDestroy(request);
        }

        public Call<List<ModuleBayTemplate>> bulkPartialUpdate(List<ModuleBayTemplateRequest> request) {
            return service.dcimModuleBayTemplatesBulkPartialUpdate(request);
        }

        public Call<List<ModuleBayTemplate>> bulkUpdate(List<ModuleBayTemplateRequest> request) {
            return service.dcimModuleBayTemplatesBulkUpdate(request);
        }

        public Call<ModuleBayTemplate> create(DcimModuleBayTemplatesCreateRequest request) {
            return service.dcimModuleBayTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimModuleBayTemplatesDestroy(id);
        }

        public Call<PaginatedModuleBayTemplateList> list() {
            return service.dcimModuleBayTemplatesList();
        }

        public Call<ModuleBayTemplate> partialUpdate(Integer id, PatchedModuleBayTemplateRequest request) {
            return service.dcimModuleBayTemplatesPartialUpdate(id, request);
        }

        public Call<ModuleBayTemplate> get(Integer id) {
            return service.dcimModuleBayTemplatesRetrieve(id);
        }

        public Call<ModuleBayTemplate> update(Integer id, ModuleBayTemplateRequest request) {
            return service.dcimModuleBayTemplatesUpdate(id, request);
        }
    }

    // ==================== INTERFACES ====================
    public class Interfaces {
        public Call<Void> bulkDestroy(List<InterfaceRequest> request) {
            return service.dcimInterfacesBulkDestroy(request);
        }

        public Call<List<ModelInterface>> bulkPartialUpdate(List<InterfaceRequest> request) {
            return service.dcimInterfacesBulkPartialUpdate(request);
        }

        public Call<List<ModelInterface>> bulkUpdate(List<InterfaceRequest> request) {
            return service.dcimInterfacesBulkUpdate(request);
        }

        public Call<ModelInterface> create(DcimInterfacesCreateRequest request) {
            return service.dcimInterfacesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimInterfacesDestroy(id);
        }

        public Call<PaginatedInterfaceList> list() {
            return service.dcimInterfacesList();
        }

        public Call<ModelInterface> partialUpdate(Integer id, PatchedWritableInterfaceRequest request) {
            return service.dcimInterfacesPartialUpdate(id, request);
        }

        public Call<ModelInterface> get(Integer id) {
            return service.dcimInterfacesRetrieve(id);
        }

        public Call<ModelInterface> trace(Integer id) {
            return service.dcimInterfacesTraceRetrieve(id);
        }

        public Call<ModelInterface> update(Integer id, WritableInterfaceRequest request) {
            return service.dcimInterfacesUpdate(id, request);
        }
    }

    // ==================== INTERFACE TEMPLATES ====================
    public class InterfaceTemplates {
        public Call<Void> bulkDestroy(List<InterfaceTemplateRequest> request) {
            return service.dcimInterfaceTemplatesBulkDestroy(request);
        }

        public Call<List<InterfaceTemplate>> bulkPartialUpdate(List<InterfaceTemplateRequest> request) {
            return service.dcimInterfaceTemplatesBulkPartialUpdate(request);
        }

        public Call<List<InterfaceTemplate>> bulkUpdate(List<InterfaceTemplateRequest> request) {
            return service.dcimInterfaceTemplatesBulkUpdate(request);
        }

        public Call<InterfaceTemplate> create(DcimInterfaceTemplatesCreateRequest request) {
            return service.dcimInterfaceTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimInterfaceTemplatesDestroy(id);
        }

        public Call<PaginatedInterfaceTemplateList> list() {
            return service.dcimInterfaceTemplatesList();
        }

        public Call<InterfaceTemplate> partialUpdate(Integer id, PatchedWritableInterfaceTemplateRequest request) {
            return service.dcimInterfaceTemplatesPartialUpdate(id, request);
        }

        public Call<InterfaceTemplate> get(Integer id) {
            return service.dcimInterfaceTemplatesRetrieve(id);
        }

        public Call<InterfaceTemplate> update(Integer id, WritableInterfaceTemplateRequest request) {
            return service.dcimInterfaceTemplatesUpdate(id, request);
        }
    }

    // ==================== CABLES ====================
    public class Cables {
        public Call<Void> bulkDestroy(List<CableRequest> request) {
            return service.dcimCablesBulkDestroy(request);
        }

        public Call<List<Cable>> bulkPartialUpdate(List<CableRequest> request) {
            return service.dcimCablesBulkPartialUpdate(request);
        }

        public Call<List<Cable>> bulkUpdate(List<CableRequest> request) {
            return service.dcimCablesBulkUpdate(request);
        }

        public Call<Cable> create(DcimCablesCreateRequest request) {
            return service.dcimCablesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimCablesDestroy(id);
        }

        public Call<PaginatedCableList> list() {
            return service.dcimCablesList();
        }

        public Call<Cable> partialUpdate(Integer id, PatchedWritableCableRequest request) {
            return service.dcimCablesPartialUpdate(id, request);
        }

        public Call<Cable> get(Integer id) {
            return service.dcimCablesRetrieve(id);
        }

        public Call<Cable> update(Integer id, WritableCableRequest request) {
            return service.dcimCablesUpdate(id, request);
        }
    }

    // ==================== CABLE TERMINATIONS ====================
    public class CableTerminations {
        public Call<PaginatedCableTerminationList> list() {
            return service.dcimCableTerminationsList();
        }

        public Call<CableTermination> get(Integer id) {
            return service.dcimCableTerminationsRetrieve(id);
        }
    }

    // ==================== CONNECTED DEVICE ====================
    public class ConnectedDevice {
        public Call<List<Device>> list() {
            return service.dcimConnectedDeviceList();
        }
    }

    // ==================== CONSOLE PORTS ====================
    public class ConsolePorts {
        public Call<Void> bulkDestroy(List<ConsolePortRequest> request) {
            return service.dcimConsolePortsBulkDestroy(request);
        }

        public Call<List<ConsolePort>> bulkPartialUpdate(List<ConsolePortRequest> request) {
            return service.dcimConsolePortsBulkPartialUpdate(request);
        }

        public Call<List<ConsolePort>> bulkUpdate(List<ConsolePortRequest> request) {
            return service.dcimConsolePortsBulkUpdate(request);
        }

        public Call<ConsolePort> create(DcimConsolePortsCreateRequest request) {
            return service.dcimConsolePortsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimConsolePortsDestroy(id);
        }

        public Call<PaginatedConsolePortList> list() {
            return service.dcimConsolePortsList();
        }

        public Call<ConsolePort> partialUpdate(Integer id, PatchedWritableConsolePortRequest request) {
            return service.dcimConsolePortsPartialUpdate(id, request);
        }

        public Call<ConsolePort> get(Integer id) {
            return service.dcimConsolePortsRetrieve(id);
        }

        public Call<ConsolePort> trace(Integer id) {
            return service.dcimConsolePortsTraceRetrieve(id);
        }

        public Call<ConsolePort> update(Integer id, WritableConsolePortRequest request) {
            return service.dcimConsolePortsUpdate(id, request);
        }
    }

    // ==================== CONSOLE PORT TEMPLATES ====================
    public class ConsolePortTemplates {
        public Call<Void> bulkDestroy(List<ConsolePortTemplateRequest> request) {
            return service.dcimConsolePortTemplatesBulkDestroy(request);
        }

        public Call<List<ConsolePortTemplate>> bulkPartialUpdate(List<ConsolePortTemplateRequest> request) {
            return service.dcimConsolePortTemplatesBulkPartialUpdate(request);
        }

        public Call<List<ConsolePortTemplate>> bulkUpdate(List<ConsolePortTemplateRequest> request) {
            return service.dcimConsolePortTemplatesBulkUpdate(request);
        }

        public Call<ConsolePortTemplate> create(DcimConsolePortTemplatesCreateRequest request) {
            return service.dcimConsolePortTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimConsolePortTemplatesDestroy(id);
        }

        public Call<PaginatedConsolePortTemplateList> list() {
            return service.dcimConsolePortTemplatesList();
        }

        public Call<ConsolePortTemplate> partialUpdate(Integer id, PatchedWritableConsolePortTemplateRequest request) {
            return service.dcimConsolePortTemplatesPartialUpdate(id, request);
        }

        public Call<ConsolePortTemplate> get(Integer id) {
            return service.dcimConsolePortTemplatesRetrieve(id);
        }

        public Call<ConsolePortTemplate> update(Integer id, WritableConsolePortTemplateRequest request) {
            return service.dcimConsolePortTemplatesUpdate(id, request);
        }
    }

    // ==================== CONSOLE SERVER PORTS ====================
    public class ConsoleServerPorts {
        public Call<Void> bulkDestroy(List<ConsoleServerPortRequest> request) {
            return service.dcimConsoleServerPortsBulkDestroy(request);
        }

        public Call<List<ConsoleServerPort>> bulkPartialUpdate(List<ConsoleServerPortRequest> request) {
            return service.dcimConsoleServerPortsBulkPartialUpdate(request);
        }

        public Call<List<ConsoleServerPort>> bulkUpdate(List<ConsoleServerPortRequest> request) {
            return service.dcimConsoleServerPortsBulkUpdate(request);
        }

        public Call<ConsoleServerPort> create(DcimConsoleServerPortsCreateRequest request) {
            return service.dcimConsoleServerPortsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimConsoleServerPortsDestroy(id);
        }

        public Call<PaginatedConsoleServerPortList> list() {
            return service.dcimConsoleServerPortsList();
        }

        public Call<ConsoleServerPort> partialUpdate(Integer id, PatchedWritableConsoleServerPortRequest request) {
            return service.dcimConsoleServerPortsPartialUpdate(id, request);
        }

        public Call<ConsoleServerPort> get(Integer id) {
            return service.dcimConsoleServerPortsRetrieve(id);
        }

        public Call<ConsoleServerPort> trace(Integer id) {
            return service.dcimConsoleServerPortsTraceRetrieve(id);
        }

        public Call<ConsoleServerPort> update(Integer id, WritableConsoleServerPortRequest request) {
            return service.dcimConsoleServerPortsUpdate(id, request);
        }
    }

    // ==================== CONSOLE SERVER PORT TEMPLATES ====================
    public class ConsoleServerPortTemplates {
        public Call<Void> bulkDestroy(List<ConsoleServerPortTemplateRequest> request) {
            return service.dcimConsoleServerPortTemplatesBulkDestroy(request);
        }

        public Call<List<ConsoleServerPortTemplate>> bulkPartialUpdate(List<ConsoleServerPortTemplateRequest> request) {
            return service.dcimConsoleServerPortTemplatesBulkPartialUpdate(request);
        }

        public Call<List<ConsoleServerPortTemplate>> bulkUpdate(List<ConsoleServerPortTemplateRequest> request) {
            return service.dcimConsoleServerPortTemplatesBulkUpdate(request);
        }

        public Call<ConsoleServerPortTemplate> create(DcimConsoleServerPortTemplatesCreateRequest request) {
            return service.dcimConsoleServerPortTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimConsoleServerPortTemplatesDestroy(id);
        }

        public Call<PaginatedConsoleServerPortTemplateList> list() {
            return service.dcimConsoleServerPortTemplatesList();
        }

        public Call<ConsoleServerPortTemplate> partialUpdate(Integer id,
                PatchedWritableConsoleServerPortTemplateRequest request) {
            return service.dcimConsoleServerPortTemplatesPartialUpdate(id, request);
        }

        public Call<ConsoleServerPortTemplate> get(Integer id) {
            return service.dcimConsoleServerPortTemplatesRetrieve(id);
        }

        public Call<ConsoleServerPortTemplate> update(Integer id, WritableConsoleServerPortTemplateRequest request) {
            return service.dcimConsoleServerPortTemplatesUpdate(id, request);
        }
    }

    // ==================== POWER PORTS ====================
    public class PowerPorts {
        public Call<Void> bulkDestroy(List<PowerPortRequest> request) {
            return service.dcimPowerPortsBulkDestroy(request);
        }

        public Call<List<PowerPort>> bulkPartialUpdate(List<PowerPortRequest> request) {
            return service.dcimPowerPortsBulkPartialUpdate(request);
        }

        public Call<List<PowerPort>> bulkUpdate(List<PowerPortRequest> request) {
            return service.dcimPowerPortsBulkUpdate(request);
        }

        public Call<PowerPort> create(DcimPowerPortsCreateRequest request) {
            return service.dcimPowerPortsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimPowerPortsDestroy(id);
        }

        public Call<PaginatedPowerPortList> list() {
            return service.dcimPowerPortsList();
        }

        public Call<PowerPort> partialUpdate(Integer id, PatchedWritablePowerPortRequest request) {
            return service.dcimPowerPortsPartialUpdate(id, request);
        }

        public Call<PowerPort> get(Integer id) {
            return service.dcimPowerPortsRetrieve(id);
        }

        public Call<PowerPort> trace(Integer id) {
            return service.dcimPowerPortsTraceRetrieve(id);
        }

        public Call<PowerPort> update(Integer id, WritablePowerPortRequest request) {
            return service.dcimPowerPortsUpdate(id, request);
        }
    }

    // ==================== POWER PORT TEMPLATES ====================
    public class PowerPortTemplates {
        public Call<Void> bulkDestroy(List<PowerPortTemplateRequest> request) {
            return service.dcimPowerPortTemplatesBulkDestroy(request);
        }

        public Call<List<PowerPortTemplate>> bulkPartialUpdate(List<PowerPortTemplateRequest> request) {
            return service.dcimPowerPortTemplatesBulkPartialUpdate(request);
        }

        public Call<List<PowerPortTemplate>> bulkUpdate(List<PowerPortTemplateRequest> request) {
            return service.dcimPowerPortTemplatesBulkUpdate(request);
        }

        public Call<PowerPortTemplate> create(DcimPowerPortTemplatesCreateRequest request) {
            return service.dcimPowerPortTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimPowerPortTemplatesDestroy(id);
        }

        public Call<PaginatedPowerPortTemplateList> list() {
            return service.dcimPowerPortTemplatesList();
        }

        public Call<PowerPortTemplate> partialUpdate(Integer id, PatchedWritablePowerPortTemplateRequest request) {
            return service.dcimPowerPortTemplatesPartialUpdate(id, request);
        }

        public Call<PowerPortTemplate> get(Integer id) {
            return service.dcimPowerPortTemplatesRetrieve(id);
        }

        public Call<PowerPortTemplate> update(Integer id, WritablePowerPortTemplateRequest request) {
            return service.dcimPowerPortTemplatesUpdate(id, request);
        }
    }

    // ==================== POWER OUTLETS ====================
    public class PowerOutlets {
        public Call<Void> bulkDestroy(List<PowerOutletRequest> request) {
            return service.dcimPowerOutletsBulkDestroy(request);
        }

        public Call<List<PowerOutlet>> bulkPartialUpdate(List<PowerOutletRequest> request) {
            return service.dcimPowerOutletsBulkPartialUpdate(request);
        }

        public Call<List<PowerOutlet>> bulkUpdate(List<PowerOutletRequest> request) {
            return service.dcimPowerOutletsBulkUpdate(request);
        }

        public Call<PowerOutlet> create(DcimPowerOutletsCreateRequest request) {
            return service.dcimPowerOutletsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimPowerOutletsDestroy(id);
        }

        public Call<PaginatedPowerOutletList> list() {
            return service.dcimPowerOutletsList();
        }

        public Call<PowerOutlet> partialUpdate(Integer id, PatchedWritablePowerOutletRequest request) {
            return service.dcimPowerOutletsPartialUpdate(id, request);
        }

        public Call<PowerOutlet> get(Integer id) {
            return service.dcimPowerOutletsRetrieve(id);
        }

        public Call<PowerOutlet> trace(Integer id) {
            return service.dcimPowerOutletsTraceRetrieve(id);
        }

        public Call<PowerOutlet> update(Integer id, WritablePowerOutletRequest request) {
            return service.dcimPowerOutletsUpdate(id, request);
        }
    }

    // ==================== POWER OUTLET TEMPLATES ====================
    public class PowerOutletTemplates {
        public Call<Void> bulkDestroy(List<PowerOutletTemplateRequest> request) {
            return service.dcimPowerOutletTemplatesBulkDestroy(request);
        }

        public Call<List<PowerOutletTemplate>> bulkPartialUpdate(List<PowerOutletTemplateRequest> request) {
            return service.dcimPowerOutletTemplatesBulkPartialUpdate(request);
        }

        public Call<List<PowerOutletTemplate>> bulkUpdate(List<PowerOutletTemplateRequest> request) {
            return service.dcimPowerOutletTemplatesBulkUpdate(request);
        }

        public Call<PowerOutletTemplate> create(DcimPowerOutletTemplatesCreateRequest request) {
            return service.dcimPowerOutletTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimPowerOutletTemplatesDestroy(id);
        }

        public Call<PaginatedPowerOutletTemplateList> list() {
            return service.dcimPowerOutletTemplatesList();
        }

        public Call<PowerOutletTemplate> partialUpdate(Integer id, PatchedWritablePowerOutletTemplateRequest request) {
            return service.dcimPowerOutletTemplatesPartialUpdate(id, request);
        }

        public Call<PowerOutletTemplate> get(Integer id) {
            return service.dcimPowerOutletTemplatesRetrieve(id);
        }

        public Call<PowerOutletTemplate> update(Integer id, WritablePowerOutletTemplateRequest request) {
            return service.dcimPowerOutletTemplatesUpdate(id, request);
        }
    }

    // ==================== POWER PANELS ====================
    public class PowerPanels {
        public Call<Void> bulkDestroy(List<PowerPanelRequest> request) {
            return service.dcimPowerPanelsBulkDestroy(request);
        }

        public Call<List<PowerPanel>> bulkPartialUpdate(List<PowerPanelRequest> request) {
            return service.dcimPowerPanelsBulkPartialUpdate(request);
        }

        public Call<List<PowerPanel>> bulkUpdate(List<PowerPanelRequest> request) {
            return service.dcimPowerPanelsBulkUpdate(request);
        }

        public Call<PowerPanel> create(DcimPowerPanelsCreateRequest request) {
            return service.dcimPowerPanelsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimPowerPanelsDestroy(id);
        }

        public Call<PaginatedPowerPanelList> list() {
            return service.dcimPowerPanelsList();
        }

        public Call<PowerPanel> partialUpdate(Integer id, PatchedPowerPanelRequest request) {
            return service.dcimPowerPanelsPartialUpdate(id, request);
        }

        public Call<PowerPanel> get(Integer id) {
            return service.dcimPowerPanelsRetrieve(id);
        }

        public Call<PowerPanel> update(Integer id, PowerPanelRequest request) {
            return service.dcimPowerPanelsUpdate(id, request);
        }
    }

    // ==================== POWER FEEDS ====================
    public class PowerFeeds {
        public Call<Void> bulkDestroy(List<PowerFeedRequest> request) {
            return service.dcimPowerFeedsBulkDestroy(request);
        }

        public Call<List<PowerFeed>> bulkPartialUpdate(List<PowerFeedRequest> request) {
            return service.dcimPowerFeedsBulkPartialUpdate(request);
        }

        public Call<List<PowerFeed>> bulkUpdate(List<PowerFeedRequest> request) {
            return service.dcimPowerFeedsBulkUpdate(request);
        }

        public Call<PowerFeed> create(DcimPowerFeedsCreateRequest request) {
            return service.dcimPowerFeedsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimPowerFeedsDestroy(id);
        }

        public Call<PaginatedPowerFeedList> list() {
            return service.dcimPowerFeedsList();
        }

        public Call<PowerFeed> partialUpdate(Integer id, PatchedWritablePowerFeedRequest request) {
            return service.dcimPowerFeedsPartialUpdate(id, request);
        }

        public Call<PowerFeed> get(Integer id) {
            return service.dcimPowerFeedsRetrieve(id);
        }

        public Call<PowerFeed> trace(Integer id) {
            return service.dcimPowerFeedsTraceRetrieve(id);
        }

        public Call<PowerFeed> update(Integer id, WritablePowerFeedRequest request) {
            return service.dcimPowerFeedsUpdate(id, request);
        }
    }

    // ==================== FRONT PORTS ====================
    public class FrontPorts {
        public Call<Void> bulkDestroy(List<FrontPortRequest> request) {
            return service.dcimFrontPortsBulkDestroy(request);
        }

        public Call<List<FrontPort>> bulkPartialUpdate(List<FrontPortRequest> request) {
            return service.dcimFrontPortsBulkPartialUpdate(request);
        }

        public Call<List<FrontPort>> bulkUpdate(List<FrontPortRequest> request) {
            return service.dcimFrontPortsBulkUpdate(request);
        }

        public Call<FrontPort> create(DcimFrontPortsCreateRequest request) {
            return service.dcimFrontPortsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimFrontPortsDestroy(id);
        }

        public Call<PaginatedFrontPortList> list() {
            return service.dcimFrontPortsList();
        }

        public Call<FrontPort> partialUpdate(Integer id, PatchedWritableFrontPortRequest request) {
            return service.dcimFrontPortsPartialUpdate(id, request);
        }

        public Call<FrontPort> paths(Integer id) {
            return service.dcimFrontPortsPathsRetrieve(id);
        }

        public Call<FrontPort> get(Integer id) {
            return service.dcimFrontPortsRetrieve(id);
        }

        public Call<FrontPort> update(Integer id, WritableFrontPortRequest request) {
            return service.dcimFrontPortsUpdate(id, request);
        }
    }

    // ==================== FRONT PORT TEMPLATES ====================
    public class FrontPortTemplates {
        public Call<Void> bulkDestroy(List<FrontPortTemplateRequest> request) {
            return service.dcimFrontPortTemplatesBulkDestroy(request);
        }

        public Call<List<FrontPortTemplate>> bulkPartialUpdate(List<FrontPortTemplateRequest> request) {
            return service.dcimFrontPortTemplatesBulkPartialUpdate(request);
        }

        public Call<List<FrontPortTemplate>> bulkUpdate(List<FrontPortTemplateRequest> request) {
            return service.dcimFrontPortTemplatesBulkUpdate(request);
        }

        public Call<FrontPortTemplate> create(DcimFrontPortTemplatesCreateRequest request) {
            return service.dcimFrontPortTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimFrontPortTemplatesDestroy(id);
        }

        public Call<PaginatedFrontPortTemplateList> list() {
            return service.dcimFrontPortTemplatesList();
        }

        public Call<FrontPortTemplate> partialUpdate(Integer id, PatchedWritableFrontPortTemplateRequest request) {
            return service.dcimFrontPortTemplatesPartialUpdate(id, request);
        }

        public Call<FrontPortTemplate> get(Integer id) {
            return service.dcimFrontPortTemplatesRetrieve(id);
        }

        public Call<FrontPortTemplate> update(Integer id, WritableFrontPortTemplateRequest request) {
            return service.dcimFrontPortTemplatesUpdate(id, request);
        }
    }

    // ==================== REAR PORTS ====================
    public class RearPorts {
        public Call<Void> bulkDestroy(List<RearPortRequest> request) {
            return service.dcimRearPortsBulkDestroy(request);
        }

        public Call<List<RearPort>> bulkPartialUpdate(List<RearPortRequest> request) {
            return service.dcimRearPortsBulkPartialUpdate(request);
        }

        public Call<List<RearPort>> bulkUpdate(List<RearPortRequest> request) {
            return service.dcimRearPortsBulkUpdate(request);
        }

        public Call<RearPort> create(DcimRearPortsCreateRequest request) {
            return service.dcimRearPortsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimRearPortsDestroy(id);
        }

        public Call<PaginatedRearPortList> list() {
            return service.dcimRearPortsList();
        }

        public Call<RearPort> partialUpdate(Integer id, PatchedWritableRearPortRequest request) {
            return service.dcimRearPortsPartialUpdate(id, request);
        }

        public Call<RearPort> paths(Integer id) {
            return service.dcimRearPortsPathsRetrieve(id);
        }

        public Call<RearPort> get(Integer id) {
            return service.dcimRearPortsRetrieve(id);
        }

        public Call<RearPort> update(Integer id, WritableRearPortRequest request) {
            return service.dcimRearPortsUpdate(id, request);
        }
    }

    // ==================== REAR PORT TEMPLATES ====================
    public class RearPortTemplates {
        public Call<Void> bulkDestroy(List<RearPortTemplateRequest> request) {
            return service.dcimRearPortTemplatesBulkDestroy(request);
        }

        public Call<List<RearPortTemplate>> bulkPartialUpdate(List<RearPortTemplateRequest> request) {
            return service.dcimRearPortTemplatesBulkPartialUpdate(request);
        }

        public Call<List<RearPortTemplate>> bulkUpdate(List<RearPortTemplateRequest> request) {
            return service.dcimRearPortTemplatesBulkUpdate(request);
        }

        public Call<RearPortTemplate> create(DcimRearPortTemplatesCreateRequest request) {
            return service.dcimRearPortTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimRearPortTemplatesDestroy(id);
        }

        public Call<PaginatedRearPortTemplateList> list() {
            return service.dcimRearPortTemplatesList();
        }

        public Call<RearPortTemplate> partialUpdate(Integer id, PatchedWritableRearPortTemplateRequest request) {
            return service.dcimRearPortTemplatesPartialUpdate(id, request);
        }

        public Call<RearPortTemplate> get(Integer id) {
            return service.dcimRearPortTemplatesRetrieve(id);
        }

        public Call<RearPortTemplate> update(Integer id, WritableRearPortTemplateRequest request) {
            return service.dcimRearPortTemplatesUpdate(id, request);
        }
    }

    // ==================== DEVICE BAYS ====================
    public class DeviceBays {
        public Call<Void> bulkDestroy(List<DeviceBayRequest> request) {
            return service.dcimDeviceBaysBulkDestroy(request);
        }

        public Call<List<DeviceBay>> bulkPartialUpdate(List<DeviceBayRequest> request) {
            return service.dcimDeviceBaysBulkPartialUpdate(request);
        }

        public Call<List<DeviceBay>> bulkUpdate(List<DeviceBayRequest> request) {
            return service.dcimDeviceBaysBulkUpdate(request);
        }

        public Call<DeviceBay> create(DcimDeviceBaysCreateRequest request) {
            return service.dcimDeviceBaysCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimDeviceBaysDestroy(id);
        }

        public Call<PaginatedDeviceBayList> list() {
            return service.dcimDeviceBaysList();
        }

        public Call<DeviceBay> partialUpdate(Integer id, PatchedDeviceBayRequest request) {
            return service.dcimDeviceBaysPartialUpdate(id, request);
        }

        public Call<DeviceBay> get(Integer id) {
            return service.dcimDeviceBaysRetrieve(id);
        }

        public Call<DeviceBay> update(Integer id, DeviceBayRequest request) {
            return service.dcimDeviceBaysUpdate(id, request);
        }
    }

    // ==================== DEVICE BAY TEMPLATES ====================
    public class DeviceBayTemplates {
        public Call<Void> bulkDestroy(List<DeviceBayTemplateRequest> request) {
            return service.dcimDeviceBayTemplatesBulkDestroy(request);
        }

        public Call<List<DeviceBayTemplate>> bulkPartialUpdate(List<DeviceBayTemplateRequest> request) {
            return service.dcimDeviceBayTemplatesBulkPartialUpdate(request);
        }

        public Call<List<DeviceBayTemplate>> bulkUpdate(List<DeviceBayTemplateRequest> request) {
            return service.dcimDeviceBayTemplatesBulkUpdate(request);
        }

        public Call<DeviceBayTemplate> create(DcimDeviceBayTemplatesCreateRequest request) {
            return service.dcimDeviceBayTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimDeviceBayTemplatesDestroy(id);
        }

        public Call<PaginatedDeviceBayTemplateList> list() {
            return service.dcimDeviceBayTemplatesList();
        }

        public Call<DeviceBayTemplate> partialUpdate(Integer id, PatchedDeviceBayTemplateRequest request) {
            return service.dcimDeviceBayTemplatesPartialUpdate(id, request);
        }

        public Call<DeviceBayTemplate> get(Integer id) {
            return service.dcimDeviceBayTemplatesRetrieve(id);
        }

        public Call<DeviceBayTemplate> update(Integer id, DeviceBayTemplateRequest request) {
            return service.dcimDeviceBayTemplatesUpdate(id, request);
        }
    }

    // ==================== MAC ADDRESSES ====================
    public class MacAddresses {
        public Call<Void> bulkDestroy(List<MACAddressRequest> request) {
            return service.dcimMacAddressesBulkDestroy(request);
        }

        public Call<List<MACAddress>> bulkPartialUpdate(List<MACAddressRequest> request) {
            return service.dcimMacAddressesBulkPartialUpdate(request);
        }

        public Call<List<MACAddress>> bulkUpdate(List<MACAddressRequest> request) {
            return service.dcimMacAddressesBulkUpdate(request);
        }

        public Call<MACAddress> create(DcimMacAddressesCreateRequest request) {
            return service.dcimMacAddressesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.dcimMacAddressesDestroy(id);
        }

        public Call<PaginatedMACAddressList> list() {
            return service.dcimMacAddressesList();
        }

        public Call<MACAddress> partialUpdate(Integer id, PatchedMACAddressRequest request) {
            return service.dcimMacAddressesPartialUpdate(id, request);
        }

        public Call<MACAddress> get(Integer id) {
            return service.dcimMacAddressesRetrieve(id);
        }

        public Call<MACAddress> update(Integer id, MACAddressRequest request) {
            return service.dcimMacAddressesUpdate(id, request);
        }
    }
}
