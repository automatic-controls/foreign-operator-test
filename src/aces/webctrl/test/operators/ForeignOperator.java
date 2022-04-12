/*
  BSD 3-Clause License
  Copyright (c) 2022, Automatic Controls Equipment Systems, Inc.
  Contributors: Cameron Vogt (@cvogt729)
*/
package aces.webctrl.test.operators;
import java.util.*;
import com.controlj.green.addonsupport.web.*;
import com.controlj.green.addonsupport.web.auth.*;
public class ForeignOperator implements WebOperator {
  @Override public int getNavigationTimeout(){
    return -1;
  }
  @Override public String getDisplayName(){
    return Initializer.DISPLAY_NAME;
  }
  @Override public String getLoginName(){
    return Initializer.USERNAME;
  }
  @Override public Link getStartLocation(){
    return null;
  }
  @Override public Locale getLocale(){
    return Locale.getDefault();
  }
  @Override public boolean isSystem(){
    return false;
  }
  @Override public Set<String> getPrivilegeSet(com.controlj.green.addonsupport.access.Location loc){
    return priv;
  }
  @Override public com.controlj.green.addonsupport.access.PrivilegeTester getFunctionalPrivilegeTester(){
    return tester;
  }
  @Override public com.controlj.green.addonsupport.access.PrivilegeTester getLocationPrivilegeTester(com.controlj.green.addonsupport.access.Location loc){
    return tester;
  }
  private final static com.controlj.green.addonsupport.access.PrivilegeTester tester = new com.controlj.green.addonsupport.access.PrivilegeTester(){
    @Override public boolean hasPrivilege(String str){
      return true;
    }
  };
  private volatile static Set<String> priv;
  static {
    Set<String> priv = new HashSet<String>();
    priv.add("administrator");
    ForeignOperator.priv = Collections.unmodifiableSet(priv);
  }
}