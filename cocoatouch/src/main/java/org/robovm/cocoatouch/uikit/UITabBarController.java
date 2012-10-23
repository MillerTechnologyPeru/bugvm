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
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html">UITabBarController Class Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UITabBarController /*</name>*/ 
    extends /*<extends>*/ UIViewController /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UITabBarController /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UITabBarController /*</name>*/.class);

    /*<constructors>*/
    protected UITabBarController(SkipInit skipInit) { super(skipInit); }
    public UITabBarController() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector customizableViewControllers = Selector.register("customizableViewControllers");
    @Bridge(symbol = "objc_msgSend") private native static NSArray objc_getCustomizableViewControllers(UITabBarController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getCustomizableViewControllersSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/customizableViewControllers">@property(nonatomic, copy) NSArray *customizableViewControllers</a>
     * @since Available in iOS 2.0 and later.
     */
    public NSArray getCustomizableViewControllers() {
        if (customClass) { return objc_getCustomizableViewControllersSuper(getSuper(), this, customizableViewControllers); } else { return objc_getCustomizableViewControllers(this, customizableViewControllers); }
    }
    
    private static final Selector setCustomizableViewControllers$ = Selector.register("setCustomizableViewControllers:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setCustomizableViewControllers(UITabBarController __self__, Selector __cmd__, NSArray customizableViewControllers);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setCustomizableViewControllersSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__, NSArray customizableViewControllers);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/customizableViewControllers">@property(nonatomic, copy) NSArray *customizableViewControllers</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setCustomizableViewControllers(NSArray customizableViewControllers) {
        if (customClass) { objc_setCustomizableViewControllersSuper(getSuper(), this, setCustomizableViewControllers$, customizableViewControllers); } else { objc_setCustomizableViewControllers(this, setCustomizableViewControllers$, customizableViewControllers); }
    }
    
    private static final Selector delegate = Selector.register("delegate");
    @Bridge(symbol = "objc_msgSend") private native static UITabBarControllerDelegate objc_getDelegate(UITabBarController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UITabBarControllerDelegate objc_getDelegateSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/delegate">@property(nonatomic, assign) id&amp;lt;UITabBarControllerDelegate&amp;gt; delegate</a>
     * @since Available in iOS 2.0 and later.
     */
    public UITabBarControllerDelegate getDelegate() {
        if (customClass) { return objc_getDelegateSuper(getSuper(), this, delegate); } else { return objc_getDelegate(this, delegate); }
    }
    
    private static final Selector setDelegate$ = Selector.register("setDelegate:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setDelegate(UITabBarController __self__, Selector __cmd__, UITabBarControllerDelegate delegate);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setDelegateSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__, UITabBarControllerDelegate delegate);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/delegate">@property(nonatomic, assign) id&amp;lt;UITabBarControllerDelegate&amp;gt; delegate</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setDelegate(UITabBarControllerDelegate delegate) {
        if (customClass) { objc_setDelegateSuper(getSuper(), this, setDelegate$, delegate); } else { objc_setDelegate(this, setDelegate$, delegate); }
    }
    
    private static final Selector moreNavigationController = Selector.register("moreNavigationController");
    @Bridge(symbol = "objc_msgSend") private native static UINavigationController objc_getMoreNavigationController(UITabBarController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UINavigationController objc_getMoreNavigationControllerSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/moreNavigationController">@property(nonatomic, readonly) UINavigationController *moreNavigationController</a>
     * @since Available in iOS 2.0 and later.
     */
    public UINavigationController getMoreNavigationController() {
        if (customClass) { return objc_getMoreNavigationControllerSuper(getSuper(), this, moreNavigationController); } else { return objc_getMoreNavigationController(this, moreNavigationController); }
    }
    
    private static final Selector selectedIndex = Selector.register("selectedIndex");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getSelectedIndex(UITabBarController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getSelectedIndexSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/selectedIndex">@property(nonatomic) NSUInteger selectedIndex</a>
     * @since Available in iOS 2.0 and later.
     */
    public int getSelectedIndex() {
        if (customClass) { return objc_getSelectedIndexSuper(getSuper(), this, selectedIndex); } else { return objc_getSelectedIndex(this, selectedIndex); }
    }
    
    private static final Selector setSelectedIndex$ = Selector.register("setSelectedIndex:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setSelectedIndex(UITabBarController __self__, Selector __cmd__, int selectedIndex);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setSelectedIndexSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__, int selectedIndex);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/selectedIndex">@property(nonatomic) NSUInteger selectedIndex</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setSelectedIndex(int selectedIndex) {
        if (customClass) { objc_setSelectedIndexSuper(getSuper(), this, setSelectedIndex$, selectedIndex); } else { objc_setSelectedIndex(this, setSelectedIndex$, selectedIndex); }
    }
    
    private static final Selector selectedViewController = Selector.register("selectedViewController");
    @Bridge(symbol = "objc_msgSend") private native static UIViewController objc_getSelectedViewController(UITabBarController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIViewController objc_getSelectedViewControllerSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/selectedViewController">@property(nonatomic, assign) UIViewController *selectedViewController</a>
     * @since Available in iOS 2.0 and later.
     */
    public UIViewController getSelectedViewController() {
        if (customClass) { return objc_getSelectedViewControllerSuper(getSuper(), this, selectedViewController); } else { return objc_getSelectedViewController(this, selectedViewController); }
    }
    
    private static final Selector setSelectedViewController$ = Selector.register("setSelectedViewController:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setSelectedViewController(UITabBarController __self__, Selector __cmd__, UIViewController selectedViewController);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setSelectedViewControllerSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__, UIViewController selectedViewController);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/selectedViewController">@property(nonatomic, assign) UIViewController *selectedViewController</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setSelectedViewController(UIViewController selectedViewController) {
        if (customClass) { objc_setSelectedViewControllerSuper(getSuper(), this, setSelectedViewController$, selectedViewController); } else { objc_setSelectedViewController(this, setSelectedViewController$, selectedViewController); }
    }
    
    private static final Selector tabBar = Selector.register("tabBar");
    @Bridge(symbol = "objc_msgSend") private native static UITabBar objc_getTabBar(UITabBarController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UITabBar objc_getTabBarSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/tabBar">@property(nonatomic,readonly) UITabBar *tabBar</a>
     * @since Available in iOS 3.0 and later.
     */
    public UITabBar getTabBar() {
        if (customClass) { return objc_getTabBarSuper(getSuper(), this, tabBar); } else { return objc_getTabBar(this, tabBar); }
    }
    
    private static final Selector viewControllers = Selector.register("viewControllers");
    @Bridge(symbol = "objc_msgSend") private native static NSArray objc_getViewControllers(UITabBarController __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getViewControllersSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/viewControllers">@property(nonatomic, copy) NSArray *viewControllers</a>
     * @since Available in iOS 2.0 and later.
     */
    public NSArray getViewControllers() {
        if (customClass) { return objc_getViewControllersSuper(getSuper(), this, viewControllers); } else { return objc_getViewControllers(this, viewControllers); }
    }
    
    private static final Selector setViewControllers$ = Selector.register("setViewControllers:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setViewControllers(UITabBarController __self__, Selector __cmd__, NSArray viewControllers);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setViewControllersSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__, NSArray viewControllers);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instp/UITabBarController/viewControllers">@property(nonatomic, copy) NSArray *viewControllers</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setViewControllers(NSArray viewControllers) {
        if (customClass) { objc_setViewControllersSuper(getSuper(), this, setViewControllers$, viewControllers); } else { objc_setViewControllers(this, setViewControllers$, viewControllers); }
    }
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector setViewControllers$animated$ = Selector.register("setViewControllers:animated:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setViewControllers(UITabBarController __self__, Selector __cmd__, NSArray viewControllers, boolean animated);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setViewControllersSuper(ObjCSuper __super__, UITabBarController __self__, Selector __cmd__, NSArray viewControllers, boolean animated);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITabBarController_Class/Reference/Reference.html#//apple_ref/occ/instm/UITabBarController/setViewControllers:animated:">- (void)setViewControllers:(NSArray *)viewControllers  animated:(BOOL)animated</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setViewControllers(NSArray viewControllers, boolean animated) {
        if (customClass) { objc_setViewControllersSuper(getSuper(), this, setViewControllers$animated$, viewControllers, animated); } else { objc_setViewControllers(this, setViewControllers$animated$, viewControllers, animated); }
    }
    /*</methods>*/
    /*<callbacks>*/
    static class Callbacks {
        @Callback @BindSelector("setViewControllers:animated:") public static void setViewControllers(UITabBarController __self__, Selector __cmd__, NSArray viewControllers, boolean animated) { __self__.setViewControllers(viewControllers, animated); }
    }
    /*</callbacks>*/

}
