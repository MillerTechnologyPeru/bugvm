/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html">UIMenuController Class Reference</a>
 *   @since Available in iOS 3.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIMenuController /*</name>*/ 
    extends /*<extends>*/ NSObject /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIMenuController /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIMenuController /*</name>*/.class);

    /*<constructors>*/
    protected UIMenuController(SkipInit skipInit) { super(skipInit); }
    public UIMenuController() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector arrowDirection = Selector.register("arrowDirection");
    @Bridge(symbol = "objc_msgSend") private native static UIMenuControllerArrowDirection objc_getArrowDirection(UIMenuController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIMenuControllerArrowDirection objc_getArrowDirectionSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instp/UIMenuController/arrowDirection">@property UIMenuControllerArrowDirection arrowDirection</a>
     * @since Available in iOS 3.2 and later.
     */
    public UIMenuControllerArrowDirection getArrowDirection() {
        if (customClass) { return objc_getArrowDirectionSuper(getSuper(), this, arrowDirection); } else { return objc_getArrowDirection(this, arrowDirection); }
    }
    
    private static final Selector setArrowDirection$ = Selector.register("setArrowDirection:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setArrowDirection(UIMenuController __self__, Selector __cmd__, UIMenuControllerArrowDirection arrowDirection);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setArrowDirectionSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__, UIMenuControllerArrowDirection arrowDirection);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instp/UIMenuController/arrowDirection">@property UIMenuControllerArrowDirection arrowDirection</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setArrowDirection(UIMenuControllerArrowDirection arrowDirection) {
        if (customClass) { objc_setArrowDirectionSuper(getSuper(), this, setArrowDirection$, arrowDirection); } else { objc_setArrowDirection(this, setArrowDirection$, arrowDirection); }
    }
    
    private static final Selector menuFrame = Selector.register("menuFrame");
    @Bridge(symbol = "objc_msgSend") private native static CGRect objc_getMenuFrame(UIMenuController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGRect objc_getMenuFrameSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instp/UIMenuController/menuFrame">@property(nonatomic, readonly) CGRect menuFrame</a>
     * @since Available in iOS 3.0 and later.
     */
    public CGRect getMenuFrame() {
        if (customClass) { return objc_getMenuFrameSuper(getSuper(), this, menuFrame); } else { return objc_getMenuFrame(this, menuFrame); }
    }
    
    private static final Selector menuItems = Selector.register("menuItems");
    @Bridge(symbol = "objc_msgSend") private native static NSArray objc_getMenuItems(UIMenuController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getMenuItemsSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instp/UIMenuController/menuItems">@property(copy) NSArray *menuItems</a>
     * @since Available in iOS 3.2 and later.
     */
    public NSArray getMenuItems() {
        if (customClass) { return objc_getMenuItemsSuper(getSuper(), this, menuItems); } else { return objc_getMenuItems(this, menuItems); }
    }
    
    private static final Selector setMenuItems$ = Selector.register("setMenuItems:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setMenuItems(UIMenuController __self__, Selector __cmd__, NSArray menuItems);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setMenuItemsSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__, NSArray menuItems);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instp/UIMenuController/menuItems">@property(copy) NSArray *menuItems</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setMenuItems(NSArray menuItems) {
        if (customClass) { objc_setMenuItemsSuper(getSuper(), this, setMenuItems$, menuItems); } else { objc_setMenuItems(this, setMenuItems$, menuItems); }
    }
    
    private static final Selector isMenuVisible = Selector.register("isMenuVisible");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isMenuVisible(UIMenuController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isMenuVisibleSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instp/UIMenuController/menuVisible">@property(nonatomic, getter=isMenuVisible) BOOL menuVisible</a>
     * @since Available in iOS 3.0 and later.
     */
    public boolean isMenuVisible() {
        if (customClass) { return objc_isMenuVisibleSuper(getSuper(), this, isMenuVisible); } else { return objc_isMenuVisible(this, isMenuVisible); }
    }
    
    private static final Selector setMenuVisible$ = Selector.register("setMenuVisible:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setMenuVisible(UIMenuController __self__, Selector __cmd__, boolean menuVisible);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setMenuVisibleSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__, boolean menuVisible);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instp/UIMenuController/menuVisible">@property(nonatomic, getter=isMenuVisible) BOOL menuVisible</a>
     * @since Available in iOS 3.0 and later.
     */
    public void setMenuVisible(boolean menuVisible) {
        if (customClass) { objc_setMenuVisibleSuper(getSuper(), this, setMenuVisible$, menuVisible); } else { objc_setMenuVisible(this, setMenuVisible$, menuVisible); }
    }
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector sharedMenuController = Selector.register("sharedMenuController");
    @Bridge(symbol = "objc_msgSend") private native static UIMenuController objc_getSharedMenuController(ObjCClass __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/clm/UIMenuController/sharedMenuController">+ (UIMenuController *)sharedMenuController</a>
     * @since Available in iOS 3.0 and later.
     */
    public static UIMenuController getSharedMenuController() {
        return objc_getSharedMenuController(objCClass, sharedMenuController);
    }
    
    private static final Selector setMenuVisible$animated$ = Selector.register("setMenuVisible:animated:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setMenuVisible(UIMenuController __self__, Selector __cmd__, boolean menuVisible, boolean animated);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setMenuVisibleSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__, boolean menuVisible, boolean animated);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instm/UIMenuController/setMenuVisible:animated:">- (void)setMenuVisible:(BOOL)menuVisible animated:(BOOL)animated</a>
     * @since Available in iOS 3.0 and later.
     */
    public void setMenuVisible(boolean menuVisible, boolean animated) {
        if (customClass) { objc_setMenuVisibleSuper(getSuper(), this, setMenuVisible$animated$, menuVisible, animated); } else { objc_setMenuVisible(this, setMenuVisible$animated$, menuVisible, animated); }
    }
    
    private static final Selector setTargetRect$inView$ = Selector.register("setTargetRect:inView:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setTargetRect(UIMenuController __self__, Selector __cmd__, CGRect targetRect, UIView targetView);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setTargetRectSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__, CGRect targetRect, UIView targetView);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instm/UIMenuController/setTargetRect:inView:">- (void)setTargetRect:(CGRect)targetRect inView:(UIView *)targetView</a>
     * @since Available in iOS 3.0 and later.
     */
    public void setTargetRect(CGRect targetRect, UIView targetView) {
        if (customClass) { objc_setTargetRectSuper(getSuper(), this, setTargetRect$inView$, targetRect, targetView); } else { objc_setTargetRect(this, setTargetRect$inView$, targetRect, targetView); }
    }
    
    private static final Selector update = Selector.register("update");
    @Bridge(symbol = "objc_msgSend") private native static void objc_update(UIMenuController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_updateSuper(ObjCSuper __super__, UIMenuController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIMenuController_Class/UIMenuController.html#//apple_ref/occ/instm/UIMenuController/update">- (void)update</a>
     * @since Available in iOS 3.0 and later.
     */
    public void update() {
        if (customClass) { objc_updateSuper(getSuper(), this, update); } else { objc_update(this, update); }
    }
    /*</methods>*/
    /*<callbacks>*/
    static class Callbacks {
        @Callback @BindSelector("setMenuVisible:animated:") public static void setMenuVisible(UIMenuController __self__, Selector __cmd__, boolean menuVisible, boolean animated) { __self__.setMenuVisible(menuVisible, animated); }
        @Callback @BindSelector("setTargetRect:inView:") public static void setTargetRect(UIMenuController __self__, Selector __cmd__, CGRect targetRect, UIView targetView) { __self__.setTargetRect(targetRect, targetView); }
        @Callback @BindSelector("update") public static void update(UIMenuController __self__, Selector __cmd__) { __self__.update(); }
    }
    /*</callbacks>*/

}
