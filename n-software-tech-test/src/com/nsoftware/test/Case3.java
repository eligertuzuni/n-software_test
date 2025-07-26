package com.nsoftware.test;

import com.jcraft.jsch.*;

import java.util.Vector;

public class Case3 {
    public void run() {
        String host = "test.rebex.net";
        String user = "demo";
        String password = "password";

        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, 22);
            session.setPassword(password);

            // Skip host key check
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();

            ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
            sftpChannel.connect();

            sftpChannel.cd("/pub/example");
            Vector<ChannelSftp.LsEntry> files = sftpChannel.ls(".");

            for (ChannelSftp.LsEntry entry : files) {
                System.out.println("→ " + entry.getFilename());
            }

            sftpChannel.disconnect();
            session.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
