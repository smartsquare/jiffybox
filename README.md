[![Build Status](https://travis-ci.org/jschlichtholz/jiffybox.svg?branch=master)](https://travis-ci.org/jschlichtholz/jiffybox)
[![Coverage Status](https://coveralls.io/repos/jschlichtholz/jiffybox/badge.png)](https://coveralls.io/r/jschlichtholz/jiffybox)

# JiffyBox API
Beware! Until the release of version 1.0.0 this API is under development and it is likely, that there will be changes even to public methods.

## Introduction
Cloud servers on demand by JiffyBox are virtual servers which's resources are not fixed but coming from a large pool, the "cloud". Without an inflexible price corset and without a minimal runtime the billing is calculated by actual usage only. Further information on features and pricing of JiffyBoxes can be found at the JiffyBox website:

- For German customers: http://www.df.eu/de/cloud-hosting/cloud-server/
- For Austrian customers: http://www.df.eu/at/cloud-hosting/cloud-server/

A complete documentation on the API's features can be found at http://www.df.eu/fileadmin/media/doc/jiffybox-api-dokumentation.pdf

For the javadoc look at http://jschlichtholz.github.io/jiffybox/

This project is a Java implementation of the JiffyBox API. It is licensed under the MIT License.

## Usage
Basic usage is
```java
// Get an API instance using the <Your API token> token.
ModuleFactory api = ModuleFactory.getInstance("<Your API token>");

// Get a module (e. g. backups).
ModuleBackups backups = api.backups();

// Make a call to the module (e. g. requesting a list of all backups).
Response<Map<String, Backup>> response = backups.getBackups();

// Get the messages sent by the api.
List<String> messages = response.getMessages();

// Get the result sent by the API.
Map<String, Backup> result = response.getResult();
```

Make sure to handle `IOExceptions`which occur when either an API limit is exceeded or the API server is unreachable for whatever reason.

For further examples see the test cases.

## Testing
The test cases are written using WireMock (http://wiremock.org/) by Tom Akehurst (http://www.tomakehurst.com/about/). To add or examine test cases there has to be a mapping within the src/test/resources/mappings folder (or a sub folder).