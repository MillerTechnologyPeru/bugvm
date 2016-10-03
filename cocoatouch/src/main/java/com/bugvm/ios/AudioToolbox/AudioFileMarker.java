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
package com.bugvm.ios.AudioToolbox;

/*<imports>*/

import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioFileMarker/*</name>*/ 
    extends /*<extends>*/Struct<AudioFileMarker>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioFileMarkerPtr extends Ptr<AudioFileMarker, AudioFileMarkerPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioFileMarker() {}
    public AudioFileMarker(double framePosition, String name, int markerID, AudioFileSMPTETime SMPTETime, com.bugvm.ios.AudioToolbox.AudioFileMarkerType type, short channel) {
        this.setFramePosition(framePosition);
        this.setName(name);
        this.setMarkerID(markerID);
        this.setSMPTETime(SMPTETime);
        this.setType(type);
        this.setChannel(channel);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double getFramePosition();
    @StructMember(0) public native AudioFileMarker setFramePosition(double framePosition);
    @StructMember(1) public native String getName();
    @StructMember(1) public native AudioFileMarker setName(String name);
    @StructMember(2) public native int getMarkerID();
    @StructMember(2) public native AudioFileMarker setMarkerID(int markerID);
    @StructMember(3) public native @ByVal
    AudioFileSMPTETime getSMPTETime();
    @StructMember(3) public native AudioFileMarker setSMPTETime(@ByVal AudioFileSMPTETime SMPTETime);
    @StructMember(4) public native com.bugvm.ios.AudioToolbox.AudioFileMarkerType getType();
    @StructMember(4) public native AudioFileMarker setType(com.bugvm.ios.AudioToolbox.AudioFileMarkerType type);
    @StructMember(5) private native short getReserved();
    @StructMember(5) private native AudioFileMarker setReserved(short reserved);
    @StructMember(6) public native short getChannel();
    @StructMember(6) public native AudioFileMarker setChannel(short channel);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
