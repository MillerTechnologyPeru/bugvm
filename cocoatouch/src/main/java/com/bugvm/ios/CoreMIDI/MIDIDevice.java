/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.ios.CoreMIDI;

/*<imports>*/

import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDIDevice/*</name>*/ 
    extends /*<extends>*/MIDIObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDIDevicePtr extends Ptr<MIDIDevice, MIDIDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(MIDIDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public com.bugvm.ios.CoreMIDI.MIDIError addEntity(String name, boolean embedded, @MachineSizedUInt long numSourceEndpoints, @MachineSizedUInt long numDestinationEndpoints, com.bugvm.ios.CoreMIDI.MIDIEntity newEntity) {
       com.bugvm.ios.CoreMIDI.MIDIEntity.MIDIEntityPtr ptr = new com.bugvm.ios.CoreMIDI.MIDIEntity.MIDIEntityPtr();
       ptr.set(newEntity);
       return addEntity(name, embedded, numSourceEndpoints, numDestinationEndpoints, ptr);
    }
    public static MIDIDevice create(com.bugvm.ios.CoreMIDI.MIDIDriver owner, String name, String manufacturer, String model) {
        MIDIDevicePtr ptr = new MIDIDevicePtr();
        create(owner, name, manufacturer, model, ptr);
        return ptr.get();
    }
    public static MIDIDevice createExternal(String name, String manufacturer, String model) {
        MIDIDevicePtr ptr = new MIDIDevicePtr();
        createExternal(name, manufacturer, model, ptr);
        return ptr.get();
    }
    /*<methods>*/
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Bridge(symbol="MIDIDeviceGetNumberOfEntities", optional=true)
    public native @MachineSizedUInt long getNumberOfEntities();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Bridge(symbol="MIDIDeviceGetEntity", optional=true)
    public native com.bugvm.ios.CoreMIDI.MIDIEntity getEntity(@MachineSizedUInt long entityIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Bridge(symbol="MIDIDeviceAddEntity", optional=true)
    protected native com.bugvm.ios.CoreMIDI.MIDIError addEntity(String name, boolean embedded, @MachineSizedUInt long numSourceEndpoints, @MachineSizedUInt long numDestinationEndpoints, com.bugvm.ios.CoreMIDI.MIDIEntity.MIDIEntityPtr newEntity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Bridge(symbol="MIDIDeviceRemoveEntity", optional=true)
    public native com.bugvm.ios.CoreMIDI.MIDIError removeEntity(com.bugvm.ios.CoreMIDI.MIDIEntity entity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Bridge(symbol="MIDIExternalDeviceCreate", optional=true)
    protected static native com.bugvm.ios.CoreMIDI.MIDIError createExternal(String name, String manufacturer, String model, MIDIDevice.MIDIDevicePtr outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Bridge(symbol="MIDIDeviceCreate", optional=true)
    protected static native com.bugvm.ios.CoreMIDI.MIDIError create(com.bugvm.ios.CoreMIDI.MIDIDriver owner, String name, String manufacturer, String model, MIDIDevice.MIDIDevicePtr outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Bridge(symbol="MIDIDeviceDispose", optional=true)
    public native com.bugvm.ios.CoreMIDI.MIDIError dispose();
    /*</methods>*/
}
