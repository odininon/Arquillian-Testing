package org.arquillian.example.rs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rs/v1")
public class RestApplication extends Application {
}
