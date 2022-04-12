/*
  BSD 3-Clause License
  Copyright (c) 2022, Automatic Controls Equipment Systems, Inc.
  Contributors: Cameron Vogt (@cvogt729)
*/
package aces.webctrl.test.operators;
import javax.servlet.*;
import com.controlj.green.addonsupport.*;
public class Initializer implements ServletContextListener {
  public final static String DISPLAY_NAME = "Foreign";
  public final static String USERNAME = "foreign";
  public final static String PASSWORD = "12345678";
  static {
    // Temporary workaround for bug until ALC releases a patch for WebCTRL
    try{
      Class.forName("com.controlj.green.directaccess.DirectAccessInternal").getMethod("getDirectAccessInternal").invoke(null);
      com.controlj.green.addonsupport.access.DirectAccess.getDirectAccess();
    }catch (Throwable t){
      System.err.println("Failed to enforce temporary workaround.");
    }
  }
  @Override public void contextInitialized(ServletContextEvent sce){
    HelperAPI.logoutAllForeign();
    HelperAPI.activateWebOperatorProvider(AddOnInfo.getAddOnInfo().getName());
  }
  @Override public void contextDestroyed(ServletContextEvent sce){
    HelperAPI.activateDefaultWebOperatorProvider();
    HelperAPI.logoutAllForeign();
  }
}