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
package com.bugvm.bindings.AVFoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioUnitEQFilterParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioUnitEQFilterParametersPtr extends Ptr<AVAudioUnitEQFilterParameters, AVAudioUnitEQFilterParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioUnitEQFilterParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioUnitEQFilterParameters() {}
    protected AVAudioUnitEQFilterParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "filterType")
    public native AVAudioUnitEQFilterType getFilterType();
    @Property(selector = "setFilterType:")
    public native void setFilterType(AVAudioUnitEQFilterType v);
    @Property(selector = "frequency")
    public native float getFrequency();
    @Property(selector = "setFrequency:")
    public native void setFrequency(float v);
    @Property(selector = "bandwidth")
    public native float getBandwidth();
    @Property(selector = "setBandwidth:")
    public native void setBandwidth(float v);
    @Property(selector = "gain")
    public native float getGain();
    @Property(selector = "setGain:")
    public native void setGain(float v);
    @Property(selector = "bypass")
    public native boolean isBypass();
    @Property(selector = "setBypass:")
    public native void setBypass(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
