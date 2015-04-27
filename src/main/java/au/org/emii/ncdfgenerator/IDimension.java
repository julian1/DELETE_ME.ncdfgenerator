
package au.org.emii.ncdfgenerator;

import ucar.nc2.NetcdfFileWriteable;
import ucar.nc2.Dimension;


interface IDimension extends IAddValue {
    void define(NetcdfFileWriteable writer);
    Dimension getDimension();  // horrible to expose this...
    // can't the caller create the dimension?
    int getLength();
    void addValueToBuffer(Object value);
    String getName();
}
