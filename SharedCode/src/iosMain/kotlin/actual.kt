package com.salam.crosstaxi

import platform.UIKit.UIDevice

actual fun platformName(): String {

    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}
