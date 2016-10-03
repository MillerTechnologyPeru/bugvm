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
import java.util.*;

import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetExportSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetExportSessionPtr extends Ptr<AVAssetExportSession, AVAssetExportSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetExportSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAssetExportSession() {}
    protected AVAssetExportSession(SkipInit skipInit) { super(skipInit); }
    public AVAssetExportSession(com.bugvm.ios.AVFoundation.AVAsset asset, com.bugvm.ios.AVFoundation.AVAssetExportPreset presetName) { super((SkipInit) null); initObject(init(asset, presetName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "presetName")
    public native com.bugvm.ios.AVFoundation.AVAssetExportPreset getPresetName();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "asset")
    public native com.bugvm.ios.AVFoundation.AVAsset getAsset();
    @Property(selector = "outputFileType")
    public native String getOutputFileType();
    @Property(selector = "setOutputFileType:")
    public native void setOutputFileType(String v);
    @Property(selector = "outputURL")
    public native NSURL getOutputURL();
    @Property(selector = "setOutputURL:")
    public native void setOutputURL(NSURL v);
    @Property(selector = "shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();
    @Property(selector = "setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean v);
    @Property(selector = "status")
    public native AVAssetExportSessionStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "progress")
    public native float getProgress();
    @Property(selector = "supportedFileTypes")
    public native @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSupportedFileTypes();
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "setTimeRange:")
    public native void setTimeRange(@ByVal CMTimeRange v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "maxDuration")
    public native @ByVal CMTime getMaxDuration();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "estimatedOutputFileLength")
    public native long getEstimatedOutputFileLength();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "fileLengthLimit")
    public native long getFileLengthLimit();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "setFileLengthLimit:")
    public native void setFileLengthLimit(long v);
    @Property(selector = "metadata")
    public native NSArray<com.bugvm.ios.AVFoundation.AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<com.bugvm.ios.AVFoundation.AVMetadataItem> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "metadataItemFilter")
    public native com.bugvm.ios.AVFoundation.AVMetadataItemFilter getMetadataItemFilter();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setMetadataItemFilter:")
    public native void setMetadataItemFilter(com.bugvm.ios.AVFoundation.AVMetadataItemFilter v);
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
    @Property(selector = "audioMix")
    public native com.bugvm.ios.AVFoundation.AVAudioMix getAudioMix();
    @Property(selector = "setAudioMix:")
    public native void setAudioMix(com.bugvm.ios.AVFoundation.AVAudioMix v);
    @Property(selector = "videoComposition")
    public native com.bugvm.ios.AVFoundation.AVVideoComposition getVideoComposition();
    @Property(selector = "setVideoComposition:")
    public native void setVideoComposition(com.bugvm.ios.AVFoundation.AVVideoComposition v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "customVideoCompositor")
    public native com.bugvm.ios.AVFoundation.AVVideoCompositing getCustomVideoCompositor();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "canPerformMultiplePassesOverSourceMediaData")
    public native boolean canPerformMultiplePassesOverSourceMediaData();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setCanPerformMultiplePassesOverSourceMediaData:")
    public native void setCanPerformMultiplePassesOverSourceMediaData(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "directoryForTemporaryFiles")
    public native NSURL getDirectoryForTemporaryFiles();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAsset:presetName:")
    protected native @Pointer long init(com.bugvm.ios.AVFoundation.AVAsset asset, com.bugvm.ios.AVFoundation.AVAssetExportPreset presetName);
    @Method(selector = "exportAsynchronouslyWithCompletionHandler:")
    public native void exportAsynchronously(@Block Runnable handler);
    @Method(selector = "cancelExport")
    public native void cancelExport();
    @Method(selector = "allExportPresets")
    public static native @com.bugvm.rt.bro.annotation.Marshaler(com.bugvm.ios.AVFoundation.AVAssetExportPreset.AsListMarshaler.class) List<com.bugvm.ios.AVFoundation.AVAssetExportPreset> getAllExportPresets();
    @Method(selector = "exportPresetsCompatibleWithAsset:")
    public static native @com.bugvm.rt.bro.annotation.Marshaler(com.bugvm.ios.AVFoundation.AVAssetExportPreset.AsListMarshaler.class) List<com.bugvm.ios.AVFoundation.AVAssetExportPreset> getCompatibleExportPresets(com.bugvm.ios.AVFoundation.AVAsset asset);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:")
    public static native void determineCompatibilityOfExportPreset(com.bugvm.ios.AVFoundation.AVAssetExportPreset presetName, com.bugvm.ios.AVFoundation.AVAsset asset, String outputFileType, @Block VoidBooleanBlock handler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "determineCompatibleFileTypesWithCompletionHandler:")
    public native void determineCompatibleFileTypes(@Block VoidBlock1<NSArray<NSString>> handler);
    /*</methods>*/
}
