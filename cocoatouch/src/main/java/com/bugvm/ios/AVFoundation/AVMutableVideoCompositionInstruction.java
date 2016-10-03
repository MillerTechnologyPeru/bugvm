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
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableVideoCompositionInstruction/*</name>*/ 
    extends /*<extends>*/AVVideoCompositionInstruction/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableVideoCompositionInstructionPtr extends Ptr<AVMutableVideoCompositionInstruction, AVMutableVideoCompositionInstructionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableVideoCompositionInstruction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMutableVideoCompositionInstruction() {}
    protected AVMutableVideoCompositionInstruction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "setTimeRange:")
    public native void setTimeRange(@ByVal CMTimeRange v);
    @Property(selector = "backgroundColor")
    public native CGColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(CGColor v);
    @Property(selector = "layerInstructions")
    public native NSArray<com.bugvm.ios.AVFoundation.AVVideoCompositionLayerInstruction> getLayerInstructions();
    @Property(selector = "setLayerInstructions:")
    public native void setLayerInstructions(NSArray<com.bugvm.ios.AVFoundation.AVVideoCompositionLayerInstruction> v);
    @Property(selector = "enablePostProcessing")
    public native boolean isPostProcessingEnabled();
    @Property(selector = "setEnablePostProcessing:")
    public native void setPostProcessingEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
