package org.unix4j.grep;

import org.unix4j.grep.builder.DefaultUnix4jCommandBuilder;
import org.unix4j.grep.builder.Unix4jCommandBuilder;
import org.unix4j.grep.unix.Grep;

public class Main {

    public static void main(String[] args) {
        boolean isIgnoreCase = true;
        boolean isInvertMatch = false;
        boolean isFixedStrings = false;
        boolean isLineNumber = false;
        boolean isCount = false;
        boolean isMatchingFiles = false;
        boolean isWholeLine = false;

        DefaultUnix4jCommandBuilder u = new DefaultUnix4jCommandBuilder();
//        Unix4jCommandBuilder res = u.grep("name", "pom.xml");
        Unix4jCommandBuilder res = u.grep(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber, isCount,
                isMatchingFiles, isWholeLine, "Name", "pom.xml");
        res.toStdOut();
    }
}
