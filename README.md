A basic Selenium 3 test run in Firefox 45-51b8

Status as of 2016-12-28:

```
Results :

Failed tests: 
  BasicIT.FF45:28->test:83 window.something failure expected:<something else> but was:<null>
  BasicIT.FF46:35->test:83 window.something failure expected:<something else> but was:<null>
  BasicIT.FF47:42->test:83 window.something failure expected:<something else> but was:<null>
  BasicIT.FF48:50->test:95 expected:<timer[ double-clicked]> but was:<timer[]>
  BasicIT.FF51:73->test:95 expected:<timer[ double-clicked]> but was:<timer[]>

Tests in error: 
  BasicIT.FF49:58->test:85 » Timeout Expected condition failed: waiting for org....
  BasicIT.FF50:66->test:85 » Timeout Expected condition failed: waiting for org....

Tests run: 7, Failures: 5, Errors: 2, Skipped: 0
```


If you want to run it yourself, adjust the browser path in BasicIT.java and
do
`mvn clean install`

