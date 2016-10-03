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

import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
@Marshaler(/*<name>*/AVVideoSettings/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVVideoSettings/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVVideoSettings toObject(Class<AVVideoSettings> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new AVVideoSettings(o);
        }
        @MarshalsPointer
        public static long toNative(AVVideoSettings o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<AVVideoSettings> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVVideoSettings> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new AVVideoSettings(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVVideoSettings> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (AVVideoSettings i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    AVVideoSettings(NSDictionary data) {
        super(data);
    }
    public AVVideoSettings() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public AVVideoSettings set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 4.0 and later.
     */
    @WeaklyLinked
    public CMVideoCodecType getCodec() {
        if (has(Keys.Codec())) {
            NSNumber val = (NSNumber) get(Keys.Codec());
            return CMVideoCodecType.valueOf(val.longValue());
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @WeaklyLinked
    public AVVideoSettings setCodec(CMVideoCodecType codec) {
        set(Keys.Codec(), NSNumber.valueOf(codec.value()));
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getWidth() {
        if (has(Keys.Width())) {
            NSNumber val = (NSNumber) get(Keys.Width());
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVVideoSettings setWidth(long width) {
        set(Keys.Width(), NSNumber.valueOf(width));
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getHeight() {
        if (has(Keys.Height())) {
            NSNumber val = (NSNumber) get(Keys.Height());
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVVideoSettings setHeight(long height) {
        set(Keys.Height(), NSNumber.valueOf(height));
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVVideoCleanAperture getCleanAperture() {
        if (has(Keys.CleanAperture())) {
            NSDictionary val = (NSDictionary) get(Keys.CleanAperture());
            return new AVVideoCleanAperture(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVVideoSettings setCleanAperture(AVVideoCleanAperture cleanAperture) {
        set(Keys.CleanAperture(), cleanAperture.getDictionary());
        return this;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public com.bugvm.ios.AVFoundation.AVVideoScalingMode getScalingMode() {
        if (has(Keys.ScalingMode())) {
            NSString val = (NSString) get(Keys.ScalingMode());
            return com.bugvm.ios.AVFoundation.AVVideoScalingMode.valueOf(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public AVVideoSettings setScalingMode(com.bugvm.ios.AVFoundation.AVVideoScalingMode scalingMode) {
        set(Keys.ScalingMode(), scalingMode.value());
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public boolean allowsFrameReordering() {
        if (has(Keys.AllowFrameReordering())) {
            NSNumber val = (NSNumber) get(Keys.AllowFrameReordering());
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public AVVideoSettings setAllowsFrameReordering(boolean allowsFrameReordering) {
        set(Keys.AllowFrameReordering(), NSNumber.valueOf(allowsFrameReordering));
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public com.bugvm.ios.AVFoundation.AVVideoProfileLevel getProfileLevel() {
        if (has(Keys.ProfileLevel())) {
            NSString val = (NSString) get(Keys.ProfileLevel());
            return com.bugvm.ios.AVFoundation.AVVideoProfileLevel.valueOf(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVVideoSettings setProfileLevel(com.bugvm.ios.AVFoundation.AVVideoProfileLevel profileLevel) {
        set(Keys.ProfileLevel(), profileLevel.value());
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public com.bugvm.ios.AVFoundation.AVVideoH264EntropyMode getH264EntropyMode() {
        if (has(Keys.H264EntropyMode())) {
            NSString val = (NSString) get(Keys.H264EntropyMode());
            return com.bugvm.ios.AVFoundation.AVVideoH264EntropyMode.valueOf(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public AVVideoSettings setH264EntropyMode(com.bugvm.ios.AVFoundation.AVVideoH264EntropyMode h264EntropyMode) {
        set(Keys.H264EntropyMode(), h264EntropyMode.value());
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public double getExpectedSourceFrameRate() {
        if (has(Keys.ExpectedSourceFrameRate())) {
            NSNumber val = (NSNumber) get(Keys.ExpectedSourceFrameRate());
            return val.doubleValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public AVVideoSettings setExpectedSourceFrameRate(double expectedSourceFrameRate) {
        set(Keys.ExpectedSourceFrameRate(), NSNumber.valueOf(expectedSourceFrameRate));
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public double getAverageNonDroppableFrameRate() {
        if (has(Keys.AverageNonDroppableFrameRate())) {
            NSNumber val = (NSNumber) get(Keys.AverageNonDroppableFrameRate());
            return val.doubleValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public AVVideoSettings setAverageNonDroppableFrameRate(double averageNonDroppableFrameRate) {
        set(Keys.AverageNonDroppableFrameRate(), NSNumber.valueOf(averageNonDroppableFrameRate));
        return this;
    }
    /*</methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public com.bugvm.ios.AVFoundation.AVPixelAspectRatio getPixelAspectRatio() {
        if (has(Keys.PixelAspectRatio())) {
            NSDictionary<NSString, NSObject> val = (NSDictionary<NSString, NSObject>) get(Keys.PixelAspectRatio());
            com.bugvm.ios.AVFoundation.AVPixelAspectRatio result = new com.bugvm.ios.AVFoundation.AVPixelAspectRatio(val.getLong(com.bugvm.ios.AVFoundation.AVPixelAspectRatio.HorizontalSpacing(), 0), val.getLong(com.bugvm.ios.AVFoundation.AVPixelAspectRatio.VerticalSpacing(), 0));
            return result;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVVideoSettings setPixelAspectRatio(com.bugvm.ios.AVFoundation.AVPixelAspectRatio pixelAspectRatio) {
        NSDictionary<NSString, NSObject> val = new NSMutableDictionary<>();
        val.put(com.bugvm.ios.AVFoundation.AVPixelAspectRatio.HorizontalSpacing(), pixelAspectRatio.getHorizontalSpacing());
        val.put(com.bugvm.ios.AVFoundation.AVPixelAspectRatio.VerticalSpacing(), pixelAspectRatio.getVerticalSpacing());
        set(Keys.PixelAspectRatio(), val);
        return this;
    }
    
    /*<keys>*/
    @Library("AVFoundation")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecKey", optional=true)
        public static native NSString Codec();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="AVVideoWidthKey", optional=true)
        public static native NSString Width();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="AVVideoHeightKey", optional=true)
        public static native NSString Height();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="AVVideoPixelAspectRatioKey", optional=true)
        public static native NSString PixelAspectRatio();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="AVVideoCleanApertureKey", optional=true)
        public static native NSString CleanAperture();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="AVVideoScalingModeKey", optional=true)
        public static native NSString ScalingMode();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="AVVideoCompressionPropertiesKey", optional=true)
        public static native NSString CompressionProperties();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="AVVideoAllowFrameReorderingKey", optional=true)
        public static native NSString AllowFrameReordering();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="AVVideoProfileLevelKey", optional=true)
        public static native NSString ProfileLevel();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="AVVideoH264EntropyModeKey", optional=true)
        public static native NSString H264EntropyMode();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="AVVideoExpectedSourceFrameRateKey", optional=true)
        public static native NSString ExpectedSourceFrameRate();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="AVVideoAverageNonDroppableFrameRateKey", optional=true)
        public static native NSString AverageNonDroppableFrameRate();
    }
    /*</keys>*/
}
