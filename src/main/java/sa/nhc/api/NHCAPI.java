package sa.nhc.api;

import sa.nhc.api.repo.LoginAPI;

public class NHCAPI {

    public final LoginAPI loginApi;

    public NHCAPI() {
        loginApi = new LoginAPI();
    }
}