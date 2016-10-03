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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioFilePacketTableInfo/*</name>*/ 
    extends /*<extends>*/Struct<AudioFilePacketTableInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioFilePacketTableInfoPtr extends Ptr<AudioFilePacketTableInfo, AudioFilePacketTableInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioFilePacketTableInfo() {}
    public AudioFilePacketTableInfo(long numberValidFrames, int primingFrames, int remainderFrames) {
        this.setNumberValidFrames(numberValidFrames);
        this.setPrimingFrames(primingFrames);
        this.setRemainderFrames(remainderFrames);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getNumberValidFrames();
    @StructMember(0) public native AudioFilePacketTableInfo setNumberValidFrames(long numberValidFrames);
    @StructMember(1) public native int getPrimingFrames();
    @StructMember(1) public native AudioFilePacketTableInfo setPrimingFrames(int primingFrames);
    @StructMember(2) public native int getRemainderFrames();
    @StructMember(2) public native AudioFilePacketTableInfo setRemainderFrames(int remainderFrames);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
