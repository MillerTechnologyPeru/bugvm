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
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPixelAspectRatio/*</name>*/ 
    extends /*<extends>*/Struct<AVPixelAspectRatio>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPixelAspectRatioPtr extends Ptr<AVPixelAspectRatio, AVPixelAspectRatioPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(AVPixelAspectRatio.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVPixelAspectRatio() {}
    public AVPixelAspectRatio(@MachineSizedSInt long horizontalSpacing, @MachineSizedSInt long verticalSpacing) {
        this.setHorizontalSpacing(horizontalSpacing);
        this.setVerticalSpacing(verticalSpacing);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedSInt long getHorizontalSpacing();
    @StructMember(0) public native AVPixelAspectRatio setHorizontalSpacing(@MachineSizedSInt long horizontalSpacing);
    @StructMember(1) public native @MachineSizedSInt long getVerticalSpacing();
    @StructMember(1) public native AVPixelAspectRatio setVerticalSpacing(@MachineSizedSInt long verticalSpacing);
    /*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="AVVideoPixelAspectRatioHorizontalSpacingKey", optional=true)
    protected static native NSString HorizontalSpacing();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="AVVideoPixelAspectRatioVerticalSpacingKey", optional=true)
    protected static native NSString VerticalSpacing();
    /*</methods>*/
}
