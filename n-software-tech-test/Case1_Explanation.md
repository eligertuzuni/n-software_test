# Case 1 - TCP Binary Data Transfer with Java

## Overview
This test case demonstrates how to send and receive binary data line-by-line over a TCP connection using Java. The client reads data from an input source (simulating async serial input), and sends it to a server which saves each line as it arrives.

## Tools Used
- Java (Standard Libraries)
- Socket (for TCP client)
- ServerSocket (for TCP server)
- BufferedReader & InputStreamReader for handling input and communication

## Data Flow
- The client reads from an input source (which can be replaced with async serial data).
- Each line of binary data is transmitted to the server via TCP.
- The server listens for connections, receives incoming lines, and logs or stores them.

## File Structure
```
- tcp-transfer/  
- ├── src/  
- │   ├── Client.java  
- │   └── Server.java  
- └── README.md
```

## What It Does
- The **Server** runs on a specified port, waits for client connections, and prints each incoming binary line.
- The **Client** connects to the server IP and port, simulates reading binary lines, and sends them one-by-one.

## Example
**Server Output:**
- Received: [Binary] Hello
- Received: [Binary] World

## Notes
- The client need Run `Server.java` first so it listens before the client attempts connection.
- Client and server must use the same binary encoding/decoding logic.
- Real async serial data can replace the simulated lines in the client.

## Requirements
- Java 8 or higher
- No external dependencies
- Open the TCP port in firewall if running on different machines

