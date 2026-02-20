

# InterfaceRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**device** | [**BriefInterfaceRequestDevice**](BriefInterfaceRequestDevice.md) |  |  |
|**vdcs** | **List&lt;Integer&gt;** |  |  [optional] |
|**module** | [**ConsolePortRequestModule**](ConsolePortRequestModule.md) |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;virtual&#x60; - Virtual * &#x60;bridge&#x60; - Bridge * &#x60;lag&#x60; - Link Aggregation Group (LAG) * &#x60;100base-fx&#x60; - 100BASE-FX (10/100ME) * &#x60;100base-lfx&#x60; - 100BASE-LFX (10/100ME) * &#x60;100base-tx&#x60; - 100BASE-TX (10/100ME) * &#x60;100base-t1&#x60; - 100BASE-T1 (10/100ME) * &#x60;1000base-bx10-d&#x60; - 1000BASE-BX10-D (1GE BiDi Down) * &#x60;1000base-bx10-u&#x60; - 1000BASE-BX10-U (1GE BiDi Up) * &#x60;1000base-cwdm&#x60; - 1000BASE-CWDM (1GE) * &#x60;1000base-cx&#x60; - 1000BASE-CX (1GE DAC) * &#x60;1000base-dwdm&#x60; - 1000BASE-DWDM (1GE) * &#x60;1000base-ex&#x60; - 1000BASE-EX (1GE) * &#x60;1000base-lsx&#x60; - 1000BASE-LSX (1GE) * &#x60;1000base-lx&#x60; - 1000BASE-LX (1GE) * &#x60;1000base-lx10&#x60; - 1000BASE-LX10/LH (1GE) * &#x60;1000base-sx&#x60; - 1000BASE-SX (1GE) * &#x60;1000base-t&#x60; - 1000BASE-T (1GE) * &#x60;1000base-tx&#x60; - 1000BASE-TX (1GE) * &#x60;1000base-zx&#x60; - 1000BASE-ZX (1GE) * &#x60;2.5gbase-t&#x60; - 2.5GBASE-T (2.5GE) * &#x60;5gbase-t&#x60; - 5GBASE-T (5GE) * &#x60;10gbase-br-d&#x60; - 10GBASE-BR-D (10GE BiDi Down) * &#x60;10gbase-br-u&#x60; - 10GBASE-BR-U (10GE BiDi Up) * &#x60;10gbase-cx4&#x60; - 10GBASE-CX4 (10GE DAC) * &#x60;10gbase-er&#x60; - 10GBASE-ER (10GE) * &#x60;10gbase-lr&#x60; - 10GBASE-LR (10GE) * &#x60;10gbase-lrm&#x60; - 10GBASE-LRM (10GE) * &#x60;10gbase-lx4&#x60; - 10GBASE-LX4 (10GE) * &#x60;10gbase-sr&#x60; - 10GBASE-SR (10GE) * &#x60;10gbase-t&#x60; - 10GBASE-T (10GE) * &#x60;10gbase-zr&#x60; - 10GBASE-ZR (10GE) * &#x60;25gbase-cr&#x60; - 25GBASE-CR (25GE DAC) * &#x60;25gbase-er&#x60; - 25GBASE-ER (25GE) * &#x60;25gbase-lr&#x60; - 25GBASE-LR (25GE) * &#x60;25gbase-sr&#x60; - 25GBASE-SR (25GE) * &#x60;25gbase-t&#x60; - 25GBASE-T (25GE) * &#x60;40gbase-cr4&#x60; - 40GBASE-CR4 (40GE DAC) * &#x60;40gbase-er4&#x60; - 40GBASE-ER4 (40GE) * &#x60;40gbase-fr4&#x60; - 40GBASE-FR4 (40GE) * &#x60;40gbase-lr4&#x60; - 40GBASE-LR4 (40GE) * &#x60;40gbase-sr4&#x60; - 40GBASE-SR4 (40GE) * &#x60;50gbase-cr&#x60; - 50GBASE-CR (50GE DAC) * &#x60;50gbase-er&#x60; - 50GBASE-ER (50GE) * &#x60;50gbase-fr&#x60; - 50GBASE-FR (50GE) * &#x60;50gbase-lr&#x60; - 50GBASE-LR (50GE) * &#x60;50gbase-sr&#x60; - 50GBASE-SR (50GE) * &#x60;100gbase-cr1&#x60; - 100GBASE-CR1 (100GE DAC) * &#x60;100gbase-cr2&#x60; - 100GBASE-CR2 (100GE DAC) * &#x60;100gbase-cr4&#x60; - 100GBASE-CR4 (100GE DAC) * &#x60;100gbase-cr10&#x60; - 100GBASE-CR10 (100GE DAC) * &#x60;100gbase-cwdm4&#x60; - 100GBASE-CWDM4 (100GE) * &#x60;100gbase-dr&#x60; - 100GBASE-DR (100GE) * &#x60;100gbase-er4&#x60; - 100GBASE-ER4 (100GE) * &#x60;100gbase-fr1&#x60; - 100GBASE-FR1 (100GE) * &#x60;100gbase-lr1&#x60; - 100GBASE-LR1 (100GE) * &#x60;100gbase-lr4&#x60; - 100GBASE-LR4 (100GE) * &#x60;100gbase-sr1&#x60; - 100GBASE-SR1 (100GE) * &#x60;100gbase-sr1.2&#x60; - 100GBASE-SR1.2 (100GE BiDi) * &#x60;100gbase-sr2&#x60; - 100GBASE-SR2 (100GE) * &#x60;100gbase-sr4&#x60; - 100GBASE-SR4 (100GE) * &#x60;100gbase-sr10&#x60; - 100GBASE-SR10 (100GE) * &#x60;100gbase-zr&#x60; - 100GBASE-ZR (100GE) * &#x60;200gbase-cr2&#x60; - 200GBASE-CR2 (200GE) * &#x60;200gbase-cr4&#x60; - 200GBASE-CR4 (200GE) * &#x60;200gbase-dr4&#x60; - 200GBASE-DR4 (200GE) * &#x60;200gbase-er4&#x60; - 200GBASE-ER4 (200GE) * &#x60;200gbase-fr4&#x60; - 200GBASE-FR4 (200GE) * &#x60;200gbase-lr4&#x60; - 200GBASE-LR4 (200GE) * &#x60;200gbase-sr2&#x60; - 200GBASE-SR2 (200GE) * &#x60;200gbase-sr4&#x60; - 200GBASE-SR4 (200GE) * &#x60;200gbase-vr2&#x60; - 200GBASE-VR2 (200GE) * &#x60;400gbase-cr4&#x60; - 400GBASE-CR4 (400GE) * &#x60;400gbase-dr4&#x60; - 400GBASE-DR4 (400GE) * &#x60;400gbase-er8&#x60; - 400GBASE-ER8 (400GE) * &#x60;400gbase-fr4&#x60; - 400GBASE-FR4 (400GE) * &#x60;400gbase-fr8&#x60; - 400GBASE-FR8 (400GE) * &#x60;400gbase-lr4&#x60; - 400GBASE-LR4 (400GE) * &#x60;400gbase-lr8&#x60; - 400GBASE-LR8 (400GE) * &#x60;400gbase-sr4&#x60; - 400GBASE-SR4 (400GE) * &#x60;400gbase-sr4_2&#x60; - 400GBASE-SR4.2 (400GE BiDi) * &#x60;400gbase-sr8&#x60; - 400GBASE-SR8 (400GE) * &#x60;400gbase-sr16&#x60; - 400GBASE-SR16 (400GE) * &#x60;400gbase-vr4&#x60; - 400GBASE-VR4 (400GE) * &#x60;400gbase-zr&#x60; - 400GBASE-ZR (400GE) * &#x60;800gbase-cr8&#x60; - 800GBASE-CR8 (800GE) * &#x60;800gbase-dr8&#x60; - 800GBASE-DR8 (800GE) * &#x60;800gbase-sr8&#x60; - 800GBASE-SR8 (800GE) * &#x60;800gbase-vr8&#x60; - 800GBASE-VR8 (800GE) * &#x60;100base-x-sfp&#x60; - SFP (100ME) * &#x60;1000base-x-gbic&#x60; - GBIC (1GE) * &#x60;1000base-x-sfp&#x60; - SFP (1GE) * &#x60;10gbase-x-sfpp&#x60; - SFP+ (10GE) * &#x60;10gbase-x-xenpak&#x60; - XENPAK (10GE) * &#x60;10gbase-x-xfp&#x60; - XFP (10GE) * &#x60;10gbase-x-x2&#x60; - X2 (10GE) * &#x60;25gbase-x-sfp28&#x60; - SFP28 (25GE) * &#x60;40gbase-x-qsfpp&#x60; - QSFP+ (40GE) * &#x60;50gbase-x-sfp28&#x60; - QSFP28 (50GE) * &#x60;50gbase-x-sfp56&#x60; - SFP56 (50GE) * &#x60;100gbase-x-cfp&#x60; - CFP (100GE) * &#x60;100gbase-x-cfp2&#x60; - CFP2 (100GE) * &#x60;100gbase-x-cfp4&#x60; - CFP4 (100GE) * &#x60;100gbase-x-cxp&#x60; - CXP (100GE) * &#x60;100gbase-x-cpak&#x60; - Cisco CPAK (100GE) * &#x60;100gbase-x-dsfp&#x60; - DSFP (100GE) * &#x60;100gbase-x-qsfp28&#x60; - QSFP28 (100GE) * &#x60;100gbase-x-qsfpdd&#x60; - QSFP-DD (100GE) * &#x60;100gbase-x-sfpdd&#x60; - SFP-DD (100GE) * &#x60;200gbase-x-cfp2&#x60; - CFP2 (200GE) * &#x60;200gbase-x-qsfp56&#x60; - QSFP56 (200GE) * &#x60;200gbase-x-qsfpdd&#x60; - QSFP-DD (200GE) * &#x60;400gbase-x-qsfp112&#x60; - QSFP112 (400GE) * &#x60;400gbase-x-qsfpdd&#x60; - QSFP-DD (400GE) * &#x60;400gbase-x-cdfp&#x60; - CDFP (400GE) * &#x60;400gbase-x-cfp2&#x60; - CFP2 (400GE) * &#x60;400gbase-x-cfp8&#x60; - CPF8 (400GE) * &#x60;400gbase-x-osfp&#x60; - OSFP (400GE) * &#x60;400gbase-x-osfp-rhs&#x60; - OSFP-RHS (400GE) * &#x60;800gbase-x-osfp&#x60; - OSFP (800GE) * &#x60;800gbase-x-qsfpdd&#x60; - QSFP-DD (800GE) * &#x60;1000base-kx&#x60; - 1000BASE-KX (1GE) * &#x60;2.5gbase-kx&#x60; - 2.5GBASE-KX (2.5GE) * &#x60;5gbase-kr&#x60; - 5GBASE-KR (5GE) * &#x60;10gbase-kr&#x60; - 10GBASE-KR (10GE) * &#x60;10gbase-kx4&#x60; - 10GBASE-KX4 (10GE) * &#x60;25gbase-kr&#x60; - 25GBASE-KR (25GE) * &#x60;40gbase-kr4&#x60; - 40GBASE-KR4 (40GE) * &#x60;50gbase-kr&#x60; - 50GBASE-KR (50GE) * &#x60;100gbase-kp4&#x60; - 100GBASE-KP4 (100GE) * &#x60;100gbase-kr2&#x60; - 100GBASE-KR2 (100GE) * &#x60;100gbase-kr4&#x60; - 100GBASE-KR4 (100GE) * &#x60;ieee802.11a&#x60; - IEEE 802.11a * &#x60;ieee802.11g&#x60; - IEEE 802.11b/g * &#x60;ieee802.11n&#x60; - IEEE 802.11n (Wi-Fi 4) * &#x60;ieee802.11ac&#x60; - IEEE 802.11ac (Wi-Fi 5) * &#x60;ieee802.11ad&#x60; - IEEE 802.11ad (WiGig) * &#x60;ieee802.11ax&#x60; - IEEE 802.11ax (Wi-Fi 6) * &#x60;ieee802.11ay&#x60; - IEEE 802.11ay (WiGig) * &#x60;ieee802.11be&#x60; - IEEE 802.11be (Wi-Fi 7) * &#x60;ieee802.15.1&#x60; - IEEE 802.15.1 (Bluetooth) * &#x60;ieee802.15.4&#x60; - IEEE 802.15.4 (LR-WPAN) * &#x60;other-wireless&#x60; - Other (Wireless) * &#x60;gsm&#x60; - GSM * &#x60;cdma&#x60; - CDMA * &#x60;lte&#x60; - LTE * &#x60;4g&#x60; - 4G * &#x60;5g&#x60; - 5G * &#x60;sonet-oc3&#x60; - OC-3/STM-1 * &#x60;sonet-oc12&#x60; - OC-12/STM-4 * &#x60;sonet-oc48&#x60; - OC-48/STM-16 * &#x60;sonet-oc192&#x60; - OC-192/STM-64 * &#x60;sonet-oc768&#x60; - OC-768/STM-256 * &#x60;sonet-oc1920&#x60; - OC-1920/STM-640 * &#x60;sonet-oc3840&#x60; - OC-3840/STM-1234 * &#x60;1gfc-sfp&#x60; - SFP (1GFC) * &#x60;2gfc-sfp&#x60; - SFP (2GFC) * &#x60;4gfc-sfp&#x60; - SFP (4GFC) * &#x60;8gfc-sfpp&#x60; - SFP+ (8GFC) * &#x60;16gfc-sfpp&#x60; - SFP+ (16GFC) * &#x60;32gfc-sfp28&#x60; - SFP28 (32GFC) * &#x60;32gfc-sfpp&#x60; - SFP+ (32GFC) * &#x60;64gfc-qsfpp&#x60; - QSFP+ (64GFC) * &#x60;64gfc-sfpdd&#x60; - SFP-DD (64GFC) * &#x60;64gfc-sfpp&#x60; - SFP+ (64GFC) * &#x60;128gfc-qsfp28&#x60; - QSFP28 (128GFC) * &#x60;infiniband-sdr&#x60; - SDR (2 Gbps) * &#x60;infiniband-ddr&#x60; - DDR (4 Gbps) * &#x60;infiniband-qdr&#x60; - QDR (8 Gbps) * &#x60;infiniband-fdr10&#x60; - FDR10 (10 Gbps) * &#x60;infiniband-fdr&#x60; - FDR (13.5 Gbps) * &#x60;infiniband-edr&#x60; - EDR (25 Gbps) * &#x60;infiniband-hdr&#x60; - HDR (50 Gbps) * &#x60;infiniband-ndr&#x60; - NDR (100 Gbps) * &#x60;infiniband-xdr&#x60; - XDR (250 Gbps) * &#x60;t1&#x60; - T1 (1.544 Mbps) * &#x60;e1&#x60; - E1 (2.048 Mbps) * &#x60;t3&#x60; - T3 (45 Mbps) * &#x60;e3&#x60; - E3 (34 Mbps) * &#x60;xdsl&#x60; - xDSL * &#x60;docsis&#x60; - DOCSIS * &#x60;moca&#x60; - MoCA * &#x60;bpon&#x60; - BPON (622 Mbps / 155 Mbps) * &#x60;epon&#x60; - EPON (1 Gbps) * &#x60;10g-epon&#x60; - 10G-EPON (10 Gbps) * &#x60;gpon&#x60; - GPON (2.5 Gbps / 1.25 Gbps) * &#x60;xg-pon&#x60; - XG-PON (10 Gbps / 2.5 Gbps) * &#x60;xgs-pon&#x60; - XGS-PON (10 Gbps) * &#x60;ng-pon2&#x60; - NG-PON2 (TWDM-PON) (4x10 Gbps) * &#x60;25g-pon&#x60; - 25G-PON (25 Gbps) * &#x60;50g-pon&#x60; - 50G-PON (50 Gbps) * &#x60;cisco-stackwise&#x60; - Cisco StackWise * &#x60;cisco-stackwise-plus&#x60; - Cisco StackWise Plus * &#x60;cisco-flexstack&#x60; - Cisco FlexStack * &#x60;cisco-flexstack-plus&#x60; - Cisco FlexStack Plus * &#x60;cisco-stackwise-80&#x60; - Cisco StackWise-80 * &#x60;cisco-stackwise-160&#x60; - Cisco StackWise-160 * &#x60;cisco-stackwise-320&#x60; - Cisco StackWise-320 * &#x60;cisco-stackwise-480&#x60; - Cisco StackWise-480 * &#x60;cisco-stackwise-1t&#x60; - Cisco StackWise-1T * &#x60;juniper-vcp&#x60; - Juniper VCP * &#x60;extreme-summitstack&#x60; - Extreme SummitStack * &#x60;extreme-summitstack-128&#x60; - Extreme SummitStack-128 * &#x60;extreme-summitstack-256&#x60; - Extreme SummitStack-256 * &#x60;extreme-summitstack-512&#x60; - Extreme SummitStack-512 * &#x60;other&#x60; - Other |  |
|**enabled** | **Boolean** |  |  [optional] |
|**parent** | [**NestedInterfaceRequest**](NestedInterfaceRequest.md) |  |  [optional] |
|**bridge** | [**NestedInterfaceRequest**](NestedInterfaceRequest.md) |  |  [optional] |
|**lag** | [**NestedInterfaceRequest**](NestedInterfaceRequest.md) |  |  [optional] |
|**mtu** | **Integer** |  |  [optional] |
|**primaryMacAddress** | [**InterfaceRequestPrimaryMacAddress**](InterfaceRequestPrimaryMacAddress.md) |  |  [optional] |
|**speed** | **Integer** |  |  [optional] |
|**duplex** | [**DuplexEnum**](#DuplexEnum) | * &#x60;half&#x60; - Half * &#x60;full&#x60; - Full * &#x60;auto&#x60; - Auto |  [optional] |
|**wwn** | **String** |  |  [optional] |
|**mgmtOnly** | **Boolean** | This interface is used only for out-of-band management |  [optional] |
|**description** | **String** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | * &#x60;access&#x60; - Access * &#x60;tagged&#x60; - Tagged * &#x60;tagged-all&#x60; - Tagged (All) * &#x60;q-in-q&#x60; - Q-in-Q (802.1ad) |  [optional] |
|**rfRole** | [**RfRoleEnum**](#RfRoleEnum) | * &#x60;ap&#x60; - Access point * &#x60;station&#x60; - Station |  [optional] |
|**rfChannel** | [**RfChannelEnum**](#RfChannelEnum) | * &#x60;2.4g-1-2412-22&#x60; - 1 (2412 MHz) * &#x60;2.4g-2-2417-22&#x60; - 2 (2417 MHz) * &#x60;2.4g-3-2422-22&#x60; - 3 (2422 MHz) * &#x60;2.4g-4-2427-22&#x60; - 4 (2427 MHz) * &#x60;2.4g-5-2432-22&#x60; - 5 (2432 MHz) * &#x60;2.4g-6-2437-22&#x60; - 6 (2437 MHz) * &#x60;2.4g-7-2442-22&#x60; - 7 (2442 MHz) * &#x60;2.4g-8-2447-22&#x60; - 8 (2447 MHz) * &#x60;2.4g-9-2452-22&#x60; - 9 (2452 MHz) * &#x60;2.4g-10-2457-22&#x60; - 10 (2457 MHz) * &#x60;2.4g-11-2462-22&#x60; - 11 (2462 MHz) * &#x60;2.4g-12-2467-22&#x60; - 12 (2467 MHz) * &#x60;2.4g-13-2472-22&#x60; - 13 (2472 MHz) * &#x60;5g-32-5160-20&#x60; - 32 (5160/20 MHz) * &#x60;5g-34-5170-40&#x60; - 34 (5170/40 MHz) * &#x60;5g-36-5180-20&#x60; - 36 (5180/20 MHz) * &#x60;5g-38-5190-40&#x60; - 38 (5190/40 MHz) * &#x60;5g-40-5200-20&#x60; - 40 (5200/20 MHz) * &#x60;5g-42-5210-80&#x60; - 42 (5210/80 MHz) * &#x60;5g-44-5220-20&#x60; - 44 (5220/20 MHz) * &#x60;5g-46-5230-40&#x60; - 46 (5230/40 MHz) * &#x60;5g-48-5240-20&#x60; - 48 (5240/20 MHz) * &#x60;5g-50-5250-160&#x60; - 50 (5250/160 MHz) * &#x60;5g-52-5260-20&#x60; - 52 (5260/20 MHz) * &#x60;5g-54-5270-40&#x60; - 54 (5270/40 MHz) * &#x60;5g-56-5280-20&#x60; - 56 (5280/20 MHz) * &#x60;5g-58-5290-80&#x60; - 58 (5290/80 MHz) * &#x60;5g-60-5300-20&#x60; - 60 (5300/20 MHz) * &#x60;5g-62-5310-40&#x60; - 62 (5310/40 MHz) * &#x60;5g-64-5320-20&#x60; - 64 (5320/20 MHz) * &#x60;5g-100-5500-20&#x60; - 100 (5500/20 MHz) * &#x60;5g-102-5510-40&#x60; - 102 (5510/40 MHz) * &#x60;5g-104-5520-20&#x60; - 104 (5520/20 MHz) * &#x60;5g-106-5530-80&#x60; - 106 (5530/80 MHz) * &#x60;5g-108-5540-20&#x60; - 108 (5540/20 MHz) * &#x60;5g-110-5550-40&#x60; - 110 (5550/40 MHz) * &#x60;5g-112-5560-20&#x60; - 112 (5560/20 MHz) * &#x60;5g-114-5570-160&#x60; - 114 (5570/160 MHz) * &#x60;5g-116-5580-20&#x60; - 116 (5580/20 MHz) * &#x60;5g-118-5590-40&#x60; - 118 (5590/40 MHz) * &#x60;5g-120-5600-20&#x60; - 120 (5600/20 MHz) * &#x60;5g-122-5610-80&#x60; - 122 (5610/80 MHz) * &#x60;5g-124-5620-20&#x60; - 124 (5620/20 MHz) * &#x60;5g-126-5630-40&#x60; - 126 (5630/40 MHz) * &#x60;5g-128-5640-20&#x60; - 128 (5640/20 MHz) * &#x60;5g-132-5660-20&#x60; - 132 (5660/20 MHz) * &#x60;5g-134-5670-40&#x60; - 134 (5670/40 MHz) * &#x60;5g-136-5680-20&#x60; - 136 (5680/20 MHz) * &#x60;5g-138-5690-80&#x60; - 138 (5690/80 MHz) * &#x60;5g-140-5700-20&#x60; - 140 (5700/20 MHz) * &#x60;5g-142-5710-40&#x60; - 142 (5710/40 MHz) * &#x60;5g-144-5720-20&#x60; - 144 (5720/20 MHz) * &#x60;5g-149-5745-20&#x60; - 149 (5745/20 MHz) * &#x60;5g-151-5755-40&#x60; - 151 (5755/40 MHz) * &#x60;5g-153-5765-20&#x60; - 153 (5765/20 MHz) * &#x60;5g-155-5775-80&#x60; - 155 (5775/80 MHz) * &#x60;5g-157-5785-20&#x60; - 157 (5785/20 MHz) * &#x60;5g-159-5795-40&#x60; - 159 (5795/40 MHz) * &#x60;5g-161-5805-20&#x60; - 161 (5805/20 MHz) * &#x60;5g-163-5815-160&#x60; - 163 (5815/160 MHz) * &#x60;5g-165-5825-20&#x60; - 165 (5825/20 MHz) * &#x60;5g-167-5835-40&#x60; - 167 (5835/40 MHz) * &#x60;5g-169-5845-20&#x60; - 169 (5845/20 MHz) * &#x60;5g-171-5855-80&#x60; - 171 (5855/80 MHz) * &#x60;5g-173-5865-20&#x60; - 173 (5865/20 MHz) * &#x60;5g-175-5875-40&#x60; - 175 (5875/40 MHz) * &#x60;5g-177-5885-20&#x60; - 177 (5885/20 MHz) * &#x60;6g-1-5955-20&#x60; - 1 (5955/20 MHz) * &#x60;6g-3-5965-40&#x60; - 3 (5965/40 MHz) * &#x60;6g-5-5975-20&#x60; - 5 (5975/20 MHz) * &#x60;6g-7-5985-80&#x60; - 7 (5985/80 MHz) * &#x60;6g-9-5995-20&#x60; - 9 (5995/20 MHz) * &#x60;6g-11-6005-40&#x60; - 11 (6005/40 MHz) * &#x60;6g-13-6015-20&#x60; - 13 (6015/20 MHz) * &#x60;6g-15-6025-160&#x60; - 15 (6025/160 MHz) * &#x60;6g-17-6035-20&#x60; - 17 (6035/20 MHz) * &#x60;6g-19-6045-40&#x60; - 19 (6045/40 MHz) * &#x60;6g-21-6055-20&#x60; - 21 (6055/20 MHz) * &#x60;6g-23-6065-80&#x60; - 23 (6065/80 MHz) * &#x60;6g-25-6075-20&#x60; - 25 (6075/20 MHz) * &#x60;6g-27-6085-40&#x60; - 27 (6085/40 MHz) * &#x60;6g-29-6095-20&#x60; - 29 (6095/20 MHz) * &#x60;6g-31-6105-320&#x60; - 31 (6105/320 MHz) * &#x60;6g-33-6115-20&#x60; - 33 (6115/20 MHz) * &#x60;6g-35-6125-40&#x60; - 35 (6125/40 MHz) * &#x60;6g-37-6135-20&#x60; - 37 (6135/20 MHz) * &#x60;6g-39-6145-80&#x60; - 39 (6145/80 MHz) * &#x60;6g-41-6155-20&#x60; - 41 (6155/20 MHz) * &#x60;6g-43-6165-40&#x60; - 43 (6165/40 MHz) * &#x60;6g-45-6175-20&#x60; - 45 (6175/20 MHz) * &#x60;6g-47-6185-160&#x60; - 47 (6185/160 MHz) * &#x60;6g-49-6195-20&#x60; - 49 (6195/20 MHz) * &#x60;6g-51-6205-40&#x60; - 51 (6205/40 MHz) * &#x60;6g-53-6215-20&#x60; - 53 (6215/20 MHz) * &#x60;6g-55-6225-80&#x60; - 55 (6225/80 MHz) * &#x60;6g-57-6235-20&#x60; - 57 (6235/20 MHz) * &#x60;6g-59-6245-40&#x60; - 59 (6245/40 MHz) * &#x60;6g-61-6255-20&#x60; - 61 (6255/20 MHz) * &#x60;6g-65-6275-20&#x60; - 65 (6275/20 MHz) * &#x60;6g-67-6285-40&#x60; - 67 (6285/40 MHz) * &#x60;6g-69-6295-20&#x60; - 69 (6295/20 MHz) * &#x60;6g-71-6305-80&#x60; - 71 (6305/80 MHz) * &#x60;6g-73-6315-20&#x60; - 73 (6315/20 MHz) * &#x60;6g-75-6325-40&#x60; - 75 (6325/40 MHz) * &#x60;6g-77-6335-20&#x60; - 77 (6335/20 MHz) * &#x60;6g-79-6345-160&#x60; - 79 (6345/160 MHz) * &#x60;6g-81-6355-20&#x60; - 81 (6355/20 MHz) * &#x60;6g-83-6365-40&#x60; - 83 (6365/40 MHz) * &#x60;6g-85-6375-20&#x60; - 85 (6375/20 MHz) * &#x60;6g-87-6385-80&#x60; - 87 (6385/80 MHz) * &#x60;6g-89-6395-20&#x60; - 89 (6395/20 MHz) * &#x60;6g-91-6405-40&#x60; - 91 (6405/40 MHz) * &#x60;6g-93-6415-20&#x60; - 93 (6415/20 MHz) * &#x60;6g-95-6425-320&#x60; - 95 (6425/320 MHz) * &#x60;6g-97-6435-20&#x60; - 97 (6435/20 MHz) * &#x60;6g-99-6445-40&#x60; - 99 (6445/40 MHz) * &#x60;6g-101-6455-20&#x60; - 101 (6455/20 MHz) * &#x60;6g-103-6465-80&#x60; - 103 (6465/80 MHz) * &#x60;6g-105-6475-20&#x60; - 105 (6475/20 MHz) * &#x60;6g-107-6485-40&#x60; - 107 (6485/40 MHz) * &#x60;6g-109-6495-20&#x60; - 109 (6495/20 MHz) * &#x60;6g-111-6505-160&#x60; - 111 (6505/160 MHz) * &#x60;6g-113-6515-20&#x60; - 113 (6515/20 MHz) * &#x60;6g-115-6525-40&#x60; - 115 (6525/40 MHz) * &#x60;6g-117-6535-20&#x60; - 117 (6535/20 MHz) * &#x60;6g-119-6545-80&#x60; - 119 (6545/80 MHz) * &#x60;6g-121-6555-20&#x60; - 121 (6555/20 MHz) * &#x60;6g-123-6565-40&#x60; - 123 (6565/40 MHz) * &#x60;6g-125-6575-20&#x60; - 125 (6575/20 MHz) * &#x60;6g-129-6595-20&#x60; - 129 (6595/20 MHz) * &#x60;6g-131-6605-40&#x60; - 131 (6605/40 MHz) * &#x60;6g-133-6615-20&#x60; - 133 (6615/20 MHz) * &#x60;6g-135-6625-80&#x60; - 135 (6625/80 MHz) * &#x60;6g-137-6635-20&#x60; - 137 (6635/20 MHz) * &#x60;6g-139-6645-40&#x60; - 139 (6645/40 MHz) * &#x60;6g-141-6655-20&#x60; - 141 (6655/20 MHz) * &#x60;6g-143-6665-160&#x60; - 143 (6665/160 MHz) * &#x60;6g-145-6675-20&#x60; - 145 (6675/20 MHz) * &#x60;6g-147-6685-40&#x60; - 147 (6685/40 MHz) * &#x60;6g-149-6695-20&#x60; - 149 (6695/20 MHz) * &#x60;6g-151-6705-80&#x60; - 151 (6705/80 MHz) * &#x60;6g-153-6715-20&#x60; - 153 (6715/20 MHz) * &#x60;6g-155-6725-40&#x60; - 155 (6725/40 MHz) * &#x60;6g-157-6735-20&#x60; - 157 (6735/20 MHz) * &#x60;6g-159-6745-320&#x60; - 159 (6745/320 MHz) * &#x60;6g-161-6755-20&#x60; - 161 (6755/20 MHz) * &#x60;6g-163-6765-40&#x60; - 163 (6765/40 MHz) * &#x60;6g-165-6775-20&#x60; - 165 (6775/20 MHz) * &#x60;6g-167-6785-80&#x60; - 167 (6785/80 MHz) * &#x60;6g-169-6795-20&#x60; - 169 (6795/20 MHz) * &#x60;6g-171-6805-40&#x60; - 171 (6805/40 MHz) * &#x60;6g-173-6815-20&#x60; - 173 (6815/20 MHz) * &#x60;6g-175-6825-160&#x60; - 175 (6825/160 MHz) * &#x60;6g-177-6835-20&#x60; - 177 (6835/20 MHz) * &#x60;6g-179-6845-40&#x60; - 179 (6845/40 MHz) * &#x60;6g-181-6855-20&#x60; - 181 (6855/20 MHz) * &#x60;6g-183-6865-80&#x60; - 183 (6865/80 MHz) * &#x60;6g-185-6875-20&#x60; - 185 (6875/20 MHz) * &#x60;6g-187-6885-40&#x60; - 187 (6885/40 MHz) * &#x60;6g-189-6895-20&#x60; - 189 (6895/20 MHz) * &#x60;6g-193-6915-20&#x60; - 193 (6915/20 MHz) * &#x60;6g-195-6925-40&#x60; - 195 (6925/40 MHz) * &#x60;6g-197-6935-20&#x60; - 197 (6935/20 MHz) * &#x60;6g-199-6945-80&#x60; - 199 (6945/80 MHz) * &#x60;6g-201-6955-20&#x60; - 201 (6955/20 MHz) * &#x60;6g-203-6965-40&#x60; - 203 (6965/40 MHz) * &#x60;6g-205-6975-20&#x60; - 205 (6975/20 MHz) * &#x60;6g-207-6985-160&#x60; - 207 (6985/160 MHz) * &#x60;6g-209-6995-20&#x60; - 209 (6995/20 MHz) * &#x60;6g-211-7005-40&#x60; - 211 (7005/40 MHz) * &#x60;6g-213-7015-20&#x60; - 213 (7015/20 MHz) * &#x60;6g-215-7025-80&#x60; - 215 (7025/80 MHz) * &#x60;6g-217-7035-20&#x60; - 217 (7035/20 MHz) * &#x60;6g-219-7045-40&#x60; - 219 (7045/40 MHz) * &#x60;6g-221-7055-20&#x60; - 221 (7055/20 MHz) * &#x60;6g-225-7075-20&#x60; - 225 (7075/20 MHz) * &#x60;6g-227-7085-40&#x60; - 227 (7085/40 MHz) * &#x60;6g-229-7095-20&#x60; - 229 (7095/20 MHz) * &#x60;6g-233-7115-20&#x60; - 233 (7115/20 MHz) * &#x60;60g-1-58320-2160&#x60; - 1 (58.32/2.16 GHz) * &#x60;60g-2-60480-2160&#x60; - 2 (60.48/2.16 GHz) * &#x60;60g-3-62640-2160&#x60; - 3 (62.64/2.16 GHz) * &#x60;60g-4-64800-2160&#x60; - 4 (64.80/2.16 GHz) * &#x60;60g-5-66960-2160&#x60; - 5 (66.96/2.16 GHz) * &#x60;60g-6-69120-2160&#x60; - 6 (69.12/2.16 GHz) * &#x60;60g-9-59400-4320&#x60; - 9 (59.40/4.32 GHz) * &#x60;60g-10-61560-4320&#x60; - 10 (61.56/4.32 GHz) * &#x60;60g-11-63720-4320&#x60; - 11 (63.72/4.32 GHz) * &#x60;60g-12-65880-4320&#x60; - 12 (65.88/4.32 GHz) * &#x60;60g-13-68040-4320&#x60; - 13 (68.04/4.32 GHz) * &#x60;60g-17-60480-6480&#x60; - 17 (60.48/6.48 GHz) * &#x60;60g-18-62640-6480&#x60; - 18 (62.64/6.48 GHz) * &#x60;60g-19-64800-6480&#x60; - 19 (64.80/6.48 GHz) * &#x60;60g-20-66960-6480&#x60; - 20 (66.96/6.48 GHz) * &#x60;60g-25-61560-6480&#x60; - 25 (61.56/8.64 GHz) * &#x60;60g-26-63720-6480&#x60; - 26 (63.72/8.64 GHz) * &#x60;60g-27-65880-6480&#x60; - 27 (65.88/8.64 GHz) |  [optional] |
|**poeMode** | [**PoeModeEnum**](#PoeModeEnum) | * &#x60;pd&#x60; - PD * &#x60;pse&#x60; - PSE |  [optional] |
|**poeType** | [**PoeTypeEnum**](#PoeTypeEnum) | * &#x60;type1-ieee802.3af&#x60; - 802.3af (Type 1) * &#x60;type2-ieee802.3at&#x60; - 802.3at (Type 2) * &#x60;type3-ieee802.3bt&#x60; - 802.3bt (Type 3) * &#x60;type4-ieee802.3bt&#x60; - 802.3bt (Type 4) * &#x60;passive-24v-2pair&#x60; - Passive 24V (2-pair) * &#x60;passive-24v-4pair&#x60; - Passive 24V (4-pair) * &#x60;passive-48v-2pair&#x60; - Passive 48V (2-pair) * &#x60;passive-48v-4pair&#x60; - Passive 48V (4-pair) |  [optional] |
|**rfChannelFrequency** | **Double** | Populated by selected channel (if set) |  [optional] |
|**rfChannelWidth** | **Double** | Populated by selected channel (if set) |  [optional] |
|**txPower** | **Integer** |  |  [optional] |
|**untaggedVlan** | [**InterfaceRequestUntaggedVlan**](InterfaceRequestUntaggedVlan.md) |  |  [optional] |
|**taggedVlans** | **List&lt;Integer&gt;** |  |  [optional] |
|**qinqSvlan** | [**InterfaceRequestUntaggedVlan**](InterfaceRequestUntaggedVlan.md) |  |  [optional] |
|**vlanTranslationPolicy** | [**InterfaceRequestVlanTranslationPolicy**](InterfaceRequestVlanTranslationPolicy.md) |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**wirelessLans** | **List&lt;Integer&gt;** |  |  [optional] |
|**vrf** | [**IPAddressRequestVrf**](IPAddressRequestVrf.md) |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VIRTUAL | &quot;virtual&quot; |
| BRIDGE | &quot;bridge&quot; |
| LAG | &quot;lag&quot; |
| _100BASE_FX | &quot;100base-fx&quot; |
| _100BASE_LFX | &quot;100base-lfx&quot; |
| _100BASE_TX | &quot;100base-tx&quot; |
| _100BASE_T1 | &quot;100base-t1&quot; |
| _1000BASE_BX10_D | &quot;1000base-bx10-d&quot; |
| _1000BASE_BX10_U | &quot;1000base-bx10-u&quot; |
| _1000BASE_CWDM | &quot;1000base-cwdm&quot; |
| _1000BASE_CX | &quot;1000base-cx&quot; |
| _1000BASE_DWDM | &quot;1000base-dwdm&quot; |
| _1000BASE_EX | &quot;1000base-ex&quot; |
| _1000BASE_LSX | &quot;1000base-lsx&quot; |
| _1000BASE_LX | &quot;1000base-lx&quot; |
| _1000BASE_LX10 | &quot;1000base-lx10&quot; |
| _1000BASE_SX | &quot;1000base-sx&quot; |
| _1000BASE_T | &quot;1000base-t&quot; |
| _1000BASE_TX | &quot;1000base-tx&quot; |
| _1000BASE_ZX | &quot;1000base-zx&quot; |
| _2_5GBASE_T | &quot;2.5gbase-t&quot; |
| _5GBASE_T | &quot;5gbase-t&quot; |
| _10GBASE_BR_D | &quot;10gbase-br-d&quot; |
| _10GBASE_BR_U | &quot;10gbase-br-u&quot; |
| _10GBASE_CX4 | &quot;10gbase-cx4&quot; |
| _10GBASE_ER | &quot;10gbase-er&quot; |
| _10GBASE_LR | &quot;10gbase-lr&quot; |
| _10GBASE_LRM | &quot;10gbase-lrm&quot; |
| _10GBASE_LX4 | &quot;10gbase-lx4&quot; |
| _10GBASE_SR | &quot;10gbase-sr&quot; |
| _10GBASE_T | &quot;10gbase-t&quot; |
| _10GBASE_ZR | &quot;10gbase-zr&quot; |
| _25GBASE_CR | &quot;25gbase-cr&quot; |
| _25GBASE_ER | &quot;25gbase-er&quot; |
| _25GBASE_LR | &quot;25gbase-lr&quot; |
| _25GBASE_SR | &quot;25gbase-sr&quot; |
| _25GBASE_T | &quot;25gbase-t&quot; |
| _40GBASE_CR4 | &quot;40gbase-cr4&quot; |
| _40GBASE_ER4 | &quot;40gbase-er4&quot; |
| _40GBASE_FR4 | &quot;40gbase-fr4&quot; |
| _40GBASE_LR4 | &quot;40gbase-lr4&quot; |
| _40GBASE_SR4 | &quot;40gbase-sr4&quot; |
| _50GBASE_CR | &quot;50gbase-cr&quot; |
| _50GBASE_ER | &quot;50gbase-er&quot; |
| _50GBASE_FR | &quot;50gbase-fr&quot; |
| _50GBASE_LR | &quot;50gbase-lr&quot; |
| _50GBASE_SR | &quot;50gbase-sr&quot; |
| _100GBASE_CR1 | &quot;100gbase-cr1&quot; |
| _100GBASE_CR2 | &quot;100gbase-cr2&quot; |
| _100GBASE_CR4 | &quot;100gbase-cr4&quot; |
| _100GBASE_CR10 | &quot;100gbase-cr10&quot; |
| _100GBASE_CWDM4 | &quot;100gbase-cwdm4&quot; |
| _100GBASE_DR | &quot;100gbase-dr&quot; |
| _100GBASE_ER4 | &quot;100gbase-er4&quot; |
| _100GBASE_FR1 | &quot;100gbase-fr1&quot; |
| _100GBASE_LR1 | &quot;100gbase-lr1&quot; |
| _100GBASE_LR4 | &quot;100gbase-lr4&quot; |
| _100GBASE_SR1 | &quot;100gbase-sr1&quot; |
| _100GBASE_SR1_2 | &quot;100gbase-sr1.2&quot; |
| _100GBASE_SR2 | &quot;100gbase-sr2&quot; |
| _100GBASE_SR4 | &quot;100gbase-sr4&quot; |
| _100GBASE_SR10 | &quot;100gbase-sr10&quot; |
| _100GBASE_ZR | &quot;100gbase-zr&quot; |
| _200GBASE_CR2 | &quot;200gbase-cr2&quot; |
| _200GBASE_CR4 | &quot;200gbase-cr4&quot; |
| _200GBASE_DR4 | &quot;200gbase-dr4&quot; |
| _200GBASE_ER4 | &quot;200gbase-er4&quot; |
| _200GBASE_FR4 | &quot;200gbase-fr4&quot; |
| _200GBASE_LR4 | &quot;200gbase-lr4&quot; |
| _200GBASE_SR2 | &quot;200gbase-sr2&quot; |
| _200GBASE_SR4 | &quot;200gbase-sr4&quot; |
| _200GBASE_VR2 | &quot;200gbase-vr2&quot; |
| _400GBASE_CR4 | &quot;400gbase-cr4&quot; |
| _400GBASE_DR4 | &quot;400gbase-dr4&quot; |
| _400GBASE_ER8 | &quot;400gbase-er8&quot; |
| _400GBASE_FR4 | &quot;400gbase-fr4&quot; |
| _400GBASE_FR8 | &quot;400gbase-fr8&quot; |
| _400GBASE_LR4 | &quot;400gbase-lr4&quot; |
| _400GBASE_LR8 | &quot;400gbase-lr8&quot; |
| _400GBASE_SR4 | &quot;400gbase-sr4&quot; |
| _400GBASE_SR4_2 | &quot;400gbase-sr4_2&quot; |
| _400GBASE_SR8 | &quot;400gbase-sr8&quot; |
| _400GBASE_SR16 | &quot;400gbase-sr16&quot; |
| _400GBASE_VR4 | &quot;400gbase-vr4&quot; |
| _400GBASE_ZR | &quot;400gbase-zr&quot; |
| _800GBASE_CR8 | &quot;800gbase-cr8&quot; |
| _800GBASE_DR8 | &quot;800gbase-dr8&quot; |
| _800GBASE_SR8 | &quot;800gbase-sr8&quot; |
| _800GBASE_VR8 | &quot;800gbase-vr8&quot; |
| _100BASE_X_SFP | &quot;100base-x-sfp&quot; |
| _1000BASE_X_GBIC | &quot;1000base-x-gbic&quot; |
| _1000BASE_X_SFP | &quot;1000base-x-sfp&quot; |
| _10GBASE_X_SFPP | &quot;10gbase-x-sfpp&quot; |
| _10GBASE_X_XENPAK | &quot;10gbase-x-xenpak&quot; |
| _10GBASE_X_XFP | &quot;10gbase-x-xfp&quot; |
| _10GBASE_X_X2 | &quot;10gbase-x-x2&quot; |
| _25GBASE_X_SFP28 | &quot;25gbase-x-sfp28&quot; |
| _40GBASE_X_QSFPP | &quot;40gbase-x-qsfpp&quot; |
| _50GBASE_X_SFP28 | &quot;50gbase-x-sfp28&quot; |
| _50GBASE_X_SFP56 | &quot;50gbase-x-sfp56&quot; |
| _100GBASE_X_CFP | &quot;100gbase-x-cfp&quot; |
| _100GBASE_X_CFP2 | &quot;100gbase-x-cfp2&quot; |
| _100GBASE_X_CFP4 | &quot;100gbase-x-cfp4&quot; |
| _100GBASE_X_CXP | &quot;100gbase-x-cxp&quot; |
| _100GBASE_X_CPAK | &quot;100gbase-x-cpak&quot; |
| _100GBASE_X_DSFP | &quot;100gbase-x-dsfp&quot; |
| _100GBASE_X_QSFP28 | &quot;100gbase-x-qsfp28&quot; |
| _100GBASE_X_QSFPDD | &quot;100gbase-x-qsfpdd&quot; |
| _100GBASE_X_SFPDD | &quot;100gbase-x-sfpdd&quot; |
| _200GBASE_X_CFP2 | &quot;200gbase-x-cfp2&quot; |
| _200GBASE_X_QSFP56 | &quot;200gbase-x-qsfp56&quot; |
| _200GBASE_X_QSFPDD | &quot;200gbase-x-qsfpdd&quot; |
| _400GBASE_X_QSFP112 | &quot;400gbase-x-qsfp112&quot; |
| _400GBASE_X_QSFPDD | &quot;400gbase-x-qsfpdd&quot; |
| _400GBASE_X_CDFP | &quot;400gbase-x-cdfp&quot; |
| _400GBASE_X_CFP2 | &quot;400gbase-x-cfp2&quot; |
| _400GBASE_X_CFP8 | &quot;400gbase-x-cfp8&quot; |
| _400GBASE_X_OSFP | &quot;400gbase-x-osfp&quot; |
| _400GBASE_X_OSFP_RHS | &quot;400gbase-x-osfp-rhs&quot; |
| _800GBASE_X_OSFP | &quot;800gbase-x-osfp&quot; |
| _800GBASE_X_QSFPDD | &quot;800gbase-x-qsfpdd&quot; |
| _1000BASE_KX | &quot;1000base-kx&quot; |
| _2_5GBASE_KX | &quot;2.5gbase-kx&quot; |
| _5GBASE_KR | &quot;5gbase-kr&quot; |
| _10GBASE_KR | &quot;10gbase-kr&quot; |
| _10GBASE_KX4 | &quot;10gbase-kx4&quot; |
| _25GBASE_KR | &quot;25gbase-kr&quot; |
| _40GBASE_KR4 | &quot;40gbase-kr4&quot; |
| _50GBASE_KR | &quot;50gbase-kr&quot; |
| _100GBASE_KP4 | &quot;100gbase-kp4&quot; |
| _100GBASE_KR2 | &quot;100gbase-kr2&quot; |
| _100GBASE_KR4 | &quot;100gbase-kr4&quot; |
| IEEE802_11A | &quot;ieee802.11a&quot; |
| IEEE802_11G | &quot;ieee802.11g&quot; |
| IEEE802_11N | &quot;ieee802.11n&quot; |
| IEEE802_11AC | &quot;ieee802.11ac&quot; |
| IEEE802_11AD | &quot;ieee802.11ad&quot; |
| IEEE802_11AX | &quot;ieee802.11ax&quot; |
| IEEE802_11AY | &quot;ieee802.11ay&quot; |
| IEEE802_11BE | &quot;ieee802.11be&quot; |
| IEEE802_15_1 | &quot;ieee802.15.1&quot; |
| IEEE802_15_4 | &quot;ieee802.15.4&quot; |
| OTHER_WIRELESS | &quot;other-wireless&quot; |
| GSM | &quot;gsm&quot; |
| CDMA | &quot;cdma&quot; |
| LTE | &quot;lte&quot; |
| _4G | &quot;4g&quot; |
| _5G | &quot;5g&quot; |
| SONET_OC3 | &quot;sonet-oc3&quot; |
| SONET_OC12 | &quot;sonet-oc12&quot; |
| SONET_OC48 | &quot;sonet-oc48&quot; |
| SONET_OC192 | &quot;sonet-oc192&quot; |
| SONET_OC768 | &quot;sonet-oc768&quot; |
| SONET_OC1920 | &quot;sonet-oc1920&quot; |
| SONET_OC3840 | &quot;sonet-oc3840&quot; |
| _1GFC_SFP | &quot;1gfc-sfp&quot; |
| _2GFC_SFP | &quot;2gfc-sfp&quot; |
| _4GFC_SFP | &quot;4gfc-sfp&quot; |
| _8GFC_SFPP | &quot;8gfc-sfpp&quot; |
| _16GFC_SFPP | &quot;16gfc-sfpp&quot; |
| _32GFC_SFP28 | &quot;32gfc-sfp28&quot; |
| _32GFC_SFPP | &quot;32gfc-sfpp&quot; |
| _64GFC_QSFPP | &quot;64gfc-qsfpp&quot; |
| _64GFC_SFPDD | &quot;64gfc-sfpdd&quot; |
| _64GFC_SFPP | &quot;64gfc-sfpp&quot; |
| _128GFC_QSFP28 | &quot;128gfc-qsfp28&quot; |
| INFINIBAND_SDR | &quot;infiniband-sdr&quot; |
| INFINIBAND_DDR | &quot;infiniband-ddr&quot; |
| INFINIBAND_QDR | &quot;infiniband-qdr&quot; |
| INFINIBAND_FDR10 | &quot;infiniband-fdr10&quot; |
| INFINIBAND_FDR | &quot;infiniband-fdr&quot; |
| INFINIBAND_EDR | &quot;infiniband-edr&quot; |
| INFINIBAND_HDR | &quot;infiniband-hdr&quot; |
| INFINIBAND_NDR | &quot;infiniband-ndr&quot; |
| INFINIBAND_XDR | &quot;infiniband-xdr&quot; |
| T1 | &quot;t1&quot; |
| E1 | &quot;e1&quot; |
| T3 | &quot;t3&quot; |
| E3 | &quot;e3&quot; |
| XDSL | &quot;xdsl&quot; |
| DOCSIS | &quot;docsis&quot; |
| MOCA | &quot;moca&quot; |
| BPON | &quot;bpon&quot; |
| EPON | &quot;epon&quot; |
| _10G_EPON | &quot;10g-epon&quot; |
| GPON | &quot;gpon&quot; |
| XG_PON | &quot;xg-pon&quot; |
| XGS_PON | &quot;xgs-pon&quot; |
| NG_PON2 | &quot;ng-pon2&quot; |
| _25G_PON | &quot;25g-pon&quot; |
| _50G_PON | &quot;50g-pon&quot; |
| CISCO_STACKWISE | &quot;cisco-stackwise&quot; |
| CISCO_STACKWISE_PLUS | &quot;cisco-stackwise-plus&quot; |
| CISCO_FLEXSTACK | &quot;cisco-flexstack&quot; |
| CISCO_FLEXSTACK_PLUS | &quot;cisco-flexstack-plus&quot; |
| CISCO_STACKWISE_80 | &quot;cisco-stackwise-80&quot; |
| CISCO_STACKWISE_160 | &quot;cisco-stackwise-160&quot; |
| CISCO_STACKWISE_320 | &quot;cisco-stackwise-320&quot; |
| CISCO_STACKWISE_480 | &quot;cisco-stackwise-480&quot; |
| CISCO_STACKWISE_1T | &quot;cisco-stackwise-1t&quot; |
| JUNIPER_VCP | &quot;juniper-vcp&quot; |
| EXTREME_SUMMITSTACK | &quot;extreme-summitstack&quot; |
| EXTREME_SUMMITSTACK_128 | &quot;extreme-summitstack-128&quot; |
| EXTREME_SUMMITSTACK_256 | &quot;extreme-summitstack-256&quot; |
| EXTREME_SUMMITSTACK_512 | &quot;extreme-summitstack-512&quot; |
| OTHER | &quot;other&quot; |



## Enum: DuplexEnum

| Name | Value |
|---- | -----|
| HALF | &quot;half&quot; |
| FULL | &quot;full&quot; |
| AUTO | &quot;auto&quot; |
| EMPTY | &quot;&quot; |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| ACCESS | &quot;access&quot; |
| TAGGED | &quot;tagged&quot; |
| TAGGED_ALL | &quot;tagged-all&quot; |
| Q_IN_Q | &quot;q-in-q&quot; |
| EMPTY | &quot;&quot; |



## Enum: RfRoleEnum

| Name | Value |
|---- | -----|
| AP | &quot;ap&quot; |
| STATION | &quot;station&quot; |
| EMPTY | &quot;&quot; |



## Enum: RfChannelEnum

| Name | Value |
|---- | -----|
| _2_4G_1_2412_22 | &quot;2.4g-1-2412-22&quot; |
| _2_4G_2_2417_22 | &quot;2.4g-2-2417-22&quot; |
| _2_4G_3_2422_22 | &quot;2.4g-3-2422-22&quot; |
| _2_4G_4_2427_22 | &quot;2.4g-4-2427-22&quot; |
| _2_4G_5_2432_22 | &quot;2.4g-5-2432-22&quot; |
| _2_4G_6_2437_22 | &quot;2.4g-6-2437-22&quot; |
| _2_4G_7_2442_22 | &quot;2.4g-7-2442-22&quot; |
| _2_4G_8_2447_22 | &quot;2.4g-8-2447-22&quot; |
| _2_4G_9_2452_22 | &quot;2.4g-9-2452-22&quot; |
| _2_4G_10_2457_22 | &quot;2.4g-10-2457-22&quot; |
| _2_4G_11_2462_22 | &quot;2.4g-11-2462-22&quot; |
| _2_4G_12_2467_22 | &quot;2.4g-12-2467-22&quot; |
| _2_4G_13_2472_22 | &quot;2.4g-13-2472-22&quot; |
| _5G_32_5160_20 | &quot;5g-32-5160-20&quot; |
| _5G_34_5170_40 | &quot;5g-34-5170-40&quot; |
| _5G_36_5180_20 | &quot;5g-36-5180-20&quot; |
| _5G_38_5190_40 | &quot;5g-38-5190-40&quot; |
| _5G_40_5200_20 | &quot;5g-40-5200-20&quot; |
| _5G_42_5210_80 | &quot;5g-42-5210-80&quot; |
| _5G_44_5220_20 | &quot;5g-44-5220-20&quot; |
| _5G_46_5230_40 | &quot;5g-46-5230-40&quot; |
| _5G_48_5240_20 | &quot;5g-48-5240-20&quot; |
| _5G_50_5250_160 | &quot;5g-50-5250-160&quot; |
| _5G_52_5260_20 | &quot;5g-52-5260-20&quot; |
| _5G_54_5270_40 | &quot;5g-54-5270-40&quot; |
| _5G_56_5280_20 | &quot;5g-56-5280-20&quot; |
| _5G_58_5290_80 | &quot;5g-58-5290-80&quot; |
| _5G_60_5300_20 | &quot;5g-60-5300-20&quot; |
| _5G_62_5310_40 | &quot;5g-62-5310-40&quot; |
| _5G_64_5320_20 | &quot;5g-64-5320-20&quot; |
| _5G_100_5500_20 | &quot;5g-100-5500-20&quot; |
| _5G_102_5510_40 | &quot;5g-102-5510-40&quot; |
| _5G_104_5520_20 | &quot;5g-104-5520-20&quot; |
| _5G_106_5530_80 | &quot;5g-106-5530-80&quot; |
| _5G_108_5540_20 | &quot;5g-108-5540-20&quot; |
| _5G_110_5550_40 | &quot;5g-110-5550-40&quot; |
| _5G_112_5560_20 | &quot;5g-112-5560-20&quot; |
| _5G_114_5570_160 | &quot;5g-114-5570-160&quot; |
| _5G_116_5580_20 | &quot;5g-116-5580-20&quot; |
| _5G_118_5590_40 | &quot;5g-118-5590-40&quot; |
| _5G_120_5600_20 | &quot;5g-120-5600-20&quot; |
| _5G_122_5610_80 | &quot;5g-122-5610-80&quot; |
| _5G_124_5620_20 | &quot;5g-124-5620-20&quot; |
| _5G_126_5630_40 | &quot;5g-126-5630-40&quot; |
| _5G_128_5640_20 | &quot;5g-128-5640-20&quot; |
| _5G_132_5660_20 | &quot;5g-132-5660-20&quot; |
| _5G_134_5670_40 | &quot;5g-134-5670-40&quot; |
| _5G_136_5680_20 | &quot;5g-136-5680-20&quot; |
| _5G_138_5690_80 | &quot;5g-138-5690-80&quot; |
| _5G_140_5700_20 | &quot;5g-140-5700-20&quot; |
| _5G_142_5710_40 | &quot;5g-142-5710-40&quot; |
| _5G_144_5720_20 | &quot;5g-144-5720-20&quot; |
| _5G_149_5745_20 | &quot;5g-149-5745-20&quot; |
| _5G_151_5755_40 | &quot;5g-151-5755-40&quot; |
| _5G_153_5765_20 | &quot;5g-153-5765-20&quot; |
| _5G_155_5775_80 | &quot;5g-155-5775-80&quot; |
| _5G_157_5785_20 | &quot;5g-157-5785-20&quot; |
| _5G_159_5795_40 | &quot;5g-159-5795-40&quot; |
| _5G_161_5805_20 | &quot;5g-161-5805-20&quot; |
| _5G_163_5815_160 | &quot;5g-163-5815-160&quot; |
| _5G_165_5825_20 | &quot;5g-165-5825-20&quot; |
| _5G_167_5835_40 | &quot;5g-167-5835-40&quot; |
| _5G_169_5845_20 | &quot;5g-169-5845-20&quot; |
| _5G_171_5855_80 | &quot;5g-171-5855-80&quot; |
| _5G_173_5865_20 | &quot;5g-173-5865-20&quot; |
| _5G_175_5875_40 | &quot;5g-175-5875-40&quot; |
| _5G_177_5885_20 | &quot;5g-177-5885-20&quot; |
| _6G_1_5955_20 | &quot;6g-1-5955-20&quot; |
| _6G_3_5965_40 | &quot;6g-3-5965-40&quot; |
| _6G_5_5975_20 | &quot;6g-5-5975-20&quot; |
| _6G_7_5985_80 | &quot;6g-7-5985-80&quot; |
| _6G_9_5995_20 | &quot;6g-9-5995-20&quot; |
| _6G_11_6005_40 | &quot;6g-11-6005-40&quot; |
| _6G_13_6015_20 | &quot;6g-13-6015-20&quot; |
| _6G_15_6025_160 | &quot;6g-15-6025-160&quot; |
| _6G_17_6035_20 | &quot;6g-17-6035-20&quot; |
| _6G_19_6045_40 | &quot;6g-19-6045-40&quot; |
| _6G_21_6055_20 | &quot;6g-21-6055-20&quot; |
| _6G_23_6065_80 | &quot;6g-23-6065-80&quot; |
| _6G_25_6075_20 | &quot;6g-25-6075-20&quot; |
| _6G_27_6085_40 | &quot;6g-27-6085-40&quot; |
| _6G_29_6095_20 | &quot;6g-29-6095-20&quot; |
| _6G_31_6105_320 | &quot;6g-31-6105-320&quot; |
| _6G_33_6115_20 | &quot;6g-33-6115-20&quot; |
| _6G_35_6125_40 | &quot;6g-35-6125-40&quot; |
| _6G_37_6135_20 | &quot;6g-37-6135-20&quot; |
| _6G_39_6145_80 | &quot;6g-39-6145-80&quot; |
| _6G_41_6155_20 | &quot;6g-41-6155-20&quot; |
| _6G_43_6165_40 | &quot;6g-43-6165-40&quot; |
| _6G_45_6175_20 | &quot;6g-45-6175-20&quot; |
| _6G_47_6185_160 | &quot;6g-47-6185-160&quot; |
| _6G_49_6195_20 | &quot;6g-49-6195-20&quot; |
| _6G_51_6205_40 | &quot;6g-51-6205-40&quot; |
| _6G_53_6215_20 | &quot;6g-53-6215-20&quot; |
| _6G_55_6225_80 | &quot;6g-55-6225-80&quot; |
| _6G_57_6235_20 | &quot;6g-57-6235-20&quot; |
| _6G_59_6245_40 | &quot;6g-59-6245-40&quot; |
| _6G_61_6255_20 | &quot;6g-61-6255-20&quot; |
| _6G_65_6275_20 | &quot;6g-65-6275-20&quot; |
| _6G_67_6285_40 | &quot;6g-67-6285-40&quot; |
| _6G_69_6295_20 | &quot;6g-69-6295-20&quot; |
| _6G_71_6305_80 | &quot;6g-71-6305-80&quot; |
| _6G_73_6315_20 | &quot;6g-73-6315-20&quot; |
| _6G_75_6325_40 | &quot;6g-75-6325-40&quot; |
| _6G_77_6335_20 | &quot;6g-77-6335-20&quot; |
| _6G_79_6345_160 | &quot;6g-79-6345-160&quot; |
| _6G_81_6355_20 | &quot;6g-81-6355-20&quot; |
| _6G_83_6365_40 | &quot;6g-83-6365-40&quot; |
| _6G_85_6375_20 | &quot;6g-85-6375-20&quot; |
| _6G_87_6385_80 | &quot;6g-87-6385-80&quot; |
| _6G_89_6395_20 | &quot;6g-89-6395-20&quot; |
| _6G_91_6405_40 | &quot;6g-91-6405-40&quot; |
| _6G_93_6415_20 | &quot;6g-93-6415-20&quot; |
| _6G_95_6425_320 | &quot;6g-95-6425-320&quot; |
| _6G_97_6435_20 | &quot;6g-97-6435-20&quot; |
| _6G_99_6445_40 | &quot;6g-99-6445-40&quot; |
| _6G_101_6455_20 | &quot;6g-101-6455-20&quot; |
| _6G_103_6465_80 | &quot;6g-103-6465-80&quot; |
| _6G_105_6475_20 | &quot;6g-105-6475-20&quot; |
| _6G_107_6485_40 | &quot;6g-107-6485-40&quot; |
| _6G_109_6495_20 | &quot;6g-109-6495-20&quot; |
| _6G_111_6505_160 | &quot;6g-111-6505-160&quot; |
| _6G_113_6515_20 | &quot;6g-113-6515-20&quot; |
| _6G_115_6525_40 | &quot;6g-115-6525-40&quot; |
| _6G_117_6535_20 | &quot;6g-117-6535-20&quot; |
| _6G_119_6545_80 | &quot;6g-119-6545-80&quot; |
| _6G_121_6555_20 | &quot;6g-121-6555-20&quot; |
| _6G_123_6565_40 | &quot;6g-123-6565-40&quot; |
| _6G_125_6575_20 | &quot;6g-125-6575-20&quot; |
| _6G_129_6595_20 | &quot;6g-129-6595-20&quot; |
| _6G_131_6605_40 | &quot;6g-131-6605-40&quot; |
| _6G_133_6615_20 | &quot;6g-133-6615-20&quot; |
| _6G_135_6625_80 | &quot;6g-135-6625-80&quot; |
| _6G_137_6635_20 | &quot;6g-137-6635-20&quot; |
| _6G_139_6645_40 | &quot;6g-139-6645-40&quot; |
| _6G_141_6655_20 | &quot;6g-141-6655-20&quot; |
| _6G_143_6665_160 | &quot;6g-143-6665-160&quot; |
| _6G_145_6675_20 | &quot;6g-145-6675-20&quot; |
| _6G_147_6685_40 | &quot;6g-147-6685-40&quot; |
| _6G_149_6695_20 | &quot;6g-149-6695-20&quot; |
| _6G_151_6705_80 | &quot;6g-151-6705-80&quot; |
| _6G_153_6715_20 | &quot;6g-153-6715-20&quot; |
| _6G_155_6725_40 | &quot;6g-155-6725-40&quot; |
| _6G_157_6735_20 | &quot;6g-157-6735-20&quot; |
| _6G_159_6745_320 | &quot;6g-159-6745-320&quot; |
| _6G_161_6755_20 | &quot;6g-161-6755-20&quot; |
| _6G_163_6765_40 | &quot;6g-163-6765-40&quot; |
| _6G_165_6775_20 | &quot;6g-165-6775-20&quot; |
| _6G_167_6785_80 | &quot;6g-167-6785-80&quot; |
| _6G_169_6795_20 | &quot;6g-169-6795-20&quot; |
| _6G_171_6805_40 | &quot;6g-171-6805-40&quot; |
| _6G_173_6815_20 | &quot;6g-173-6815-20&quot; |
| _6G_175_6825_160 | &quot;6g-175-6825-160&quot; |
| _6G_177_6835_20 | &quot;6g-177-6835-20&quot; |
| _6G_179_6845_40 | &quot;6g-179-6845-40&quot; |
| _6G_181_6855_20 | &quot;6g-181-6855-20&quot; |
| _6G_183_6865_80 | &quot;6g-183-6865-80&quot; |
| _6G_185_6875_20 | &quot;6g-185-6875-20&quot; |
| _6G_187_6885_40 | &quot;6g-187-6885-40&quot; |
| _6G_189_6895_20 | &quot;6g-189-6895-20&quot; |
| _6G_193_6915_20 | &quot;6g-193-6915-20&quot; |
| _6G_195_6925_40 | &quot;6g-195-6925-40&quot; |
| _6G_197_6935_20 | &quot;6g-197-6935-20&quot; |
| _6G_199_6945_80 | &quot;6g-199-6945-80&quot; |
| _6G_201_6955_20 | &quot;6g-201-6955-20&quot; |
| _6G_203_6965_40 | &quot;6g-203-6965-40&quot; |
| _6G_205_6975_20 | &quot;6g-205-6975-20&quot; |
| _6G_207_6985_160 | &quot;6g-207-6985-160&quot; |
| _6G_209_6995_20 | &quot;6g-209-6995-20&quot; |
| _6G_211_7005_40 | &quot;6g-211-7005-40&quot; |
| _6G_213_7015_20 | &quot;6g-213-7015-20&quot; |
| _6G_215_7025_80 | &quot;6g-215-7025-80&quot; |
| _6G_217_7035_20 | &quot;6g-217-7035-20&quot; |
| _6G_219_7045_40 | &quot;6g-219-7045-40&quot; |
| _6G_221_7055_20 | &quot;6g-221-7055-20&quot; |
| _6G_225_7075_20 | &quot;6g-225-7075-20&quot; |
| _6G_227_7085_40 | &quot;6g-227-7085-40&quot; |
| _6G_229_7095_20 | &quot;6g-229-7095-20&quot; |
| _6G_233_7115_20 | &quot;6g-233-7115-20&quot; |
| _60G_1_58320_2160 | &quot;60g-1-58320-2160&quot; |
| _60G_2_60480_2160 | &quot;60g-2-60480-2160&quot; |
| _60G_3_62640_2160 | &quot;60g-3-62640-2160&quot; |
| _60G_4_64800_2160 | &quot;60g-4-64800-2160&quot; |
| _60G_5_66960_2160 | &quot;60g-5-66960-2160&quot; |
| _60G_6_69120_2160 | &quot;60g-6-69120-2160&quot; |
| _60G_9_59400_4320 | &quot;60g-9-59400-4320&quot; |
| _60G_10_61560_4320 | &quot;60g-10-61560-4320&quot; |
| _60G_11_63720_4320 | &quot;60g-11-63720-4320&quot; |
| _60G_12_65880_4320 | &quot;60g-12-65880-4320&quot; |
| _60G_13_68040_4320 | &quot;60g-13-68040-4320&quot; |
| _60G_17_60480_6480 | &quot;60g-17-60480-6480&quot; |
| _60G_18_62640_6480 | &quot;60g-18-62640-6480&quot; |
| _60G_19_64800_6480 | &quot;60g-19-64800-6480&quot; |
| _60G_20_66960_6480 | &quot;60g-20-66960-6480&quot; |
| _60G_25_61560_6480 | &quot;60g-25-61560-6480&quot; |
| _60G_26_63720_6480 | &quot;60g-26-63720-6480&quot; |
| _60G_27_65880_6480 | &quot;60g-27-65880-6480&quot; |
| EMPTY | &quot;&quot; |



## Enum: PoeModeEnum

| Name | Value |
|---- | -----|
| PD | &quot;pd&quot; |
| PSE | &quot;pse&quot; |
| EMPTY | &quot;&quot; |



## Enum: PoeTypeEnum

| Name | Value |
|---- | -----|
| TYPE1_IEEE802_3AF | &quot;type1-ieee802.3af&quot; |
| TYPE2_IEEE802_3AT | &quot;type2-ieee802.3at&quot; |
| TYPE3_IEEE802_3BT | &quot;type3-ieee802.3bt&quot; |
| TYPE4_IEEE802_3BT | &quot;type4-ieee802.3bt&quot; |
| PASSIVE_24V_2PAIR | &quot;passive-24v-2pair&quot; |
| PASSIVE_24V_4PAIR | &quot;passive-24v-4pair&quot; |
| PASSIVE_48V_2PAIR | &quot;passive-48v-2pair&quot; |
| PASSIVE_48V_4PAIR | &quot;passive-48v-4pair&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


