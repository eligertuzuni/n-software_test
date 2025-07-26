/*package com.nsoftware.test;

import ipworkszip.*;
import java.io.File;

public class Case2 {
    public void run() {
        try {
            Zip zip = new Zip();

            zip.setArchiveFile("example.zip");  // Path to the ZIP file

            String outputDir = "output_folder";
            File folder = new File(outputDir);
            if (!folder.exists()) {
                if (folder.mkdirs()) {
                    System.out.println("✔ Created folder: " + outputDir);
                } else {
                    System.out.println("✖ Failed to create folder: " + outputDir);
                    return;
                }
            }

            zip.setExtractToPath(outputDir); // Folder to extract to
            zip.scan(); // Load the archive contents

            String targetFileName = "mydoc.txt";
            boolean found = false;

            int fileCount = zip.getArchiveFileCount();  // ✅ Correct method
            for (int i = 0; i < fileCount; i++) {
                ZipArchiveFile file = zip.getArchiveFile(i);  // ✅ Correct class
                String internalPath = file.getPath();         // ✅ File path in ZIP

                if (internalPath.endsWith("/" + targetFileName) || internalPath.equals(targetFileName)) {
                    zip.setArchiveFileIndex(i);              // ✅ Select the file
                    zip.extract();                            // ✅ Extract only this file
                    System.out.println("✔ Extracted: " + internalPath);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("✖ File not found: " + targetFileName);
            }

        } catch (Exception e) {
            System.out.println("✖ Error: " + e.getMessage());
        }
    }
}
*/