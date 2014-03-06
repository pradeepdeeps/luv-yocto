SUMMARY = "Firmware testsuite"
DESCRIPTION = "The tool fwts comprises of tests that are designed to exercise BIOS, these need access to read BIOS data and ACPI tables"
HOMEPAGE = "https://wiki.ubuntu.com/Kernel/Reference/fwts"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/main.c;beginline=1;endline=16;md5=deb8af5388e838d133eaa036f4d1496f"

PV = "14.01.00+git${SRCPV}"

SRCREV = "fef72314787d7b029d932ef56b4a117538cf69e3"
SRC_URI = "git://kernel.ubuntu.com/hwe/fwts.git \
           file://subdir.patch \
           file://jsonc.patch \
          "

S = "${WORKDIR}/git"
DEPENDS = "autoconf automake libtool libpcre libjson flex bison "

inherit autotools
FILES_${PN} += "${libdir}/fwts/lib*${SOLIBS}"
FILES_${PN}-dev += "${libdir}/fwts/lib*${SOLIBSDEV} ${libdir}/fwts/lib*.la"