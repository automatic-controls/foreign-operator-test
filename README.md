# ForeignOperatorTest

WebCTRL is a trademark of Automated Logic Corporation.  Any other trademarks mentioned herein are the property of their respective owners.

## General Information

For demonstration and testing purposes, this add-on creates a single foreign operator with administrative privileges.

## Instructions

1. If your server requires signed add-ons, copy the authenticating certificate [*ACES.cer*](https://github.com/automatic-controls/addon-dev-script/blob/main/ACES.cer?raw=true) to the *./addons* directory of your WebCTRL installation folder.

2. Install [*ForeignOperatorTest.addon*](https://github.com/automatic-controls/foreign-operator-test/releases/latest/download/ForeignOperatorTest.addon) using the WebCTRL interface.
   
3. Use the manual command `rebootserver`. Note: this step won't be necessary when ALC fixes [one of the bugs I found](http://alcshare.com/content/webctrl80-foreign-operators-not-working).
   
4. Login to your WebCTRL server using credentials provided in the following table. If you receive an HTTP error upon logging in (this is a result of a WebCTRL bug), remove all add-ons except this one, and go back to step 3.

   | Username | Password |
   | - | - |
   | foreign | 12345678 |