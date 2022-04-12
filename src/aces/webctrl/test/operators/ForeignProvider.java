/*
  BSD 3-Clause License
  Copyright (c) 2022, Automatic Controls Equipment Systems, Inc.
  Contributors: Cameron Vogt (@cvogt729)
*/
package aces.webctrl.test.operators;
import com.controlj.green.addonsupport.web.auth.*;
public class ForeignProvider extends StandardWebOperatorProvider {
  private final static char[] PASSWORD = Initializer.PASSWORD.toCharArray();
  @Override public WebOperator validate(String username, char[] password, String host) throws ValidationException {
    if (Initializer.USERNAME.equalsIgnoreCase(username) && java.util.Arrays.equals(PASSWORD, password)){
      return new ForeignOperator();
    }
    return super.validate(username, password, host);
  }
}