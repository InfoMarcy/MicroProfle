package com.bazdigital;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class App extends Application {

}
// mvn thorntail:run
//lsof -i:9990
// kill -9 14037
//mvn clean package fabric8:build fabric8:deploy

//  http://user-microprofile.a3c1.starter-us-west-1.openshiftapps.com/

