package su.openwifi.openwlanmap.service;

import android.content.AsyncTaskLoader;
import android.content.Context;

/**
 * Created by tali on 31.05.18.
 */

public class WifiUploader extends AsyncTaskLoader {
    public WifiUploader(Context context) {
        super(context);
    }

    @Override
    public Object loadInBackground() {
        return null;
    }
}
