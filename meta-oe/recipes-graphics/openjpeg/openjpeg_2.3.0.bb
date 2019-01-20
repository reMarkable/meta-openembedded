DESCRIPTION = "OpenJPEG library is an open-source JPEG 2000 codec"
HOMEPAGE = "http://www.openjpeg.org"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c648878b4840d7babaade1303e7f108c"

SRC_URI = "https://github.com/uclouvain/${BPN}/archive/v${PV}.tar.gz;downloadfilename=${BP}.tar.gz \
          "

SRC_URI[md5sum] = "6a1f8aaa1fe55d2088e3a9c942e0f698"
SRC_URI[sha256sum] = "3dc787c1bb6023ba846c2a0d9b1f6e179f1cd255172bde9eb75b01f1e6c7d71a"

inherit cmake

DEPENDS = "libpng tiff lcms zlib"

# standard path for *.cmake
EXTRA_OECMAKE += "-DOPENJPEG_INSTALL_PACKAGE_DIR=${baselib}/cmake \
                  -DOPENJPEG_INSTALL_LIB_DIR:PATH=${libdir}"

FILES_${PN}-dev += "${libdir}/cmake/*.cmake"
