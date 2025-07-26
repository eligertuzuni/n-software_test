# Case 2 - Extract File from ZIP by Name (Unknown Path)

## Overview
This test case demonstrates how to extract a specific file from a ZIP archive when only the file name is known, but the internal folder structure is unknown. It uses the `ipworkszip` library to scan and extract the desired file.

## Library Used
- [`ipworkszip`](https://www.nsoftware.com/ipworkszip/) – for managing and extracting ZIP archive contents in Java

## ZIP Information
- **ZIP File**: `example.zip`
- **Target File Name**: `mydoc.txt`
- **Output Directory**: `output_folder/`

## What It Does
- Loads the contents of a ZIP archive
- Searches for the file `mydoc.txt` regardless of its internal folder path
- Extracts only that file to `output_folder/` if found
- Skips full extraction of the archive

## Output Example
- ✔ Extracted: `docs/mydoc.txt`
- ✖ File not found: `mydoc.txt` (if not found)

## Notes
- The method uses `.scan()` to inspect ZIP contents before extraction.
- The solution is suitable when you want to extract one file but don't know its internal path.

## Requirements
- `ipworkszip.jar` must be included in your project classpath manually (not via Maven)
- Java 17 or higher
