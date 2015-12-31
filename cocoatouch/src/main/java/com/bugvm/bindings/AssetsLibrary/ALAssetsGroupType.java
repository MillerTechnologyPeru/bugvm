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
package com.bugvm.bindings.AssetsLibrary;

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
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/ALAssetsGroupType/*</name>*/ extends Bits</*<name>*/ALAssetsGroupType/*</name>*/> {
    /*<values>*/
    public static final ALAssetsGroupType None = new ALAssetsGroupType(0L);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupType Library = new ALAssetsGroupType(1L);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupType Album = new ALAssetsGroupType(2L);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupType Event = new ALAssetsGroupType(4L);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupType Faces = new ALAssetsGroupType(8L);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupType SavedPhotos = new ALAssetsGroupType(16L);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupType PhotoStream = new ALAssetsGroupType(32L);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupType All = new ALAssetsGroupType(-1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/ALAssetsGroupType/*</name>*/[] values = _values(/*<name>*/ALAssetsGroupType/*</name>*/.class);

    public /*<name>*/ALAssetsGroupType/*</name>*/(long value) { super(value); }
    private /*<name>*/ALAssetsGroupType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/ALAssetsGroupType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/ALAssetsGroupType/*</name>*/(value, mask);
    }
    protected /*<name>*/ALAssetsGroupType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/ALAssetsGroupType/*</name>*/[] values() {
        return values.clone();
    }
}
