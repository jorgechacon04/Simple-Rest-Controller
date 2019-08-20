Database Prep:

You must
	CREATE DATABASE fuelmgmt;
	GRANT ALL PRIVILEGES ON DATABASE fuelmgmt TO fuelmgmt;
	CREATE SCHEMA docmgmt;

Then you can start the service to have Flyway run all the migrations.

NOTE: CURRENT FOLDER DATA IS FOR sandbox NOT A CURRENT ENVIRONMENT.

------------------------------

BOX API

	http://wiki-mia.wfs.com/pages/viewpage.action?spaceKey=LP&title=Accessing+Box+to+search+and+download+files+from+a+spring+boot+application
References a project
	http://stash.wfs.com/projects/GPOR/repos/portal-land-service/browse/src/main/java/com/wfs/land/portalservices/config/box/BoxIdentityConfig.java


First, you need a token.
	https://developer.box.com/reference
		https://api.box.com/oauth2/token

FROM VANIA	2019-07-09T
{
  "boxAppSettings": {
    "clientID": "ptd47mmpgmsufxzz85vsw8534sz1fhye",
    "clientSecret": "Ox5ZqKpbaZpoUPdnOHU0A1oF1qDSda4l",
    "appAuth": {
      "publicKeyID": "cef66jvc",
      "privateKey": "-----BEGIN ENCRYPTED PRIVATE KEY-----\nMIIFDjBABgkqhkiG9w0BBQ0wMzAbBgkqhkiG9w0BBQwwDgQInqmkdsTst0ECAggA\nMBQGCCqGSIb3DQMHBAhJmqYoP8IW4QSCBMgz8hDN5PfBZPNyjpZz/CKfA21JCwOy\nVnm/qUmgleiEDMbeJDq53BXL8hvGrEtkfS31ycW/ebSmxGJYG/Ca9SWoEEcXWwc2\nS0lfyN/Rcn0tsEAm4YHIk9TEhV9EHqJS+PF5eprtn+izorDJcmRExdjTt7y09bCZ\n0EcUT0aRlRYk+Dr2yyK4Rmz0BlG/1GQnH50HaoThRzuLK760HBzL39DBKZJ0qcmM\nffSVViSsATEFHW5z9KSFsTsuSrmIv8kJNWBHJSVG10z1REboE7aKk9awcLRC13ly\nRaVj4PyHhYEk+DYxX21HQE2U/WSvtVVTPui5ZlFqsWp9LkWHygm4dxq0zBZPAI2J\nW6VShtBLw6rmX1Oy9gPzFBXj3Mx9zJIBnWeyHQ68hvLkXWs10DELqAtrl0BtdYGF\nAPJpeq0i8KsoVEBU5jR4j7FflTPUC38ZroPRe6EMf5O9Gjduxi0LAcfomVVGve1H\nlLIT3qSiLz3u2B0DCfoo0zsfCAB8P91hTOPhjA3ankcyojXaGzLPrdvW8RTz3ebw\nhzLlgnloOWmcbcfxGiiH+K5aqEkCbkF1FLDa0ooRcD+gq4HbbweOolqoVaP1JxJZ\nV17LuskmbgODuU8lTlX1J81aNjlPPm3gxjdg7li40fVla319vF8j5U5BlcCHN4Em\nseYTz9HozdhI2B6OF4KQ2JJJzE/gYkJSyx9itjWT3CJj8e+1XDxBsA3F2ak9bGtM\nFhDGa8PaqTsilnIYwj/OtkCpAMSlgaKUqgZJURqee6kP+52vtpDgdbXrlpQs6CUC\nio2LjCisN+3JF75jWJRIgIwob3MhMsz9a90JlU+KeApDyCKWVVCd1MfKSBD9P9ih\neWX4tWpys+9nzOfdbTcQsf7th9ltb0zSEvQrFka9/3hc6WS3wWsBNk8llF9VYNxq\n2rM2Y1OfPATJflgs7P9r4Zi69lDS3f5C2MAwIkCpo73KsC1QTUrZbbhOmmkOddEX\nWBqpfwx6rnA0NrvbFDZEvUXWdKggQg+xvgHBhxB1RjGeLQ//v+wdBzYx38Hoh77r\nEQ6H3LcjOOKhz4qpkFV/IrMaUyjZ3iJdq25TmD/2LOE4NqifDoiving95Ox+QPrh\n9zmtGOMkuYoAbki4gC0KdPVs9MsV96J+4ZUK1gEBsSOUbTJTCm8BYFIngAaaOp8x\n7w5TOhcf0me4NuJlnBtWaYN5BKEAGtYaIPl5Of1oJuPbGEWqUx1BbqbEpT3MoePW\nu+wyxi8K/tlQERWImAm6OZ/XJ7uKsO6GcGPQr1Tf7V831/Eb68uY5xEj8ZBinRMH\n+cStAam/iyqJXZNp2TgoDpOCikv4dXYx9BX0VrWyQYS0OjTMj+OwC1XOq/e4kkGA\nb06Gt7nRj4QHBiG8g9W7DF6S95v+xay+JvLFmBBwEgaIR8qYvuCG95+3967GPujQ\nGF1NChQlQTwCH/eFuVu56iYkZsQPSOqf2BZ3z+Pk0Db9G+4k+rKxz3iN16wmFUiH\nCBPcIsXnPXEy2H618MlX24a2qNJPti5Q3tkK7JWkYUOaldmGE6KpBj7JQdxYDxG6\nigEaay785Z3Ql14CLyu4kO1tFuW+mMMvcmrAA+e/Q0LaUB8bOXTTKNSHVnrkzWiW\nuBk=\n-----END ENCRYPTED PRIVATE KEY-----\n",
      "passphrase": "0c6909f84454914f0ae0e3201bb20480"
    }
  },
  "enterpriseID": "51764595"
}
-----
NOTE: each environment has a root Box folder ID
SEE: application.properties > app.box.rootFolderId
NEEDS TO BE SET IN ZEUS.

	SANDBOX	80847443857
	DEV		80850449324
	TEST	80849789791
	QA		80846928269

-----
Our brand new MetaData @ 2019-07-09
{
           "id": "537133c3-138b-43fe-9fe4-1770a02c113a",
           "type": "metadata_template",
           "templateKey": "fmPortal",
           "scope": "enterprise_51764595",
           "displayName": "FM Portal",
           "hidden": false,
           "fields": [
               {
                   "id": "fa8d695c-7597-41a0-b645-1ad57125901e",
                   "type": "string",
                   "key": "accessRole",
                   "displayName": "Access Role",
                   "hidden": false
               },
               {
                   "id": "49e4b744-3be1-4d26-98d1-b6ba09694d91",
                   "type": "string",
                   "key": "customerNumber",
                   "displayName": "Customer Number",
                   "hidden": false
               }
           ]
       },

Vania confirmed that the Box team WILL NOT MAKE FOLDERS.



