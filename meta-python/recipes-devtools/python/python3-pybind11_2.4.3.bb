inherit pypi setuptools3
require python-pybind11.inc

EXTRA_OECMAKE =  "-DPYBIND11_TEST=OFF \
		-DPYTHON_EXECUTABLE=${RECIPE_SYSROOT_NATIVE}/usr/bin/python3-native/python3.8 \
"