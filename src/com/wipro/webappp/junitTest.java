package com.wipro.webappp;
 
 
public class JWebUnitTest {
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8081/junitwebapp");
    }
 
    @Test
    public void testIndexPage() {
        beginAt("index.jsp"); 
        assertTitleEquals("Currency Convertor");
        //assertLinkPresent("home");
        //clickLink("home");
        //assertTitleEquals("Home");
    }
     

}
