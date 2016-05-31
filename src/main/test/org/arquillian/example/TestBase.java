package org.arquillian.example;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;


public class TestBase {
    private static final Logger LOG = LoggerFactory.getLogger(TestBase.class);

    @ArquillianResource
    private URL deploymentUrl;

    @Deployment(testable = false)
    public static WebArchive createDeployment() {

        WebArchive war = ShrinkWrap.create(WebArchive.class, "testing.war")
                .addPackages(true, "org.arquillian.example")
                .addAsWebInfResource("META-INF/beans.xml", "beans.xml")
                .addAsWebInfResource("web.xml");

        LOG.info("##################################################");
        LOG.info(war.toString(true));
        LOG.info("##################################################");
        return war;
    }


    String getBaseURL() {
        return deploymentUrl.toString();
    }
}
