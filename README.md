A basic Selenium 3 test run in Firefox 45-51b8

Status as of 2016-12-28:

```
Failed tests: 
  BasicIT.FF45:28->test:84 window.something failure expected:<something else> but was:<null>
  BasicIT.FF46:35->test:84 window.something failure expected:<something else> but was:<null>
  BasicIT.FF47:42->test:84 window.something failure expected:<something else> but was:<null>

Tests in error: 
  BasicIT.FF48:50->test:95 » UnsupportedCommand POST /session/f39bd2ce-2c4f-8547...
  BasicIT.FF49:58->test:86 » Timeout Expected condition failed: waiting for org....
  BasicIT.FF50:66->test:86 » Timeout Expected condition failed: waiting for org....
  BasicIT.FF51:74->test:95 » UnsupportedCommand POST /session/634c5174-6a69-4343...
```


If you want to run it yourself, adjust the browser path in BasicIT.java and
do
`mvn clean install`

