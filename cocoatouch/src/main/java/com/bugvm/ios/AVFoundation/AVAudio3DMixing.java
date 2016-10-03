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

import com.bugvm.objc.annotation.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AVAudio3DMixing/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "renderingAlgorithm")
    AVAudio3DMixingRenderingAlgorithm getRenderingAlgorithm();
    @Property(selector = "setRenderingAlgorithm:")
    void setRenderingAlgorithm(AVAudio3DMixingRenderingAlgorithm v);
    @Property(selector = "rate")
    float getRate();
    @Property(selector = "setRate:")
    void setRate(float v);
    @Property(selector = "reverbBlend")
    float getReverbBlend();
    @Property(selector = "setReverbBlend:")
    void setReverbBlend(float v);
    @Property(selector = "obstruction")
    float getObstruction();
    @Property(selector = "setObstruction:")
    void setObstruction(float v);
    @Property(selector = "occlusion")
    float getOcclusion();
    @Property(selector = "setOcclusion:")
    void setOcclusion(float v);
    @Property(selector = "position")
    @ByVal
    com.bugvm.ios.AVFoundation.AVAudio3DPoint getPosition();
    @Property(selector = "setPosition:")
    void setPosition(@ByVal com.bugvm.ios.AVFoundation.AVAudio3DPoint v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
