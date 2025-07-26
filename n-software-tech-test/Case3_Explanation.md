# Case 3 - SFTP File Listing Using JSch

## Overview
This test case demonstrates how to connect to a public SFTP server using the JSch library, authenticate with credentials, and retrieve a list of files from a specific directory.

## Library Used
- [`jsch`](http://www.jcraft.com/jsch/) (Java Secure Channel) – for handling SFTP operations over SSH

## Server Information
- **Host**: `test.rebex.net`
- **Port**: `22`
- **Username**: `demo`
- **Password**: `password`
- **Remote Directory**: `/pub/example`

## What It Does
- Connects to the remote SFTP server using the provided credentials
- Skips strict host key verification (for test/demo purposes)
- Navigates to the `/pub/example` directory
- Retrieves the list of files in that directory
- Prints the filenames to the console

## Output Example
- → imap-console-client.png
- → KeyGenerator.png
- → readme.txt
- → WinFormClient.png

## Notes
- This example disables host key checking for simplicity. In production, you should **enable proper host verification**.
- Uses `ChannelSftp` and `Session` classes from the JSch library.

## Requirements
- `jsch-0.1.55.jar` (added via Maven or local dependency)
- Java 17 or higher
