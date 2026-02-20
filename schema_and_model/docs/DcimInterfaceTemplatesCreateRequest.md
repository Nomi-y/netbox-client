

# DcimInterfaceTemplatesCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceType** | [**ConsolePortTemplateRequestDeviceType**](ConsolePortTemplateRequestDeviceType.md) |  |  [optional] |
|**moduleType** | [**ConsolePortTemplateRequestModuleType**](ConsolePortTemplateRequestModuleType.md) |  |  [optional] |
|**name** | **String** | {module} is accepted as a substitution for the module bay position when attached to a module type. |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;virtual&#x60; - Virtual * &#x60;bridge&#x60; - Bridge * &#x60;lag&#x60; - Link Aggregation Group (LAG) * &#x60;100base-fx&#x60; - 100BASE-FX (10/100ME) * &#x60;100base-lfx&#x60; - 100BASE-LFX (10/100ME) * &#x60;100base-tx&#x60; - 100BASE-TX (10/100ME) * &#x60;100base-t1&#x60; - 100BASE-T1 (10/100ME) * &#x60;1000base-bx10-d&#x60; - 1000BASE-BX10-D (1GE BiDi Down) * &#x60;1000base-bx10-u&#x60; - 1000BASE-BX10-U (1GE BiDi Up) * &#x60;1000base-cwdm&#x60; - 1000BASE-CWDM (1GE) * &#x60;1000base-cx&#x60; - 1000BASE-CX (1GE DAC) * &#x60;1000base-dwdm&#x60; - 1000BASE-DWDM (1GE) * &#x60;1000base-ex&#x60; - 1000BASE-EX (1GE) * &#x60;1000base-lsx&#x60; - 1000BASE-LSX (1GE) * &#x60;1000base-lx&#x60; - 1000BASE-LX (1GE) * &#x60;1000base-lx10&#x60; - 1000BASE-LX10/LH (1GE) * &#x60;1000base-sx&#x60; - 1000BASE-SX (1GE) * &#x60;1000base-t&#x60; - 1000BASE-T (1GE) * &#x60;1000base-tx&#x60; - 1000BASE-TX (1GE) * &#x60;1000base-zx&#x60; - 1000BASE-ZX (1GE) * &#x60;2.5gbase-t&#x60; - 2.5GBASE-T (2.5GE) * &#x60;5gbase-t&#x60; - 5GBASE-T (5GE) * &#x60;10gbase-br-d&#x60; - 10GBASE-BR-D (10GE BiDi Down) * &#x60;10gbase-br-u&#x60; - 10GBASE-BR-U (10GE BiDi Up) * &#x60;10gbase-cx4&#x60; - 10GBASE-CX4 (10GE DAC) * &#x60;10gbase-er&#x60; - 10GBASE-ER (10GE) * &#x60;10gbase-lr&#x60; - 10GBASE-LR (10GE) * &#x60;10gbase-lrm&#x60; - 10GBASE-LRM (10GE) * &#x60;10gbase-lx4&#x60; - 10GBASE-LX4 (10GE) * &#x60;10gbase-sr&#x60; - 10GBASE-SR (10GE) * &#x60;10gbase-t&#x60; - 10GBASE-T (10GE) * &#x60;10gbase-zr&#x60; - 10GBASE-ZR (10GE) * &#x60;25gbase-cr&#x60; - 25GBASE-CR (25GE DAC) * &#x60;25gbase-er&#x60; - 25GBASE-ER (25GE) * &#x60;25gbase-lr&#x60; - 25GBASE-LR (25GE) * &#x60;25gbase-sr&#x60; - 25GBASE-SR (25GE) * &#x60;25gbase-t&#x60; - 25GBASE-T (25GE) * &#x60;40gbase-cr4&#x60; - 40GBASE-CR4 (40GE DAC) * &#x60;40gbase-er4&#x60; - 40GBASE-ER4 (40GE) * &#x60;40gbase-fr4&#x60; - 40GBASE-FR4 (40GE) * &#x60;40gbase-lr4&#x60; - 40GBASE-LR4 (40GE) * &#x60;40gbase-sr4&#x60; - 40GBASE-SR4 (40GE) * &#x60;50gbase-cr&#x60; - 50GBASE-CR (50GE DAC) * &#x60;50gbase-er&#x60; - 50GBASE-ER (50GE) * &#x60;50gbase-fr&#x60; - 50GBASE-FR (50GE) * &#x60;50gbase-lr&#x60; - 50GBASE-LR (50GE) * &#x60;50gbase-sr&#x60; - 50GBASE-SR (50GE) * &#x60;100gbase-cr1&#x60; - 100GBASE-CR1 (100GE DAC) * &#x60;100gbase-cr2&#x60; - 100GBASE-CR2 (100GE DAC) * &#x60;100gbase-cr4&#x60; - 100GBASE-CR4 (100GE DAC) * &#x60;100gbase-cr10&#x60; - 100GBASE-CR10 (100GE DAC) * &#x60;100gbase-cwdm4&#x60; - 100GBASE-CWDM4 (100GE) * &#x60;100gbase-dr&#x60; - 100GBASE-DR (100GE) * &#x60;100gbase-er4&#x60; - 100GBASE-ER4 (100GE) * &#x60;100gbase-fr1&#x60; - 100GBASE-FR1 (100GE) * &#x60;100gbase-lr1&#x60; - 100GBASE-LR1 (100GE) * &#x60;100gbase-lr4&#x60; - 100GBASE-LR4 (100GE) * &#x60;100gbase-sr1&#x60; - 100GBASE-SR1 (100GE) * &#x60;100gbase-sr1.2&#x60; - 100GBASE-SR1.2 (100GE BiDi) * &#x60;100gbase-sr2&#x60; - 100GBASE-SR2 (100GE) * &#x60;100gbase-sr4&#x60; - 100GBASE-SR4 (100GE) * &#x60;100gbase-sr10&#x60; - 100GBASE-SR10 (100GE) * &#x60;100gbase-zr&#x60; - 100GBASE-ZR (100GE) * &#x60;200gbase-cr2&#x60; - 200GBASE-CR2 (200GE) * &#x60;200gbase-cr4&#x60; - 200GBASE-CR4 (200GE) * &#x60;200gbase-dr4&#x60; - 200GBASE-DR4 (200GE) * &#x60;200gbase-er4&#x60; - 200GBASE-ER4 (200GE) * &#x60;200gbase-fr4&#x60; - 200GBASE-FR4 (200GE) * &#x60;200gbase-lr4&#x60; - 200GBASE-LR4 (200GE) * &#x60;200gbase-sr2&#x60; - 200GBASE-SR2 (200GE) * &#x60;200gbase-sr4&#x60; - 200GBASE-SR4 (200GE) * &#x60;200gbase-vr2&#x60; - 200GBASE-VR2 (200GE) * &#x60;400gbase-cr4&#x60; - 400GBASE-CR4 (400GE) * &#x60;400gbase-dr4&#x60; - 400GBASE-DR4 (400GE) * &#x60;400gbase-er8&#x60; - 400GBASE-ER8 (400GE) * &#x60;400gbase-fr4&#x60; - 400GBASE-FR4 (400GE) * &#x60;400gbase-fr8&#x60; - 400GBASE-FR8 (400GE) * &#x60;400gbase-lr4&#x60; - 400GBASE-LR4 (400GE) * &#x60;400gbase-lr8&#x60; - 400GBASE-LR8 (400GE) * &#x60;400gbase-sr4&#x60; - 400GBASE-SR4 (400GE) * &#x60;400gbase-sr4_2&#x60; - 400GBASE-SR4.2 (400GE BiDi) * &#x60;400gbase-sr8&#x60; - 400GBASE-SR8 (400GE) * &#x60;400gbase-sr16&#x60; - 400GBASE-SR16 (400GE) * &#x60;400gbase-vr4&#x60; - 400GBASE-VR4 (400GE) * &#x60;400gbase-zr&#x60; - 400GBASE-ZR (400GE) * &#x60;800gbase-cr8&#x60; - 800GBASE-CR8 (800GE) * &#x60;800gbase-dr8&#x60; - 800GBASE-DR8 (800GE) * &#x60;800gbase-sr8&#x60; - 800GBASE-SR8 (800GE) * &#x60;800gbase-vr8&#x60; - 800GBASE-VR8 (800GE) * &#x60;100base-x-sfp&#x60; - SFP (100ME) * &#x60;1000base-x-gbic&#x60; - GBIC (1GE) * &#x60;1000base-x-sfp&#x60; - SFP (1GE) * &#x60;10gbase-x-sfpp&#x60; - SFP+ (10GE) * &#x60;10gbase-x-xenpak&#x60; - XENPAK (10GE) * &#x60;10gbase-x-xfp&#x60; - XFP (10GE) * &#x60;10gbase-x-x2&#x60; - X2 (10GE) * &#x60;25gbase-x-sfp28&#x60; - SFP28 (25GE) * &#x60;40gbase-x-qsfpp&#x60; - QSFP+ (40GE) * &#x60;50gbase-x-sfp28&#x60; - QSFP28 (50GE) * &#x60;50gbase-x-sfp56&#x60; - SFP56 (50GE) * &#x60;100gbase-x-cfp&#x60; - CFP (100GE) * &#x60;100gbase-x-cfp2&#x60; - CFP2 (100GE) * &#x60;100gbase-x-cfp4&#x60; - CFP4 (100GE) * &#x60;100gbase-x-cxp&#x60; - CXP (100GE) * &#x60;100gbase-x-cpak&#x60; - Cisco CPAK (100GE) * &#x60;100gbase-x-dsfp&#x60; - DSFP (100GE) * &#x60;100gbase-x-qsfp28&#x60; - QSFP28 (100GE) * &#x60;100gbase-x-qsfpdd&#x60; - QSFP-DD (100GE) * &#x60;100gbase-x-sfpdd&#x60; - SFP-DD (100GE) * &#x60;200gbase-x-cfp2&#x60; - CFP2 (200GE) * &#x60;200gbase-x-qsfp56&#x60; - QSFP56 (200GE) * &#x60;200gbase-x-qsfpdd&#x60; - QSFP-DD (200GE) * &#x60;400gbase-x-qsfp112&#x60; - QSFP112 (400GE) * &#x60;400gbase-x-qsfpdd&#x60; - QSFP-DD (400GE) * &#x60;400gbase-x-cdfp&#x60; - CDFP (400GE) * &#x60;400gbase-x-cfp2&#x60; - CFP2 (400GE) * &#x60;400gbase-x-cfp8&#x60; - CPF8 (400GE) * &#x60;400gbase-x-osfp&#x60; - OSFP (400GE) * &#x60;400gbase-x-osfp-rhs&#x60; - OSFP-RHS (400GE) * &#x60;800gbase-x-osfp&#x60; - OSFP (800GE) * &#x60;800gbase-x-qsfpdd&#x60; - QSFP-DD (800GE) * &#x60;1000base-kx&#x60; - 1000BASE-KX (1GE) * &#x60;2.5gbase-kx&#x60; - 2.5GBASE-KX (2.5GE) * &#x60;5gbase-kr&#x60; - 5GBASE-KR (5GE) * &#x60;10gbase-kr&#x60; - 10GBASE-KR (10GE) * &#x60;10gbase-kx4&#x60; - 10GBASE-KX4 (10GE) * &#x60;25gbase-kr&#x60; - 25GBASE-KR (25GE) * &#x60;40gbase-kr4&#x60; - 40GBASE-KR4 (40GE) * &#x60;50gbase-kr&#x60; - 50GBASE-KR (50GE) * &#x60;100gbase-kp4&#x60; - 100GBASE-KP4 (100GE) * &#x60;100gbase-kr2&#x60; - 100GBASE-KR2 (100GE) * &#x60;100gbase-kr4&#x60; - 100GBASE-KR4 (100GE) * &#x60;ieee802.11a&#x60; - IEEE 802.11a * &#x60;ieee802.11g&#x60; - IEEE 802.11b/g * &#x60;ieee802.11n&#x60; - IEEE 802.11n (Wi-Fi 4) * &#x60;ieee802.11ac&#x60; - IEEE 802.11ac (Wi-Fi 5) * &#x60;ieee802.11ad&#x60; - IEEE 802.11ad (WiGig) * &#x60;ieee802.11ax&#x60; - IEEE 802.11ax (Wi-Fi 6) * &#x60;ieee802.11ay&#x60; - IEEE 802.11ay (WiGig) * &#x60;ieee802.11be&#x60; - IEEE 802.11be (Wi-Fi 7) * &#x60;ieee802.15.1&#x60; - IEEE 802.15.1 (Bluetooth) * &#x60;ieee802.15.4&#x60; - IEEE 802.15.4 (LR-WPAN) * &#x60;other-wireless&#x60; - Other (Wireless) * &#x60;gsm&#x60; - GSM * &#x60;cdma&#x60; - CDMA * &#x60;lte&#x60; - LTE * &#x60;4g&#x60; - 4G * &#x60;5g&#x60; - 5G * &#x60;sonet-oc3&#x60; - OC-3/STM-1 * &#x60;sonet-oc12&#x60; - OC-12/STM-4 * &#x60;sonet-oc48&#x60; - OC-48/STM-16 * &#x60;sonet-oc192&#x60; - OC-192/STM-64 * &#x60;sonet-oc768&#x60; - OC-768/STM-256 * &#x60;sonet-oc1920&#x60; - OC-1920/STM-640 * &#x60;sonet-oc3840&#x60; - OC-3840/STM-1234 * &#x60;1gfc-sfp&#x60; - SFP (1GFC) * &#x60;2gfc-sfp&#x60; - SFP (2GFC) * &#x60;4gfc-sfp&#x60; - SFP (4GFC) * &#x60;8gfc-sfpp&#x60; - SFP+ (8GFC) * &#x60;16gfc-sfpp&#x60; - SFP+ (16GFC) * &#x60;32gfc-sfp28&#x60; - SFP28 (32GFC) * &#x60;32gfc-sfpp&#x60; - SFP+ (32GFC) * &#x60;64gfc-qsfpp&#x60; - QSFP+ (64GFC) * &#x60;64gfc-sfpdd&#x60; - SFP-DD (64GFC) * &#x60;64gfc-sfpp&#x60; - SFP+ (64GFC) * &#x60;128gfc-qsfp28&#x60; - QSFP28 (128GFC) * &#x60;infiniband-sdr&#x60; - SDR (2 Gbps) * &#x60;infiniband-ddr&#x60; - DDR (4 Gbps) * &#x60;infiniband-qdr&#x60; - QDR (8 Gbps) * &#x60;infiniband-fdr10&#x60; - FDR10 (10 Gbps) * &#x60;infiniband-fdr&#x60; - FDR (13.5 Gbps) * &#x60;infiniband-edr&#x60; - EDR (25 Gbps) * &#x60;infiniband-hdr&#x60; - HDR (50 Gbps) * &#x60;infiniband-ndr&#x60; - NDR (100 Gbps) * &#x60;infiniband-xdr&#x60; - XDR (250 Gbps) * &#x60;t1&#x60; - T1 (1.544 Mbps) * &#x60;e1&#x60; - E1 (2.048 Mbps) * &#x60;t3&#x60; - T3 (45 Mbps) * &#x60;e3&#x60; - E3 (34 Mbps) * &#x60;xdsl&#x60; - xDSL * &#x60;docsis&#x60; - DOCSIS * &#x60;moca&#x60; - MoCA * &#x60;bpon&#x60; - BPON (622 Mbps / 155 Mbps) * &#x60;epon&#x60; - EPON (1 Gbps) * &#x60;10g-epon&#x60; - 10G-EPON (10 Gbps) * &#x60;gpon&#x60; - GPON (2.5 Gbps / 1.25 Gbps) * &#x60;xg-pon&#x60; - XG-PON (10 Gbps / 2.5 Gbps) * &#x60;xgs-pon&#x60; - XGS-PON (10 Gbps) * &#x60;ng-pon2&#x60; - NG-PON2 (TWDM-PON) (4x10 Gbps) * &#x60;25g-pon&#x60; - 25G-PON (25 Gbps) * &#x60;50g-pon&#x60; - 50G-PON (50 Gbps) * &#x60;cisco-stackwise&#x60; - Cisco StackWise * &#x60;cisco-stackwise-plus&#x60; - Cisco StackWise Plus * &#x60;cisco-flexstack&#x60; - Cisco FlexStack * &#x60;cisco-flexstack-plus&#x60; - Cisco FlexStack Plus * &#x60;cisco-stackwise-80&#x60; - Cisco StackWise-80 * &#x60;cisco-stackwise-160&#x60; - Cisco StackWise-160 * &#x60;cisco-stackwise-320&#x60; - Cisco StackWise-320 * &#x60;cisco-stackwise-480&#x60; - Cisco StackWise-480 * &#x60;cisco-stackwise-1t&#x60; - Cisco StackWise-1T * &#x60;juniper-vcp&#x60; - Juniper VCP * &#x60;extreme-summitstack&#x60; - Extreme SummitStack * &#x60;extreme-summitstack-128&#x60; - Extreme SummitStack-128 * &#x60;extreme-summitstack-256&#x60; - Extreme SummitStack-256 * &#x60;extreme-summitstack-512&#x60; - Extreme SummitStack-512 * &#x60;other&#x60; - Other |  |
|**enabled** | **Boolean** |  |  [optional] |
|**mgmtOnly** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**bridge** | **Integer** |  |  [optional] |
|**poeMode** | [**PoeModeEnum**](#PoeModeEnum) | * &#x60;pd&#x60; - PD * &#x60;pse&#x60; - PSE |  [optional] |
|**poeType** | [**PoeTypeEnum**](#PoeTypeEnum) | * &#x60;type1-ieee802.3af&#x60; - 802.3af (Type 1) * &#x60;type2-ieee802.3at&#x60; - 802.3at (Type 2) * &#x60;type3-ieee802.3bt&#x60; - 802.3bt (Type 3) * &#x60;type4-ieee802.3bt&#x60; - 802.3bt (Type 4) * &#x60;passive-24v-2pair&#x60; - Passive 24V (2-pair) * &#x60;passive-24v-4pair&#x60; - Passive 24V (4-pair) * &#x60;passive-48v-2pair&#x60; - Passive 48V (2-pair) * &#x60;passive-48v-4pair&#x60; - Passive 48V (4-pair) |  [optional] |
|**rfRole** | [**RfRoleEnum**](#RfRoleEnum) | * &#x60;ap&#x60; - Access point * &#x60;station&#x60; - Station |  [optional] |



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



## Enum: RfRoleEnum

| Name | Value |
|---- | -----|
| AP | &quot;ap&quot; |
| STATION | &quot;station&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


