package com.slin.smvc;

import org.springframework.beans.factory.annotation.Value;

public class Constants {
	//public static final String NS="http://service.server.cxf.webservice/";
	//public static final String NS="http://com.slin.smvc.service/";
	public static final String NS="http://impl.service.smvc.slin.com/";
    public static final String versionCode="update_time";

    @Value("${aa.prePicture}")
    public static String PREPICTURE="fffffff";
}
