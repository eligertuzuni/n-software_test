# Case 1 - TCP Binary Data Transfer with Java

## Overview
This test case demonstrates how to send and receive binary data line-by-line over a TCP connection using Java. The client reads data from an input source (simulating async serial input), and sends it to a server which saves each line as it arrives.

## Tools Used
- Java (Standard Libraries)
- Socket (for TCP client)
- ServerSocket (for TCP server)

## Data Flow
- The client reads from an input source (can be replaced with async serial stream).
- Each binary line is transmitted to the server via TCP.
- The server listens for connections, receives incoming lines, and logs or stores them.

## File Structure

## tcp-transfer/
- ├── src/
- │ ├── Client.java
- │ └── Server.java
- └── README.md


## What It Does
- The server runs on a specified port, accepts a client connection, and prints each incoming binary line.
- The client connects to the server IP and port, simulates reading binary lines, and sends them immediately.

## Example
- **Server Output:**
 - Received: [Binary] Hello
 - Received: [Binary] World


## Notes
- Client must run `Server.java` first to listen for connections.
- The client and server should use the same encoding/decoding strategy for binary lines.
- If adapting for real async serial data, plug the source into the client `InputStream`.

## Requirements
- Java 8 or higher
- No external dependencies
- Open firewall port for TCP communication if on different machines
