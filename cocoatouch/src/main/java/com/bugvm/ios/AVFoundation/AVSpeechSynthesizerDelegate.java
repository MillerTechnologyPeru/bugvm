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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AVSpeechSynthesizerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "speechSynthesizer:didStartSpeechUtterance:")
    void didStartSpeechUtterance(AVSpeechSynthesizer synthesizer, com.bugvm.ios.AVFoundation.AVSpeechUtterance utterance);
    @Method(selector = "speechSynthesizer:didFinishSpeechUtterance:")
    void didFinishSpeechUtterance(AVSpeechSynthesizer synthesizer, com.bugvm.ios.AVFoundation.AVSpeechUtterance utterance);
    @Method(selector = "speechSynthesizer:didPauseSpeechUtterance:")
    void didPauseSpeechUtterance(AVSpeechSynthesizer synthesizer, com.bugvm.ios.AVFoundation.AVSpeechUtterance utterance);
    @Method(selector = "speechSynthesizer:didContinueSpeechUtterance:")
    void didContinueSpeechUtterance(AVSpeechSynthesizer synthesizer, com.bugvm.ios.AVFoundation.AVSpeechUtterance utterance);
    @Method(selector = "speechSynthesizer:didCancelSpeechUtterance:")
    void didCancelSpeechUtterance(AVSpeechSynthesizer synthesizer, com.bugvm.ios.AVFoundation.AVSpeechUtterance utterance);
    @Method(selector = "speechSynthesizer:willSpeakRangeOfSpeechString:utterance:")
    void willSpeak(AVSpeechSynthesizer synthesizer, @ByVal NSRange characterRange, com.bugvm.ios.AVFoundation.AVSpeechUtterance utterance);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
