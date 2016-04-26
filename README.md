# nci-diff-CDISC
diff specific for CDISC reports

CDISC Changes Report Generator
==============================

This program will generate a changes report between two CDISC releases.
The releases may span any amount of time.

Requirements
------------
Git
Apache Ant
Java Developers Kit

Building the program
--------------------

Clone the DiffCDISC repository onto your local filesystem using Git.

C:\> git clone https://github.com/NCIEVS/diff-cdisc.git

Open a Command Prompt and navigate to the repository directory.

Run an ant build

C:\DiffCDISC> ant build

This will create a 'classes' and add a jar file to the 'dist' directory 
where program dependancies are stored.  The program is now ready to run.

NOTE: If the build fails, you may need to inspect your ant configurations.
See: https://ant.apache.org/manual/

Preparing data for the program
------------------------------

Users should pull two reports in .txt format from the same EVS CDISC
Archive directory (e.g., ADaM, SDTM, SEND).

Included in this repository are two example reports from the SDTM Archive
directory.  The example below will demonstrate how to run the program
using these two files.

Running the program
-------------------

Each report is input into the program (newest followed by oldest),
followed by a "release date" and then the filename of the output. Suppose the package is in *C:\\DiffCDISC* , Open a shell window and run:

```
cd C:\DiffCDISC\dist
RunChanges "..\docs\SDTM Terminology 2015-09-25.txt" "..\docs\SDTM Terminology 2015-06-26.txt" "9/25/2015" Changes.txt
```

If all goes well, you will get in the shell window:

```
Initializing diff report...
Getting changes...
Printing changes report...
```

The output file Changes.txt will be in *C:\\DiffCDISC\\dist*.

About the program
-----------------

The following changes between CDISC releases are detected.  In the event 
of an Update, original and new values are reported.

- Add new CDISC Synonym
- Add new term to existing codelist
- Add new term to new codelist
- Addition of new codelist
- Remove CDISC Synonym
- Remove term entirely from codelist
- Remove term from retired codelist
- Retire codelist
- Update CDISC Codelist Name
- Update CDISC Definition
- Update CDISC Extensible List
- Update CDISC Submission Value
- Update NCI Preferred Term

Known issues
------------

The 'Request Code' column will always be empty as they are stored in the
JIRA tracking system.  This column is manually populated by EVS before
each quarterly release.
