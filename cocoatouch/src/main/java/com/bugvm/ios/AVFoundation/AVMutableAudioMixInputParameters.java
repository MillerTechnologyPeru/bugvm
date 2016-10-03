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
package com.bugvm.ios.AVFoundation;

/*<imports>*/

import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.mediatoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableAudioMixInputParameters/*</name>*/ 
    extends /*<extends>*/AVAudioMixInputParameters/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableAudioMixInputParametersPtr extends Ptr<AVMutableAudioMixInputParameters, AVMutableAudioMixInputParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableAudioMixInputParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMutableAudioMixInputParameters() {}
    protected AVMutableAudioMixInputParameters(SkipInit skipInit) { super(skipInit); }
    public AVMutableAudioMixInputParameters(com.bugvm.ios.AVFoundation.AVAssetTrack track) { super(create(track)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "trackID")
    public native int getTrackID();
    @Property(selector = "setTrackID:")
    public native void setTrackID(int v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "audioTimePitchAlgorithm")
    public native com.bugvm.ios.AVFoundation.AVAudioTimePitchAlgorithm getAudioTimePitchAlgorithm();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(com.bugvm.ios.AVFoundation.AVAudioTimePitchAlgorithm v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    @Property(selector = "audioTapProcessor")
    public native MTAudioProcessingTap getAudioTapProcessor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    @Property(selector = "setAudioTapProcessor:")
    public native void setAudioTapProcessor(MTAudioProcessingTap v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setVolumeRamp(com.bugvm.ios.AVFoundation.AVTimeRamp<Float> ramp) {
        setVolumeRamp(ramp.getStart(), ramp.getEnd(), ramp.getTimeRange());
    }
    /*<methods>*/
    @Method(selector = "setVolumeRampFromStartVolume:toEndVolume:timeRange:")
    public native void setVolumeRamp(float startVolume, float endVolume, @ByVal CMTimeRange timeRange);
    @Method(selector = "setVolume:atTime:")
    public native void setVolume(float volume, @ByVal CMTime time);
    @Method(selector = "audioMixInputParametersWithTrack:")
    protected static native @Pointer long create(com.bugvm.ios.AVFoundation.AVAssetTrack track);
    /*</methods>*/
}
