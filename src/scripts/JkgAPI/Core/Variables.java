package scripts.JkgAPI.Core;

import scripts.JkgAPI.Core.DataBag;

public class Variables {

    private static final DataBag instance = new DataBag();

    private Variables() {

    }

    public static DataBag getInstance() {
        return instance;
    }
}
