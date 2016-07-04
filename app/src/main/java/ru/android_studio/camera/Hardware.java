package ru.android_studio.camera;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by y.andreev on 05.07.2016.
 */
public class Hardware {
    /**
     * Checking device has camera hardware or not
     * */
    public static boolean isDeviceSupportCamera(Context context) {
        if (context.getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA)) {
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }
}
