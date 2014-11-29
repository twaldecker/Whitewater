package org.mapsforge.applications.android.samples;

import android.util.Log;

import org.mapsforge.map.rendertheme.XmlRenderTheme;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by vkmapadm on 10.02.14.
 */
public class OpenSeaMapViewer extends BasicMapViewer{
    /**
     * @return the rendertheme for this viewer
     */
    protected XmlRenderTheme getRenderTheme() {
        XmlRenderTheme result = null;
        File aOSMRenderer = null;
        try {
           aOSMRenderer = new File("/mnt/sdcard/assetswithseamarks015.xml");
            if (aOSMRenderer.exists()) {
                  result =  new ExternalRenderThemeUsingJarResources(aOSMRenderer);
            } else {
                Log.i(SamplesApplication.TAG, "file not found "
                        + aOSMRenderer.getName());
            }
        } catch (FileNotFoundException e) {
            Log.i(SamplesApplication.TAG, "Could not open file "
                    + aOSMRenderer.getName());
        }
       return result;
    }
}
