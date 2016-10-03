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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AVAudioSessionSilenceSecondaryAudioHintType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Begin(1L),
    End(0L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AVAudioSessionSilenceSecondaryAudioHintType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AVAudioSessionSilenceSecondaryAudioHintType/*</name>*/ valueOf(long n) {
        for (/*<name>*/AVAudioSessionSilenceSecondaryAudioHintType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AVAudioSessionSilenceSecondaryAudioHintType/*</name>*/.class.getName());
    }
}
